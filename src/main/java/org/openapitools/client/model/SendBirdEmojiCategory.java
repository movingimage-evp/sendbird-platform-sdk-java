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
import org.openapitools.client.model.SendBirdEmoji;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdEmojiCategory
 */
@JsonPropertyOrder({
  SendBirdEmojiCategory.JSON_PROPERTY_EMOJIS,
  SendBirdEmojiCategory.JSON_PROPERTY_ID,
  SendBirdEmojiCategory.JSON_PROPERTY_NAME,
  SendBirdEmojiCategory.JSON_PROPERTY_URL
})
@JsonTypeName("SendBird.EmojiCategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class SendBirdEmojiCategory {
  public static final String JSON_PROPERTY_EMOJIS = "emojis";
  private List<SendBirdEmoji> emojis = null;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SendBirdEmojiCategory() { 
  }

  public SendBirdEmojiCategory emojis(List<SendBirdEmoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public SendBirdEmojiCategory addEmojisItem(SendBirdEmoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

   /**
   * Get emojis
   * @return emojis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdEmoji> getEmojis() {
    return emojis;
  }


  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmojis(List<SendBirdEmoji> emojis) {
    this.emojis = emojis;
  }


  public SendBirdEmojiCategory id(BigDecimal id) {
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


  public SendBirdEmojiCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SendBirdEmojiCategory url(String url) {
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
   * Return true if this SendBird.EmojiCategory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdEmojiCategory sendBirdEmojiCategory = (SendBirdEmojiCategory) o;
    return Objects.equals(this.emojis, sendBirdEmojiCategory.emojis) &&
        Objects.equals(this.id, sendBirdEmojiCategory.id) &&
        Objects.equals(this.name, sendBirdEmojiCategory.name) &&
        Objects.equals(this.url, sendBirdEmojiCategory.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis, id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdEmojiCategory {\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

