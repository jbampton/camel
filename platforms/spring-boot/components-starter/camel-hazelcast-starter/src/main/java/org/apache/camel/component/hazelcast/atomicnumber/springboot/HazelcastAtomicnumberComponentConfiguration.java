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
package org.apache.camel.component.hazelcast.atomicnumber.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The hazelcast-atomicvalue component is used to access Hazelcast atomic
 * number, which is an object that simply provides a grid wide number (long).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.hazelcast-atomicvalue")
public class HazelcastAtomicnumberComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the hazelcast-atomicvalue
     * component. This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The hazelcast instance reference which can be used for hazelcast
     * endpoint. If you don't specify the instance reference, camel use the
     * default hazelcast instance from the camel-hazelcast instance. The option
     * is a com.hazelcast.core.HazelcastInstance type.
     */
    private String hazelcastInstance;
    /**
     * The hazelcast mode reference which kind of instance should be used. If
     * you don't specify the mode, then the node mode will be the default.
     */
    private String hazelcastMode = "node";
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public String getHazelcastInstance() {
        return hazelcastInstance;
    }

    public void setHazelcastInstance(String hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

    public String getHazelcastMode() {
        return hazelcastMode;
    }

    public void setHazelcastMode(String hazelcastMode) {
        this.hazelcastMode = hazelcastMode;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }
}