/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdGroupChannel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListMyGroupChannelsResponse
 */
@JsonPropertyOrder({
  ListMyGroupChannelsResponse.JSON_PROPERTY_CHANNELS,
  ListMyGroupChannelsResponse.JSON_PROPERTY_NEXT,
  ListMyGroupChannelsResponse.JSON_PROPERTY_TS
})
@JsonTypeName("listMyGroupChannelsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class ListMyGroupChannelsResponse {
  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<SendBirdGroupChannel> channels = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_TS = "ts";
  private BigDecimal ts;

  public ListMyGroupChannelsResponse() { 
  }

  public ListMyGroupChannelsResponse channels(List<SendBirdGroupChannel> channels) {
    this.channels = channels;
    return this;
  }

  public ListMyGroupChannelsResponse addChannelsItem(SendBirdGroupChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
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
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdGroupChannel> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTs() {
    return ts;
  }


  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }


  /**
   * Return true if this listMyGroupChannelsResponse object is equal to o.
   */
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

