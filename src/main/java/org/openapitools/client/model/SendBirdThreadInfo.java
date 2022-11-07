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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdThreadInfo
 */
@JsonPropertyOrder({
  SendBirdThreadInfo.JSON_PROPERTY_LAST_REPLIED_AT,
  SendBirdThreadInfo.JSON_PROPERTY_MOST_REPLIED_USERS,
  SendBirdThreadInfo.JSON_PROPERTY_REPLY_COUNT,
  SendBirdThreadInfo.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("SendBird.ThreadInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class SendBirdThreadInfo {
  public static final String JSON_PROPERTY_LAST_REPLIED_AT = "last_replied_at";
  private BigDecimal lastRepliedAt;

  public static final String JSON_PROPERTY_MOST_REPLIED_USERS = "most_replied_users";
  private List<SendBirdUser> mostRepliedUsers = null;

  public static final String JSON_PROPERTY_REPLY_COUNT = "reply_count";
  private BigDecimal replyCount;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public SendBirdThreadInfo() { 
  }

  public SendBirdThreadInfo lastRepliedAt(BigDecimal lastRepliedAt) {
    this.lastRepliedAt = lastRepliedAt;
    return this;
  }

   /**
   * Get lastRepliedAt
   * @return lastRepliedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_REPLIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLastRepliedAt() {
    return lastRepliedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_REPLIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRepliedAt(BigDecimal lastRepliedAt) {
    this.lastRepliedAt = lastRepliedAt;
  }


  public SendBirdThreadInfo mostRepliedUsers(List<SendBirdUser> mostRepliedUsers) {
    this.mostRepliedUsers = mostRepliedUsers;
    return this;
  }

  public SendBirdThreadInfo addMostRepliedUsersItem(SendBirdUser mostRepliedUsersItem) {
    if (this.mostRepliedUsers == null) {
      this.mostRepliedUsers = new ArrayList<>();
    }
    this.mostRepliedUsers.add(mostRepliedUsersItem);
    return this;
  }

   /**
   * Get mostRepliedUsers
   * @return mostRepliedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOST_REPLIED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getMostRepliedUsers() {
    return mostRepliedUsers;
  }


  @JsonProperty(JSON_PROPERTY_MOST_REPLIED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostRepliedUsers(List<SendBirdUser> mostRepliedUsers) {
    this.mostRepliedUsers = mostRepliedUsers;
  }


  public SendBirdThreadInfo replyCount(BigDecimal replyCount) {
    this.replyCount = replyCount;
    return this;
  }

   /**
   * Get replyCount
   * @return replyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPLY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReplyCount() {
    return replyCount;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyCount(BigDecimal replyCount) {
    this.replyCount = replyCount;
  }


  public SendBirdThreadInfo updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this SendBird.ThreadInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThreadInfo sendBirdThreadInfo = (SendBirdThreadInfo) o;
    return Objects.equals(this.lastRepliedAt, sendBirdThreadInfo.lastRepliedAt) &&
        Objects.equals(this.mostRepliedUsers, sendBirdThreadInfo.mostRepliedUsers) &&
        Objects.equals(this.replyCount, sendBirdThreadInfo.replyCount) &&
        Objects.equals(this.updatedAt, sendBirdThreadInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRepliedAt, mostRepliedUsers, replyCount, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThreadInfo {\n");
    sb.append("    lastRepliedAt: ").append(toIndentedString(lastRepliedAt)).append("\n");
    sb.append("    mostRepliedUsers: ").append(toIndentedString(mostRepliedUsers)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

