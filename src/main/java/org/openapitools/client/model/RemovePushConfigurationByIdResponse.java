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

/**
 * RemovePushConfigurationByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class RemovePushConfigurationByIdResponse {
  public static final String SERIALIZED_NAME_PUSH_CONFIGURATIONS = "push_configurations";
  @SerializedName(SERIALIZED_NAME_PUSH_CONFIGURATIONS)
  private List<String> pushConfigurations = null;

  public RemovePushConfigurationByIdResponse() { 
  }

  public RemovePushConfigurationByIdResponse pushConfigurations(List<String> pushConfigurations) {
    
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public RemovePushConfigurationByIdResponse addPushConfigurationsItem(String pushConfigurationsItem) {
    if (this.pushConfigurations == null) {
      this.pushConfigurations = new ArrayList<String>();
    }
    this.pushConfigurations.add(pushConfigurationsItem);
    return this;
  }

   /**
   * Get pushConfigurations
   * @return pushConfigurations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPushConfigurations() {
    return pushConfigurations;
  }


  public void setPushConfigurations(List<String> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovePushConfigurationByIdResponse removePushConfigurationByIdResponse = (RemovePushConfigurationByIdResponse) o;
    return Objects.equals(this.pushConfigurations, removePushConfigurationByIdResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovePushConfigurationByIdResponse {\n");
    sb.append("    pushConfigurations: ").append(toIndentedString(pushConfigurations)).append("\n");
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

