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
 * UseDefaultEmojisResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class UseDefaultEmojisResponse {
  public static final String SERIALIZED_NAME_USE_DEFAULT_EMOJI = "use_default_emoji";
  @SerializedName(SERIALIZED_NAME_USE_DEFAULT_EMOJI)
  private Boolean useDefaultEmoji;

  public UseDefaultEmojisResponse() { 
  }

  public UseDefaultEmojisResponse useDefaultEmoji(Boolean useDefaultEmoji) {
    
    this.useDefaultEmoji = useDefaultEmoji;
    return this;
  }

   /**
   * Get useDefaultEmoji
   * @return useDefaultEmoji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseDefaultEmoji() {
    return useDefaultEmoji;
  }


  public void setUseDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseDefaultEmojisResponse useDefaultEmojisResponse = (UseDefaultEmojisResponse) o;
    return Objects.equals(this.useDefaultEmoji, useDefaultEmojisResponse.useDefaultEmoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultEmoji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseDefaultEmojisResponse {\n");
    sb.append("    useDefaultEmoji: ").append(toIndentedString(useDefaultEmoji)).append("\n");
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
    openapiFields.add("use_default_emoji");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UseDefaultEmojisResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UseDefaultEmojisResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UseDefaultEmojisResponse is not found in the empty JSON string", UseDefaultEmojisResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UseDefaultEmojisResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UseDefaultEmojisResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UseDefaultEmojisResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UseDefaultEmojisResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UseDefaultEmojisResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UseDefaultEmojisResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UseDefaultEmojisResponse>() {
           @Override
           public void write(JsonWriter out, UseDefaultEmojisResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UseDefaultEmojisResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UseDefaultEmojisResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UseDefaultEmojisResponse
  * @throws IOException if the JSON string is invalid with respect to UseDefaultEmojisResponse
  */
  public static UseDefaultEmojisResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UseDefaultEmojisResponse.class);
  }

 /**
  * Convert an instance of UseDefaultEmojisResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

