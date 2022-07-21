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
import org.openapitools.client.model.SendBirdUser;

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
 * OcListBannedUsersResponseBannedListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class OcListBannedUsersResponseBannedListInner {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdUser user;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private BigDecimal startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public OcListBannedUsersResponseBannedListInner() { 
  }

  public OcListBannedUsersResponseBannedListInner user(SendBirdUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getUser() {
    return user;
  }


  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  public OcListBannedUsersResponseBannedListInner startAt(BigDecimal startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartAt() {
    return startAt;
  }


  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  public OcListBannedUsersResponseBannedListInner endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public OcListBannedUsersResponseBannedListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcListBannedUsersResponseBannedListInner ocListBannedUsersResponseBannedListInner = (OcListBannedUsersResponseBannedListInner) o;
    return Objects.equals(this.user, ocListBannedUsersResponseBannedListInner.user) &&
        Objects.equals(this.startAt, ocListBannedUsersResponseBannedListInner.startAt) &&
        Objects.equals(this.endAt, ocListBannedUsersResponseBannedListInner.endAt) &&
        Objects.equals(this.description, ocListBannedUsersResponseBannedListInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startAt, endAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcListBannedUsersResponseBannedListInner {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("start_at");
    openapiFields.add("end_at");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcListBannedUsersResponseBannedListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcListBannedUsersResponseBannedListInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcListBannedUsersResponseBannedListInner is not found in the empty JSON string", OcListBannedUsersResponseBannedListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcListBannedUsersResponseBannedListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcListBannedUsersResponseBannedListInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        SendBirdUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcListBannedUsersResponseBannedListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcListBannedUsersResponseBannedListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcListBannedUsersResponseBannedListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcListBannedUsersResponseBannedListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OcListBannedUsersResponseBannedListInner>() {
           @Override
           public void write(JsonWriter out, OcListBannedUsersResponseBannedListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcListBannedUsersResponseBannedListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcListBannedUsersResponseBannedListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcListBannedUsersResponseBannedListInner
  * @throws IOException if the JSON string is invalid with respect to OcListBannedUsersResponseBannedListInner
  */
  public static OcListBannedUsersResponseBannedListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcListBannedUsersResponseBannedListInner.class);
  }

 /**
  * Convert an instance of OcListBannedUsersResponseBannedListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

