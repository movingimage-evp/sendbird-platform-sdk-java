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
import org.openapitools.client.model.SendBirdGroupChannel;

/**
 * ListMyGroupChannelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class ListMyGroupChannelsResponse {
  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<SendBirdGroupChannel> channels = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private BigDecimal ts;

  public ListMyGroupChannelsResponse() { 
  }

  public ListMyGroupChannelsResponse channels(List<SendBirdGroupChannel> channels) {
    
    this.channels = channels;
    return this;
  }

  public ListMyGroupChannelsResponse addChannelsItem(SendBirdGroupChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<SendBirdGroupChannel>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdGroupChannel> getChannels() {
    return channels;
  }


  public void setChannels(List<SendBirdGroupChannel> channels) {
    this.channels = channels;
  }


  public ListMyGroupChannelsResponse next(String next) {
    
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


  public ListMyGroupChannelsResponse ts(BigDecimal ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTs() {
    return ts;
  }


  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMyGroupChannelsResponse listMyGroupChannelsResponse = (ListMyGroupChannelsResponse) o;
    return Objects.equals(this.channels, listMyGroupChannelsResponse.channels) &&
        Objects.equals(this.next, listMyGroupChannelsResponse.next) &&
        Objects.equals(this.ts, listMyGroupChannelsResponse.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, next, ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMyGroupChannelsResponse {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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
