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
import org.openapitools.client.model.SendBirdUser;

/**
 * SendBirdOpenChannel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T12:13:33.713738Z[Europe/London]")
public class SendBirdOpenChannel {
  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private SendBirdUser creator;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_IS_EPHEMERAL = "is_ephemeral";
  @SerializedName(SERIALIZED_NAME_IS_EPHEMERAL)
  private Boolean isEphemeral;

  public static final String SERIALIZED_NAME_IS_FROZEN = "is_frozen";
  @SerializedName(SERIALIZED_NAME_IS_FROZEN)
  private Boolean isFrozen;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATORS = "operators";
  @SerializedName(SERIALIZED_NAME_OPERATORS)
  private List<SendBirdUser> operators = null;

  public static final String SERIALIZED_NAME_PARTICIPANT_COUNT = "participant_count";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_COUNT)
  private BigDecimal participantCount;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public SendBirdOpenChannel() { 
  }

  public SendBirdOpenChannel coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Get coverUrl
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public SendBirdOpenChannel createdAt(BigDecimal createdAt) {
    
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


  public SendBirdOpenChannel creator(SendBirdUser creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getCreator() {
    return creator;
  }


  public void setCreator(SendBirdUser creator) {
    this.creator = creator;
  }


  public SendBirdOpenChannel customType(String customType) {
    
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


  public SendBirdOpenChannel data(String data) {
    
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


  public SendBirdOpenChannel isEphemeral(Boolean isEphemeral) {
    
    this.isEphemeral = isEphemeral;
    return this;
  }

   /**
   * Get isEphemeral
   * @return isEphemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEphemeral() {
    return isEphemeral;
  }


  public void setIsEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
  }


  public SendBirdOpenChannel isFrozen(Boolean isFrozen) {
    
    this.isFrozen = isFrozen;
    return this;
  }

   /**
   * Get isFrozen
   * @return isFrozen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsFrozen() {
    return isFrozen;
  }


  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }


  public SendBirdOpenChannel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SendBirdOpenChannel operators(List<SendBirdUser> operators) {
    
    this.operators = operators;
    return this;
  }

  public SendBirdOpenChannel addOperatorsItem(SendBirdUser operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<SendBirdUser>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * Get operators
   * @return operators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdUser> getOperators() {
    return operators;
  }


  public void setOperators(List<SendBirdUser> operators) {
    this.operators = operators;
  }


  public SendBirdOpenChannel participantCount(BigDecimal participantCount) {
    
    this.participantCount = participantCount;
    return this;
  }

   /**
   * Get participantCount
   * @return participantCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getParticipantCount() {
    return participantCount;
  }


  public void setParticipantCount(BigDecimal participantCount) {
    this.participantCount = participantCount;
  }


  public SendBirdOpenChannel channelUrl(String channelUrl) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdOpenChannel sendBirdOpenChannel = (SendBirdOpenChannel) o;
    return Objects.equals(this.coverUrl, sendBirdOpenChannel.coverUrl) &&
        Objects.equals(this.createdAt, sendBirdOpenChannel.createdAt) &&
        Objects.equals(this.creator, sendBirdOpenChannel.creator) &&
        Objects.equals(this.customType, sendBirdOpenChannel.customType) &&
        Objects.equals(this.data, sendBirdOpenChannel.data) &&
        Objects.equals(this.isEphemeral, sendBirdOpenChannel.isEphemeral) &&
        Objects.equals(this.isFrozen, sendBirdOpenChannel.isFrozen) &&
        Objects.equals(this.name, sendBirdOpenChannel.name) &&
        Objects.equals(this.operators, sendBirdOpenChannel.operators) &&
        Objects.equals(this.participantCount, sendBirdOpenChannel.participantCount) &&
        Objects.equals(this.channelUrl, sendBirdOpenChannel.channelUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverUrl, createdAt, creator, customType, data, isEphemeral, isFrozen, name, operators, participantCount, channelUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdOpenChannel {\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isEphemeral: ").append(toIndentedString(isEphemeral)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
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

