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
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponsePushMessageTemplates;

/**
 * ListPushNotificationContentTemplatesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class ListPushNotificationContentTemplatesResponse {
  public static final String SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES = "push_message_templates";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES)
  private List<ListPushNotificationContentTemplatesResponsePushMessageTemplates> pushMessageTemplates = null;

  public ListPushNotificationContentTemplatesResponse() { 
  }

  public ListPushNotificationContentTemplatesResponse pushMessageTemplates(List<ListPushNotificationContentTemplatesResponsePushMessageTemplates> pushMessageTemplates) {
    
    this.pushMessageTemplates = pushMessageTemplates;
    return this;
  }

  public ListPushNotificationContentTemplatesResponse addPushMessageTemplatesItem(ListPushNotificationContentTemplatesResponsePushMessageTemplates pushMessageTemplatesItem) {
    if (this.pushMessageTemplates == null) {
      this.pushMessageTemplates = new ArrayList<ListPushNotificationContentTemplatesResponsePushMessageTemplates>();
    }
    this.pushMessageTemplates.add(pushMessageTemplatesItem);
    return this;
  }

   /**
   * Get pushMessageTemplates
   * @return pushMessageTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListPushNotificationContentTemplatesResponsePushMessageTemplates> getPushMessageTemplates() {
    return pushMessageTemplates;
  }


  public void setPushMessageTemplates(List<ListPushNotificationContentTemplatesResponsePushMessageTemplates> pushMessageTemplates) {
    this.pushMessageTemplates = pushMessageTemplates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponse listPushNotificationContentTemplatesResponse = (ListPushNotificationContentTemplatesResponse) o;
    return Objects.equals(this.pushMessageTemplates, listPushNotificationContentTemplatesResponse.pushMessageTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushMessageTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponse {\n");
    sb.append("    pushMessageTemplates: ").append(toIndentedString(pushMessageTemplates)).append("\n");
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

