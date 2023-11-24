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
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcListMutedUsersResponse
 */
@JsonPropertyOrder({
  GcListMutedUsersResponse.JSON_PROPERTY_MUTED_LIST,
  GcListMutedUsersResponse.JSON_PROPERTY_TOTAL_MUTE_COUNT,
  GcListMutedUsersResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("gcListMutedUsersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class GcListMutedUsersResponse {
  public static final String JSON_PROPERTY_MUTED_LIST = "muted_list";
  private List<SendBirdUser> mutedList = null;

  public static final String JSON_PROPERTY_TOTAL_MUTE_COUNT = "total_mute_count";
  private BigDecimal totalMuteCount;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public GcListMutedUsersResponse() { 
  }

  public GcListMutedUsersResponse mutedList(List<SendBirdUser> mutedList) {
    this.mutedList = mutedList;
    return this;
  }

  public GcListMutedUsersResponse addMutedListItem(SendBirdUser mutedListItem) {
    if (this.mutedList == null) {
      this.mutedList = new ArrayList<>();
    }
    this.mutedList.add(mutedListItem);
    return this;
  }

   /**
   * Get mutedList
   * @return mutedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getMutedList() {
    return mutedList;
  }


  @JsonProperty(JSON_PROPERTY_MUTED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutedList(List<SendBirdUser> mutedList) {
    this.mutedList = mutedList;
  }


  public GcListMutedUsersResponse totalMuteCount(BigDecimal totalMuteCount) {
    this.totalMuteCount = totalMuteCount;
    return this;
  }

   /**
   * Get totalMuteCount
   * @return totalMuteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_MUTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalMuteCount() {
    return totalMuteCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_MUTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalMuteCount(BigDecimal totalMuteCount) {
    this.totalMuteCount = totalMuteCount;
  }


  public GcListMutedUsersResponse next(String next) {
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
   * Return true if this gcListMutedUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcListMutedUsersResponse gcListMutedUsersResponse = (GcListMutedUsersResponse) o;
    return Objects.equals(this.mutedList, gcListMutedUsersResponse.mutedList) &&
        Objects.equals(this.totalMuteCount, gcListMutedUsersResponse.totalMuteCount) &&
        Objects.equals(this.next, gcListMutedUsersResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutedList, totalMuteCount, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcListMutedUsersResponse {\n");
    sb.append("    mutedList: ").append(toIndentedString(mutedList)).append("\n");
    sb.append("    totalMuteCount: ").append(toIndentedString(totalMuteCount)).append("\n");
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

