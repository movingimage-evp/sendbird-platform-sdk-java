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
 * SendBirdThumbnailSize
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class SendBirdThumbnailSize {
  public static final String SERIALIZED_NAME_MAX_HEIGHT = "max_height";
  @SerializedName(SERIALIZED_NAME_MAX_HEIGHT)
  private BigDecimal maxHeight;

  public static final String SERIALIZED_NAME_MAX_WIDTH = "max_width";
  @SerializedName(SERIALIZED_NAME_MAX_WIDTH)
  private BigDecimal maxWidth;

  public SendBirdThumbnailSize() { 
  }

  public SendBirdThumbnailSize maxHeight(BigDecimal maxHeight) {
    
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxHeight() {
    return maxHeight;
  }


  public void setMaxHeight(BigDecimal maxHeight) {
    this.maxHeight = maxHeight;
  }


  public SendBirdThumbnailSize maxWidth(BigDecimal maxWidth) {
    
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxWidth() {
    return maxWidth;
  }


  public void setMaxWidth(BigDecimal maxWidth) {
    this.maxWidth = maxWidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThumbnailSize sendBirdThumbnailSize = (SendBirdThumbnailSize) o;
    return Objects.equals(this.maxHeight, sendBirdThumbnailSize.maxHeight) &&
        Objects.equals(this.maxWidth, sendBirdThumbnailSize.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHeight, maxWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThumbnailSize {\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
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

