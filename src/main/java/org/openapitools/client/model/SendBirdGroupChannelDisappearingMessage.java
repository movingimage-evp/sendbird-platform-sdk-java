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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdGroupChannelDisappearingMessage
 */
@JsonPropertyOrder({
  SendBirdGroupChannelDisappearingMessage.JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS,
  SendBirdGroupChannelDisappearingMessage.JSON_PROPERTY_IS_TRIGGERED_BY_MESSAGE_READ
})
@JsonTypeName("SendBird_GroupChannel_disappearing_message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class SendBirdGroupChannelDisappearingMessage {
  public static final String JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  private BigDecimal messageSurvivalSeconds;

  public static final String JSON_PROPERTY_IS_TRIGGERED_BY_MESSAGE_READ = "is_triggered_by_message_read";
  private Boolean isTriggeredByMessageRead;

  public SendBirdGroupChannelDisappearingMessage() { 
  }

  public SendBirdGroupChannelDisappearingMessage messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public SendBirdGroupChannelDisappearingMessage isTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
    return this;
  }

   /**
   * Get isTriggeredByMessageRead
   * @return isTriggeredByMessageRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_TRIGGERED_BY_MESSAGE_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTriggeredByMessageRead() {
    return isTriggeredByMessageRead;
  }


  @JsonProperty(JSON_PROPERTY_IS_TRIGGERED_BY_MESSAGE_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
  }


  /**
   * Return true if this SendBird_GroupChannel_disappearing_message object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelDisappearingMessage sendBirdGroupChannelDisappearingMessage = (SendBirdGroupChannelDisappearingMessage) o;
    return Objects.equals(this.messageSurvivalSeconds, sendBirdGroupChannelDisappearingMessage.messageSurvivalSeconds) &&
        Objects.equals(this.isTriggeredByMessageRead, sendBirdGroupChannelDisappearingMessage.isTriggeredByMessageRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, isTriggeredByMessageRead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelDisappearingMessage {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    isTriggeredByMessageRead: ").append(toIndentedString(isTriggeredByMessageRead)).append("\n");
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

