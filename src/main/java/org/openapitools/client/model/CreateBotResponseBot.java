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
 * CreateBotResponseBot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class CreateBotResponseBot {
  public static final String SERIALIZED_NAME_BOT_TOKEN = "bot_token";
  @SerializedName(SERIALIZED_NAME_BOT_TOKEN)
  private String botToken;

  public static final String SERIALIZED_NAME_BOT_PROFILE_URL = "bot_profile_url";
  @SerializedName(SERIALIZED_NAME_BOT_PROFILE_URL)
  private String botProfileUrl;

  public static final String SERIALIZED_NAME_BOT_USERID = "bot_userid";
  @SerializedName(SERIALIZED_NAME_BOT_USERID)
  private String botUserid;

  public static final String SERIALIZED_NAME_BOT_NICKNAME = "bot_nickname";
  @SerializedName(SERIALIZED_NAME_BOT_NICKNAME)
  private String botNickname;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private String botType;

  public static final String SERIALIZED_NAME_BOT_METADATA = "bot_metadata";
  @SerializedName(SERIALIZED_NAME_BOT_METADATA)
  private Object botMetadata;

  public CreateBotResponseBot() { 
  }

  public CreateBotResponseBot botToken(String botToken) {
    
    this.botToken = botToken;
    return this;
  }

   /**
   * Get botToken
   * @return botToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotToken() {
    return botToken;
  }


  public void setBotToken(String botToken) {
    this.botToken = botToken;
  }


  public CreateBotResponseBot botProfileUrl(String botProfileUrl) {
    
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Get botProfileUrl
   * @return botProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public CreateBotResponseBot botUserid(String botUserid) {
    
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Get botUserid
   * @return botUserid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotUserid() {
    return botUserid;
  }


  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public CreateBotResponseBot botNickname(String botNickname) {
    
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Get botNickname
   * @return botNickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotNickname() {
    return botNickname;
  }


  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public CreateBotResponseBot botType(String botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBotType() {
    return botType;
  }


  public void setBotType(String botType) {
    this.botType = botType;
  }


  public CreateBotResponseBot botMetadata(Object botMetadata) {
    
    this.botMetadata = botMetadata;
    return this;
  }

   /**
   * Get botMetadata
   * @return botMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBotMetadata() {
    return botMetadata;
  }


  public void setBotMetadata(Object botMetadata) {
    this.botMetadata = botMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBotResponseBot createBotResponseBot = (CreateBotResponseBot) o;
    return Objects.equals(this.botToken, createBotResponseBot.botToken) &&
        Objects.equals(this.botProfileUrl, createBotResponseBot.botProfileUrl) &&
        Objects.equals(this.botUserid, createBotResponseBot.botUserid) &&
        Objects.equals(this.botNickname, createBotResponseBot.botNickname) &&
        Objects.equals(this.botType, createBotResponseBot.botType) &&
        Objects.equals(this.botMetadata, createBotResponseBot.botMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botToken, botProfileUrl, botUserid, botNickname, botType, botMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBotResponseBot {\n");
    sb.append("    botToken: ").append(toIndentedString(botToken)).append("\n");
    sb.append("    botProfileUrl: ").append(toIndentedString(botProfileUrl)).append("\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    botNickname: ").append(toIndentedString(botNickname)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    botMetadata: ").append(toIndentedString(botMetadata)).append("\n");
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
    openapiFields.add("bot_token");
    openapiFields.add("bot_profile_url");
    openapiFields.add("bot_userid");
    openapiFields.add("bot_nickname");
    openapiFields.add("bot_type");
    openapiFields.add("bot_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateBotResponseBot
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateBotResponseBot.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBotResponseBot is not found in the empty JSON string", CreateBotResponseBot.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateBotResponseBot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBotResponseBot` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bot_token") != null && !jsonObj.get("bot_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_token").toString()));
      }
      if (jsonObj.get("bot_profile_url") != null && !jsonObj.get("bot_profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_profile_url").toString()));
      }
      if (jsonObj.get("bot_userid") != null && !jsonObj.get("bot_userid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_userid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_userid").toString()));
      }
      if (jsonObj.get("bot_nickname") != null && !jsonObj.get("bot_nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_nickname").toString()));
      }
      if (jsonObj.get("bot_type") != null && !jsonObj.get("bot_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBotResponseBot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBotResponseBot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBotResponseBot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBotResponseBot.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBotResponseBot>() {
           @Override
           public void write(JsonWriter out, CreateBotResponseBot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBotResponseBot read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBotResponseBot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBotResponseBot
  * @throws IOException if the JSON string is invalid with respect to CreateBotResponseBot
  */
  public static CreateBotResponseBot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBotResponseBot.class);
  }

 /**
  * Convert an instance of CreateBotResponseBot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

