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
 * UpdatePushPreferencesForChannelByUrlData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class UpdatePushPreferencesForChannelByUrlData {
  public static final String SERIALIZED_NAME_PUSH_TRIGGER_OPTION = "push_trigger_option";
  @SerializedName(SERIALIZED_NAME_PUSH_TRIGGER_OPTION)
  private String pushTriggerOption;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public UpdatePushPreferencesForChannelByUrlData() { 
  }

  public UpdatePushPreferencesForChannelByUrlData pushTriggerOption(String pushTriggerOption) {
    
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Determines the type of push notification trigger to apply to the speficied channel. Acceptable values are limited to the following:&lt;br /&gt;- default: the user&#39;s push notification trigger setting automatically applies to the channel. This is the default setting.&lt;br /&gt;- all: when disconnected from Sendbird server, the user receives notifications for all new messages in the channel including messages the user has been mentioned in.&lt;br /&gt;- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages in the channel the user has been mentioned in.&lt;br /&gt;- off: the user doesn&#39;t receive any notifications in the channel.
   * @return pushTriggerOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the type of push notification trigger to apply to the speficied channel. Acceptable values are limited to the following:<br />- default: the user's push notification trigger setting automatically applies to the channel. This is the default setting.<br />- all: when disconnected from Sendbird server, the user receives notifications for all new messages in the channel including messages the user has been mentioned in.<br />- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages in the channel the user has been mentioned in.<br />- off: the user doesn't receive any notifications in the channel.")

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  public UpdatePushPreferencesForChannelByUrlData enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * (Deprecated) Determines whether notification messages for the user are delivered to the group channel. (default: true)
   * @return enable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(Deprecated) Determines whether notification messages for the user are delivered to the group channel. (default: true)")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public UpdatePushPreferencesForChannelByUrlData pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to the specified channel.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to the specified channel.")

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
    UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData = (UpdatePushPreferencesForChannelByUrlData) o;
    return Objects.equals(this.pushTriggerOption, updatePushPreferencesForChannelByUrlData.pushTriggerOption) &&
        Objects.equals(this.enable, updatePushPreferencesForChannelByUrlData.enable) &&
        Objects.equals(this.pushSound, updatePushPreferencesForChannelByUrlData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushTriggerOption, enable, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushPreferencesForChannelByUrlData {\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("push_trigger_option");
    openapiFields.add("enable");
    openapiFields.add("push_sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("push_trigger_option");
    openapiRequiredFields.add("enable");
    openapiRequiredFields.add("push_sound");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePushPreferencesForChannelByUrlData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePushPreferencesForChannelByUrlData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePushPreferencesForChannelByUrlData is not found in the empty JSON string", UpdatePushPreferencesForChannelByUrlData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePushPreferencesForChannelByUrlData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePushPreferencesForChannelByUrlData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePushPreferencesForChannelByUrlData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("push_trigger_option") != null && !jsonObj.get("push_trigger_option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_trigger_option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_trigger_option").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePushPreferencesForChannelByUrlData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePushPreferencesForChannelByUrlData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePushPreferencesForChannelByUrlData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePushPreferencesForChannelByUrlData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePushPreferencesForChannelByUrlData>() {
           @Override
           public void write(JsonWriter out, UpdatePushPreferencesForChannelByUrlData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePushPreferencesForChannelByUrlData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePushPreferencesForChannelByUrlData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePushPreferencesForChannelByUrlData
  * @throws IOException if the JSON string is invalid with respect to UpdatePushPreferencesForChannelByUrlData
  */
  public static UpdatePushPreferencesForChannelByUrlData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePushPreferencesForChannelByUrlData.class);
  }

 /**
  * Convert an instance of UpdatePushPreferencesForChannelByUrlData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

