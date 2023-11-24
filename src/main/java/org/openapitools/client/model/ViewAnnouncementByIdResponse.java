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
import org.openapitools.client.model.ScheduleAnnouncementResponseCreateChannelOptions;
import org.openapitools.client.model.ScheduleAnnouncementResponseMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewAnnouncementByIdResponse
 */
@JsonPropertyOrder({
  ViewAnnouncementByIdResponse.JSON_PROPERTY_UNIQUE_ID,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_ANNOUNCEMENT_GROUP,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_MESSAGE,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_ENABLE_PUSH,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_TARGET_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_TARGET_USER_COUNT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_TARGET_CHANNEL_COUNT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_STATUS,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_SCHEDULED_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_CEASE_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_RESUME_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_COMPLETED_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_SENT_USER_COUNT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_OPEN_COUNT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_OPEN_RATE,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_CREATE_CHANNEL,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_END_AT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_MARK_AS_READ,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_SENT_CHANNEL_COUNT,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_TARGET_CHANNEL_TYPE,
  ViewAnnouncementByIdResponse.JSON_PROPERTY_TARGET_CUSTOM_TYPE
})
@JsonTypeName("viewAnnouncementByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class ViewAnnouncementByIdResponse {
  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_ANNOUNCEMENT_GROUP = "announcement_group";
  private String announcementGroup;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private ScheduleAnnouncementResponseMessage message;

  public static final String JSON_PROPERTY_ENABLE_PUSH = "enable_push";
  private Boolean enablePush;

  public static final String JSON_PROPERTY_TARGET_AT = "target_at";
  private String targetAt;

  public static final String JSON_PROPERTY_TARGET_USER_COUNT = "target_user_count";
  private BigDecimal targetUserCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_COUNT = "target_channel_count";
  private BigDecimal targetChannelCount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private BigDecimal scheduledAt;

  public static final String JSON_PROPERTY_CEASE_AT = "cease_at";
  private String ceaseAt;

  public static final String JSON_PROPERTY_RESUME_AT = "resume_at";
  private String resumeAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private BigDecimal completedAt;

  public static final String JSON_PROPERTY_SENT_USER_COUNT = "sent_user_count";
  private BigDecimal sentUserCount;

  public static final String JSON_PROPERTY_OPEN_COUNT = "open_count";
  private BigDecimal openCount;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_CREATE_CHANNEL = "create_channel";
  private Boolean createChannel;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS = "create_channel_options";
  private ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private BigDecimal endAt;

  public static final String JSON_PROPERTY_MARK_AS_READ = "mark_as_read";
  private Boolean markAsRead;

  public static final String JSON_PROPERTY_SENT_CHANNEL_COUNT = "sent_channel_count";
  private BigDecimal sentChannelCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_TYPE = "target_channel_type";
  private String targetChannelType;

  public static final String JSON_PROPERTY_TARGET_CUSTOM_TYPE = "target_custom_type";
  private String targetCustomType;

  public ViewAnnouncementByIdResponse() { 
  }

  public ViewAnnouncementByIdResponse uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ViewAnnouncementByIdResponse announcementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public ViewAnnouncementByIdResponse message(ScheduleAnnouncementResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleAnnouncementResponseMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(ScheduleAnnouncementResponseMessage message) {
    this.message = message;
  }


  public ViewAnnouncementByIdResponse enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePush() {
    return enablePush;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }


  public ViewAnnouncementByIdResponse targetAt(String targetAt) {
    this.targetAt = targetAt;
    return this;
  }

   /**
   * Get targetAt
   * @return targetAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetAt() {
    return targetAt;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAt(String targetAt) {
    this.targetAt = targetAt;
  }


  public ViewAnnouncementByIdResponse targetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
    return this;
  }

   /**
   * Get targetUserCount
   * @return targetUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetUserCount() {
    return targetUserCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
  }


  public ViewAnnouncementByIdResponse targetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
    return this;
  }

   /**
   * Get targetChannelCount
   * @return targetChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetChannelCount() {
    return targetChannelCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
  }


  public ViewAnnouncementByIdResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ViewAnnouncementByIdResponse scheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ViewAnnouncementByIdResponse ceaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
    return this;
  }

   /**
   * Get ceaseAt
   * @return ceaseAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCeaseAt() {
    return ceaseAt;
  }


  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCeaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
  }


  public ViewAnnouncementByIdResponse resumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Get resumeAt
   * @return resumeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResumeAt() {
    return resumeAt;
  }


  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
  }


  public ViewAnnouncementByIdResponse completedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
  }


  public ViewAnnouncementByIdResponse sentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
    return this;
  }

   /**
   * Get sentUserCount
   * @return sentUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENT_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSentUserCount() {
    return sentUserCount;
  }


  @JsonProperty(JSON_PROPERTY_SENT_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
  }


  public ViewAnnouncementByIdResponse openCount(BigDecimal openCount) {
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenCount() {
    return openCount;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenCount(BigDecimal openCount) {
    this.openCount = openCount;
  }


  public ViewAnnouncementByIdResponse openRate(BigDecimal openRate) {
    this.openRate = openRate;
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenRate(BigDecimal openRate) {
    this.openRate = openRate;
  }


  public ViewAnnouncementByIdResponse createChannel(Boolean createChannel) {
    this.createChannel = createChannel;
    return this;
  }

   /**
   * Get createChannel
   * @return createChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateChannel() {
    return createChannel;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannel(Boolean createChannel) {
    this.createChannel = createChannel;
  }


  public ViewAnnouncementByIdResponse createChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
    return this;
  }

   /**
   * Get createChannelOptions
   * @return createChannelOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleAnnouncementResponseCreateChannelOptions getCreateChannelOptions() {
    return createChannelOptions;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
  }


  public ViewAnnouncementByIdResponse endAt(BigDecimal endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public ViewAnnouncementByIdResponse markAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Get markAsRead
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ViewAnnouncementByIdResponse sentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
    return this;
  }

   /**
   * Get sentChannelCount
   * @return sentChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENT_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSentChannelCount() {
    return sentChannelCount;
  }


  @JsonProperty(JSON_PROPERTY_SENT_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
  }


  public ViewAnnouncementByIdResponse targetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
    return this;
  }

   /**
   * Get targetChannelType
   * @return targetChannelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetChannelType() {
    return targetChannelType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
  }


  public ViewAnnouncementByIdResponse targetCustomType(String targetCustomType) {
    this.targetCustomType = targetCustomType;
    return this;
  }

   /**
   * Get targetCustomType
   * @return targetCustomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetCustomType() {
    return targetCustomType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCustomType(String targetCustomType) {
    this.targetCustomType = targetCustomType;
  }


  /**
   * Return true if this viewAnnouncementByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewAnnouncementByIdResponse viewAnnouncementByIdResponse = (ViewAnnouncementByIdResponse) o;
    return Objects.equals(this.uniqueId, viewAnnouncementByIdResponse.uniqueId) &&
        Objects.equals(this.announcementGroup, viewAnnouncementByIdResponse.announcementGroup) &&
        Objects.equals(this.message, viewAnnouncementByIdResponse.message) &&
        Objects.equals(this.enablePush, viewAnnouncementByIdResponse.enablePush) &&
        Objects.equals(this.targetAt, viewAnnouncementByIdResponse.targetAt) &&
        Objects.equals(this.targetUserCount, viewAnnouncementByIdResponse.targetUserCount) &&
        Objects.equals(this.targetChannelCount, viewAnnouncementByIdResponse.targetChannelCount) &&
        Objects.equals(this.status, viewAnnouncementByIdResponse.status) &&
        Objects.equals(this.scheduledAt, viewAnnouncementByIdResponse.scheduledAt) &&
        Objects.equals(this.ceaseAt, viewAnnouncementByIdResponse.ceaseAt) &&
        Objects.equals(this.resumeAt, viewAnnouncementByIdResponse.resumeAt) &&
        Objects.equals(this.completedAt, viewAnnouncementByIdResponse.completedAt) &&
        Objects.equals(this.sentUserCount, viewAnnouncementByIdResponse.sentUserCount) &&
        Objects.equals(this.openCount, viewAnnouncementByIdResponse.openCount) &&
        Objects.equals(this.openRate, viewAnnouncementByIdResponse.openRate) &&
        Objects.equals(this.createChannel, viewAnnouncementByIdResponse.createChannel) &&
        Objects.equals(this.createChannelOptions, viewAnnouncementByIdResponse.createChannelOptions) &&
        Objects.equals(this.endAt, viewAnnouncementByIdResponse.endAt) &&
        Objects.equals(this.markAsRead, viewAnnouncementByIdResponse.markAsRead) &&
        Objects.equals(this.sentChannelCount, viewAnnouncementByIdResponse.sentChannelCount) &&
        Objects.equals(this.targetChannelType, viewAnnouncementByIdResponse.targetChannelType) &&
        Objects.equals(this.targetCustomType, viewAnnouncementByIdResponse.targetCustomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, announcementGroup, message, enablePush, targetAt, targetUserCount, targetChannelCount, status, scheduledAt, ceaseAt, resumeAt, completedAt, sentUserCount, openCount, openRate, createChannel, createChannelOptions, endAt, markAsRead, sentChannelCount, targetChannelType, targetCustomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewAnnouncementByIdResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    targetAt: ").append(toIndentedString(targetAt)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    ceaseAt: ").append(toIndentedString(ceaseAt)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    createChannel: ").append(toIndentedString(createChannel)).append("\n");
    sb.append("    createChannelOptions: ").append(toIndentedString(createChannelOptions)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    sentChannelCount: ").append(toIndentedString(sentChannelCount)).append("\n");
    sb.append("    targetChannelType: ").append(toIndentedString(targetChannelType)).append("\n");
    sb.append("    targetCustomType: ").append(toIndentedString(targetCustomType)).append("\n");
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

