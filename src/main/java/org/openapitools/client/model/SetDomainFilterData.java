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
import org.openapitools.client.model.SetDomainFilterDataDomainFilter;
import org.openapitools.client.model.SetDomainFilterDataImageModeration;
import org.openapitools.client.model.SetDomainFilterDataProfanityFilter;
import org.openapitools.client.model.SetDomainFilterDataProfanityTriggeredModeration;

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
 * SetDomainFilterData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class SetDomainFilterData {
  public static final String SERIALIZED_NAME_DOMAIN_FILTER = "domain_filter";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FILTER)
  private SetDomainFilterDataDomainFilter domainFilter;

  public static final String SERIALIZED_NAME_PROFANITY_FILTER = "profanity_filter";
  @SerializedName(SERIALIZED_NAME_PROFANITY_FILTER)
  private SetDomainFilterDataProfanityFilter profanityFilter;

  public static final String SERIALIZED_NAME_PROFANITY_TRIGGERED_MODERATION = "profanity_triggered_moderation";
  @SerializedName(SERIALIZED_NAME_PROFANITY_TRIGGERED_MODERATION)
  private SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration;

  public static final String SERIALIZED_NAME_IMAGE_MODERATION = "image_moderation";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODERATION)
  private SetDomainFilterDataImageModeration imageModeration;

  public SetDomainFilterData() { 
  }

  public SetDomainFilterData domainFilter(SetDomainFilterDataDomainFilter domainFilter) {
    
    this.domainFilter = domainFilter;
    return this;
  }

   /**
   * Get domainFilter
   * @return domainFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetDomainFilterDataDomainFilter getDomainFilter() {
    return domainFilter;
  }


  public void setDomainFilter(SetDomainFilterDataDomainFilter domainFilter) {
    this.domainFilter = domainFilter;
  }


  public SetDomainFilterData profanityFilter(SetDomainFilterDataProfanityFilter profanityFilter) {
    
    this.profanityFilter = profanityFilter;
    return this;
  }

   /**
   * Get profanityFilter
   * @return profanityFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetDomainFilterDataProfanityFilter getProfanityFilter() {
    return profanityFilter;
  }


  public void setProfanityFilter(SetDomainFilterDataProfanityFilter profanityFilter) {
    this.profanityFilter = profanityFilter;
  }


  public SetDomainFilterData profanityTriggeredModeration(SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration) {
    
    this.profanityTriggeredModeration = profanityTriggeredModeration;
    return this;
  }

   /**
   * Get profanityTriggeredModeration
   * @return profanityTriggeredModeration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetDomainFilterDataProfanityTriggeredModeration getProfanityTriggeredModeration() {
    return profanityTriggeredModeration;
  }


  public void setProfanityTriggeredModeration(SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration) {
    this.profanityTriggeredModeration = profanityTriggeredModeration;
  }


  public SetDomainFilterData imageModeration(SetDomainFilterDataImageModeration imageModeration) {
    
    this.imageModeration = imageModeration;
    return this;
  }

   /**
   * Get imageModeration
   * @return imageModeration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetDomainFilterDataImageModeration getImageModeration() {
    return imageModeration;
  }


  public void setImageModeration(SetDomainFilterDataImageModeration imageModeration) {
    this.imageModeration = imageModeration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterData setDomainFilterData = (SetDomainFilterData) o;
    return Objects.equals(this.domainFilter, setDomainFilterData.domainFilter) &&
        Objects.equals(this.profanityFilter, setDomainFilterData.profanityFilter) &&
        Objects.equals(this.profanityTriggeredModeration, setDomainFilterData.profanityTriggeredModeration) &&
        Objects.equals(this.imageModeration, setDomainFilterData.imageModeration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainFilter, profanityFilter, profanityTriggeredModeration, imageModeration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterData {\n");
    sb.append("    domainFilter: ").append(toIndentedString(domainFilter)).append("\n");
    sb.append("    profanityFilter: ").append(toIndentedString(profanityFilter)).append("\n");
    sb.append("    profanityTriggeredModeration: ").append(toIndentedString(profanityTriggeredModeration)).append("\n");
    sb.append("    imageModeration: ").append(toIndentedString(imageModeration)).append("\n");
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
    openapiFields.add("domain_filter");
    openapiFields.add("profanity_filter");
    openapiFields.add("profanity_triggered_moderation");
    openapiFields.add("image_moderation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetDomainFilterData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetDomainFilterData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetDomainFilterData is not found in the empty JSON string", SetDomainFilterData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetDomainFilterData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetDomainFilterData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `domain_filter`
      if (jsonObj.getAsJsonObject("domain_filter") != null) {
        SetDomainFilterDataDomainFilter.validateJsonObject(jsonObj.getAsJsonObject("domain_filter"));
      }
      // validate the optional field `profanity_filter`
      if (jsonObj.getAsJsonObject("profanity_filter") != null) {
        SetDomainFilterDataProfanityFilter.validateJsonObject(jsonObj.getAsJsonObject("profanity_filter"));
      }
      // validate the optional field `profanity_triggered_moderation`
      if (jsonObj.getAsJsonObject("profanity_triggered_moderation") != null) {
        SetDomainFilterDataProfanityTriggeredModeration.validateJsonObject(jsonObj.getAsJsonObject("profanity_triggered_moderation"));
      }
      // validate the optional field `image_moderation`
      if (jsonObj.getAsJsonObject("image_moderation") != null) {
        SetDomainFilterDataImageModeration.validateJsonObject(jsonObj.getAsJsonObject("image_moderation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetDomainFilterData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetDomainFilterData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetDomainFilterData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetDomainFilterData.class));

       return (TypeAdapter<T>) new TypeAdapter<SetDomainFilterData>() {
           @Override
           public void write(JsonWriter out, SetDomainFilterData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetDomainFilterData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetDomainFilterData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetDomainFilterData
  * @throws IOException if the JSON string is invalid with respect to SetDomainFilterData
  */
  public static SetDomainFilterData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetDomainFilterData.class);
  }

 /**
  * Convert an instance of SetDomainFilterData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

