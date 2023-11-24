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
 * GcCheckIfMemberByIdResponse
 */
@JsonPropertyOrder({
  GcCheckIfMemberByIdResponse.JSON_PROPERTY_IS_MEMBER,
  GcCheckIfMemberByIdResponse.JSON_PROPERTY_STATE
})
@JsonTypeName("gcCheckIfMemberByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class GcCheckIfMemberByIdResponse {
  public static final String JSON_PROPERTY_IS_MEMBER = "is_member";
  private Boolean isMember;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public GcCheckIfMemberByIdResponse() { 
  }

  public GcCheckIfMemberByIdResponse isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMember() {
    return isMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public GcCheckIfMemberByIdResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  /**
   * Return true if this gcCheckIfMemberByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcCheckIfMemberByIdResponse gcCheckIfMemberByIdResponse = (GcCheckIfMemberByIdResponse) o;
    return Objects.equals(this.isMember, gcCheckIfMemberByIdResponse.isMember) &&
        Objects.equals(this.state, gcCheckIfMemberByIdResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMember, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcCheckIfMemberByIdResponse {\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

