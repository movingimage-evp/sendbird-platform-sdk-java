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
import org.openapitools.client.model.OcListBannedUsersResponseBannedListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * OcListBannedUsersResponse
 */
@JsonPropertyOrder({
  OcListBannedUsersResponse.JSON_PROPERTY_BANNED_LIST,
  OcListBannedUsersResponse.JSON_PROPERTY_TOTAL_BAN_COUNT,
  OcListBannedUsersResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("ocListBannedUsersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class OcListBannedUsersResponse {
  public static final String JSON_PROPERTY_BANNED_LIST = "banned_list";
  private List<OcListBannedUsersResponseBannedListInner> bannedList = null;

  public static final String JSON_PROPERTY_TOTAL_BAN_COUNT = "total_ban_count";
  private BigDecimal totalBanCount;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public OcListBannedUsersResponse() { 
  }

  public OcListBannedUsersResponse bannedList(List<OcListBannedUsersResponseBannedListInner> bannedList) {
    this.bannedList = bannedList;
    return this;
  }

  public OcListBannedUsersResponse addBannedListItem(OcListBannedUsersResponseBannedListInner bannedListItem) {
    if (this.bannedList == null) {
      this.bannedList = new ArrayList<>();
    }
    this.bannedList.add(bannedListItem);
    return this;
  }

   /**
   * Get bannedList
   * @return bannedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcListBannedUsersResponseBannedListInner> getBannedList() {
    return bannedList;
  }


  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannedList(List<OcListBannedUsersResponseBannedListInner> bannedList) {
    this.bannedList = bannedList;
  }


  public OcListBannedUsersResponse totalBanCount(BigDecimal totalBanCount) {
    this.totalBanCount = totalBanCount;
    return this;
  }

   /**
   * Get totalBanCount
   * @return totalBanCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_BAN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalBanCount() {
    return totalBanCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_BAN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalBanCount(BigDecimal totalBanCount) {
    this.totalBanCount = totalBanCount;
  }


  public OcListBannedUsersResponse next(String next) {
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
   * Return true if this ocListBannedUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcListBannedUsersResponse ocListBannedUsersResponse = (OcListBannedUsersResponse) o;
    return Objects.equals(this.bannedList, ocListBannedUsersResponse.bannedList) &&
        Objects.equals(this.totalBanCount, ocListBannedUsersResponse.totalBanCount) &&
        Objects.equals(this.next, ocListBannedUsersResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannedList, totalBanCount, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcListBannedUsersResponse {\n");
    sb.append("    bannedList: ").append(toIndentedString(bannedList)).append("\n");
    sb.append("    totalBanCount: ").append(toIndentedString(totalBanCount)).append("\n");
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

