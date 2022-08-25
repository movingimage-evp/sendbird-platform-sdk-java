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
 * SetDomainFilterDataProfanityFilterRegexFiltersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class SetDomainFilterDataProfanityFilterRegexFiltersInner {
  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public SetDomainFilterDataProfanityFilterRegexFiltersInner() { 
  }

  public SetDomainFilterDataProfanityFilterRegexFiltersInner regex(String regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegex() {
    return regex;
  }


  public void setRegex(String regex) {
    this.regex = regex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataProfanityFilterRegexFiltersInner setDomainFilterDataProfanityFilterRegexFiltersInner = (SetDomainFilterDataProfanityFilterRegexFiltersInner) o;
    return Objects.equals(this.regex, setDomainFilterDataProfanityFilterRegexFiltersInner.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataProfanityFilterRegexFiltersInner {\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
    openapiFields.add("regex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetDomainFilterDataProfanityFilterRegexFiltersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetDomainFilterDataProfanityFilterRegexFiltersInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetDomainFilterDataProfanityFilterRegexFiltersInner is not found in the empty JSON string", SetDomainFilterDataProfanityFilterRegexFiltersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetDomainFilterDataProfanityFilterRegexFiltersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetDomainFilterDataProfanityFilterRegexFiltersInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("regex") != null && !jsonObj.get("regex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regex").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetDomainFilterDataProfanityFilterRegexFiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetDomainFilterDataProfanityFilterRegexFiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetDomainFilterDataProfanityFilterRegexFiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetDomainFilterDataProfanityFilterRegexFiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SetDomainFilterDataProfanityFilterRegexFiltersInner>() {
           @Override
           public void write(JsonWriter out, SetDomainFilterDataProfanityFilterRegexFiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetDomainFilterDataProfanityFilterRegexFiltersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetDomainFilterDataProfanityFilterRegexFiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetDomainFilterDataProfanityFilterRegexFiltersInner
  * @throws IOException if the JSON string is invalid with respect to SetDomainFilterDataProfanityFilterRegexFiltersInner
  */
  public static SetDomainFilterDataProfanityFilterRegexFiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDomainFilterDataProfanityFilterRegexFiltersInner.class);
  }

 /**
  * Convert an instance of SetDomainFilterDataProfanityFilterRegexFiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

