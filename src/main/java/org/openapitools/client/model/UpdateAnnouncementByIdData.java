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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * UpdateAnnouncementByIdData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class UpdateAnnouncementByIdData {
  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ANNOUNCEMENT_GROUP = "announcement_group";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_GROUP)
  private String announcementGroup;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL = "create_channel";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL)
  private Boolean createChannel;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_NAME = "create_channel_options.name";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_NAME)
  private String createChannelOptionsName;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_COVER_URL = "create_channel_options.cover_url";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_COVER_URL)
  private String createChannelOptionsCoverUrl;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE = "create_channel_options.custom_type";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE)
  private String createChannelOptionsCustomType;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_DATA = "create_channel_options.data";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_DATA)
  private String createChannelOptionsData;

  public static final String SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_DISTINCT = "create_channel_options.distinct";
  @SerializedName(SERIALIZED_NAME_CREATE_CHANNEL_OPTIONS_DISTINCT)
  private String createChannelOptionsDistinct;

  public static final String SERIALIZED_NAME_MESSAGE_USER_ID = "message.user_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_USER_ID)
  private String messageUserId;

  public static final String SERIALIZED_NAME_MESSAGE_CONTENT = "message.content";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CONTENT)
  private String messageContent;

  public static final String SERIALIZED_NAME_MESSAGE_DATA = "message.data";
  @SerializedName(SERIALIZED_NAME_MESSAGE_DATA)
  private String messageData;

  public static final String SERIALIZED_NAME_ENABLE_PUSH = "enable_push";
  @SerializedName(SERIALIZED_NAME_ENABLE_PUSH)
  private Boolean enablePush;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private Integer scheduledAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private Integer endAt;

  public static final String SERIALIZED_NAME_CEASE_AT = "cease_at";
  @SerializedName(SERIALIZED_NAME_CEASE_AT)
  private String ceaseAt;

  public static final String SERIALIZED_NAME_RESUME_AT = "resume_at";
  @SerializedName(SERIALIZED_NAME_RESUME_AT)
  private String resumeAt;

  public UpdateAnnouncementByIdData() { 
  }

  public UpdateAnnouncementByIdData uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Specifies the unique ID of the announcement to update.
   * @return uniqueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the announcement to update.")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public UpdateAnnouncementByIdData action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Specifies an action to take on the announcement. If this property is updated, other specified properties in the request are not effective. Acceptable values are limited to remove, pause, resume, and cancel. The [Announcement actions](#2-update-an-announcement-3-how-to-change-announcement-status) table explains each action in detail.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an action to take on the announcement. If this property is updated, other specified properties in the request are not effective. Acceptable values are limited to remove, pause, resume, and cancel. The [Announcement actions](#2-update-an-announcement-3-how-to-change-announcement-status) table explains each action in detail.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public UpdateAnnouncementByIdData announcementGroup(String announcementGroup) {
    
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Specifies the name of an announcement group to retrieve. If not specified, all announcements are returned, regardless of their group.
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of an announcement group to retrieve. If not specified, all announcements are returned, regardless of their group.")

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public UpdateAnnouncementByIdData createChannel(Boolean createChannel) {
    
    this.createChannel = createChannel;
    return this;
  }

   /**
   * Determines whether to create a new channel if there is no existing channel that matches with the target options including target_at and target_list.
   * @return createChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to create a new channel if there is no existing channel that matches with the target options including target_at and target_list.")

  public Boolean getCreateChannel() {
    return createChannel;
  }


  public void setCreateChannel(Boolean createChannel) {
    this.createChannel = createChannel;
  }


  public UpdateAnnouncementByIdData createChannelOptionsName(String createChannelOptionsName) {
    
    this.createChannelOptionsName = createChannelOptionsName;
    return this;
  }

   /**
   * Specifies the name of the channel. (Default: Group Channel)
   * @return createChannelOptionsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the channel. (Default: Group Channel)")

  public String getCreateChannelOptionsName() {
    return createChannelOptionsName;
  }


  public void setCreateChannelOptionsName(String createChannelOptionsName) {
    this.createChannelOptionsName = createChannelOptionsName;
  }


  public UpdateAnnouncementByIdData createChannelOptionsCoverUrl(String createChannelOptionsCoverUrl) {
    
    this.createChannelOptionsCoverUrl = createChannelOptionsCoverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image.
   * @return createChannelOptionsCoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the cover image.")

  public String getCreateChannelOptionsCoverUrl() {
    return createChannelOptionsCoverUrl;
  }


  public void setCreateChannelOptionsCoverUrl(String createChannelOptionsCoverUrl) {
    this.createChannelOptionsCoverUrl = createChannelOptionsCoverUrl;
  }


  public UpdateAnnouncementByIdData createChannelOptionsCustomType(String createChannelOptionsCustomType) {
    
    this.createChannelOptionsCustomType = createChannelOptionsCustomType;
    return this;
  }

   /**
   * Specifies the custom channel type.
   * @return createChannelOptionsCustomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the custom channel type.")

  public String getCreateChannelOptionsCustomType() {
    return createChannelOptionsCustomType;
  }


  public void setCreateChannelOptionsCustomType(String createChannelOptionsCustomType) {
    this.createChannelOptionsCustomType = createChannelOptionsCustomType;
  }


  public UpdateAnnouncementByIdData createChannelOptionsData(String createChannelOptionsData) {
    
    this.createChannelOptionsData = createChannelOptionsData;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return createChannelOptionsData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")

  public String getCreateChannelOptionsData() {
    return createChannelOptionsData;
  }


  public void setCreateChannelOptionsData(String createChannelOptionsData) {
    this.createChannelOptionsData = createChannelOptionsData;
  }


  public UpdateAnnouncementByIdData createChannelOptionsDistinct(String createChannelOptionsDistinct) {
    
    this.createChannelOptionsDistinct = createChannelOptionsDistinct;
    return this;
  }

   /**
   * Determines whether to create a [distinct](/docs/chat/v3/platform-api/guides/channel-types#2-group-channel) channel. (Default: true)
   * @return createChannelOptionsDistinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to create a [distinct](/docs/chat/v3/platform-api/guides/channel-types#2-group-channel) channel. (Default: true)")

  public String getCreateChannelOptionsDistinct() {
    return createChannelOptionsDistinct;
  }


  public void setCreateChannelOptionsDistinct(String createChannelOptionsDistinct) {
    this.createChannelOptionsDistinct = createChannelOptionsDistinct;
  }


  public UpdateAnnouncementByIdData messageUserId(String messageUserId) {
    
    this.messageUserId = messageUserId;
    return this;
  }

   /**
   * Specifies the unique ID of the announcement sender.
   * @return messageUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the announcement sender.")

  public String getMessageUserId() {
    return messageUserId;
  }


  public void setMessageUserId(String messageUserId) {
    this.messageUserId = messageUserId;
  }


  public UpdateAnnouncementByIdData messageContent(String messageContent) {
    
    this.messageContent = messageContent;
    return this;
  }

   /**
   * Specifies the content of the message.
   * @return messageContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the content of the message.")

  public String getMessageContent() {
    return messageContent;
  }


  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }


  public UpdateAnnouncementByIdData messageData(String messageData) {
    
    this.messageData = messageData;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return messageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")

  public String getMessageData() {
    return messageData;
  }


  public void setMessageData(String messageData) {
    this.messageData = messageData;
  }


  public UpdateAnnouncementByIdData enablePush(Boolean enablePush) {
    
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Determines whether to turn on push notification for the announcement. If set to true, push notifications will be sent for announcements.
   * @return enablePush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to turn on push notification for the announcement. If set to true, push notifications will be sent for announcements.")

  public Boolean getEnablePush() {
    return enablePush;
  }


  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }


  public UpdateAnnouncementByIdData scheduledAt(Integer scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Specifies the time to start the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. (Default: current timestamp)
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to start the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. (Default: current timestamp)")

  public Integer getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(Integer scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public UpdateAnnouncementByIdData endAt(Integer endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Specifies the time to permanently end the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format, even if the announcement is not sent to all its targets.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to permanently end the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format, even if the announcement is not sent to all its targets.")

  public Integer getEndAt() {
    return endAt;
  }


  public void setEndAt(Integer endAt) {
    this.endAt = endAt;
  }


  public UpdateAnnouncementByIdData ceaseAt(String ceaseAt) {
    
    this.ceaseAt = ceaseAt;
    return this;
  }

   /**
   * Specifies the time to temporarily put the announcement on hold in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the resume_at below.
   * @return ceaseAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to temporarily put the announcement on hold in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the resume_at below.")

  public String getCeaseAt() {
    return ceaseAt;
  }


  public void setCeaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
  }


  public UpdateAnnouncementByIdData resumeAt(String resumeAt) {
    
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Specifies the time to automatically resume the on-hold announcement in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the cease_at above.
   * @return resumeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to automatically resume the on-hold announcement in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the cease_at above.")

  public String getResumeAt() {
    return resumeAt;
  }


  public void setResumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnnouncementByIdData updateAnnouncementByIdData = (UpdateAnnouncementByIdData) o;
    return Objects.equals(this.uniqueId, updateAnnouncementByIdData.uniqueId) &&
        Objects.equals(this.action, updateAnnouncementByIdData.action) &&
        Objects.equals(this.announcementGroup, updateAnnouncementByIdData.announcementGroup) &&
        Objects.equals(this.createChannel, updateAnnouncementByIdData.createChannel) &&
        Objects.equals(this.createChannelOptionsName, updateAnnouncementByIdData.createChannelOptionsName) &&
        Objects.equals(this.createChannelOptionsCoverUrl, updateAnnouncementByIdData.createChannelOptionsCoverUrl) &&
        Objects.equals(this.createChannelOptionsCustomType, updateAnnouncementByIdData.createChannelOptionsCustomType) &&
        Objects.equals(this.createChannelOptionsData, updateAnnouncementByIdData.createChannelOptionsData) &&
        Objects.equals(this.createChannelOptionsDistinct, updateAnnouncementByIdData.createChannelOptionsDistinct) &&
        Objects.equals(this.messageUserId, updateAnnouncementByIdData.messageUserId) &&
        Objects.equals(this.messageContent, updateAnnouncementByIdData.messageContent) &&
        Objects.equals(this.messageData, updateAnnouncementByIdData.messageData) &&
        Objects.equals(this.enablePush, updateAnnouncementByIdData.enablePush) &&
        Objects.equals(this.scheduledAt, updateAnnouncementByIdData.scheduledAt) &&
        Objects.equals(this.endAt, updateAnnouncementByIdData.endAt) &&
        Objects.equals(this.ceaseAt, updateAnnouncementByIdData.ceaseAt) &&
        Objects.equals(this.resumeAt, updateAnnouncementByIdData.resumeAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, action, announcementGroup, createChannel, createChannelOptionsName, createChannelOptionsCoverUrl, createChannelOptionsCustomType, createChannelOptionsData, createChannelOptionsDistinct, messageUserId, messageContent, messageData, enablePush, scheduledAt, endAt, ceaseAt, resumeAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnnouncementByIdData {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    createChannel: ").append(toIndentedString(createChannel)).append("\n");
    sb.append("    createChannelOptionsName: ").append(toIndentedString(createChannelOptionsName)).append("\n");
    sb.append("    createChannelOptionsCoverUrl: ").append(toIndentedString(createChannelOptionsCoverUrl)).append("\n");
    sb.append("    createChannelOptionsCustomType: ").append(toIndentedString(createChannelOptionsCustomType)).append("\n");
    sb.append("    createChannelOptionsData: ").append(toIndentedString(createChannelOptionsData)).append("\n");
    sb.append("    createChannelOptionsDistinct: ").append(toIndentedString(createChannelOptionsDistinct)).append("\n");
    sb.append("    messageUserId: ").append(toIndentedString(messageUserId)).append("\n");
    sb.append("    messageContent: ").append(toIndentedString(messageContent)).append("\n");
    sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    ceaseAt: ").append(toIndentedString(ceaseAt)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("unique_id");
    openapiFields.add("action");
    openapiFields.add("announcement_group");
    openapiFields.add("create_channel");
    openapiFields.add("create_channel_options.name");
    openapiFields.add("create_channel_options.cover_url");
    openapiFields.add("create_channel_options.custom_type");
    openapiFields.add("create_channel_options.data");
    openapiFields.add("create_channel_options.distinct");
    openapiFields.add("message.user_id");
    openapiFields.add("message.content");
    openapiFields.add("message.data");
    openapiFields.add("enable_push");
    openapiFields.add("scheduled_at");
    openapiFields.add("end_at");
    openapiFields.add("cease_at");
    openapiFields.add("resume_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unique_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateAnnouncementByIdData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateAnnouncementByIdData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAnnouncementByIdData is not found in the empty JSON string", UpdateAnnouncementByIdData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateAnnouncementByIdData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAnnouncementByIdData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateAnnouncementByIdData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("announcement_group") != null && !jsonObj.get("announcement_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcement_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcement_group").toString()));
      }
      if (jsonObj.get("create_channel_options.name") != null && !jsonObj.get("create_channel_options.name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_channel_options.name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_channel_options.name").toString()));
      }
      if (jsonObj.get("create_channel_options.cover_url") != null && !jsonObj.get("create_channel_options.cover_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_channel_options.cover_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_channel_options.cover_url").toString()));
      }
      if (jsonObj.get("create_channel_options.custom_type") != null && !jsonObj.get("create_channel_options.custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_channel_options.custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_channel_options.custom_type").toString()));
      }
      if (jsonObj.get("create_channel_options.data") != null && !jsonObj.get("create_channel_options.data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_channel_options.data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_channel_options.data").toString()));
      }
      if (jsonObj.get("create_channel_options.distinct") != null && !jsonObj.get("create_channel_options.distinct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_channel_options.distinct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_channel_options.distinct").toString()));
      }
      if (jsonObj.get("message.user_id") != null && !jsonObj.get("message.user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message.user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message.user_id").toString()));
      }
      if (jsonObj.get("message.content") != null && !jsonObj.get("message.content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message.content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message.content").toString()));
      }
      if (jsonObj.get("message.data") != null && !jsonObj.get("message.data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message.data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message.data").toString()));
      }
      if (jsonObj.get("cease_at") != null && !jsonObj.get("cease_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cease_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cease_at").toString()));
      }
      if (jsonObj.get("resume_at") != null && !jsonObj.get("resume_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resume_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resume_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAnnouncementByIdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAnnouncementByIdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAnnouncementByIdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAnnouncementByIdData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAnnouncementByIdData>() {
           @Override
           public void write(JsonWriter out, UpdateAnnouncementByIdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAnnouncementByIdData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAnnouncementByIdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAnnouncementByIdData
  * @throws IOException if the JSON string is invalid with respect to UpdateAnnouncementByIdData
  */
  public static UpdateAnnouncementByIdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAnnouncementByIdData.class);
  }

 /**
  * Convert an instance of UpdateAnnouncementByIdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

