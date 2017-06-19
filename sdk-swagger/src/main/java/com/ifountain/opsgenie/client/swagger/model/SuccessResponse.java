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

import javax.validation.constraints.NotNull;

/**
 * SuccessResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-19T13:16:01.587+03:00")
public class SuccessResponse {
    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("took")
    private Float took = 0.0f;

    @JsonProperty("result")
    private String result = null;

    @JsonProperty("data")
    private Object data = null;

    public SuccessResponse requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SuccessResponse took(Float took) {
        this.took = took;
        return this;
    }

    /**
     * Get took
     *
     * @return took
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public Float getTook() {
        return took;
    }

    public void setTook(Float took) {
        this.took = took;
    }

    public SuccessResponse result(String result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     **/
    @ApiModelProperty(value = "")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SuccessResponse data(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @ApiModelProperty(value = "")
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SuccessResponse successResponse = (SuccessResponse) o;
        return ObjectUtils.equals(this.requestId, successResponse.requestId) &&
                ObjectUtils.equals(this.took, successResponse.took) &&
                ObjectUtils.equals(this.result, successResponse.result) &&
                ObjectUtils.equals(this.data, successResponse.data);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(requestId, took, result, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuccessResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    took: ").append(toIndentedString(took)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

