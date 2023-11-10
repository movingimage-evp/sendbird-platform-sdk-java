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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdThumbnailSBObject
 */
@JsonPropertyOrder({
  SendBirdThumbnailSBObject.JSON_PROPERTY_HEIGHT,
  SendBirdThumbnailSBObject.JSON_PROPERTY_PLAIN_URL,
  SendBirdThumbnailSBObject.JSON_PROPERTY_REAL_HEIGHT,
  SendBirdThumbnailSBObject.JSON_PROPERTY_REAL_WIDTH,
  SendBirdThumbnailSBObject.JSON_PROPERTY_URL,
  SendBirdThumbnailSBObject.JSON_PROPERTY_WIDTH
})
@JsonTypeName("SendBird.ThumbnailSBObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class SendBirdThumbnailSBObject {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public static final String JSON_PROPERTY_PLAIN_URL = "plain_url";
  private String plainUrl;

  public static final String JSON_PROPERTY_REAL_HEIGHT = "real_height";
  private BigDecimal realHeight;

  public static final String JSON_PROPERTY_REAL_WIDTH = "real_width";
  private BigDecimal realWidth;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  public SendBirdThumbnailSBObject() { 
  }

  public SendBirdThumbnailSBObject height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public SendBirdThumbnailSBObject plainUrl(String plainUrl) {
    this.plainUrl = plainUrl;
    return this;
  }

   /**
   * Get plainUrl
   * @return plainUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAIN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlainUrl() {
    return plainUrl;
  }


  @JsonProperty(JSON_PROPERTY_PLAIN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlainUrl(String plainUrl) {
    this.plainUrl = plainUrl;
  }


  public SendBirdThumbnailSBObject realHeight(BigDecimal realHeight) {
    this.realHeight = realHeight;
    return this;
  }

   /**
   * Get realHeight
   * @return realHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REAL_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRealHeight() {
    return realHeight;
  }


  @JsonProperty(JSON_PROPERTY_REAL_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRealHeight(BigDecimal realHeight) {
    this.realHeight = realHeight;
  }


  public SendBirdThumbnailSBObject realWidth(BigDecimal realWidth) {
    this.realWidth = realWidth;
    return this;
  }

   /**
   * Get realWidth
   * @return realWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REAL_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRealWidth() {
    return realWidth;
  }


  @JsonProperty(JSON_PROPERTY_REAL_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRealWidth(BigDecimal realWidth) {
    this.realWidth = realWidth;
  }


  public SendBirdThumbnailSBObject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public SendBirdThumbnailSBObject width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  /**
   * Return true if this SendBird.ThumbnailSBObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThumbnailSBObject sendBirdThumbnailSBObject = (SendBirdThumbnailSBObject) o;
    return Objects.equals(this.height, sendBirdThumbnailSBObject.height) &&
        Objects.equals(this.plainUrl, sendBirdThumbnailSBObject.plainUrl) &&
        Objects.equals(this.realHeight, sendBirdThumbnailSBObject.realHeight) &&
        Objects.equals(this.realWidth, sendBirdThumbnailSBObject.realWidth) &&
        Objects.equals(this.url, sendBirdThumbnailSBObject.url) &&
        Objects.equals(this.width, sendBirdThumbnailSBObject.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, plainUrl, realHeight, realWidth, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThumbnailSBObject {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    plainUrl: ").append(toIndentedString(plainUrl)).append("\n");
    sb.append("    realHeight: ").append(toIndentedString(realHeight)).append("\n");
    sb.append("    realWidth: ").append(toIndentedString(realWidth)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

