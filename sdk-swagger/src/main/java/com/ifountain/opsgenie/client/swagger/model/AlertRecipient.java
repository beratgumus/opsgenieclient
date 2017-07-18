/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;
import org.joda.time.DateTime;

/**
 * AlertRecipient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class AlertRecipient {
    @JsonProperty("user")
    private UserMeta user = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("method")
    private String method = null;

    @JsonProperty("createdAt")
    private DateTime createdAt = null;

    @JsonProperty("updatedAt")
    private DateTime updatedAt = null;

    public AlertRecipient user(UserMeta user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @ApiModelProperty(value = "")
    public UserMeta getUser() {
        return user;
    }

    public void setUser(UserMeta user) {
        this.user = user;
    }

    public AlertRecipient state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @ApiModelProperty(value = "")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AlertRecipient method(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     **/
    @ApiModelProperty(value = "")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public AlertRecipient createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/
    @ApiModelProperty(value = "")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AlertRecipient updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     **/
    @ApiModelProperty(value = "")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertRecipient alertRecipient = (AlertRecipient) o;
        return ObjectUtils.equals(this.user, alertRecipient.user) &&
                ObjectUtils.equals(this.state, alertRecipient.state) &&
                ObjectUtils.equals(this.method, alertRecipient.method) &&
                ObjectUtils.equals(this.createdAt, alertRecipient.createdAt) &&
                ObjectUtils.equals(this.updatedAt, alertRecipient.updatedAt);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(user, state, method, createdAt, updatedAt);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRecipient {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
