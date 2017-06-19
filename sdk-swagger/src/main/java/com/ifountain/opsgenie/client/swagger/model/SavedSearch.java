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

import java.util.ArrayList;
import java.util.List;

/**
 * SavedSearch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-19T13:16:01.587+03:00")
public class SavedSearch {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("createdAt")
    private DateTime createdAt = null;

    @JsonProperty("updatedAt")
    private DateTime updatedAt = null;

    @JsonProperty("owner")
    private SavedSearchEntity owner = null;

    @JsonProperty("teams")
    private List<SavedSearchEntity> teams = new ArrayList<SavedSearchEntity>();

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("query")
    private String query = null;

    public SavedSearch id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SavedSearch name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavedSearch createdAt(DateTime createdAt) {
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

    public SavedSearch updatedAt(DateTime updatedAt) {
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

    public SavedSearch owner(SavedSearchEntity owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @ApiModelProperty(value = "")
    public SavedSearchEntity getOwner() {
        return owner;
    }

    public void setOwner(SavedSearchEntity owner) {
        this.owner = owner;
    }

    public SavedSearch teams(List<SavedSearchEntity> teams) {
        this.teams = teams;
        return this;
    }

    public SavedSearch addTeamsItem(SavedSearchEntity teamsItem) {
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * Get teams
     *
     * @return teams
     **/
    @ApiModelProperty(value = "")
    public List<SavedSearchEntity> getTeams() {
        return teams;
    }

    public void setTeams(List<SavedSearchEntity> teams) {
        this.teams = teams;
    }

    public SavedSearch description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SavedSearch query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     *
     * @return query
     **/
    @ApiModelProperty(value = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SavedSearch savedSearch = (SavedSearch) o;
        return ObjectUtils.equals(this.id, savedSearch.id) &&
                ObjectUtils.equals(this.name, savedSearch.name) &&
                ObjectUtils.equals(this.createdAt, savedSearch.createdAt) &&
                ObjectUtils.equals(this.updatedAt, savedSearch.updatedAt) &&
                ObjectUtils.equals(this.owner, savedSearch.owner) &&
                ObjectUtils.equals(this.teams, savedSearch.teams) &&
                ObjectUtils.equals(this.description, savedSearch.description) &&
                ObjectUtils.equals(this.query, savedSearch.query);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(id, name, createdAt, updatedAt, owner, teams, description, query);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SavedSearch {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

