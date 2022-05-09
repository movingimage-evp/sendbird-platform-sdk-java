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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdMessageResponseMentionedUsers;
import org.openapitools.client.model.SendBirdMessageResponseUser;

/**
 * SendBirdMessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class SendBirdMessageResponse {
  public static final String SERIALIZED_NAME_REQUIRE_AUTH = "require_auth";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH)
  private Boolean requireAuth;

  public static final String SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS)
  private BigDecimal messageSurvivalSeconds;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_MENTIONED_USERS = "mentioned_users";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USERS)
  private List<SendBirdMessageResponseMentionedUsers> mentionedUsers = null;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private Object translations;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public static final String SERIALIZED_NAME_IS_OP_MSG = "is_op_msg";
  @SerializedName(SERIALIZED_NAME_IS_OP_MSG)
  private Boolean isOpMsg;

  public static final String SERIALIZED_NAME_IS_REMOVED = "is_removed";
  @SerializedName(SERIALIZED_NAME_IS_REMOVED)
  private Boolean isRemoved;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdMessageResponseUser user;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Object file;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_MESSAGE_RETENTION_HOUR = "message_retention_hour";
  @SerializedName(SERIALIZED_NAME_MESSAGE_RETENTION_HOUR)
  private BigDecimal messageRetentionHour;

  public static final String SERIALIZED_NAME_SILENT = "silent";
  @SerializedName(SERIALIZED_NAME_SILENT)
  private Boolean silent;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_REQ_ID = "req_id";
  @SerializedName(SERIALIZED_NAME_REQ_ID)
  private String reqId;

  public static final String SERIALIZED_NAME_MENTION_TYPE = "mention_type";
  @SerializedName(SERIALIZED_NAME_MENTION_TYPE)
  private String mentionType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private BigDecimal messageId;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_SORTED_METAARRAY = "sorted_metaarray";
  @SerializedName(SERIALIZED_NAME_SORTED_METAARRAY)
  private List<Object> sortedMetaarray = null;

  public static final String SERIALIZED_NAME_THREAD_INFO = "thread_info";
  @SerializedName(SERIALIZED_NAME_THREAD_INFO)
  private Object threadInfo;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE_ID = "parent_message_id";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE_ID)
  private BigDecimal parentMessageId;

  public static final String SERIALIZED_NAME_PARENT_MESSAGE_INFO = "parent_message_info";
  @SerializedName(SERIALIZED_NAME_PARENT_MESSAGE_INFO)
  private Object parentMessageInfo;

  public static final String SERIALIZED_NAME_IS_REPLY_TO_CHANNEL = "is_reply_to_channel";
  @SerializedName(SERIALIZED_NAME_IS_REPLY_TO_CHANNEL)
  private Boolean isReplyToChannel;

  public SendBirdMessageResponse() { 
  }

  public SendBirdMessageResponse requireAuth(Boolean requireAuth) {
    
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }


  public SendBirdMessageResponse messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public SendBirdMessageResponse customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public SendBirdMessageResponse mentionedUsers(List<SendBirdMessageResponseMentionedUsers> mentionedUsers) {
    
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdMessageResponse addMentionedUsersItem(SendBirdMessageResponseMentionedUsers mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<SendBirdMessageResponseMentionedUsers>();
    }
    this.mentionedUsers.add(mentionedUsersItem);
    return this;
  }

   /**
   * Get mentionedUsers
   * @return mentionedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdMessageResponseMentionedUsers> getMentionedUsers() {
    return mentionedUsers;
  }


  public void setMentionedUsers(List<SendBirdMessageResponseMentionedUsers> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public SendBirdMessageResponse translations(Object translations) {
    
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTranslations() {
    return translations;
  }


  public void setTranslations(Object translations) {
    this.translations = translations;
  }


  public SendBirdMessageResponse updatedAt(BigDecimal updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SendBirdMessageResponse isOpMsg(Boolean isOpMsg) {
    
    this.isOpMsg = isOpMsg;
    return this;
  }

   /**
   * Get isOpMsg
   * @return isOpMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOpMsg() {
    return isOpMsg;
  }


  public void setIsOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
  }


  public SendBirdMessageResponse isRemoved(Boolean isRemoved) {
    
    this.isRemoved = isRemoved;
    return this;
  }

   /**
   * Get isRemoved
   * @return isRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRemoved() {
    return isRemoved;
  }


  public void setIsRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
  }


  public SendBirdMessageResponse user(SendBirdMessageResponseUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdMessageResponseUser getUser() {
    return user;
  }


  public void setUser(SendBirdMessageResponseUser user) {
    this.user = user;
  }


  public SendBirdMessageResponse file(Object file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFile() {
    return file;
  }


  public void setFile(Object file) {
    this.file = file;
  }


  public SendBirdMessageResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SendBirdMessageResponse data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public SendBirdMessageResponse messageRetentionHour(BigDecimal messageRetentionHour) {
    
    this.messageRetentionHour = messageRetentionHour;
    return this;
  }

   /**
   * Get messageRetentionHour
   * @return messageRetentionHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageRetentionHour() {
    return messageRetentionHour;
  }


  public void setMessageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
  }


  public SendBirdMessageResponse silent(Boolean silent) {
    
    this.silent = silent;
    return this;
  }

   /**
   * Get silent
   * @return silent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSilent() {
    return silent;
  }


  public void setSilent(Boolean silent) {
    this.silent = silent;
  }


  public SendBirdMessageResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SendBirdMessageResponse createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdMessageResponse channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public SendBirdMessageResponse reqId(String reqId) {
    
    this.reqId = reqId;
    return this;
  }

   /**
   * Get reqId
   * @return reqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReqId() {
    return reqId;
  }


  public void setReqId(String reqId) {
    this.reqId = reqId;
  }


  public SendBirdMessageResponse mentionType(String mentionType) {
    
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Get mentionType
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMentionType() {
    return mentionType;
  }


  public void setMentionType(String mentionType) {
    this.mentionType = mentionType;
  }


  public SendBirdMessageResponse channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public SendBirdMessageResponse messageId(BigDecimal messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageId() {
    return messageId;
  }


  public void setMessageId(BigDecimal messageId) {
    this.messageId = messageId;
  }


  public SendBirdMessageResponse size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public SendBirdMessageResponse sortedMetaarray(List<Object> sortedMetaarray) {
    
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public SendBirdMessageResponse addSortedMetaarrayItem(Object sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<Object>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Get sortedMetaarray
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getSortedMetaarray() {
    return sortedMetaarray;
  }


  public void setSortedMetaarray(List<Object> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public SendBirdMessageResponse threadInfo(Object threadInfo) {
    
    this.threadInfo = threadInfo;
    return this;
  }

   /**
   * Get threadInfo
   * @return threadInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getThreadInfo() {
    return threadInfo;
  }


  public void setThreadInfo(Object threadInfo) {
    this.threadInfo = threadInfo;
  }


  public SendBirdMessageResponse parentMessageId(BigDecimal parentMessageId) {
    
    this.parentMessageId = parentMessageId;
    return this;
  }

   /**
   * Get parentMessageId
   * @return parentMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getParentMessageId() {
    return parentMessageId;
  }


  public void setParentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
  }


  public SendBirdMessageResponse parentMessageInfo(Object parentMessageInfo) {
    
    this.parentMessageInfo = parentMessageInfo;
    return this;
  }

   /**
   * Get parentMessageInfo
   * @return parentMessageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getParentMessageInfo() {
    return parentMessageInfo;
  }


  public void setParentMessageInfo(Object parentMessageInfo) {
    this.parentMessageInfo = parentMessageInfo;
  }


  public SendBirdMessageResponse isReplyToChannel(Boolean isReplyToChannel) {
    
    this.isReplyToChannel = isReplyToChannel;
    return this;
  }

   /**
   * Get isReplyToChannel
   * @return isReplyToChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsReplyToChannel() {
    return isReplyToChannel;
  }


  public void setIsReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdMessageResponse sendBirdMessageResponse = (SendBirdMessageResponse) o;
    return Objects.equals(this.requireAuth, sendBirdMessageResponse.requireAuth) &&
        Objects.equals(this.messageSurvivalSeconds, sendBirdMessageResponse.messageSurvivalSeconds) &&
        Objects.equals(this.customType, sendBirdMessageResponse.customType) &&
        Objects.equals(this.mentionedUsers, sendBirdMessageResponse.mentionedUsers) &&
        Objects.equals(this.translations, sendBirdMessageResponse.translations) &&
        Objects.equals(this.updatedAt, sendBirdMessageResponse.updatedAt) &&
        Objects.equals(this.isOpMsg, sendBirdMessageResponse.isOpMsg) &&
        Objects.equals(this.isRemoved, sendBirdMessageResponse.isRemoved) &&
        Objects.equals(this.user, sendBirdMessageResponse.user) &&
        Objects.equals(this.file, sendBirdMessageResponse.file) &&
        Objects.equals(this.message, sendBirdMessageResponse.message) &&
        Objects.equals(this.data, sendBirdMessageResponse.data) &&
        Objects.equals(this.messageRetentionHour, sendBirdMessageResponse.messageRetentionHour) &&
        Objects.equals(this.silent, sendBirdMessageResponse.silent) &&
        Objects.equals(this.type, sendBirdMessageResponse.type) &&
        Objects.equals(this.createdAt, sendBirdMessageResponse.createdAt) &&
        Objects.equals(this.channelType, sendBirdMessageResponse.channelType) &&
        Objects.equals(this.reqId, sendBirdMessageResponse.reqId) &&
        Objects.equals(this.mentionType, sendBirdMessageResponse.mentionType) &&
        Objects.equals(this.channelUrl, sendBirdMessageResponse.channelUrl) &&
        Objects.equals(this.messageId, sendBirdMessageResponse.messageId) &&
        Objects.equals(this.size, sendBirdMessageResponse.size) &&
        Objects.equals(this.sortedMetaarray, sendBirdMessageResponse.sortedMetaarray) &&
        Objects.equals(this.threadInfo, sendBirdMessageResponse.threadInfo) &&
        Objects.equals(this.parentMessageId, sendBirdMessageResponse.parentMessageId) &&
        Objects.equals(this.parentMessageInfo, sendBirdMessageResponse.parentMessageInfo) &&
        Objects.equals(this.isReplyToChannel, sendBirdMessageResponse.isReplyToChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireAuth, messageSurvivalSeconds, customType, mentionedUsers, translations, updatedAt, isOpMsg, isRemoved, user, file, message, data, messageRetentionHour, silent, type, createdAt, channelType, reqId, mentionType, channelUrl, messageId, size, sortedMetaarray, threadInfo, parentMessageId, parentMessageInfo, isReplyToChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdMessageResponse {\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isOpMsg: ").append(toIndentedString(isOpMsg)).append("\n");
    sb.append("    isRemoved: ").append(toIndentedString(isRemoved)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    messageRetentionHour: ").append(toIndentedString(messageRetentionHour)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    reqId: ").append(toIndentedString(reqId)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
    sb.append("    threadInfo: ").append(toIndentedString(threadInfo)).append("\n");
    sb.append("    parentMessageId: ").append(toIndentedString(parentMessageId)).append("\n");
    sb.append("    parentMessageInfo: ").append(toIndentedString(parentMessageInfo)).append("\n");
    sb.append("    isReplyToChannel: ").append(toIndentedString(isReplyToChannel)).append("\n");
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

