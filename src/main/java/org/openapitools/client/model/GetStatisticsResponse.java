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
import org.openapitools.client.model.GetStatisticsDailyResponseStatisticsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GetStatisticsResponse
 */
@JsonPropertyOrder({
  GetStatisticsResponse.JSON_PROPERTY_STATISTICS,
  GetStatisticsResponse.JSON_PROPERTY_WEEK
})
@JsonTypeName("getStatisticsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class GetStatisticsResponse {
  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private List<GetStatisticsDailyResponseStatisticsInner> statistics = null;

  public static final String JSON_PROPERTY_WEEK = "week";
  private BigDecimal week;

  public GetStatisticsResponse() { 
  }

  public GetStatisticsResponse statistics(List<GetStatisticsDailyResponseStatisticsInner> statistics) {
    this.statistics = statistics;
    return this;
  }

  public GetStatisticsResponse addStatisticsItem(GetStatisticsDailyResponseStatisticsInner statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetStatisticsDailyResponseStatisticsInner> getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(List<GetStatisticsDailyResponseStatisticsInner> statistics) {
    this.statistics = statistics;
  }


  public GetStatisticsResponse week(BigDecimal week) {
    this.week = week;
    return this;
  }

   /**
   * Get week
   * @return week
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeek() {
    return week;
  }


  @JsonProperty(JSON_PROPERTY_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeek(BigDecimal week) {
    this.week = week;
  }


  /**
   * Return true if this getStatisticsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatisticsResponse getStatisticsResponse = (GetStatisticsResponse) o;
    return Objects.equals(this.statistics, getStatisticsResponse.statistics) &&
        Objects.equals(this.week, getStatisticsResponse.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatisticsResponse {\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

