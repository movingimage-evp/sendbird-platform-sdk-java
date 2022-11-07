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
 * UpdateEmojiCategoryUrlByIdData
 */
@JsonPropertyOrder({
  UpdateEmojiCategoryUrlByIdData.JSON_PROPERTY_EMOJI_CATEGORY_ID,
  UpdateEmojiCategoryUrlByIdData.JSON_PROPERTY_URL
})
@JsonTypeName("updateEmojiCategoryUrlByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class UpdateEmojiCategoryUrlByIdData {
  public static final String JSON_PROPERTY_EMOJI_CATEGORY_ID = "emoji_category_id";
  private Integer emojiCategoryId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public UpdateEmojiCategoryUrlByIdData() { 
  }

  public UpdateEmojiCategoryUrlByIdData emojiCategoryId(Integer emojiCategoryId) {
    this.emojiCategoryId = emojiCategoryId;
    return this;
  }

   /**
   * Specifies the unique ID of the emoji category to update.
   * @return emojiCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the emoji category to update.")
  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEmojiCategoryId() {
    return emojiCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmojiCategoryId(Integer emojiCategoryId) {
    this.emojiCategoryId = emojiCategoryId;
  }


  public UpdateEmojiCategoryUrlByIdData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the new URL of the emoji category.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the new URL of the emoji category.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this updateEmojiCategoryUrlByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData = (UpdateEmojiCategoryUrlByIdData) o;
    return Objects.equals(this.emojiCategoryId, updateEmojiCategoryUrlByIdData.emojiCategoryId) &&
        Objects.equals(this.url, updateEmojiCategoryUrlByIdData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCategoryId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmojiCategoryUrlByIdData {\n");
    sb.append("    emojiCategoryId: ").append(toIndentedString(emojiCategoryId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

