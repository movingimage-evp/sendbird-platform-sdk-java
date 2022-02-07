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
import org.openapitools.client.model.InlineResponse20063File;

/**
 * InlineResponse20064
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20064 {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_CSV_DELIMITER = "csv_delimiter";
  @SerializedName(SERIALIZED_NAME_CSV_DELIMITER)
  private String csvDelimiter;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_START_TS = "start_ts";
  @SerializedName(SERIALIZED_NAME_START_TS)
  private BigDecimal startTs;

  public static final String SERIALIZED_NAME_END_TS = "end_ts";
  @SerializedName(SERIALIZED_NAME_END_TS)
  private BigDecimal endTs;

  public static final String SERIALIZED_NAME_CHANNEL_URLS = "channel_urls";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URLS)
  private List<String> channelUrls = null;

  public static final String SERIALIZED_NAME_CHANNEL_CUSTOM_TYPES = "channel_custom_types";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CUSTOM_TYPES)
  private List<String> channelCustomTypes = null;

  public static final String SERIALIZED_NAME_SENDER_IDS = "sender_ids";
  @SerializedName(SERIALIZED_NAME_SENDER_IDS)
  private List<String> senderIds = null;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private InlineResponse20063File file;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<BigDecimal> userIds = null;

  public InlineResponse20064() { 
  }

  public InlineResponse20064 requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public InlineResponse20064 dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public InlineResponse20064 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public InlineResponse20064 format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public InlineResponse20064 csvDelimiter(String csvDelimiter) {
    
    this.csvDelimiter = csvDelimiter;
    return this;
  }

   /**
   * Get csvDelimiter
   * @return csvDelimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCsvDelimiter() {
    return csvDelimiter;
  }


  public void setCsvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
  }


  public InlineResponse20064 timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public InlineResponse20064 createdAt(BigDecimal createdAt) {
    
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


  public InlineResponse20064 startTs(BigDecimal startTs) {
    
    this.startTs = startTs;
    return this;
  }

   /**
   * Get startTs
   * @return startTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartTs() {
    return startTs;
  }


  public void setStartTs(BigDecimal startTs) {
    this.startTs = startTs;
  }


  public InlineResponse20064 endTs(BigDecimal endTs) {
    
    this.endTs = endTs;
    return this;
  }

   /**
   * Get endTs
   * @return endTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndTs() {
    return endTs;
  }


  public void setEndTs(BigDecimal endTs) {
    this.endTs = endTs;
  }


  public InlineResponse20064 channelUrls(List<String> channelUrls) {
    
    this.channelUrls = channelUrls;
    return this;
  }

  public InlineResponse20064 addChannelUrlsItem(String channelUrlsItem) {
    if (this.channelUrls == null) {
      this.channelUrls = new ArrayList<String>();
    }
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Get channelUrls
   * @return channelUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }


  public InlineResponse20064 channelCustomTypes(List<String> channelCustomTypes) {
    
    this.channelCustomTypes = channelCustomTypes;
    return this;
  }

  public InlineResponse20064 addChannelCustomTypesItem(String channelCustomTypesItem) {
    if (this.channelCustomTypes == null) {
      this.channelCustomTypes = new ArrayList<String>();
    }
    this.channelCustomTypes.add(channelCustomTypesItem);
    return this;
  }

   /**
   * Get channelCustomTypes
   * @return channelCustomTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChannelCustomTypes() {
    return channelCustomTypes;
  }


  public void setChannelCustomTypes(List<String> channelCustomTypes) {
    this.channelCustomTypes = channelCustomTypes;
  }


  public InlineResponse20064 senderIds(List<String> senderIds) {
    
    this.senderIds = senderIds;
    return this;
  }

  public InlineResponse20064 addSenderIdsItem(String senderIdsItem) {
    if (this.senderIds == null) {
      this.senderIds = new ArrayList<String>();
    }
    this.senderIds.add(senderIdsItem);
    return this;
  }

   /**
   * Get senderIds
   * @return senderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSenderIds() {
    return senderIds;
  }


  public void setSenderIds(List<String> senderIds) {
    this.senderIds = senderIds;
  }


  public InlineResponse20064 file(InlineResponse20063File file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20063File getFile() {
    return file;
  }


  public void setFile(InlineResponse20063File file) {
    this.file = file;
  }


  public InlineResponse20064 userIds(List<BigDecimal> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public InlineResponse20064 addUserIdsItem(BigDecimal userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<BigDecimal>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<BigDecimal> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20064 inlineResponse20064 = (InlineResponse20064) o;
    return Objects.equals(this.requestId, inlineResponse20064.requestId) &&
        Objects.equals(this.dataType, inlineResponse20064.dataType) &&
        Objects.equals(this.status, inlineResponse20064.status) &&
        Objects.equals(this.format, inlineResponse20064.format) &&
        Objects.equals(this.csvDelimiter, inlineResponse20064.csvDelimiter) &&
        Objects.equals(this.timezone, inlineResponse20064.timezone) &&
        Objects.equals(this.createdAt, inlineResponse20064.createdAt) &&
        Objects.equals(this.startTs, inlineResponse20064.startTs) &&
        Objects.equals(this.endTs, inlineResponse20064.endTs) &&
        Objects.equals(this.channelUrls, inlineResponse20064.channelUrls) &&
        Objects.equals(this.channelCustomTypes, inlineResponse20064.channelCustomTypes) &&
        Objects.equals(this.senderIds, inlineResponse20064.senderIds) &&
        Objects.equals(this.file, inlineResponse20064.file) &&
        Objects.equals(this.userIds, inlineResponse20064.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dataType, status, format, csvDelimiter, timezone, createdAt, startTs, endTs, channelUrls, channelCustomTypes, senderIds, file, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20064 {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    channelCustomTypes: ").append(toIndentedString(channelCustomTypes)).append("\n");
    sb.append("    senderIds: ").append(toIndentedString(senderIds)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
