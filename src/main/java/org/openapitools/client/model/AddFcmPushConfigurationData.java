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
 * AddFcmPushConfigurationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class AddFcmPushConfigurationData {
  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddFcmPushConfigurationData() { 
  }

  public AddFcmPushConfigurationData apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Specifies the FCM server key to register.
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the FCM server key to register.")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AddFcmPushConfigurationData pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the &#x60;/res/raw&#x60; folder.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the `/res/raw` folder.")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFcmPushConfigurationData addFcmPushConfigurationData = (AddFcmPushConfigurationData) o;
    return Objects.equals(this.apiKey, addFcmPushConfigurationData.apiKey) &&
        Objects.equals(this.pushSound, addFcmPushConfigurationData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFcmPushConfigurationData {\n");
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

