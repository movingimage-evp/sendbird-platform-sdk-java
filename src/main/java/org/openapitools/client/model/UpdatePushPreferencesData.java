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
 * UpdatePushPreferencesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class UpdatePushPreferencesData {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_PUSH_TRIGGER_OPTION = "push_trigger_option";
  @SerializedName(SERIALIZED_NAME_PUSH_TRIGGER_OPTION)
  private String pushTriggerOption;

  public static final String SERIALIZED_NAME_DO_NOT_DISTURB = "do_not_disturb";
  @SerializedName(SERIALIZED_NAME_DO_NOT_DISTURB)
  private Boolean doNotDisturb;

  public static final String SERIALIZED_NAME_START_HOUR = "start_hour";
  @SerializedName(SERIALIZED_NAME_START_HOUR)
  private Integer startHour;

  public static final String SERIALIZED_NAME_START_MIN = "start_min";
  @SerializedName(SERIALIZED_NAME_START_MIN)
  private Integer startMin;

  public static final String SERIALIZED_NAME_END_HOUR = "end_hour";
  @SerializedName(SERIALIZED_NAME_END_HOUR)
  private Integer endHour;

  public static final String SERIALIZED_NAME_END_MIN = "end_min";
  @SerializedName(SERIALIZED_NAME_END_MIN)
  private Integer endMin;

  public static final String SERIALIZED_NAME_SNOOZE_ENABLED = "snooze_enabled";
  @SerializedName(SERIALIZED_NAME_SNOOZE_ENABLED)
  private Boolean snoozeEnabled;

  public static final String SERIALIZED_NAME_SNOOZE_START_TS = "snooze_start_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_START_TS)
  private Integer snoozeStartTs;

  public static final String SERIALIZED_NAME_SNOOZE_END_TS = "snooze_end_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_END_TS)
  private Integer snoozeEndTs;

  public static final String SERIALIZED_NAME_BLOCK_PUSH_FROM_BOTS = "block_push_from_bots";
  @SerializedName(SERIALIZED_NAME_BLOCK_PUSH_FROM_BOTS)
  private Boolean blockPushFromBots;

  public static final String SERIALIZED_NAME_PUSH_BLOCKED_BOT_IDS = "push_blocked_bot_ids";
  @SerializedName(SERIALIZED_NAME_PUSH_BLOCKED_BOT_IDS)
  private List<Integer> pushBlockedBotIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public UpdatePushPreferencesData() { 
  }

  public UpdatePushPreferencesData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the target user.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the target user.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UpdatePushPreferencesData pushTriggerOption(String pushTriggerOption) {
    
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Determines the type of push notification trigger to apply to the user&#39;s joined group channels. Valid values are the following:&lt;br /&gt;- all (default): when disconnected from Sendbird server, the user receives notifications for all new messages including mentioned messages the user has been mentioned in.&lt;br /&gt;- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages the user has been mentioned in.&lt;br /&gt;- off: the user doesn&#39;t receive any notifications.
   * @return pushTriggerOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the type of push notification trigger to apply to the user's joined group channels. Valid values are the following:<br />- all (default): when disconnected from Sendbird server, the user receives notifications for all new messages including mentioned messages the user has been mentioned in.<br />- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages the user has been mentioned in.<br />- off: the user doesn't receive any notifications.")

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  public UpdatePushPreferencesData doNotDisturb(Boolean doNotDisturb) {
    
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Determines whether to pause notification messages for the user during a specific time of day. (Default: false)
   * @return doNotDisturb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to pause notification messages for the user during a specific time of day. (Default: false)")

  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }


  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }


  public UpdatePushPreferencesData startHour(Integer startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * Specifies the hour to start pausing the notifications for Do Not Disturb of the user.
   * @return startHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the hour to start pausing the notifications for Do Not Disturb of the user.")

  public Integer getStartHour() {
    return startHour;
  }


  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }


  public UpdatePushPreferencesData startMin(Integer startMin) {
    
    this.startMin = startMin;
    return this;
  }

   /**
   * Specifies the minute of the hour to start pausing the notifications for Do Not Disturb of the user.
   * @return startMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the minute of the hour to start pausing the notifications for Do Not Disturb of the user.")

  public Integer getStartMin() {
    return startMin;
  }


  public void setStartMin(Integer startMin) {
    this.startMin = startMin;
  }


  public UpdatePushPreferencesData endHour(Integer endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * Specifies the hour to stop pausing the notifications for Do Not Disturb of the user.
   * @return endHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the hour to stop pausing the notifications for Do Not Disturb of the user.")

  public Integer getEndHour() {
    return endHour;
  }


  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public UpdatePushPreferencesData endMin(Integer endMin) {
    
    this.endMin = endMin;
    return this;
  }

   /**
   * Specifies the minute of the hour to stop pausing the notifications for Do Not Disturb of the user.
   * @return endMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the minute of the hour to stop pausing the notifications for Do Not Disturb of the user.")

  public Integer getEndMin() {
    return endMin;
  }


  public void setEndMin(Integer endMin) {
    this.endMin = endMin;
  }


  public UpdatePushPreferencesData snoozeEnabled(Boolean snoozeEnabled) {
    
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Determines whether to snooze notification messages for the user during a specific period of time. (Default: false)
   * @return snoozeEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to snooze notification messages for the user during a specific period of time. (Default: false)")

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public UpdatePushPreferencesData snoozeStartTs(Integer snoozeStartTs) {
    
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Specifies the timestamp of when to start snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).
   * @return snoozeStartTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timestamp of when to start snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).")

  public Integer getSnoozeStartTs() {
    return snoozeStartTs;
  }


  public void setSnoozeStartTs(Integer snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public UpdatePushPreferencesData snoozeEndTs(Integer snoozeEndTs) {
    
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Specifies the timestamp of when to end snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).
   * @return snoozeEndTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timestamp of when to end snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).")

  public Integer getSnoozeEndTs() {
    return snoozeEndTs;
  }


  public void setSnoozeEndTs(Integer snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public UpdatePushPreferencesData blockPushFromBots(Boolean blockPushFromBots) {
    
    this.blockPushFromBots = blockPushFromBots;
    return this;
  }

   /**
   * Determines whether to block push notifications from [all bots](/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots) within the application. If the push_blocked_bot_ids is specified, notifications only from the bots in the property are blocked. (Default: false)
   * @return blockPushFromBots
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to block push notifications from [all bots](/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots) within the application. If the push_blocked_bot_ids is specified, notifications only from the bots in the property are blocked. (Default: false)")

  public Boolean getBlockPushFromBots() {
    return blockPushFromBots;
  }


  public void setBlockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
  }


  public UpdatePushPreferencesData pushBlockedBotIds(List<Integer> pushBlockedBotIds) {
    
    this.pushBlockedBotIds = pushBlockedBotIds;
    return this;
  }

  public UpdatePushPreferencesData addPushBlockedBotIdsItem(Integer pushBlockedBotIdsItem) {
    this.pushBlockedBotIds.add(pushBlockedBotIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of bots whose push notifications are blocked. This property is effective only when the block_push_from_bots is set to true.
   * @return pushBlockedBotIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of bots whose push notifications are blocked. This property is effective only when the block_push_from_bots is set to true.")

  public List<Integer> getPushBlockedBotIds() {
    return pushBlockedBotIds;
  }


  public void setPushBlockedBotIds(List<Integer> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
  }


  public UpdatePushPreferencesData timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Specifies the timezone to be applied to push preferences with a value such as UTC, Asia/Seoul, Europe/London, etc.
   * @return timezone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timezone to be applied to push preferences with a value such as UTC, Asia/Seoul, Europe/London, etc.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public UpdatePushPreferencesData pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app.")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushPreferencesData updatePushPreferencesData = (UpdatePushPreferencesData) o;
    return Objects.equals(this.userId, updatePushPreferencesData.userId) &&
        Objects.equals(this.pushTriggerOption, updatePushPreferencesData.pushTriggerOption) &&
        Objects.equals(this.doNotDisturb, updatePushPreferencesData.doNotDisturb) &&
        Objects.equals(this.startHour, updatePushPreferencesData.startHour) &&
        Objects.equals(this.startMin, updatePushPreferencesData.startMin) &&
        Objects.equals(this.endHour, updatePushPreferencesData.endHour) &&
        Objects.equals(this.endMin, updatePushPreferencesData.endMin) &&
        Objects.equals(this.snoozeEnabled, updatePushPreferencesData.snoozeEnabled) &&
        Objects.equals(this.snoozeStartTs, updatePushPreferencesData.snoozeStartTs) &&
        Objects.equals(this.snoozeEndTs, updatePushPreferencesData.snoozeEndTs) &&
        Objects.equals(this.blockPushFromBots, updatePushPreferencesData.blockPushFromBots) &&
        Objects.equals(this.pushBlockedBotIds, updatePushPreferencesData.pushBlockedBotIds) &&
        Objects.equals(this.timezone, updatePushPreferencesData.timezone) &&
        Objects.equals(this.pushSound, updatePushPreferencesData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, pushTriggerOption, doNotDisturb, startHour, startMin, endHour, endMin, snoozeEnabled, snoozeStartTs, snoozeEndTs, blockPushFromBots, pushBlockedBotIds, timezone, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushPreferencesData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    blockPushFromBots: ").append(toIndentedString(blockPushFromBots)).append("\n");
    sb.append("    pushBlockedBotIds: ").append(toIndentedString(pushBlockedBotIds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

