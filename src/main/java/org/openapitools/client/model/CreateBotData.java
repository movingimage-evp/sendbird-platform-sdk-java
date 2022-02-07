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
 * CreateBotData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class CreateBotData {
  public static final String SERIALIZED_NAME_BOT_USERID = "bot_userid";
  @SerializedName(SERIALIZED_NAME_BOT_USERID)
  private String botUserid;

  public static final String SERIALIZED_NAME_BOT_NICKNAME = "bot_nickname";
  @SerializedName(SERIALIZED_NAME_BOT_NICKNAME)
  private String botNickname;

  public static final String SERIALIZED_NAME_BOT_PROFILE_URL = "bot_profile_url";
  @SerializedName(SERIALIZED_NAME_BOT_PROFILE_URL)
  private String botProfileUrl;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private String botType;

  public static final String SERIALIZED_NAME_BOT_CALLBACK_URL = "bot_callback_url";
  @SerializedName(SERIALIZED_NAME_BOT_CALLBACK_URL)
  private String botCallbackUrl;

  public static final String SERIALIZED_NAME_IS_PRIVACY_MODE = "is_privacy_mode";
  @SerializedName(SERIALIZED_NAME_IS_PRIVACY_MODE)
  private Boolean isPrivacyMode;

  public static final String SERIALIZED_NAME_ENABLE_MARK_AS_READ = "enable_mark_as_read";
  @SerializedName(SERIALIZED_NAME_ENABLE_MARK_AS_READ)
  private Boolean enableMarkAsRead;

  public static final String SERIALIZED_NAME_SHOW_MEMBER = "show_member";
  @SerializedName(SERIALIZED_NAME_SHOW_MEMBER)
  private Boolean showMember;

  public static final String SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE = "channel_invitation_preference";
  @SerializedName(SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE)
  private Integer channelInvitationPreference;

  public CreateBotData() { 
  }

  public CreateBotData botUserid(String botUserid) {
    
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Specifies the unique ID of the bot. The length is limited to 80 characters.
   * @return botUserid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the bot. The length is limited to 80 characters.")

  public String getBotUserid() {
    return botUserid;
  }


  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public CreateBotData botNickname(String botNickname) {
    
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Specifies the bot&#39;s nickname. The length is limited to 80 characters.
   * @return botNickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the bot's nickname. The length is limited to 80 characters.")

  public String getBotNickname() {
    return botNickname;
  }


  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public CreateBotData botProfileUrl(String botProfileUrl) {
    
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Specifies the URL of the bot&#39;s profile image. The size is limited to 2,048 characters.
   * @return botProfileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the bot's profile image. The size is limited to 2,048 characters.")

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public CreateBotData botType(String botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * Specifies the type of the bot that you can specify for categorization. The length is limited to 128 characters.
   * @return botType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the bot that you can specify for categorization. The length is limited to 128 characters.")

  public String getBotType() {
    return botType;
  }


  public void setBotType(String botType) {
    this.botType = botType;
  }


  public CreateBotData botCallbackUrl(String botCallbackUrl) {
    
    this.botCallbackUrl = botCallbackUrl;
    return this;
  }

   /**
   * Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.
   * @return botCallbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.")

  public String getBotCallbackUrl() {
    return botCallbackUrl;
  }


  public void setBotCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
  }


  public CreateBotData isPrivacyMode(Boolean isPrivacyMode) {
    
    this.isPrivacyMode = isPrivacyMode;
    return this;
  }

   /**
   * In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a &#39;/&#39; or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.
   * @return isPrivacyMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a '/' or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.")

  public Boolean getIsPrivacyMode() {
    return isPrivacyMode;
  }


  public void setIsPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
  }


  public CreateBotData enableMarkAsRead(Boolean enableMarkAsRead) {
    
    this.enableMarkAsRead = enableMarkAsRead;
    return this;
  }

   /**
   * Determines whether to mark the bot&#39;s message as read upon sending it. (Default: true)
   * @return enableMarkAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the bot's message as read upon sending it. (Default: true)")

  public Boolean getEnableMarkAsRead() {
    return enableMarkAsRead;
  }


  public void setEnableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
  }


  public CreateBotData showMember(Boolean showMember) {
    
    this.showMember = showMember;
    return this;
  }

   /**
   * Determines whether to include information about the members of each channel in a callback response. (Default: false)
   * @return showMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include information about the members of each channel in a callback response. (Default: false)")

  public Boolean getShowMember() {
    return showMember;
  }


  public void setShowMember(Boolean showMember) {
    this.showMember = showMember;
  }


  public CreateBotData channelInvitationPreference(Integer channelInvitationPreference) {
    
    this.channelInvitationPreference = channelInvitationPreference;
    return this;
  }

   /**
   * Get channelInvitationPreference
   * @return channelInvitationPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChannelInvitationPreference() {
    return channelInvitationPreference;
  }


  public void setChannelInvitationPreference(Integer channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBotData createBotData = (CreateBotData) o;
    return Objects.equals(this.botUserid, createBotData.botUserid) &&
        Objects.equals(this.botNickname, createBotData.botNickname) &&
        Objects.equals(this.botProfileUrl, createBotData.botProfileUrl) &&
        Objects.equals(this.botType, createBotData.botType) &&
        Objects.equals(this.botCallbackUrl, createBotData.botCallbackUrl) &&
        Objects.equals(this.isPrivacyMode, createBotData.isPrivacyMode) &&
        Objects.equals(this.enableMarkAsRead, createBotData.enableMarkAsRead) &&
        Objects.equals(this.showMember, createBotData.showMember) &&
        Objects.equals(this.channelInvitationPreference, createBotData.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botUserid, botNickname, botProfileUrl, botType, botCallbackUrl, isPrivacyMode, enableMarkAsRead, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBotData {\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    botNickname: ").append(toIndentedString(botNickname)).append("\n");
    sb.append("    botProfileUrl: ").append(toIndentedString(botProfileUrl)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    botCallbackUrl: ").append(toIndentedString(botCallbackUrl)).append("\n");
    sb.append("    isPrivacyMode: ").append(toIndentedString(isPrivacyMode)).append("\n");
    sb.append("    enableMarkAsRead: ").append(toIndentedString(enableMarkAsRead)).append("\n");
    sb.append("    showMember: ").append(toIndentedString(showMember)).append("\n");
    sb.append("    channelInvitationPreference: ").append(toIndentedString(channelInvitationPreference)).append("\n");
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
