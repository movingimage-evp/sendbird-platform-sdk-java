/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcLeaveChannelData
 */
@JsonPropertyOrder({
  GcLeaveChannelData.JSON_PROPERTY_CHANNEL_URL,
  GcLeaveChannelData.JSON_PROPERTY_USER_IDS,
  GcLeaveChannelData.JSON_PROPERTY_SHOULD_LEAVE_ALL
})
@JsonTypeName("gcLeaveChannelData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GcLeaveChannelData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOULD_LEAVE_ALL = "should_leave_all";
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to leave.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcLeaveChannelData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public GcLeaveChannelData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users to leave the channel.
   * @return userIds
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of the users to leave the channel.")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(List<String> userIds) {
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to make all members leave the channel. (Default: false)")
  @JsonProperty(JSON_PROPERTY_SHOULD_LEAVE_ALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShouldLeaveAll() {
    return shouldLeaveAll;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_LEAVE_ALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShouldLeaveAll(Boolean shouldLeaveAll) {
    this.shouldLeaveAll = shouldLeaveAll;
  }


  /**
   * Return true if this gcLeaveChannelData object is equal to o.
   */
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

