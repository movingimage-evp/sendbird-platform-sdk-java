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
 * UpdateFcmPushConfigurationByIdData
 */
@JsonPropertyOrder({
  UpdateFcmPushConfigurationByIdData.JSON_PROPERTY_PROVIDER_ID,
  UpdateFcmPushConfigurationByIdData.JSON_PROPERTY_API_KEY,
  UpdateFcmPushConfigurationByIdData.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("updateFcmPushConfigurationByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class UpdateFcmPushConfigurationByIdData {
  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private String providerId;

  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public UpdateFcmPushConfigurationByIdData() { 
  }

  public UpdateFcmPushConfigurationByIdData providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Specifies the provider ID of the push configuration to update.
   * @return providerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the provider ID of the push configuration to update.")
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public UpdateFcmPushConfigurationByIdData apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Specifies the FCM server key to update.
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the FCM server key to update.")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public UpdateFcmPushConfigurationByIdData pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the &#x60;/res/raw&#x60; folder.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the `/res/raw` folder.")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this updateFcmPushConfigurationByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData = (UpdateFcmPushConfigurationByIdData) o;
    return Objects.equals(this.providerId, updateFcmPushConfigurationByIdData.providerId) &&
        Objects.equals(this.apiKey, updateFcmPushConfigurationByIdData.apiKey) &&
        Objects.equals(this.pushSound, updateFcmPushConfigurationByIdData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, apiKey, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFcmPushConfigurationByIdData {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

