/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.dsl.jbang.core.commands.kubernetes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.fabric8.kubernetes.api.model.StatusDetails;
import io.fabric8.openshift.client.OpenShiftClient;
import org.apache.camel.dsl.jbang.core.commands.CamelJBangMain;
import org.apache.camel.dsl.jbang.core.commands.kubernetes.traits.BaseTrait;
import org.apache.camel.util.StringHelper;
import org.codehaus.plexus.util.ExceptionUtils;
import picocli.CommandLine;

import static org.apache.camel.dsl.jbang.core.commands.kubernetes.KubernetesHelper.getKubernetesClient;

@CommandLine.Command(name = "delete",
                     description = "Delete Camel application from Kubernetes. This operation will delete all resources associated to this app, such as: Deployment, Routes, Services, etc. filtering by labels \"app.kubernetes.io/managed-by=camel-jbang\" and \"app=<app name>\".",
                     sortOptions = false)
public class KubernetesDelete extends KubernetesBaseCommand {

    @CommandLine.Parameters(description = "The deployed application name", arity = "1", paramLabel = "<app name>")
    String appName;

    public KubernetesDelete(CamelJBangMain main) {
        super(main);
    }

    public Integer doCall() throws Exception {
        printer().printf("Deleting all resources from app: %s%n", appName);
        Map<String, String> labels = new HashMap<>();
        // this label is set in KubernetesRun command
        labels.put(BaseTrait.KUBERNETES_LABEL_MANAGED_BY, "camel-jbang");
        labels.put("app", appName);
        List<StatusDetails> deleteStatuses = new ArrayList<>();
        try {
            // delete the most common resources
            // delete Deployment cascades to pod
            deleteStatuses.addAll(getKubernetesClient().apps().deployments().withLabels(labels).delete());
            // delete service
            deleteStatuses.addAll(getKubernetesClient().services().withLabels(labels).delete());
            ClusterType clusterType = KubernetesHelper.discoverClusterType();
            if (ClusterType.OPENSHIFT == clusterType) {
                // openshift specific: BuildConfig, ImageStreams, Route - BuildConfig casacade delete to Build and ConfigMap
                OpenShiftClient ocpClient = getKubernetesClient().adapt(OpenShiftClient.class);
                // BuildConfig
                deleteStatuses.addAll(ocpClient.buildConfigs().withLabels(labels).delete());
                // ImageStreams
                deleteStatuses.addAll(ocpClient.imageStreams().withLabels(labels).delete());
                // Route
                deleteStatuses.addAll(ocpClient.routes().withLabels(labels).delete());
            }
            if (deleteStatuses.size() > 0) {
                deleteStatuses.forEach(
                        s -> printer().printf("Deleted: %s '%s'%n", StringHelper.capitalize(s.getKind()), s.getName()));
            } else {
                printer().println("No deployment found with name: " + appName);
            }
        } catch (Exception ex) {
            // there could be various chained exceptions, so we want to get the root cause
            printer().println("Error trying to delete the app: " + ExceptionUtils.getRootCause(ex));
            return 1;
        }
        return 0;
    }
}
