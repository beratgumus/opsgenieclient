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

import javax.validation.constraints.NotNull;

/**
 * SnoozeAlertRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class SnoozeAlertRequest {
    @JsonProperty("user")
    private String user = null;

    @JsonProperty("note")
    private String note = null;

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("endTime")
    private DateTime endTime = null;

    public SnoozeAlertRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Display name of the request owner
     *
     * @return user
     **/
    @ApiModelProperty(value = "Display name of the request owner")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SnoozeAlertRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Additional note that will be added while creating the alert
     *
     * @return note
     **/
    @ApiModelProperty(value = "Additional note that will be added while creating the alert")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SnoozeAlertRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Source field of the alert. Default value is IP address of the incoming request
     *
     * @return source
     **/
    @ApiModelProperty(value = "Source field of the alert. Default value is IP address of the incoming request")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public SnoozeAlertRequest endTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Date and time that snooze will lose effect
     *
     * @return endTime
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Date and time that snooze will lose effect")
    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnoozeAlertRequest snoozeAlertRequest = (SnoozeAlertRequest) o;
        return ObjectUtils.equals(this.user, snoozeAlertRequest.user) &&
                ObjectUtils.equals(this.note, snoozeAlertRequest.note) &&
                ObjectUtils.equals(this.source, snoozeAlertRequest.source) &&
                ObjectUtils.equals(this.endTime, snoozeAlertRequest.endTime);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(user, note, source, endTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnoozeAlertRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

