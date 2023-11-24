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
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcListOperatorsResponse
 */
@JsonPropertyOrder({
  GcListOperatorsResponse.JSON_PROPERTY_OPERATORS,
  GcListOperatorsResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("gcListOperatorsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class GcListOperatorsResponse {
  public static final String JSON_PROPERTY_OPERATORS = "operators";
  private List<SendBirdUser> operators = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public GcListOperatorsResponse() { 
  }

  public GcListOperatorsResponse operators(List<SendBirdUser> operators) {
    this.operators = operators;
    return this;
  }

  public GcListOperatorsResponse addOperatorsItem(SendBirdUser operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * Get operators
   * @return operators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getOperators() {
    return operators;
  }


  @JsonProperty(JSON_PROPERTY_OPERATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperators(List<SendBirdUser> operators) {
    this.operators = operators;
  }


  public GcListOperatorsResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this gcListOperatorsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcListOperatorsResponse gcListOperatorsResponse = (GcListOperatorsResponse) o;
    return Objects.equals(this.operators, gcListOperatorsResponse.operators) &&
        Objects.equals(this.next, gcListOperatorsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operators, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcListOperatorsResponse {\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

