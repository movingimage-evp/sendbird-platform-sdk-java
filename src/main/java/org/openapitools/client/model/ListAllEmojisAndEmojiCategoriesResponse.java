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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponseEmojiCategories;

/**
 * ListAllEmojisAndEmojiCategoriesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class ListAllEmojisAndEmojiCategoriesResponse {
  public static final String SERIALIZED_NAME_EMOJI_HASH = "emoji_hash";
  @SerializedName(SERIALIZED_NAME_EMOJI_HASH)
  private String emojiHash;

  public static final String SERIALIZED_NAME_EMOJI_CATEGORIES = "emoji_categories";
  @SerializedName(SERIALIZED_NAME_EMOJI_CATEGORIES)
  private List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategories> emojiCategories = null;

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

  public String getEmojiHash() {
    return emojiHash;
  }


  public void setEmojiHash(String emojiHash) {
    this.emojiHash = emojiHash;
  }


  public ListAllEmojisAndEmojiCategoriesResponse emojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategories> emojiCategories) {
    
    this.emojiCategories = emojiCategories;
    return this;
  }

  public ListAllEmojisAndEmojiCategoriesResponse addEmojiCategoriesItem(ListAllEmojisAndEmojiCategoriesResponseEmojiCategories emojiCategoriesItem) {
    if (this.emojiCategories == null) {
      this.emojiCategories = new ArrayList<ListAllEmojisAndEmojiCategoriesResponseEmojiCategories>();
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

  public List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategories> getEmojiCategories() {
    return emojiCategories;
  }


  public void setEmojiCategories(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategories> emojiCategories) {
    this.emojiCategories = emojiCategories;
  }


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

