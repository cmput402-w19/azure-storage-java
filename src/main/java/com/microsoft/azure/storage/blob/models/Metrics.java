/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The Metrics model.
 */
@JacksonXmlRootElement(localName = "Metrics")
public final class Metrics {
    /**
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * Indicates whether metrics are enabled for the Blob service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /**
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeAPIs;

    /**
     * The retentionPolicy property.
     */
    @JsonProperty(value = "RetentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the Metrics object itself.
     */
    public Metrics withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set.
     * @return the Metrics object itself.
     */
    public Metrics withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the includeAPIs value.
     *
     * @return the includeAPIs value.
     */
    public Boolean includeAPIs() {
        return this.includeAPIs;
    }

    /**
     * Set the includeAPIs value.
     *
     * @param includeAPIs the includeAPIs value to set.
     * @return the Metrics object itself.
     */
    public Metrics withIncludeAPIs(Boolean includeAPIs) {
        this.includeAPIs = includeAPIs;
        return this;
    }

    /**
     * Get the retentionPolicy value.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy value.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the Metrics object itself.
     */
    public Metrics withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
