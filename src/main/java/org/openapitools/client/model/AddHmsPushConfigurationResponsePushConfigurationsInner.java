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
 * AddHmsPushConfigurationResponsePushConfigurationsInner
 */
@JsonPropertyOrder({
  AddHmsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_ID,
  AddHmsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_TYPE,
  AddHmsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_HUAWEI_APP_ID,
  AddHmsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_HUAWEI_APP_SECRET,
  AddHmsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("addHmsPushConfigurationResponse_push_configurations_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class AddHmsPushConfigurationResponsePushConfigurationsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PUSH_TYPE = "push_type";
  private String pushType;

  public static final String JSON_PROPERTY_HUAWEI_APP_ID = "huawei_app_id";
  private String huaweiAppId;

  public static final String JSON_PROPERTY_HUAWEI_APP_SECRET = "huawei_app_secret";
  private String huaweiAppSecret;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public AddHmsPushConfigurationResponsePushConfigurationsInner() { 
  }

  public AddHmsPushConfigurationResponsePushConfigurationsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AddHmsPushConfigurationResponsePushConfigurationsInner pushType(String pushType) {
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushType() {
    return pushType;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddHmsPushConfigurationResponsePushConfigurationsInner huaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
    return this;
  }

   /**
   * Get huaweiAppId
   * @return huaweiAppId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHuaweiAppId() {
    return huaweiAppId;
  }


  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHuaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
  }


  public AddHmsPushConfigurationResponsePushConfigurationsInner huaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
    return this;
  }

   /**
   * Get huaweiAppSecret
   * @return huaweiAppSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHuaweiAppSecret() {
    return huaweiAppSecret;
  }


  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHuaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
  }


  public AddHmsPushConfigurationResponsePushConfigurationsInner pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this addHmsPushConfigurationResponse_push_configurations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHmsPushConfigurationResponsePushConfigurationsInner addHmsPushConfigurationResponsePushConfigurationsInner = (AddHmsPushConfigurationResponsePushConfigurationsInner) o;
    return Objects.equals(this.id, addHmsPushConfigurationResponsePushConfigurationsInner.id) &&
        Objects.equals(this.pushType, addHmsPushConfigurationResponsePushConfigurationsInner.pushType) &&
        Objects.equals(this.huaweiAppId, addHmsPushConfigurationResponsePushConfigurationsInner.huaweiAppId) &&
        Objects.equals(this.huaweiAppSecret, addHmsPushConfigurationResponsePushConfigurationsInner.huaweiAppSecret) &&
        Objects.equals(this.pushSound, addHmsPushConfigurationResponsePushConfigurationsInner.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, huaweiAppId, huaweiAppSecret, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHmsPushConfigurationResponsePushConfigurationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    huaweiAppId: ").append(toIndentedString(huaweiAppId)).append("\n");
    sb.append("    huaweiAppSecret: ").append(toIndentedString(huaweiAppSecret)).append("\n");
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

