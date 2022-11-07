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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ChooseWhichEventsToSubscribeToData
 */
@JsonPropertyOrder({
  ChooseWhichEventsToSubscribeToData.JSON_PROPERTY_ENABLED,
  ChooseWhichEventsToSubscribeToData.JSON_PROPERTY_URL,
  ChooseWhichEventsToSubscribeToData.JSON_PROPERTY_INCLUDE_MEMBERS,
  ChooseWhichEventsToSubscribeToData.JSON_PROPERTY_ENABLED_EVENTS
})
@JsonTypeName("chooseWhichEventsToSubscribeToData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class ChooseWhichEventsToSubscribeToData {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_INCLUDE_MEMBERS = "include_members";
  private Boolean includeMembers;

  public static final String JSON_PROPERTY_ENABLED_EVENTS = "enabled_events";
  private List<String> enabledEvents = null;

  public ChooseWhichEventsToSubscribeToData() { 
  }

  public ChooseWhichEventsToSubscribeToData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines whether webhooks are turned on in your Sendbird application or not. (Default: false)
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether webhooks are turned on in your Sendbird application or not. (Default: false)")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ChooseWhichEventsToSubscribeToData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL of your webhook server to receive payloads for events.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of your webhook server to receive payloads for events.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ChooseWhichEventsToSubscribeToData includeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
    return this;
  }

   /**
   * Determines whether to include the information on the members of group channels in payloads. (Default: false)
   * @return includeMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include the information on the members of group channels in payloads. (Default: false)")
  @JsonProperty(JSON_PROPERTY_INCLUDE_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeMembers() {
    return includeMembers;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
  }


  public ChooseWhichEventsToSubscribeToData enabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
    return this;
  }

  public ChooseWhichEventsToSubscribeToData addEnabledEventsItem(String enabledEventsItem) {
    if (this.enabledEvents == null) {
      this.enabledEvents = new ArrayList<>();
    }
    this.enabledEvents.add(enabledEventsItem);
    return this;
  }

   /**
   * Specifies an array of one or more [events](#2-webhook-events) for your webhook server to subscribe to. If set to an asterisk () only, the server will subscribe to all supported events. If set to an empty array, the server will unsubscribe from all (which indicates turning off webhooks).
   * @return enabledEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more [events](#2-webhook-events) for your webhook server to subscribe to. If set to an asterisk () only, the server will subscribe to all supported events. If set to an empty array, the server will unsubscribe from all (which indicates turning off webhooks).")
  @JsonProperty(JSON_PROPERTY_ENABLED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEnabledEvents() {
    return enabledEvents;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
  }


  /**
   * Return true if this chooseWhichEventsToSubscribeToData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData = (ChooseWhichEventsToSubscribeToData) o;
    return Objects.equals(this.enabled, chooseWhichEventsToSubscribeToData.enabled) &&
        Objects.equals(this.url, chooseWhichEventsToSubscribeToData.url) &&
        Objects.equals(this.includeMembers, chooseWhichEventsToSubscribeToData.includeMembers) &&
        Objects.equals(this.enabledEvents, chooseWhichEventsToSubscribeToData.enabledEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, url, includeMembers, enabledEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToData {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    includeMembers: ").append(toIndentedString(includeMembers)).append("\n");
    sb.append("    enabledEvents: ").append(toIndentedString(enabledEvents)).append("\n");
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

