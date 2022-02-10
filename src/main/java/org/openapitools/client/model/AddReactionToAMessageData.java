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

/**
 * AddReactionToAMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class AddReactionToAMessageData {
  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private Integer messageId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_REACTION = "reaction";
  @SerializedName(SERIALIZED_NAME_REACTION)
  private String reaction;

  public AddReactionToAMessageData() { 
  }

  public AddReactionToAMessageData channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public AddReactionToAMessageData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public AddReactionToAMessageData messageId(Integer messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to add a reaction to.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to add a reaction to.")

  public Integer getMessageId() {
    return messageId;
  }


  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  public AddReactionToAMessageData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user who reacts to the message.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user who reacts to the message.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AddReactionToAMessageData reaction(String reaction) {
    
    this.reaction = reaction;
    return this;
  }

   /**
   * Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.
   * @return reaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.")

  public String getReaction() {
    return reaction;
  }


  public void setReaction(String reaction) {
    this.reaction = reaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddReactionToAMessageData addReactionToAMessageData = (AddReactionToAMessageData) o;
    return Objects.equals(this.channelType, addReactionToAMessageData.channelType) &&
        Objects.equals(this.channelUrl, addReactionToAMessageData.channelUrl) &&
        Objects.equals(this.messageId, addReactionToAMessageData.messageId) &&
        Objects.equals(this.userId, addReactionToAMessageData.userId) &&
        Objects.equals(this.reaction, addReactionToAMessageData.reaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, userId, reaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddReactionToAMessageData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
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

