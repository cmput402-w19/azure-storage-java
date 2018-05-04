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
 * the retention policy.
 */
@JacksonXmlRootElement(localName = "RetentionPolicy")
public final class RetentionPolicy {
    /**
     * Indicates whether a retention policy is enabled for the storage service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /**
     * Indicates the number of days that metrics or logging or soft-deleted
     * data should be retained. All data older than this value will be deleted.
     */
    @JsonProperty(value = "Days")
    private Integer days;

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
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days value.
     *
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days value.
     *
     * @param days the days value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }
}
