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
import org.openapitools.client.model.ListBannedChannelsResponseBannedChannels;

/**
 * ListBannedChannelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class ListBannedChannelsResponse {
  public static final String SERIALIZED_NAME_BANNED_CHANNELS = "banned_channels";
  @SerializedName(SERIALIZED_NAME_BANNED_CHANNELS)
  private List<ListBannedChannelsResponseBannedChannels> bannedChannels = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public ListBannedChannelsResponse() { 
  }

  public ListBannedChannelsResponse bannedChannels(List<ListBannedChannelsResponseBannedChannels> bannedChannels) {
    
    this.bannedChannels = bannedChannels;
    return this;
  }

  public ListBannedChannelsResponse addBannedChannelsItem(ListBannedChannelsResponseBannedChannels bannedChannelsItem) {
    if (this.bannedChannels == null) {
      this.bannedChannels = new ArrayList<ListBannedChannelsResponseBannedChannels>();
    }
    this.bannedChannels.add(bannedChannelsItem);
    return this;
  }

   /**
   * Get bannedChannels
   * @return bannedChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListBannedChannelsResponseBannedChannels> getBannedChannels() {
    return bannedChannels;
  }


  public void setBannedChannels(List<ListBannedChannelsResponseBannedChannels> bannedChannels) {
    this.bannedChannels = bannedChannels;
  }


  public ListBannedChannelsResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBannedChannelsResponse listBannedChannelsResponse = (ListBannedChannelsResponse) o;
    return Objects.equals(this.bannedChannels, listBannedChannelsResponse.bannedChannels) &&
        Objects.equals(this.next, listBannedChannelsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannedChannels, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBannedChannelsResponse {\n");
    sb.append("    bannedChannels: ").append(toIndentedString(bannedChannels)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

}

