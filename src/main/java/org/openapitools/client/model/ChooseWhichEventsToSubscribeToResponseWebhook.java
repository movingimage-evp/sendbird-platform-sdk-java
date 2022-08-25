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
import java.util.ArrayList;
import java.util.List;

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
 * ChooseWhichEventsToSubscribeToResponseWebhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class ChooseWhichEventsToSubscribeToResponseWebhook {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_INCLUDE_MEMBERS = "include_members";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MEMBERS)
  private Boolean includeMembers;

  public static final String SERIALIZED_NAME_ENABLED_EVENTS = "enabled_events";
  @SerializedName(SERIALIZED_NAME_ENABLED_EVENTS)
  private List<String> enabledEvents = null;

  public static final String SERIALIZED_NAME_INCLUDE_UNREAD_COUNT = "include_unread_count";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNREAD_COUNT)
  private Boolean includeUnreadCount;

  public ChooseWhichEventsToSubscribeToResponseWebhook() { 
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook includeMembers(Boolean includeMembers) {
    
    this.includeMembers = includeMembers;
    return this;
  }

   /**
   * Get includeMembers
   * @return includeMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeMembers() {
    return includeMembers;
  }


  public void setIncludeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook enabledEvents(List<String> enabledEvents) {
    
    this.enabledEvents = enabledEvents;
    return this;
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook addEnabledEventsItem(String enabledEventsItem) {
    if (this.enabledEvents == null) {
      this.enabledEvents = new ArrayList<>();
    }
    this.enabledEvents.add(enabledEventsItem);
    return this;
  }

   /**
   * Get enabledEvents
   * @return enabledEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnabledEvents() {
    return enabledEvents;
  }


  public void setEnabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook includeUnreadCount(Boolean includeUnreadCount) {
    
    this.includeUnreadCount = includeUnreadCount;
    return this;
  }

   /**
   * Get includeUnreadCount
   * @return includeUnreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeUnreadCount() {
    return includeUnreadCount;
  }


  public void setIncludeUnreadCount(Boolean includeUnreadCount) {
    this.includeUnreadCount = includeUnreadCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToResponseWebhook chooseWhichEventsToSubscribeToResponseWebhook = (ChooseWhichEventsToSubscribeToResponseWebhook) o;
    return Objects.equals(this.enabled, chooseWhichEventsToSubscribeToResponseWebhook.enabled) &&
        Objects.equals(this.url, chooseWhichEventsToSubscribeToResponseWebhook.url) &&
        Objects.equals(this.includeMembers, chooseWhichEventsToSubscribeToResponseWebhook.includeMembers) &&
        Objects.equals(this.enabledEvents, chooseWhichEventsToSubscribeToResponseWebhook.enabledEvents) &&
        Objects.equals(this.includeUnreadCount, chooseWhichEventsToSubscribeToResponseWebhook.includeUnreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, url, includeMembers, enabledEvents, includeUnreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToResponseWebhook {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    includeMembers: ").append(toIndentedString(includeMembers)).append("\n");
    sb.append("    enabledEvents: ").append(toIndentedString(enabledEvents)).append("\n");
    sb.append("    includeUnreadCount: ").append(toIndentedString(includeUnreadCount)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("url");
    openapiFields.add("include_members");
    openapiFields.add("enabled_events");
    openapiFields.add("include_unread_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChooseWhichEventsToSubscribeToResponseWebhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChooseWhichEventsToSubscribeToResponseWebhook.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChooseWhichEventsToSubscribeToResponseWebhook is not found in the empty JSON string", ChooseWhichEventsToSubscribeToResponseWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChooseWhichEventsToSubscribeToResponseWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChooseWhichEventsToSubscribeToResponseWebhook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("enabled_events") != null && !jsonObj.get("enabled_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled_events` to be an array in the JSON string but got `%s`", jsonObj.get("enabled_events").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChooseWhichEventsToSubscribeToResponseWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChooseWhichEventsToSubscribeToResponseWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChooseWhichEventsToSubscribeToResponseWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChooseWhichEventsToSubscribeToResponseWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<ChooseWhichEventsToSubscribeToResponseWebhook>() {
           @Override
           public void write(JsonWriter out, ChooseWhichEventsToSubscribeToResponseWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChooseWhichEventsToSubscribeToResponseWebhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChooseWhichEventsToSubscribeToResponseWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChooseWhichEventsToSubscribeToResponseWebhook
  * @throws IOException if the JSON string is invalid with respect to ChooseWhichEventsToSubscribeToResponseWebhook
  */
  public static ChooseWhichEventsToSubscribeToResponseWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChooseWhichEventsToSubscribeToResponseWebhook.class);
  }

 /**
  * Convert an instance of ChooseWhichEventsToSubscribeToResponseWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

