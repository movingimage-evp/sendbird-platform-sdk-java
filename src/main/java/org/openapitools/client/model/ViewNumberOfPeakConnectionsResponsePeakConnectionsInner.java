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
 * ViewNumberOfPeakConnectionsResponsePeakConnectionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class ViewNumberOfPeakConnectionsResponsePeakConnectionsInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_PEAK_CONNECTIONS = "peak_connections";
  @SerializedName(SERIALIZED_NAME_PEAK_CONNECTIONS)
  private BigDecimal peakConnections;

  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner() { 
  }

  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner peakConnections(BigDecimal peakConnections) {
    
    this.peakConnections = peakConnections;
    return this;
  }

   /**
   * Get peakConnections
   * @return peakConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPeakConnections() {
    return peakConnections;
  }


  public void setPeakConnections(BigDecimal peakConnections) {
    this.peakConnections = peakConnections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfPeakConnectionsResponsePeakConnectionsInner viewNumberOfPeakConnectionsResponsePeakConnectionsInner = (ViewNumberOfPeakConnectionsResponsePeakConnectionsInner) o;
    return Objects.equals(this.date, viewNumberOfPeakConnectionsResponsePeakConnectionsInner.date) &&
        Objects.equals(this.peakConnections, viewNumberOfPeakConnectionsResponsePeakConnectionsInner.peakConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, peakConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfPeakConnectionsResponsePeakConnectionsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    peakConnections: ").append(toIndentedString(peakConnections)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("peak_connections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewNumberOfPeakConnectionsResponsePeakConnectionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewNumberOfPeakConnectionsResponsePeakConnectionsInner is not found in the empty JSON string", ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewNumberOfPeakConnectionsResponsePeakConnectionsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewNumberOfPeakConnectionsResponsePeakConnectionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner>() {
           @Override
           public void write(JsonWriter out, ViewNumberOfPeakConnectionsResponsePeakConnectionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewNumberOfPeakConnectionsResponsePeakConnectionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewNumberOfPeakConnectionsResponsePeakConnectionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewNumberOfPeakConnectionsResponsePeakConnectionsInner
  * @throws IOException if the JSON string is invalid with respect to ViewNumberOfPeakConnectionsResponsePeakConnectionsInner
  */
  public static ViewNumberOfPeakConnectionsResponsePeakConnectionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewNumberOfPeakConnectionsResponsePeakConnectionsInner.class);
  }

 /**
  * Convert an instance of ViewNumberOfPeakConnectionsResponsePeakConnectionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

