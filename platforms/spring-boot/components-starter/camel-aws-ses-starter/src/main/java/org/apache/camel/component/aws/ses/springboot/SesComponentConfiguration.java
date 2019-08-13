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
package org.apache.camel.component.aws.ses.springboot;

import java.util.List;
import javax.annotation.Generated;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-ses component is used for sending emails with Amazon's SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-ses")
public class SesComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-ses component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS SES default configuration
     */
    private SesConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * The region in which SES client needs to work
     */
    private String region;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public SesConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SesConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class SesConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.ses.SesConfiguration.class;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * To use the AmazonSimpleEmailService as the client
         */
        private AmazonSimpleEmailService amazonSESClient;
        /**
         * The sender's email address.
         */
        private String from;
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         */
        private List to;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         */
        private String subject;
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         */
        private String returnPath;
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         */
        private List replyToAddresses;
        /**
         * To define a proxy host when instantiating the SES client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the SES client
         */
        private Integer proxyPort;
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name()
         */
        private String region;

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public AmazonSimpleEmailService getAmazonSESClient() {
            return amazonSESClient;
        }

        public void setAmazonSESClient(AmazonSimpleEmailService amazonSESClient) {
            this.amazonSESClient = amazonSESClient;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public List getTo() {
            return to;
        }

        public void setTo(List to) {
            this.to = to;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getReturnPath() {
            return returnPath;
        }

        public void setReturnPath(String returnPath) {
            this.returnPath = returnPath;
        }

        public List getReplyToAddresses() {
            return replyToAddresses;
        }

        public void setReplyToAddresses(List replyToAddresses) {
            this.replyToAddresses = replyToAddresses;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}