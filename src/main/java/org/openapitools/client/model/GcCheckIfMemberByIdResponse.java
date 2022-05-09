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
 * GcCheckIfMemberByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class GcCheckIfMemberByIdResponse {
  public static final String SERIALIZED_NAME_IS_MEMBER = "is_member";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
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

  public Boolean getIsMember() {
    return isMember;
  }


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

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


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

