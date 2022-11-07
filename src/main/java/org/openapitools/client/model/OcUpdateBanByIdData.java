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
 * OcUpdateBanByIdData
 */
@JsonPropertyOrder({
  OcUpdateBanByIdData.JSON_PROPERTY_CHANNEL_URL,
  OcUpdateBanByIdData.JSON_PROPERTY_BANNED_USER_ID,
  OcUpdateBanByIdData.JSON_PROPERTY_SECONDS,
  OcUpdateBanByIdData.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ocUpdateBanByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class OcUpdateBanByIdData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_BANNED_USER_ID = "banned_user_id";
  private String bannedUserId;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public OcUpdateBanByIdData() { 
  }

  public OcUpdateBanByIdData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")
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


  public OcUpdateBanByIdData bannedUserId(String bannedUserId) {
    this.bannedUserId = bannedUserId;
    return this;
  }

   /**
   * Specifies the ID of the banned user to update.
   * @return bannedUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the banned user to update.")
  @JsonProperty(JSON_PROPERTY_BANNED_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBannedUserId() {
    return bannedUserId;
  }


  @JsonProperty(JSON_PROPERTY_BANNED_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBannedUserId(String bannedUserId) {
    this.bannedUserId = bannedUserId;
  }


  public OcUpdateBanByIdData seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Specifies a new ban duration to update. If set to -1, the user will be banned permanently (10 years, technically).
   * @return seconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a new ban duration to update. If set to -1, the user will be banned permanently (10 years, technically).")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSeconds() {
    return seconds;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public OcUpdateBanByIdData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Specifies a new reason for the banning to update. The length is limited to 250 characters.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a new reason for the banning to update. The length is limited to 250 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this ocUpdateBanByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcUpdateBanByIdData ocUpdateBanByIdData = (OcUpdateBanByIdData) o;
    return Objects.equals(this.channelUrl, ocUpdateBanByIdData.channelUrl) &&
        Objects.equals(this.bannedUserId, ocUpdateBanByIdData.bannedUserId) &&
        Objects.equals(this.seconds, ocUpdateBanByIdData.seconds) &&
        Objects.equals(this.description, ocUpdateBanByIdData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, bannedUserId, seconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcUpdateBanByIdData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    bannedUserId: ").append(toIndentedString(bannedUserId)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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

}

