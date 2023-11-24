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
 * ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner
 */
@JsonPropertyOrder({
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.JSON_PROPERTY_ID,
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.JSON_PROPERTY_KEY,
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.JSON_PROPERTY_URL
})
@JsonTypeName("listAllEmojisAndEmojiCategoriesResponse_emoji_categories_inner_emojis_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner() { 
  }

  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner url(String url) {
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


  /**
   * Return true if this listAllEmojisAndEmojiCategoriesResponse_emoji_categories_inner_emojis_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner = (ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner) o;
    return Objects.equals(this.id, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.id) &&
        Objects.equals(this.key, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.key) &&
        Objects.equals(this.url, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

