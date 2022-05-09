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
import org.openapitools.client.model.CreateBotResponseBot;

/**
 * ViewBotByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class ViewBotByIdResponse {
  public static final String SERIALIZED_NAME_BOT = "bot";
  @SerializedName(SERIALIZED_NAME_BOT)
  private CreateBotResponseBot bot;

  public static final String SERIALIZED_NAME_BOT_CALLBACK_URL = "bot_callback_url";
  @SerializedName(SERIALIZED_NAME_BOT_CALLBACK_URL)
  private String botCallbackUrl;

  public static final String SERIALIZED_NAME_ENABLE_MARK_AS_READ = "enable_mark_as_read";
  @SerializedName(SERIALIZED_NAME_ENABLE_MARK_AS_READ)
  private Boolean enableMarkAsRead;

  public static final String SERIALIZED_NAME_IS_PRIVACY_MODE = "is_privacy_mode";
  @SerializedName(SERIALIZED_NAME_IS_PRIVACY_MODE)
  private Boolean isPrivacyMode;

  public static final String SERIALIZED_NAME_SHOW_MEMBER = "show_member";
  @SerializedName(SERIALIZED_NAME_SHOW_MEMBER)
  private Boolean showMember;

  public static final String SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE = "channel_invitation_preference";
  @SerializedName(SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE)
  private BigDecimal channelInvitationPreference;

  public ViewBotByIdResponse() { 
  }

  public ViewBotByIdResponse bot(CreateBotResponseBot bot) {
    
    this.bot = bot;
    return this;
  }

   /**
   * Get bot
   * @return bot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateBotResponseBot getBot() {
    return bot;
  }


  public void setBot(CreateBotResponseBot bot) {
    this.bot = bot;
  }


  public ViewBotByIdResponse botCallbackUrl(String botCallbackUrl) {
    
    this.botCallbackUrl = botCallbackUrl;
    return this;
  }

   /**
   * Get botCallbackUrl
   * @return botCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotCallbackUrl() {
    return botCallbackUrl;
  }


  public void setBotCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
  }


  public ViewBotByIdResponse enableMarkAsRead(Boolean enableMarkAsRead) {
    
    this.enableMarkAsRead = enableMarkAsRead;
    return this;
  }

   /**
   * Get enableMarkAsRead
   * @return enableMarkAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableMarkAsRead() {
    return enableMarkAsRead;
  }


  public void setEnableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
  }


  public ViewBotByIdResponse isPrivacyMode(Boolean isPrivacyMode) {
    
    this.isPrivacyMode = isPrivacyMode;
    return this;
  }

   /**
   * Get isPrivacyMode
   * @return isPrivacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrivacyMode() {
    return isPrivacyMode;
  }


  public void setIsPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
  }


  public ViewBotByIdResponse showMember(Boolean showMember) {
    
    this.showMember = showMember;
    return this;
  }

   /**
   * Get showMember
   * @return showMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowMember() {
    return showMember;
  }


  public void setShowMember(Boolean showMember) {
    this.showMember = showMember;
  }


  public ViewBotByIdResponse channelInvitationPreference(BigDecimal channelInvitationPreference) {
    
    this.channelInvitationPreference = channelInvitationPreference;
    return this;
  }

   /**
   * Get channelInvitationPreference
   * @return channelInvitationPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getChannelInvitationPreference() {
    return channelInvitationPreference;
  }


  public void setChannelInvitationPreference(BigDecimal channelInvitationPreference) {
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
    ViewBotByIdResponse viewBotByIdResponse = (ViewBotByIdResponse) o;
    return Objects.equals(this.bot, viewBotByIdResponse.bot) &&
        Objects.equals(this.botCallbackUrl, viewBotByIdResponse.botCallbackUrl) &&
        Objects.equals(this.enableMarkAsRead, viewBotByIdResponse.enableMarkAsRead) &&
        Objects.equals(this.isPrivacyMode, viewBotByIdResponse.isPrivacyMode) &&
        Objects.equals(this.showMember, viewBotByIdResponse.showMember) &&
        Objects.equals(this.channelInvitationPreference, viewBotByIdResponse.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bot, botCallbackUrl, enableMarkAsRead, isPrivacyMode, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewBotByIdResponse {\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    botCallbackUrl: ").append(toIndentedString(botCallbackUrl)).append("\n");
    sb.append("    enableMarkAsRead: ").append(toIndentedString(enableMarkAsRead)).append("\n");
    sb.append("    isPrivacyMode: ").append(toIndentedString(isPrivacyMode)).append("\n");
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

