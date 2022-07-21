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
import org.openapitools.client.model.SendBirdGroupChannel;

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
 * SendBirdGroupChannelCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class SendBirdGroupChannelCollection {
  public static final String SERIALIZED_NAME_CHANNEL_LIST = "channel_list";
  @SerializedName(SERIALIZED_NAME_CHANNEL_LIST)
  private List<SendBirdGroupChannel> channelList = null;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public SendBirdGroupChannelCollection() { 
  }

  public SendBirdGroupChannelCollection channelList(List<SendBirdGroupChannel> channelList) {
    
    this.channelList = channelList;
    return this;
  }

  public SendBirdGroupChannelCollection addChannelListItem(SendBirdGroupChannel channelListItem) {
    if (this.channelList == null) {
      this.channelList = new ArrayList<>();
    }
    this.channelList.add(channelListItem);
    return this;
  }

   /**
   * Get channelList
   * @return channelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdGroupChannel> getChannelList() {
    return channelList;
  }


  public void setChannelList(List<SendBirdGroupChannel> channelList) {
    this.channelList = channelList;
  }


  public SendBirdGroupChannelCollection hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelCollection sendBirdGroupChannelCollection = (SendBirdGroupChannelCollection) o;
    return Objects.equals(this.channelList, sendBirdGroupChannelCollection.channelList) &&
        Objects.equals(this.hasMore, sendBirdGroupChannelCollection.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelList, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelCollection {\n");
    sb.append("    channelList: ").append(toIndentedString(channelList)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
    openapiFields.add("channel_list");
    openapiFields.add("has_more");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdGroupChannelCollection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdGroupChannelCollection.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdGroupChannelCollection is not found in the empty JSON string", SendBirdGroupChannelCollection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdGroupChannelCollection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdGroupChannelCollection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraychannelList = jsonObj.getAsJsonArray("channel_list");
      if (jsonArraychannelList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("channel_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `channel_list` to be an array in the JSON string but got `%s`", jsonObj.get("channel_list").toString()));
        }

        // validate the optional field `channel_list` (array)
        for (int i = 0; i < jsonArraychannelList.size(); i++) {
          SendBirdGroupChannel.validateJsonObject(jsonArraychannelList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdGroupChannelCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdGroupChannelCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdGroupChannelCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdGroupChannelCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdGroupChannelCollection>() {
           @Override
           public void write(JsonWriter out, SendBirdGroupChannelCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdGroupChannelCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdGroupChannelCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdGroupChannelCollection
  * @throws IOException if the JSON string is invalid with respect to SendBirdGroupChannelCollection
  */
  public static SendBirdGroupChannelCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdGroupChannelCollection.class);
  }

 /**
  * Convert an instance of SendBirdGroupChannelCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

