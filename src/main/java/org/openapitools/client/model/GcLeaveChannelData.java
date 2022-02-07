/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GcLeaveChannelData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class GcLeaveChannelData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Integer> userIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_SHOULD_LEAVE_ALL = "should_leave_all";
  @SerializedName(SERIALIZED_NAME_SHOULD_LEAVE_ALL)
  private Boolean shouldLeaveAll;

  public GcLeaveChannelData() { 
  }

  public GcLeaveChannelData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to leave.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to leave.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcLeaveChannelData userIds(List<Integer> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public GcLeaveChannelData addUserIdsItem(Integer userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users to leave the channel.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of the users to leave the channel.")

  public List<Integer> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }


  public GcLeaveChannelData shouldLeaveAll(Boolean shouldLeaveAll) {
    
    this.shouldLeaveAll = shouldLeaveAll;
    return this;
  }

   /**
   * Determines whether to make all members leave the channel. (Default: false)
   * @return shouldLeaveAll
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to make all members leave the channel. (Default: false)")

  public Boolean getShouldLeaveAll() {
    return shouldLeaveAll;
  }


  public void setShouldLeaveAll(Boolean shouldLeaveAll) {
    this.shouldLeaveAll = shouldLeaveAll;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcLeaveChannelData gcLeaveChannelData = (GcLeaveChannelData) o;
    return Objects.equals(this.channelUrl, gcLeaveChannelData.channelUrl) &&
        Objects.equals(this.userIds, gcLeaveChannelData.userIds) &&
        Objects.equals(this.shouldLeaveAll, gcLeaveChannelData.shouldLeaveAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userIds, shouldLeaveAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcLeaveChannelData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    shouldLeaveAll: ").append(toIndentedString(shouldLeaveAll)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
