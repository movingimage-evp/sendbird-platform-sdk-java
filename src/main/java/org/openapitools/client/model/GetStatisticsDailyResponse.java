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
import org.openapitools.client.model.GetStatisticsDailyResponseStatistics;

/**
 * GetStatisticsDailyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T12:13:33.713738Z[Europe/London]")
public class GetStatisticsDailyResponse {
  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private List<GetStatisticsDailyResponseStatistics> statistics = null;

  public static final String SERIALIZED_NAME_WEEK = "week";
  @SerializedName(SERIALIZED_NAME_WEEK)
  private BigDecimal week;

  public GetStatisticsDailyResponse() { 
  }

  public GetStatisticsDailyResponse statistics(List<GetStatisticsDailyResponseStatistics> statistics) {
    
    this.statistics = statistics;
    return this;
  }

  public GetStatisticsDailyResponse addStatisticsItem(GetStatisticsDailyResponseStatistics statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<GetStatisticsDailyResponseStatistics>();
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

  public List<GetStatisticsDailyResponseStatistics> getStatistics() {
    return statistics;
  }


  public void setStatistics(List<GetStatisticsDailyResponseStatistics> statistics) {
    this.statistics = statistics;
  }


  public GetStatisticsDailyResponse week(BigDecimal week) {
    
    this.week = week;
    return this;
  }

   /**
   * Get week
   * @return week
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWeek() {
    return week;
  }


  public void setWeek(BigDecimal week) {
    this.week = week;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatisticsDailyResponse getStatisticsDailyResponse = (GetStatisticsDailyResponse) o;
    return Objects.equals(this.statistics, getStatisticsDailyResponse.statistics) &&
        Objects.equals(this.week, getStatisticsDailyResponse.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatisticsDailyResponse {\n");
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

