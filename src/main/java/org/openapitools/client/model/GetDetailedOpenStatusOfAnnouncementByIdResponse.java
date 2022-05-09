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
import org.openapitools.client.model.GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus;

/**
 * GetDetailedOpenStatusOfAnnouncementByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class GetDetailedOpenStatusOfAnnouncementByIdResponse {
  public static final String SERIALIZED_NAME_OPEN_STATUS = "open_status";
  @SerializedName(SERIALIZED_NAME_OPEN_STATUS)
  private List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus> openStatus = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public GetDetailedOpenStatusOfAnnouncementByIdResponse() { 
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse openStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus> openStatus) {
    
    this.openStatus = openStatus;
    return this;
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse addOpenStatusItem(GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus openStatusItem) {
    if (this.openStatus == null) {
      this.openStatus = new ArrayList<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus>();
    }
    this.openStatus.add(openStatusItem);
    return this;
  }

   /**
   * Get openStatus
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus> getOpenStatus() {
    return openStatus;
  }


  public void setOpenStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatus> openStatus) {
    this.openStatus = openStatus;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementByIdResponse = (GetDetailedOpenStatusOfAnnouncementByIdResponse) o;
    return Objects.equals(this.openStatus, getDetailedOpenStatusOfAnnouncementByIdResponse.openStatus) &&
        Objects.equals(this.next, getDetailedOpenStatusOfAnnouncementByIdResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openStatus, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenStatusOfAnnouncementByIdResponse {\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
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
