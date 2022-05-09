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

/**
 * UpdateCountPreferenceOfChannelByUrlResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class UpdateCountPreferenceOfChannelByUrlResponse {
  public static final String SERIALIZED_NAME_COUNT_PREFERENCE = "count_preference";
  @SerializedName(SERIALIZED_NAME_COUNT_PREFERENCE)
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

  public String getCountPreference() {
    return countPreference;
  }


  public void setCountPreference(String countPreference) {
    this.countPreference = countPreference;
  }


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

