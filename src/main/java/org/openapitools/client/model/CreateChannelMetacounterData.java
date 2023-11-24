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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * CreateChannelMetacounterData
 */
@JsonPropertyOrder({
  CreateChannelMetacounterData.JSON_PROPERTY_CHANNEL_TYPE,
  CreateChannelMetacounterData.JSON_PROPERTY_CHANNEL_URL,
  CreateChannelMetacounterData.JSON_PROPERTY_METACOUNTER
})
@JsonTypeName("createChannelMetacounterData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class CreateChannelMetacounterData {
  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_METACOUNTER = "metacounter";
  private String metacounter;

  public CreateChannelMetacounterData() { 
  }

  public CreateChannelMetacounterData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public CreateChannelMetacounterData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to store the metacounter in.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to store the metacounter in.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public CreateChannelMetacounterData metacounter(String metacounter) {
    this.metacounter = metacounter;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.
   * @return metacounter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.")
  @JsonProperty(JSON_PROPERTY_METACOUNTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetacounter() {
    return metacounter;
  }


  @JsonProperty(JSON_PROPERTY_METACOUNTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetacounter(String metacounter) {
    this.metacounter = metacounter;
  }


  /**
   * Return true if this createChannelMetacounterData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChannelMetacounterData createChannelMetacounterData = (CreateChannelMetacounterData) o;
    return Objects.equals(this.channelType, createChannelMetacounterData.channelType) &&
        Objects.equals(this.channelUrl, createChannelMetacounterData.channelUrl) &&
        Objects.equals(this.metacounter, createChannelMetacounterData.metacounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, metacounter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelMetacounterData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    metacounter: ").append(toIndentedString(metacounter)).append("\n");
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

