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
import org.openapitools.client.model.ChooseWhichEventsToSubscribeToResponseWebhook;

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
 * ChooseWhichEventsToSubscribeToResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class ChooseWhichEventsToSubscribeToResponse {
  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private ChooseWhichEventsToSubscribeToResponseWebhook webhook;

  public ChooseWhichEventsToSubscribeToResponse() { 
  }

  public ChooseWhichEventsToSubscribeToResponse webhook(ChooseWhichEventsToSubscribeToResponseWebhook webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChooseWhichEventsToSubscribeToResponseWebhook getWebhook() {
    return webhook;
  }


  public void setWebhook(ChooseWhichEventsToSubscribeToResponseWebhook webhook) {
    this.webhook = webhook;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToResponse chooseWhichEventsToSubscribeToResponse = (ChooseWhichEventsToSubscribeToResponse) o;
    return Objects.equals(this.webhook, chooseWhichEventsToSubscribeToResponse.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToResponse {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
    openapiFields.add("webhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChooseWhichEventsToSubscribeToResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChooseWhichEventsToSubscribeToResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChooseWhichEventsToSubscribeToResponse is not found in the empty JSON string", ChooseWhichEventsToSubscribeToResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChooseWhichEventsToSubscribeToResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChooseWhichEventsToSubscribeToResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `webhook`
      if (jsonObj.getAsJsonObject("webhook") != null) {
        ChooseWhichEventsToSubscribeToResponseWebhook.validateJsonObject(jsonObj.getAsJsonObject("webhook"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChooseWhichEventsToSubscribeToResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChooseWhichEventsToSubscribeToResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChooseWhichEventsToSubscribeToResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChooseWhichEventsToSubscribeToResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChooseWhichEventsToSubscribeToResponse>() {
           @Override
           public void write(JsonWriter out, ChooseWhichEventsToSubscribeToResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChooseWhichEventsToSubscribeToResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChooseWhichEventsToSubscribeToResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChooseWhichEventsToSubscribeToResponse
  * @throws IOException if the JSON string is invalid with respect to ChooseWhichEventsToSubscribeToResponse
  */
  public static ChooseWhichEventsToSubscribeToResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChooseWhichEventsToSubscribeToResponse.class);
  }

 /**
  * Convert an instance of ChooseWhichEventsToSubscribeToResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

