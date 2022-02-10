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
 * ViewNumberOfConcurrentConnectionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class ViewNumberOfConcurrentConnectionsResponse {
  public static final String SERIALIZED_NAME_CCU = "ccu";
  @SerializedName(SERIALIZED_NAME_CCU)
  private BigDecimal ccu;

  public ViewNumberOfConcurrentConnectionsResponse() { 
  }

  public ViewNumberOfConcurrentConnectionsResponse ccu(BigDecimal ccu) {
    
    this.ccu = ccu;
    return this;
  }

   /**
   * Get ccu
   * @return ccu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCcu() {
    return ccu;
  }


  public void setCcu(BigDecimal ccu) {
    this.ccu = ccu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfConcurrentConnectionsResponse viewNumberOfConcurrentConnectionsResponse = (ViewNumberOfConcurrentConnectionsResponse) o;
    return Objects.equals(this.ccu, viewNumberOfConcurrentConnectionsResponse.ccu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfConcurrentConnectionsResponse {\n");
    sb.append("    ccu: ").append(toIndentedString(ccu)).append("\n");
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

