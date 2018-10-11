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
import java.time.OffsetDateTime;

/**
 * An Access policy.
 */
@JacksonXmlRootElement(localName = "AccessPolicy")
public final class AccessPolicy {
    /**
     * the date-time the policy is active.
     */
    @JsonProperty(value = "Start", required = true)
    private OffsetDateTime start;

    /**
     * the date-time the policy expires.
     */
    @JsonProperty(value = "Expiry", required = true)
    private OffsetDateTime expiry;

    /**
     * the permissions for the acl policy.
     */
    @JsonProperty(value = "Permission", required = true)
    private String permission;

    /**
     * Get the start value.
     *
     * @return the start value.
     */
    public OffsetDateTime start() {
        return this.start;
    }

    /**
     * Set the start value.
     *
     * @param start the start value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withStart(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry value.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry value.
     *
     * @param expiry the expiry value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission value.
     *
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission value.
     *
     * @param permission the permission value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy withPermission(String permission) {
        this.permission = permission;
        return this;
    }
}