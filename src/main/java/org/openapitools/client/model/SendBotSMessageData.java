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
 * SendBotSMessageData
 */
@JsonPropertyOrder({
  SendBotSMessageData.JSON_PROPERTY_MESSAGE,
  SendBotSMessageData.JSON_PROPERTY_CHANNEL_URL,
  SendBotSMessageData.JSON_PROPERTY_CUSTOM_TYPE,
  SendBotSMessageData.JSON_PROPERTY_DATA,
  SendBotSMessageData.JSON_PROPERTY_SEND_PUSH,
  SendBotSMessageData.JSON_PROPERTY_MENTIONED,
  SendBotSMessageData.JSON_PROPERTY_MARK_AS_READ,
  SendBotSMessageData.JSON_PROPERTY_DEDUP_ID,
  SendBotSMessageData.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("sendBot_sMessageData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class SendBotSMessageData {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_SEND_PUSH = "send_push";
  private Boolean sendPush;

  public static final String JSON_PROPERTY_MENTIONED = "mentioned";
  private List<String> mentioned = null;

  public static final String JSON_PROPERTY_MARK_AS_READ = "mark_as_read";
  private Boolean markAsRead;

  public static final String JSON_PROPERTY_DEDUP_ID = "dedup_id";
  private String dedupId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public SendBotSMessageData() { 
  }

  public SendBotSMessageData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Specifies the content of the message sent by the bot.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the content of the message sent by the bot.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public SendBotSMessageData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel where the message is sent to.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel where the message is sent to.")
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


  public SendBotSMessageData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public SendBotSMessageData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public SendBotSMessageData sendPush(Boolean sendPush) {
    this.sendPush = sendPush;
    return this;
  }

   /**
   * Determines whether to send a push notification for the message to the members of the channel (Default: true)
   * @return sendPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to send a push notification for the message to the members of the channel (Default: true)")
  @JsonProperty(JSON_PROPERTY_SEND_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSendPush() {
    return sendPush;
  }


  @JsonProperty(JSON_PROPERTY_SEND_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendPush(Boolean sendPush) {
    this.sendPush = sendPush;
  }


  public SendBotSMessageData mentioned(List<String> mentioned) {
    this.mentioned = mentioned;
    return this;
  }

  public SendBotSMessageData addMentionedItem(String mentionedItem) {
    if (this.mentioned == null) {
      this.mentioned = new ArrayList<>();
    }
    this.mentioned.add(mentionedItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users who get a notification for the message.
   * @return mentioned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of the users who get a notification for the message.")
  @JsonProperty(JSON_PROPERTY_MENTIONED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMentioned() {
    return mentioned;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentioned(List<String> mentioned) {
    this.mentioned = mentioned;
  }


  public SendBotSMessageData markAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Determines whether to mark the message as read for the bot. If set to false, the bot&#39;s unread_count and read_receipt remain unchanged after the message is sent. (Default: true)
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the message as read for the bot. If set to false, the bot's unread_count and read_receipt remain unchanged after the message is sent. (Default: true)")
  @JsonProperty(JSON_PROPERTY_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarkAsRead() {
    return markAsRead;
  }


  @JsonProperty(JSON_PROPERTY_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
  }


  public SendBotSMessageData dedupId(String dedupId) {
    this.dedupId = dedupId;
    return this;
  }

   /**
   * Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.
   * @return dedupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.")
  @JsonProperty(JSON_PROPERTY_DEDUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDedupId() {
    return dedupId;
  }


  @JsonProperty(JSON_PROPERTY_DEDUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDedupId(String dedupId) {
    this.dedupId = dedupId;
  }


  public SendBotSMessageData createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this sendBot_sMessageData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBotSMessageData sendBotSMessageData = (SendBotSMessageData) o;
    return Objects.equals(this.message, sendBotSMessageData.message) &&
        Objects.equals(this.channelUrl, sendBotSMessageData.channelUrl) &&
        Objects.equals(this.customType, sendBotSMessageData.customType) &&
        Objects.equals(this.data, sendBotSMessageData.data) &&
        Objects.equals(this.sendPush, sendBotSMessageData.sendPush) &&
        Objects.equals(this.mentioned, sendBotSMessageData.mentioned) &&
        Objects.equals(this.markAsRead, sendBotSMessageData.markAsRead) &&
        Objects.equals(this.dedupId, sendBotSMessageData.dedupId) &&
        Objects.equals(this.createdAt, sendBotSMessageData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, channelUrl, customType, data, sendPush, mentioned, markAsRead, dedupId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBotSMessageData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sendPush: ").append(toIndentedString(sendPush)).append("\n");
    sb.append("    mentioned: ").append(toIndentedString(mentioned)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    dedupId: ").append(toIndentedString(dedupId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

