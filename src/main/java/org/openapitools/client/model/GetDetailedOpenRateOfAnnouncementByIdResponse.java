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
 * GetDetailedOpenRateOfAnnouncementByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class GetDetailedOpenRateOfAnnouncementByIdResponse {
  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public static final String SERIALIZED_NAME_OPEN_COUNTS = "open_counts";
  @SerializedName(SERIALIZED_NAME_OPEN_COUNTS)
  private List<BigDecimal> openCounts = null;

  public static final String SERIALIZED_NAME_OPEN_RATES = "open_rates";
  @SerializedName(SERIALIZED_NAME_OPEN_RATES)
  private List<BigDecimal> openRates = null;

  public static final String SERIALIZED_NAME_CUMULATIVE_OPEN_COUNTS = "cumulative_open_counts";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_OPEN_COUNTS)
  private List<BigDecimal> cumulativeOpenCounts = null;

  public static final String SERIALIZED_NAME_CUMULATIVE_OPEN_RATES = "cumulative_open_rates";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_OPEN_RATES)
  private List<BigDecimal> cumulativeOpenRates = null;

  public GetDetailedOpenRateOfAnnouncementByIdResponse() { 
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse openCounts(List<BigDecimal> openCounts) {
    
    this.openCounts = openCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addOpenCountsItem(BigDecimal openCountsItem) {
    if (this.openCounts == null) {
      this.openCounts = new ArrayList<>();
    }
    this.openCounts.add(openCountsItem);
    return this;
  }

   /**
   * Get openCounts
   * @return openCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getOpenCounts() {
    return openCounts;
  }


  public void setOpenCounts(List<BigDecimal> openCounts) {
    this.openCounts = openCounts;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse openRates(List<BigDecimal> openRates) {
    
    this.openRates = openRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addOpenRatesItem(BigDecimal openRatesItem) {
    if (this.openRates == null) {
      this.openRates = new ArrayList<>();
    }
    this.openRates.add(openRatesItem);
    return this;
  }

   /**
   * Get openRates
   * @return openRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getOpenRates() {
    return openRates;
  }


  public void setOpenRates(List<BigDecimal> openRates) {
    this.openRates = openRates;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse cumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    
    this.cumulativeOpenCounts = cumulativeOpenCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addCumulativeOpenCountsItem(BigDecimal cumulativeOpenCountsItem) {
    if (this.cumulativeOpenCounts == null) {
      this.cumulativeOpenCounts = new ArrayList<>();
    }
    this.cumulativeOpenCounts.add(cumulativeOpenCountsItem);
    return this;
  }

   /**
   * Get cumulativeOpenCounts
   * @return cumulativeOpenCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getCumulativeOpenCounts() {
    return cumulativeOpenCounts;
  }


  public void setCumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    this.cumulativeOpenCounts = cumulativeOpenCounts;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse cumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    
    this.cumulativeOpenRates = cumulativeOpenRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addCumulativeOpenRatesItem(BigDecimal cumulativeOpenRatesItem) {
    if (this.cumulativeOpenRates == null) {
      this.cumulativeOpenRates = new ArrayList<>();
    }
    this.cumulativeOpenRates.add(cumulativeOpenRatesItem);
    return this;
  }

   /**
   * Get cumulativeOpenRates
   * @return cumulativeOpenRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getCumulativeOpenRates() {
    return cumulativeOpenRates;
  }


  public void setCumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    this.cumulativeOpenRates = cumulativeOpenRates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenRateOfAnnouncementByIdResponse getDetailedOpenRateOfAnnouncementByIdResponse = (GetDetailedOpenRateOfAnnouncementByIdResponse) o;
    return Objects.equals(this.uniqueId, getDetailedOpenRateOfAnnouncementByIdResponse.uniqueId) &&
        Objects.equals(this.openCounts, getDetailedOpenRateOfAnnouncementByIdResponse.openCounts) &&
        Objects.equals(this.openRates, getDetailedOpenRateOfAnnouncementByIdResponse.openRates) &&
        Objects.equals(this.cumulativeOpenCounts, getDetailedOpenRateOfAnnouncementByIdResponse.cumulativeOpenCounts) &&
        Objects.equals(this.cumulativeOpenRates, getDetailedOpenRateOfAnnouncementByIdResponse.cumulativeOpenRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, openCounts, openRates, cumulativeOpenCounts, cumulativeOpenRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenRateOfAnnouncementByIdResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    openCounts: ").append(toIndentedString(openCounts)).append("\n");
    sb.append("    openRates: ").append(toIndentedString(openRates)).append("\n");
    sb.append("    cumulativeOpenCounts: ").append(toIndentedString(cumulativeOpenCounts)).append("\n");
    sb.append("    cumulativeOpenRates: ").append(toIndentedString(cumulativeOpenRates)).append("\n");
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
    openapiFields.add("unique_id");
    openapiFields.add("open_counts");
    openapiFields.add("open_rates");
    openapiFields.add("cumulative_open_counts");
    openapiFields.add("cumulative_open_rates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDetailedOpenRateOfAnnouncementByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetDetailedOpenRateOfAnnouncementByIdResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDetailedOpenRateOfAnnouncementByIdResponse is not found in the empty JSON string", GetDetailedOpenRateOfAnnouncementByIdResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDetailedOpenRateOfAnnouncementByIdResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDetailedOpenRateOfAnnouncementByIdResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("unique_id") != null && !jsonObj.get("unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("open_counts") != null && !jsonObj.get("open_counts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_counts` to be an array in the JSON string but got `%s`", jsonObj.get("open_counts").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("open_rates") != null && !jsonObj.get("open_rates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_rates` to be an array in the JSON string but got `%s`", jsonObj.get("open_rates").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cumulative_open_counts") != null && !jsonObj.get("cumulative_open_counts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cumulative_open_counts` to be an array in the JSON string but got `%s`", jsonObj.get("cumulative_open_counts").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cumulative_open_rates") != null && !jsonObj.get("cumulative_open_rates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cumulative_open_rates` to be an array in the JSON string but got `%s`", jsonObj.get("cumulative_open_rates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDetailedOpenRateOfAnnouncementByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDetailedOpenRateOfAnnouncementByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDetailedOpenRateOfAnnouncementByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDetailedOpenRateOfAnnouncementByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDetailedOpenRateOfAnnouncementByIdResponse>() {
           @Override
           public void write(JsonWriter out, GetDetailedOpenRateOfAnnouncementByIdResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDetailedOpenRateOfAnnouncementByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDetailedOpenRateOfAnnouncementByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDetailedOpenRateOfAnnouncementByIdResponse
  * @throws IOException if the JSON string is invalid with respect to GetDetailedOpenRateOfAnnouncementByIdResponse
  */
  public static GetDetailedOpenRateOfAnnouncementByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDetailedOpenRateOfAnnouncementByIdResponse.class);
  }

 /**
  * Convert an instance of GetDetailedOpenRateOfAnnouncementByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

