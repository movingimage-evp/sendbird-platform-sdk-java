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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest
 */
@JsonPropertyOrder({
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_MESSAGE_TYPE,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_USER_ID,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_MESSAGE,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_FILE,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_URL,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_SCHEDULED_AT,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_CUSTOM_TYPE,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_DATA,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_SEND_PUSH,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_MENTION_TYPE,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_MENTIONED_USER_IDS,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_IS_SILENT,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_MARK_AS_READ,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_SORTED_METAARRAY,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_DEDUP_ID,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_APNS_BUNDLE_ID,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_SOUND,
  V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.JSON_PROPERTY_VOLUME
})
@JsonTypeName("_v3_group_channels__channel_url__scheduled_messages__scheduled_message_id__delete_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest {
  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private String messageType;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_FILE = "file";
  private String _file;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private BigDecimal scheduledAt;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_SEND_PUSH = "send_push";
  private Boolean sendPush;

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private String mentionType;

  public static final String JSON_PROPERTY_MENTIONED_USER_IDS = "mentioned_user_ids[]";
  private List<String> mentionedUserIds = null;

  public static final String JSON_PROPERTY_IS_SILENT = "is_silent";
  private Boolean isSilent;

  public static final String JSON_PROPERTY_MARK_AS_READ = "mark_as_read";
  private Boolean markAsRead;

  public static final String JSON_PROPERTY_SORTED_METAARRAY = "sorted_metaarray";
  private List<Object> sortedMetaarray = null;

  public static final String JSON_PROPERTY_DEDUP_ID = "dedup_id";
  private String dedupId;

  public static final String JSON_PROPERTY_APNS_BUNDLE_ID = "apns_bundle_id";
  private String apnsBundleId;

  public static final String JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS = "apple_critical_alert_options";
  private Object appleCriticalAlertOptions;

  public static final String JSON_PROPERTY_SOUND = "sound";
  private String sound;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Float volume = null;

  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest() { 
  }

  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Specifies the type of the message. The value of MESG represents a text message.
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the message. The value of MESG represents a text message.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the user ID of the sender.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the user ID of the sender.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Specifies the content of the message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the content of the message.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest _file(String _file) {
    this._file = _file;
    return this;
  }

   /**
   * Depending on the file upload method, this specifies the data of the file to upload to the Sendbird server either in raw binary format or by the file&#39;s location. When sending a request containing a file, you must change the value of the content-type header to multipart/form-data; boundary&#x3D;{your_unique_boundary_string} in the request. The code examples of HTTP multipart request and cURL are provided below the tables for your reference. If this file property is specified, the url property is not required. This doesn&#39;t allow a converted base64-encoded string from a file as its value.
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Depending on the file upload method, this specifies the data of the file to upload to the Sendbird server either in raw binary format or by the file's location. When sending a request containing a file, you must change the value of the content-type header to multipart/form-data; boundary={your_unique_boundary_string} in the request. The code examples of HTTP multipart request and cURL are provided below the tables for your reference. If this file property is specified, the url property is not required. This doesn't allow a converted base64-encoded string from a file as its value.")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(String _file) {
    this._file = _file;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL of the file hosted on the server of your own or other third-party companies. If this url property is specified, the file property is not required.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the file hosted on the server of your own or other third-party companies. If this url property is specified, the file property is not required.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest scheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * The specified time that indicates when to send the message, in Unix milliseconds format. Since messages are scheduled in minutes, values less than seconds are discarded. The specified time can be between 5 minutes and 43,200 minutes (30 days) from the current time.
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specified time that indicates when to send the message, in Unix milliseconds format. Since messages are scheduled in minutes, values less than seconds are discarded. The specified time can be between 5 minutes and 43,200 minutes (30 days) from the current time.")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies a custom message type used for message grouping. The length is limited to 128 characters. * Custom types are also used to segment metrics within Sendbird&#39;s Advanced analytics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a custom message type used for message grouping. The length is limited to 128 characters. * Custom types are also used to segment metrics within Sendbird's Advanced analytics, which enables the sub-classification of data views.")
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


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type, or JSON formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type, or JSON formatted string.")
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


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest sendPush(Boolean sendPush) {
    this.sendPush = sendPush;
    return this;
  }

   /**
   * Determines whether to send a push notification of the message to the channel members. This property only applies to group channels. (Default is true)
   * @return sendPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to send a push notification of the message to the channel members. This property only applies to group channels. (Default is true)")
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


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest mentionType(String mentionType) {
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Specifies the mentioning method that indicates which user receives a notification of the message. Acceptable values are users and channels. If set to users, only the users specified in the mentioned_user_ids property below are notified. If set to channels, all users in the channel are notified. (Default &#x3D; users)
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the mentioning method that indicates which user receives a notification of the message. Acceptable values are users and channels. If set to users, only the users specified in the mentioned_user_ids property below are notified. If set to channels, all users in the channel are notified. (Default = users)")
  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMentionType() {
    return mentionType;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionType(String mentionType) {
    this.mentionType = mentionType;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest mentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest addMentionedUserIdsItem(String mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<>();
    }
    this.mentionedUserIds.add(mentionedUserIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users who will receive a notification of the message.
   * @return mentionedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of the users who will receive a notification of the message.")
  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMentionedUserIds() {
    return mentionedUserIds;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest isSilent(Boolean isSilent) {
    this.isSilent = isSilent;
    return this;
  }

   /**
   * Determines whether to send a message without updating some of the following channel properties. If set to true, the channel&#39;s last_message is updated only for the sender while its unread_message_count remains unchanged for all channel members. Also, a push notification isn&#39;t sent to the users receiving the message. If the message is sent to a hidden channel, the channel remains hidden. (Default is false)
   * @return isSilent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to send a message without updating some of the following channel properties. If set to true, the channel's last_message is updated only for the sender while its unread_message_count remains unchanged for all channel members. Also, a push notification isn't sent to the users receiving the message. If the message is sent to a hidden channel, the channel remains hidden. (Default is false)")
  @JsonProperty(JSON_PROPERTY_IS_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSilent() {
    return isSilent;
  }


  @JsonProperty(JSON_PROPERTY_IS_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSilent(Boolean isSilent) {
    this.isSilent = isSilent;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest markAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Determines whether to mark the message as read for the sender. If set to false, then the sender&#39;s unread_count and read_receipt remain unchanged after the message is sent. (Default is true)
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the message as read for the sender. If set to false, then the sender's unread_count and read_receipt remain unchanged after the message is sent. (Default is true)")
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


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest sortedMetaarray(List<Object> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest addSortedMetaarrayItem(Object sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Specifies an array of one or more JSON objects consisting of key-values items that store additional message information. Items are saved and returned in the exact order they&#39;ve been specified.
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more JSON objects consisting of key-values items that store additional message information. Items are saved and returned in the exact order they've been specified.")
  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSortedMetaarray() {
    return sortedMetaarray;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortedMetaarray(List<Object> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest dedupId(String dedupId) {
    this.dedupId = dedupId;
    return this;
  }

   /**
   * Specifies a unique ID for the message created by another system. In general, this property is used to prevent the same message data from getting inserted when migrating messages from another system to the Sendbird server. If specified, the server performs a duplicate check using the property value.
   * @return dedupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a unique ID for the message created by another system. In general, this property is used to prevent the same message data from getting inserted when migrating messages from another system to the Sendbird server. If specified, the server performs a duplicate check using the property value.")
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


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest apnsBundleId(String apnsBundleId) {
    this.apnsBundleId = apnsBundleId;
    return this;
  }

   /**
   * Specifies the bundle ID of the client app in order to send a push notification to iOS devices. You can find this in Settings &gt; Chat &gt; Notifications &gt; Push notification services on Sendbird Dashboard.
   * @return apnsBundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the bundle ID of the client app in order to send a push notification to iOS devices. You can find this in Settings > Chat > Notifications > Push notification services on Sendbird Dashboard.")
  @JsonProperty(JSON_PROPERTY_APNS_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApnsBundleId() {
    return apnsBundleId;
  }


  @JsonProperty(JSON_PROPERTY_APNS_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApnsBundleId(String apnsBundleId) {
    this.apnsBundleId = apnsBundleId;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest appleCriticalAlertOptions(Object appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
    return this;
  }

   /**
   * Specifies options that support Apple&#39;s critical alerts and checks whether the message is a critical alert.
   * @return appleCriticalAlertOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies options that support Apple's critical alerts and checks whether the message is a critical alert.")
  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAppleCriticalAlertOptions() {
    return appleCriticalAlertOptions;
  }


  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppleCriticalAlertOptions(Object appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest sound(String sound) {
    this.sound = sound;
    return this;
  }

   /**
   * Specifies the name of a sound file that is used for critical alerts.
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of a sound file that is used for critical alerts.")
  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSound() {
    return sound;
  }


  @JsonProperty(JSON_PROPERTY_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSound(String sound) {
    this.sound = sound;
  }


  public V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest volume(Float volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Specifies the volume of the critical alert sound. The volume ranges from 0.0to 1.0, which indicates silent and full volume, respectively. (Default &#x3D; 1.0)
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the volume of the critical alert sound. The volume ranges from 0.0to 1.0, which indicates silent and full volume, respectively. (Default = 1.0)")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(Float volume) {
    this.volume = volume;
  }


  /**
   * Return true if this _v3_group_channels__channel_url__scheduled_messages__scheduled_message_id__delete_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = (V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest) o;
    return Objects.equals(this.messageType, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.messageType) &&
        Objects.equals(this.userId, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.userId) &&
        Objects.equals(this.message, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.message) &&
        Objects.equals(this._file, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest._file) &&
        Objects.equals(this.url, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.url) &&
        Objects.equals(this.scheduledAt, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.scheduledAt) &&
        Objects.equals(this.customType, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.customType) &&
        Objects.equals(this.data, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.data) &&
        Objects.equals(this.sendPush, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.sendPush) &&
        Objects.equals(this.mentionType, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.mentionType) &&
        Objects.equals(this.mentionedUserIds, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.mentionedUserIds) &&
        Objects.equals(this.isSilent, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.isSilent) &&
        Objects.equals(this.markAsRead, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.markAsRead) &&
        Objects.equals(this.sortedMetaarray, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.sortedMetaarray) &&
        Objects.equals(this.dedupId, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.dedupId) &&
        Objects.equals(this.apnsBundleId, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.apnsBundleId) &&
        Objects.equals(this.appleCriticalAlertOptions, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.appleCriticalAlertOptions) &&
        Objects.equals(this.sound, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.sound) &&
        Objects.equals(this.volume, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, userId, message, _file, url, scheduledAt, customType, data, sendPush, mentionType, mentionedUserIds, isSilent, markAsRead, sortedMetaarray, dedupId, apnsBundleId, appleCriticalAlertOptions, sound, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest {\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sendPush: ").append(toIndentedString(sendPush)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
    sb.append("    isSilent: ").append(toIndentedString(isSilent)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
    sb.append("    dedupId: ").append(toIndentedString(dedupId)).append("\n");
    sb.append("    apnsBundleId: ").append(toIndentedString(apnsBundleId)).append("\n");
    sb.append("    appleCriticalAlertOptions: ").append(toIndentedString(appleCriticalAlertOptions)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
