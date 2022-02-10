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

/**
 * SendBirdOGImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class SendBirdOGImage {
  public static final String SERIALIZED_NAME_ALT = "alt";
  @SerializedName(SERIALIZED_NAME_ALT)
  private String alt;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_SECURE_URL = "secure_url";
  @SerializedName(SERIALIZED_NAME_SECURE_URL)
  private String secureUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public SendBirdOGImage() { 
  }

  public SendBirdOGImage alt(String alt) {
    
    this.alt = alt;
    return this;
  }

   /**
   * Get alt
   * @return alt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlt() {
    return alt;
  }


  public void setAlt(String alt) {
    this.alt = alt;
  }


  public SendBirdOGImage height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHeight() {
    return height;
  }


  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public SendBirdOGImage secureUrl(String secureUrl) {
    
    this.secureUrl = secureUrl;
    return this;
  }

   /**
   * Get secureUrl
   * @return secureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureUrl() {
    return secureUrl;
  }


  public void setSecureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
  }


  public SendBirdOGImage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SendBirdOGImage url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public SendBirdOGImage width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWidth() {
    return width;
  }


  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdOGImage sendBirdOGImage = (SendBirdOGImage) o;
    return Objects.equals(this.alt, sendBirdOGImage.alt) &&
        Objects.equals(this.height, sendBirdOGImage.height) &&
        Objects.equals(this.secureUrl, sendBirdOGImage.secureUrl) &&
        Objects.equals(this.type, sendBirdOGImage.type) &&
        Objects.equals(this.url, sendBirdOGImage.url) &&
        Objects.equals(this.width, sendBirdOGImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, height, secureUrl, type, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdOGImage {\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    secureUrl: ").append(toIndentedString(secureUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

