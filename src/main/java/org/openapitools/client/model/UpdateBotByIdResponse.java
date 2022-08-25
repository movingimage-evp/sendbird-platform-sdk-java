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
 * UpdateBotByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class UpdateBotByIdResponse {
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

  public UpdateBotByIdResponse() { 
  }

  public UpdateBotByIdResponse bot(CreateBotResponseBot bot) {
    
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


  public UpdateBotByIdResponse botCallbackUrl(String botCallbackUrl) {
    
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


  public UpdateBotByIdResponse enableMarkAsRead(Boolean enableMarkAsRead) {
    
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


  public UpdateBotByIdResponse isPrivacyMode(Boolean isPrivacyMode) {
    
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


  public UpdateBotByIdResponse showMember(Boolean showMember) {
    
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


  public UpdateBotByIdResponse channelInvitationPreference(BigDecimal channelInvitationPreference) {
    
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
    UpdateBotByIdResponse updateBotByIdResponse = (UpdateBotByIdResponse) o;
    return Objects.equals(this.bot, updateBotByIdResponse.bot) &&
        Objects.equals(this.botCallbackUrl, updateBotByIdResponse.botCallbackUrl) &&
        Objects.equals(this.enableMarkAsRead, updateBotByIdResponse.enableMarkAsRead) &&
        Objects.equals(this.isPrivacyMode, updateBotByIdResponse.isPrivacyMode) &&
        Objects.equals(this.showMember, updateBotByIdResponse.showMember) &&
        Objects.equals(this.channelInvitationPreference, updateBotByIdResponse.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bot, botCallbackUrl, enableMarkAsRead, isPrivacyMode, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBotByIdResponse {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bot");
    openapiFields.add("bot_callback_url");
    openapiFields.add("enable_mark_as_read");
    openapiFields.add("is_privacy_mode");
    openapiFields.add("show_member");
    openapiFields.add("channel_invitation_preference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateBotByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateBotByIdResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBotByIdResponse is not found in the empty JSON string", UpdateBotByIdResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateBotByIdResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBotByIdResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `bot`
      if (jsonObj.getAsJsonObject("bot") != null) {
        CreateBotResponseBot.validateJsonObject(jsonObj.getAsJsonObject("bot"));
      }
      if (jsonObj.get("bot_callback_url") != null && !jsonObj.get("bot_callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_callback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBotByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBotByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBotByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBotByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBotByIdResponse>() {
           @Override
           public void write(JsonWriter out, UpdateBotByIdResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBotByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBotByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBotByIdResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateBotByIdResponse
  */
  public static UpdateBotByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBotByIdResponse.class);
  }

 /**
  * Convert an instance of UpdateBotByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

