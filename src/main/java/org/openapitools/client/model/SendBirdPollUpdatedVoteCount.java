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
 * SendBirdPollUpdatedVoteCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class SendBirdPollUpdatedVoteCount {
  public static final String SERIALIZED_NAME_OPTION_ID = "option_id";
  @SerializedName(SERIALIZED_NAME_OPTION_ID)
  private BigDecimal optionId;

  public static final String SERIALIZED_NAME_VOTE_COUNT = "vote_count";
  @SerializedName(SERIALIZED_NAME_VOTE_COUNT)
  private BigDecimal voteCount;

  public SendBirdPollUpdatedVoteCount() { 
  }

  public SendBirdPollUpdatedVoteCount optionId(BigDecimal optionId) {
    
    this.optionId = optionId;
    return this;
  }

   /**
   * Get optionId
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOptionId() {
    return optionId;
  }


  public void setOptionId(BigDecimal optionId) {
    this.optionId = optionId;
  }


  public SendBirdPollUpdatedVoteCount voteCount(BigDecimal voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getVoteCount() {
    return voteCount;
  }


  public void setVoteCount(BigDecimal voteCount) {
    this.voteCount = voteCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollUpdatedVoteCount sendBirdPollUpdatedVoteCount = (SendBirdPollUpdatedVoteCount) o;
    return Objects.equals(this.optionId, sendBirdPollUpdatedVoteCount.optionId) &&
        Objects.equals(this.voteCount, sendBirdPollUpdatedVoteCount.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollUpdatedVoteCount {\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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
    openapiFields.add("option_id");
    openapiFields.add("vote_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdPollUpdatedVoteCount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdPollUpdatedVoteCount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdPollUpdatedVoteCount is not found in the empty JSON string", SendBirdPollUpdatedVoteCount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdPollUpdatedVoteCount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdPollUpdatedVoteCount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdPollUpdatedVoteCount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdPollUpdatedVoteCount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdPollUpdatedVoteCount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdPollUpdatedVoteCount.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdPollUpdatedVoteCount>() {
           @Override
           public void write(JsonWriter out, SendBirdPollUpdatedVoteCount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdPollUpdatedVoteCount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdPollUpdatedVoteCount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdPollUpdatedVoteCount
  * @throws IOException if the JSON string is invalid with respect to SendBirdPollUpdatedVoteCount
  */
  public static SendBirdPollUpdatedVoteCount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdPollUpdatedVoteCount.class);
  }

 /**
  * Convert an instance of SendBirdPollUpdatedVoteCount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

