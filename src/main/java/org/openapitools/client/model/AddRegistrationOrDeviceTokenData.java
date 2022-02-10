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
 * AddRegistrationOrDeviceTokenData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T12:13:33.713738Z[Europe/London]")
public class AddRegistrationOrDeviceTokenData {
  public static final String SERIALIZED_NAME_GCM_REG_TOKEN = "gcm_reg_token";
  @SerializedName(SERIALIZED_NAME_GCM_REG_TOKEN)
  private String gcmRegToken;

  public static final String SERIALIZED_NAME_HUAWEI_DEVICE_TOKEN = "huawei_device_token";
  @SerializedName(SERIALIZED_NAME_HUAWEI_DEVICE_TOKEN)
  private String huaweiDeviceToken;

  public static final String SERIALIZED_NAME_APNS_DEVICE_TOKEN = "apns_device_token";
  @SerializedName(SERIALIZED_NAME_APNS_DEVICE_TOKEN)
  private String apnsDeviceToken;

  public AddRegistrationOrDeviceTokenData() { 
  }

  public AddRegistrationOrDeviceTokenData gcmRegToken(String gcmRegToken) {
    
    this.gcmRegToken = gcmRegToken;
    return this;
  }

   /**
   * Specifies a registration token for Firebase Cloud Messaging (formerly [Google Cloud Messaging](https://developers.google.com/cloud-messaging/)).
   * @return gcmRegToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a registration token for Firebase Cloud Messaging (formerly [Google Cloud Messaging](https://developers.google.com/cloud-messaging/)).")

  public String getGcmRegToken() {
    return gcmRegToken;
  }


  public void setGcmRegToken(String gcmRegToken) {
    this.gcmRegToken = gcmRegToken;
  }


  public AddRegistrationOrDeviceTokenData huaweiDeviceToken(String huaweiDeviceToken) {
    
    this.huaweiDeviceToken = huaweiDeviceToken;
    return this;
  }

   /**
   * Specifies a device token for Huawei Mobile Services.
   * @return huaweiDeviceToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a device token for Huawei Mobile Services.")

  public String getHuaweiDeviceToken() {
    return huaweiDeviceToken;
  }


  public void setHuaweiDeviceToken(String huaweiDeviceToken) {
    this.huaweiDeviceToken = huaweiDeviceToken;
  }


  public AddRegistrationOrDeviceTokenData apnsDeviceToken(String apnsDeviceToken) {
    
    this.apnsDeviceToken = apnsDeviceToken;
    return this;
  }

   /**
   * Specifies a device token for Apple Push Notification Service.
   * @return apnsDeviceToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a device token for Apple Push Notification Service.")

  public String getApnsDeviceToken() {
    return apnsDeviceToken;
  }


  public void setApnsDeviceToken(String apnsDeviceToken) {
    this.apnsDeviceToken = apnsDeviceToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = (AddRegistrationOrDeviceTokenData) o;
    return Objects.equals(this.gcmRegToken, addRegistrationOrDeviceTokenData.gcmRegToken) &&
        Objects.equals(this.huaweiDeviceToken, addRegistrationOrDeviceTokenData.huaweiDeviceToken) &&
        Objects.equals(this.apnsDeviceToken, addRegistrationOrDeviceTokenData.apnsDeviceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcmRegToken, huaweiDeviceToken, apnsDeviceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRegistrationOrDeviceTokenData {\n");
    sb.append("    gcmRegToken: ").append(toIndentedString(gcmRegToken)).append("\n");
    sb.append("    huaweiDeviceToken: ").append(toIndentedString(huaweiDeviceToken)).append("\n");
    sb.append("    apnsDeviceToken: ").append(toIndentedString(apnsDeviceToken)).append("\n");
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

