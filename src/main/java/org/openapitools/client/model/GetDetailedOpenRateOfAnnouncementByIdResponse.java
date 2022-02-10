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
import java.util.ArrayList;
import java.util.List;

/**
 * GetDetailedOpenRateOfAnnouncementByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class GetDetailedOpenRateOfAnnouncementByIdResponse {
  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public static final String SERIALIZED_NAME_OPEN_COUNTS = "open_counts";
  @SerializedName(SERIALIZED_NAME_OPEN_COUNTS)
  private List<BigDecimal> openCounts = null;

  public static final String SERIALIZED_NAME_OPEN_RATES = "open_rates";
  @SerializedName(SERIALIZED_NAME_OPEN_RATES)
  private List<BigDecimal> openRates = null;

  public static final String SERIALIZED_NAME_CUMULATIVE_OPEN_COUNTS = "cumulative_open_counts";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_OPEN_COUNTS)
  private List<BigDecimal> cumulativeOpenCounts = null;

  public static final String SERIALIZED_NAME_CUMULATIVE_OPEN_RATES = "cumulative_open_rates";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_OPEN_RATES)
  private List<BigDecimal> cumulativeOpenRates = null;

  public GetDetailedOpenRateOfAnnouncementByIdResponse() { 
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse openCounts(List<BigDecimal> openCounts) {
    
    this.openCounts = openCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addOpenCountsItem(BigDecimal openCountsItem) {
    if (this.openCounts == null) {
      this.openCounts = new ArrayList<BigDecimal>();
    }
    this.openCounts.add(openCountsItem);
    return this;
  }

   /**
   * Get openCounts
   * @return openCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getOpenCounts() {
    return openCounts;
  }


  public void setOpenCounts(List<BigDecimal> openCounts) {
    this.openCounts = openCounts;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse openRates(List<BigDecimal> openRates) {
    
    this.openRates = openRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addOpenRatesItem(BigDecimal openRatesItem) {
    if (this.openRates == null) {
      this.openRates = new ArrayList<BigDecimal>();
    }
    this.openRates.add(openRatesItem);
    return this;
  }

   /**
   * Get openRates
   * @return openRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getOpenRates() {
    return openRates;
  }


  public void setOpenRates(List<BigDecimal> openRates) {
    this.openRates = openRates;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse cumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    
    this.cumulativeOpenCounts = cumulativeOpenCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addCumulativeOpenCountsItem(BigDecimal cumulativeOpenCountsItem) {
    if (this.cumulativeOpenCounts == null) {
      this.cumulativeOpenCounts = new ArrayList<BigDecimal>();
    }
    this.cumulativeOpenCounts.add(cumulativeOpenCountsItem);
    return this;
  }

   /**
   * Get cumulativeOpenCounts
   * @return cumulativeOpenCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getCumulativeOpenCounts() {
    return cumulativeOpenCounts;
  }


  public void setCumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    this.cumulativeOpenCounts = cumulativeOpenCounts;
  }


  public GetDetailedOpenRateOfAnnouncementByIdResponse cumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    
    this.cumulativeOpenRates = cumulativeOpenRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementByIdResponse addCumulativeOpenRatesItem(BigDecimal cumulativeOpenRatesItem) {
    if (this.cumulativeOpenRates == null) {
      this.cumulativeOpenRates = new ArrayList<BigDecimal>();
    }
    this.cumulativeOpenRates.add(cumulativeOpenRatesItem);
    return this;
  }

   /**
   * Get cumulativeOpenRates
   * @return cumulativeOpenRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getCumulativeOpenRates() {
    return cumulativeOpenRates;
  }


  public void setCumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    this.cumulativeOpenRates = cumulativeOpenRates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenRateOfAnnouncementByIdResponse getDetailedOpenRateOfAnnouncementByIdResponse = (GetDetailedOpenRateOfAnnouncementByIdResponse) o;
    return Objects.equals(this.uniqueId, getDetailedOpenRateOfAnnouncementByIdResponse.uniqueId) &&
        Objects.equals(this.openCounts, getDetailedOpenRateOfAnnouncementByIdResponse.openCounts) &&
        Objects.equals(this.openRates, getDetailedOpenRateOfAnnouncementByIdResponse.openRates) &&
        Objects.equals(this.cumulativeOpenCounts, getDetailedOpenRateOfAnnouncementByIdResponse.cumulativeOpenCounts) &&
        Objects.equals(this.cumulativeOpenRates, getDetailedOpenRateOfAnnouncementByIdResponse.cumulativeOpenRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, openCounts, openRates, cumulativeOpenCounts, cumulativeOpenRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenRateOfAnnouncementByIdResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    openCounts: ").append(toIndentedString(openCounts)).append("\n");
    sb.append("    openRates: ").append(toIndentedString(openRates)).append("\n");
    sb.append("    cumulativeOpenCounts: ").append(toIndentedString(cumulativeOpenCounts)).append("\n");
    sb.append("    cumulativeOpenRates: ").append(toIndentedString(cumulativeOpenRates)).append("\n");
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

