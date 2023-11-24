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
import org.openapitools.client.model.SetDomainFilterDataDomainFilter;
import org.openapitools.client.model.SetDomainFilterDataImageModeration;
import org.openapitools.client.model.SetDomainFilterDataProfanityFilter;
import org.openapitools.client.model.SetDomainFilterDataProfanityTriggeredModeration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SetDomainFilterData
 */
@JsonPropertyOrder({
  SetDomainFilterData.JSON_PROPERTY_DOMAIN_FILTER,
  SetDomainFilterData.JSON_PROPERTY_PROFANITY_FILTER,
  SetDomainFilterData.JSON_PROPERTY_PROFANITY_TRIGGERED_MODERATION,
  SetDomainFilterData.JSON_PROPERTY_IMAGE_MODERATION
})
@JsonTypeName("setDomainFilterData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class SetDomainFilterData {
  public static final String JSON_PROPERTY_DOMAIN_FILTER = "domain_filter";
  private SetDomainFilterDataDomainFilter domainFilter;

  public static final String JSON_PROPERTY_PROFANITY_FILTER = "profanity_filter";
  private SetDomainFilterDataProfanityFilter profanityFilter;

  public static final String JSON_PROPERTY_PROFANITY_TRIGGERED_MODERATION = "profanity_triggered_moderation";
  private SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration;

  public static final String JSON_PROPERTY_IMAGE_MODERATION = "image_moderation";
  private SetDomainFilterDataImageModeration imageModeration;

  public SetDomainFilterData() { 
  }

  public SetDomainFilterData domainFilter(SetDomainFilterDataDomainFilter domainFilter) {
    this.domainFilter = domainFilter;
    return this;
  }

   /**
   * Get domainFilter
   * @return domainFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetDomainFilterDataDomainFilter getDomainFilter() {
    return domainFilter;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainFilter(SetDomainFilterDataDomainFilter domainFilter) {
    this.domainFilter = domainFilter;
  }


  public SetDomainFilterData profanityFilter(SetDomainFilterDataProfanityFilter profanityFilter) {
    this.profanityFilter = profanityFilter;
    return this;
  }

   /**
   * Get profanityFilter
   * @return profanityFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFANITY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetDomainFilterDataProfanityFilter getProfanityFilter() {
    return profanityFilter;
  }


  @JsonProperty(JSON_PROPERTY_PROFANITY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfanityFilter(SetDomainFilterDataProfanityFilter profanityFilter) {
    this.profanityFilter = profanityFilter;
  }


  public SetDomainFilterData profanityTriggeredModeration(SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration) {
    this.profanityTriggeredModeration = profanityTriggeredModeration;
    return this;
  }

   /**
   * Get profanityTriggeredModeration
   * @return profanityTriggeredModeration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFANITY_TRIGGERED_MODERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetDomainFilterDataProfanityTriggeredModeration getProfanityTriggeredModeration() {
    return profanityTriggeredModeration;
  }


  @JsonProperty(JSON_PROPERTY_PROFANITY_TRIGGERED_MODERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfanityTriggeredModeration(SetDomainFilterDataProfanityTriggeredModeration profanityTriggeredModeration) {
    this.profanityTriggeredModeration = profanityTriggeredModeration;
  }


  public SetDomainFilterData imageModeration(SetDomainFilterDataImageModeration imageModeration) {
    this.imageModeration = imageModeration;
    return this;
  }

   /**
   * Get imageModeration
   * @return imageModeration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_MODERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetDomainFilterDataImageModeration getImageModeration() {
    return imageModeration;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_MODERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageModeration(SetDomainFilterDataImageModeration imageModeration) {
    this.imageModeration = imageModeration;
  }


  /**
   * Return true if this setDomainFilterData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterData setDomainFilterData = (SetDomainFilterData) o;
    return Objects.equals(this.domainFilter, setDomainFilterData.domainFilter) &&
        Objects.equals(this.profanityFilter, setDomainFilterData.profanityFilter) &&
        Objects.equals(this.profanityTriggeredModeration, setDomainFilterData.profanityTriggeredModeration) &&
        Objects.equals(this.imageModeration, setDomainFilterData.imageModeration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainFilter, profanityFilter, profanityTriggeredModeration, imageModeration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterData {\n");
    sb.append("    domainFilter: ").append(toIndentedString(domainFilter)).append("\n");
    sb.append("    profanityFilter: ").append(toIndentedString(profanityFilter)).append("\n");
    sb.append("    profanityTriggeredModeration: ").append(toIndentedString(profanityTriggeredModeration)).append("\n");
    sb.append("    imageModeration: ").append(toIndentedString(imageModeration)).append("\n");
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

