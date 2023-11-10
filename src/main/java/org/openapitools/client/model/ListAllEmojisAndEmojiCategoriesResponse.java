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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListAllEmojisAndEmojiCategoriesResponse
 */
@JsonPropertyOrder({
  ListAllEmojisAndEmojiCategoriesResponse.JSON_PROPERTY_EMOJI_HASH,
  ListAllEmojisAndEmojiCategoriesResponse.JSON_PROPERTY_EMOJI_CATEGORIES
})
@JsonTypeName("listAllEmojisAndEmojiCategoriesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class ListAllEmojisAndEmojiCategoriesResponse {
  public static final String JSON_PROPERTY_EMOJI_HASH = "emoji_hash";
  private String emojiHash;

  public static final String JSON_PROPERTY_EMOJI_CATEGORIES = "emoji_categories";
  private List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories = null;

  public ListAllEmojisAndEmojiCategoriesResponse() { 
  }

  public ListAllEmojisAndEmojiCategoriesResponse emojiHash(String emojiHash) {
    this.emojiHash = emojiHash;
    return this;
  }

   /**
   * Get emojiHash
   * @return emojiHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMOJI_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmojiHash() {
    return emojiHash;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmojiHash(String emojiHash) {
    this.emojiHash = emojiHash;
  }


  public ListAllEmojisAndEmojiCategoriesResponse emojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    this.emojiCategories = emojiCategories;
    return this;
  }

  public ListAllEmojisAndEmojiCategoriesResponse addEmojiCategoriesItem(ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner emojiCategoriesItem) {
    if (this.emojiCategories == null) {
      this.emojiCategories = new ArrayList<>();
    }
    this.emojiCategories.add(emojiCategoriesItem);
    return this;
  }

   /**
   * Get emojiCategories
   * @return emojiCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> getEmojiCategories() {
    return emojiCategories;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    this.emojiCategories = emojiCategories;
  }


  /**
   * Return true if this listAllEmojisAndEmojiCategoriesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAllEmojisAndEmojiCategoriesResponse listAllEmojisAndEmojiCategoriesResponse = (ListAllEmojisAndEmojiCategoriesResponse) o;
    return Objects.equals(this.emojiHash, listAllEmojisAndEmojiCategoriesResponse.emojiHash) &&
        Objects.equals(this.emojiCategories, listAllEmojisAndEmojiCategoriesResponse.emojiCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiHash, emojiCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllEmojisAndEmojiCategoriesResponse {\n");
    sb.append("    emojiHash: ").append(toIndentedString(emojiHash)).append("\n");
    sb.append("    emojiCategories: ").append(toIndentedString(emojiCategories)).append("\n");
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

