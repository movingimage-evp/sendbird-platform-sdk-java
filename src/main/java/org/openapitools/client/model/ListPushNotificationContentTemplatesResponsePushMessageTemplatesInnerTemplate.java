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
 * ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate
 */
@JsonPropertyOrder({
  ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.JSON_PROPERTY_M_E_S_G,
  ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.JSON_PROPERTY_F_I_L_E,
  ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.JSON_PROPERTY_A_D_M_M
})
@JsonTypeName("listPushNotificationContentTemplatesResponse_push_message_templates_inner_template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate {
  public static final String JSON_PROPERTY_M_E_S_G = "MESG";
  private String MESG;

  public static final String JSON_PROPERTY_F_I_L_E = "FILE";
  private String FILE;

  public static final String JSON_PROPERTY_A_D_M_M = "ADMM";
  private String ADMM;

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate() { 
  }

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate MESG(String MESG) {
    this.MESG = MESG;
    return this;
  }

   /**
   * Get MESG
   * @return MESG
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_M_E_S_G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMESG() {
    return MESG;
  }


  @JsonProperty(JSON_PROPERTY_M_E_S_G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMESG(String MESG) {
    this.MESG = MESG;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate FILE(String FILE) {
    this.FILE = FILE;
    return this;
  }

   /**
   * Get FILE
   * @return FILE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F_I_L_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFILE() {
    return FILE;
  }


  @JsonProperty(JSON_PROPERTY_F_I_L_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFILE(String FILE) {
    this.FILE = FILE;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate ADMM(String ADMM) {
    this.ADMM = ADMM;
    return this;
  }

   /**
   * Get ADMM
   * @return ADMM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_A_D_M_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getADMM() {
    return ADMM;
  }


  @JsonProperty(JSON_PROPERTY_A_D_M_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setADMM(String ADMM) {
    this.ADMM = ADMM;
  }


  /**
   * Return true if this listPushNotificationContentTemplatesResponse_push_message_templates_inner_template object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate = (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate) o;
    return Objects.equals(this.MESG, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.MESG) &&
        Objects.equals(this.FILE, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.FILE) &&
        Objects.equals(this.ADMM, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.ADMM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MESG, FILE, ADMM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate {\n");
    sb.append("    MESG: ").append(toIndentedString(MESG)).append("\n");
    sb.append("    FILE: ").append(toIndentedString(FILE)).append("\n");
    sb.append("    ADMM: ").append(toIndentedString(ADMM)).append("\n");
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

