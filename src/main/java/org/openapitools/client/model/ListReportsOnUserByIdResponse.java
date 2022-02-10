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
import org.openapitools.client.model.ListReportsOnMessageByIdResponseReportLogs;

/**
 * ListReportsOnUserByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class ListReportsOnUserByIdResponse {
  public static final String SERIALIZED_NAME_REPORT_LOGS = "report_logs";
  @SerializedName(SERIALIZED_NAME_REPORT_LOGS)
  private List<ListReportsOnMessageByIdResponseReportLogs> reportLogs = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public ListReportsOnUserByIdResponse() { 
  }

  public ListReportsOnUserByIdResponse reportLogs(List<ListReportsOnMessageByIdResponseReportLogs> reportLogs) {
    
    this.reportLogs = reportLogs;
    return this;
  }

  public ListReportsOnUserByIdResponse addReportLogsItem(ListReportsOnMessageByIdResponseReportLogs reportLogsItem) {
    if (this.reportLogs == null) {
      this.reportLogs = new ArrayList<ListReportsOnMessageByIdResponseReportLogs>();
    }
    this.reportLogs.add(reportLogsItem);
    return this;
  }

   /**
   * Get reportLogs
   * @return reportLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListReportsOnMessageByIdResponseReportLogs> getReportLogs() {
    return reportLogs;
  }


  public void setReportLogs(List<ListReportsOnMessageByIdResponseReportLogs> reportLogs) {
    this.reportLogs = reportLogs;
  }


  public ListReportsOnUserByIdResponse next(String next) {
    
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
    ListReportsOnUserByIdResponse listReportsOnUserByIdResponse = (ListReportsOnUserByIdResponse) o;
    return Objects.equals(this.reportLogs, listReportsOnUserByIdResponse.reportLogs) &&
        Objects.equals(this.next, listReportsOnUserByIdResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportLogs, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListReportsOnUserByIdResponse {\n");
    sb.append("    reportLogs: ").append(toIndentedString(reportLogs)).append("\n");
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

