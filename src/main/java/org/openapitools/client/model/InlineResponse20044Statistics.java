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

/**
 * InlineResponse20044Statistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20044Statistics {
  public static final String SERIALIZED_NAME_DATE_RANGE = "date_range";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private String dateRange;

  public static final String SERIALIZED_NAME_CANCELED_ANNOUNCEMENT_COUNT = "canceled_announcement_count";
  @SerializedName(SERIALIZED_NAME_CANCELED_ANNOUNCEMENT_COUNT)
  private BigDecimal canceledAnnouncementCount;

  public static final String SERIALIZED_NAME_STOPPED_ANNOUNCEMENT_COUNT = "stopped_announcement_count";
  @SerializedName(SERIALIZED_NAME_STOPPED_ANNOUNCEMENT_COUNT)
  private BigDecimal stoppedAnnouncementCount;

  public static final String SERIALIZED_NAME_COMPLETED_ANNOUNCEMENT_COUNT = "completed_announcement_count";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ANNOUNCEMENT_COUNT)
  private BigDecimal completedAnnouncementCount;

  public static final String SERIALIZED_NAME_TOTAL_ANNOUNCEMENT_COUNT = "total_announcement_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ANNOUNCEMENT_COUNT)
  private BigDecimal totalAnnouncementCount;

  public static final String SERIALIZED_NAME_TARGET_CHANNEL_COUNT = "target_channel_count";
  @SerializedName(SERIALIZED_NAME_TARGET_CHANNEL_COUNT)
  private BigDecimal targetChannelCount;

  public static final String SERIALIZED_NAME_TARGET_USER_COUNT = "target_user_count";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_COUNT)
  private BigDecimal targetUserCount;

  public static final String SERIALIZED_NAME_SENT_CHANNEL_COUNT = "sent_channel_count";
  @SerializedName(SERIALIZED_NAME_SENT_CHANNEL_COUNT)
  private BigDecimal sentChannelCount;

  public static final String SERIALIZED_NAME_SENT_USER_COUNT = "sent_user_count";
  @SerializedName(SERIALIZED_NAME_SENT_USER_COUNT)
  private BigDecimal sentUserCount;

  public static final String SERIALIZED_NAME_OPEN_RATE = "open_rate";
  @SerializedName(SERIALIZED_NAME_OPEN_RATE)
  private BigDecimal openRate;

  public static final String SERIALIZED_NAME_OPEN_COUNT = "open_count";
  @SerializedName(SERIALIZED_NAME_OPEN_COUNT)
  private BigDecimal openCount;

  public InlineResponse20044Statistics() { 
  }

  public InlineResponse20044Statistics dateRange(String dateRange) {
    
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateRange() {
    return dateRange;
  }


  public void setDateRange(String dateRange) {
    this.dateRange = dateRange;
  }


  public InlineResponse20044Statistics canceledAnnouncementCount(BigDecimal canceledAnnouncementCount) {
    
    this.canceledAnnouncementCount = canceledAnnouncementCount;
    return this;
  }

   /**
   * Get canceledAnnouncementCount
   * @return canceledAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCanceledAnnouncementCount() {
    return canceledAnnouncementCount;
  }


  public void setCanceledAnnouncementCount(BigDecimal canceledAnnouncementCount) {
    this.canceledAnnouncementCount = canceledAnnouncementCount;
  }


  public InlineResponse20044Statistics stoppedAnnouncementCount(BigDecimal stoppedAnnouncementCount) {
    
    this.stoppedAnnouncementCount = stoppedAnnouncementCount;
    return this;
  }

   /**
   * Get stoppedAnnouncementCount
   * @return stoppedAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStoppedAnnouncementCount() {
    return stoppedAnnouncementCount;
  }


  public void setStoppedAnnouncementCount(BigDecimal stoppedAnnouncementCount) {
    this.stoppedAnnouncementCount = stoppedAnnouncementCount;
  }


  public InlineResponse20044Statistics completedAnnouncementCount(BigDecimal completedAnnouncementCount) {
    
    this.completedAnnouncementCount = completedAnnouncementCount;
    return this;
  }

   /**
   * Get completedAnnouncementCount
   * @return completedAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCompletedAnnouncementCount() {
    return completedAnnouncementCount;
  }


  public void setCompletedAnnouncementCount(BigDecimal completedAnnouncementCount) {
    this.completedAnnouncementCount = completedAnnouncementCount;
  }


  public InlineResponse20044Statistics totalAnnouncementCount(BigDecimal totalAnnouncementCount) {
    
    this.totalAnnouncementCount = totalAnnouncementCount;
    return this;
  }

   /**
   * Get totalAnnouncementCount
   * @return totalAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalAnnouncementCount() {
    return totalAnnouncementCount;
  }


  public void setTotalAnnouncementCount(BigDecimal totalAnnouncementCount) {
    this.totalAnnouncementCount = totalAnnouncementCount;
  }


  public InlineResponse20044Statistics targetChannelCount(BigDecimal targetChannelCount) {
    
    this.targetChannelCount = targetChannelCount;
    return this;
  }

   /**
   * Get targetChannelCount
   * @return targetChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTargetChannelCount() {
    return targetChannelCount;
  }


  public void setTargetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
  }


  public InlineResponse20044Statistics targetUserCount(BigDecimal targetUserCount) {
    
    this.targetUserCount = targetUserCount;
    return this;
  }

   /**
   * Get targetUserCount
   * @return targetUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTargetUserCount() {
    return targetUserCount;
  }


  public void setTargetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
  }


  public InlineResponse20044Statistics sentChannelCount(BigDecimal sentChannelCount) {
    
    this.sentChannelCount = sentChannelCount;
    return this;
  }

   /**
   * Get sentChannelCount
   * @return sentChannelCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSentChannelCount() {
    return sentChannelCount;
  }


  public void setSentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
  }


  public InlineResponse20044Statistics sentUserCount(BigDecimal sentUserCount) {
    
    this.sentUserCount = sentUserCount;
    return this;
  }

   /**
   * Get sentUserCount
   * @return sentUserCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSentUserCount() {
    return sentUserCount;
  }


  public void setSentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
  }


  public InlineResponse20044Statistics openRate(BigDecimal openRate) {
    
    this.openRate = openRate;
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOpenRate() {
    return openRate;
  }


  public void setOpenRate(BigDecimal openRate) {
    this.openRate = openRate;
  }


  public InlineResponse20044Statistics openCount(BigDecimal openCount) {
    
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOpenCount() {
    return openCount;
  }


  public void setOpenCount(BigDecimal openCount) {
    this.openCount = openCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20044Statistics inlineResponse20044Statistics = (InlineResponse20044Statistics) o;
    return Objects.equals(this.dateRange, inlineResponse20044Statistics.dateRange) &&
        Objects.equals(this.canceledAnnouncementCount, inlineResponse20044Statistics.canceledAnnouncementCount) &&
        Objects.equals(this.stoppedAnnouncementCount, inlineResponse20044Statistics.stoppedAnnouncementCount) &&
        Objects.equals(this.completedAnnouncementCount, inlineResponse20044Statistics.completedAnnouncementCount) &&
        Objects.equals(this.totalAnnouncementCount, inlineResponse20044Statistics.totalAnnouncementCount) &&
        Objects.equals(this.targetChannelCount, inlineResponse20044Statistics.targetChannelCount) &&
        Objects.equals(this.targetUserCount, inlineResponse20044Statistics.targetUserCount) &&
        Objects.equals(this.sentChannelCount, inlineResponse20044Statistics.sentChannelCount) &&
        Objects.equals(this.sentUserCount, inlineResponse20044Statistics.sentUserCount) &&
        Objects.equals(this.openRate, inlineResponse20044Statistics.openRate) &&
        Objects.equals(this.openCount, inlineResponse20044Statistics.openCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRange, canceledAnnouncementCount, stoppedAnnouncementCount, completedAnnouncementCount, totalAnnouncementCount, targetChannelCount, targetUserCount, sentChannelCount, sentUserCount, openRate, openCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20044Statistics {\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    canceledAnnouncementCount: ").append(toIndentedString(canceledAnnouncementCount)).append("\n");
    sb.append("    stoppedAnnouncementCount: ").append(toIndentedString(stoppedAnnouncementCount)).append("\n");
    sb.append("    completedAnnouncementCount: ").append(toIndentedString(completedAnnouncementCount)).append("\n");
    sb.append("    totalAnnouncementCount: ").append(toIndentedString(totalAnnouncementCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    sentChannelCount: ").append(toIndentedString(sentChannelCount)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
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
