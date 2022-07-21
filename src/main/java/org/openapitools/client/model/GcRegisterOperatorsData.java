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
 * GcRegisterOperatorsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class GcRegisterOperatorsData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<Integer> operatorIds = new ArrayList<>();

  public GcRegisterOperatorsData() { 
  }

  public GcRegisterOperatorsData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to register operators to.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to register operators to.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcRegisterOperatorsData operatorIds(List<Integer> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public GcRegisterOperatorsData addOperatorIdsItem(Integer operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don&#39;t need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don't need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100.")

  public List<Integer> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<Integer> operatorIds) {
    this.operatorIds = operatorIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcRegisterOperatorsData gcRegisterOperatorsData = (GcRegisterOperatorsData) o;
    return Objects.equals(this.channelUrl, gcRegisterOperatorsData.channelUrl) &&
        Objects.equals(this.operatorIds, gcRegisterOperatorsData.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcRegisterOperatorsData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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
    openapiFields.add("channel_url");
    openapiFields.add("operator_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("operator_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcRegisterOperatorsData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcRegisterOperatorsData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcRegisterOperatorsData is not found in the empty JSON string", GcRegisterOperatorsData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcRegisterOperatorsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcRegisterOperatorsData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcRegisterOperatorsData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operator_ids") != null && !jsonObj.get("operator_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_ids` to be an array in the JSON string but got `%s`", jsonObj.get("operator_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcRegisterOperatorsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcRegisterOperatorsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcRegisterOperatorsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcRegisterOperatorsData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcRegisterOperatorsData>() {
           @Override
           public void write(JsonWriter out, GcRegisterOperatorsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcRegisterOperatorsData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcRegisterOperatorsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcRegisterOperatorsData
  * @throws IOException if the JSON string is invalid with respect to GcRegisterOperatorsData
  */
  public static GcRegisterOperatorsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcRegisterOperatorsData.class);
  }

 /**
  * Convert an instance of GcRegisterOperatorsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

