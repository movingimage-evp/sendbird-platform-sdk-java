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
 * UpdateCountPreferenceOfChannelByUrlResponse
 */
@JsonPropertyOrder({
  UpdateCountPreferenceOfChannelByUrlResponse.JSON_PROPERTY_COUNT_PREFERENCE
})
@JsonTypeName("updateCountPreferenceOfChannelByUrlResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class UpdateCountPreferenceOfChannelByUrlResponse {
  public static final String JSON_PROPERTY_COUNT_PREFERENCE = "count_preference";
  private String countPreference;

  public UpdateCountPreferenceOfChannelByUrlResponse() { 
  }

  public UpdateCountPreferenceOfChannelByUrlResponse countPreference(String countPreference) {
    this.countPreference = countPreference;
    return this;
  }

   /**
   * Get countPreference
   * @return countPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountPreference() {
    return countPreference;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountPreference(String countPreference) {
    this.countPreference = countPreference;
  }


  /**
   * Return true if this updateCountPreferenceOfChannelByUrlResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCountPreferenceOfChannelByUrlResponse updateCountPreferenceOfChannelByUrlResponse = (UpdateCountPreferenceOfChannelByUrlResponse) o;
    return Objects.equals(this.countPreference, updateCountPreferenceOfChannelByUrlResponse.countPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCountPreferenceOfChannelByUrlResponse {\n");
    sb.append("    countPreference: ").append(toIndentedString(countPreference)).append("\n");
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

