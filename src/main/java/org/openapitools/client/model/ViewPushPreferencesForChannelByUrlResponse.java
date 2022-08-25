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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * ViewPushPreferencesForChannelByUrlResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T20:54:55.542602+01:00[Europe/London]")
public class ViewPushPreferencesForChannelByUrlResponse {
  public static final String SERIALIZED_NAME_PUSH_TRIGGER_OPTION = "push_trigger_option";
  @SerializedName(SERIALIZED_NAME_PUSH_TRIGGER_OPTION)
  private String pushTriggerOption;

  public static final String SERIALIZED_NAME_DO_NOT_DISTURB = "do_not_disturb";
  @SerializedName(SERIALIZED_NAME_DO_NOT_DISTURB)
  private Boolean doNotDisturb;

  public static final String SERIALIZED_NAME_START_HOUR = "start_hour";
  @SerializedName(SERIALIZED_NAME_START_HOUR)
  private BigDecimal startHour;

  public static final String SERIALIZED_NAME_START_MIN = "start_min";
  @SerializedName(SERIALIZED_NAME_START_MIN)
  private BigDecimal startMin;

  public static final String SERIALIZED_NAME_END_HOUR = "end_hour";
  @SerializedName(SERIALIZED_NAME_END_HOUR)
  private BigDecimal endHour;

  public static final String SERIALIZED_NAME_END_MIN = "end_min";
  @SerializedName(SERIALIZED_NAME_END_MIN)
  private BigDecimal endMin;

  public static final String SERIALIZED_NAME_SNOOZE_ENABLED = "snooze_enabled";
  @SerializedName(SERIALIZED_NAME_SNOOZE_ENABLED)
  private Boolean snoozeEnabled;

  public static final String SERIALIZED_NAME_SNOOZE_START_TS = "snooze_start_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_START_TS)
  private BigDecimal snoozeStartTs;

  public static final String SERIALIZED_NAME_SNOOZE_END_TS = "snooze_end_ts";
  @SerializedName(SERIALIZED_NAME_SNOOZE_END_TS)
  private BigDecimal snoozeEndTs;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public ViewPushPreferencesForChannelByUrlResponse() { 
  }

  public ViewPushPreferencesForChannelByUrlResponse pushTriggerOption(String pushTriggerOption) {
    
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Get pushTriggerOption
   * @return pushTriggerOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  public ViewPushPreferencesForChannelByUrlResponse doNotDisturb(Boolean doNotDisturb) {
    
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Get doNotDisturb
   * @return doNotDisturb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }


  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }


  public ViewPushPreferencesForChannelByUrlResponse startHour(BigDecimal startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartHour() {
    return startHour;
  }


  public void setStartHour(BigDecimal startHour) {
    this.startHour = startHour;
  }


  public ViewPushPreferencesForChannelByUrlResponse startMin(BigDecimal startMin) {
    
    this.startMin = startMin;
    return this;
  }

   /**
   * Get startMin
   * @return startMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartMin() {
    return startMin;
  }


  public void setStartMin(BigDecimal startMin) {
    this.startMin = startMin;
  }


  public ViewPushPreferencesForChannelByUrlResponse endHour(BigDecimal endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndHour() {
    return endHour;
  }


  public void setEndHour(BigDecimal endHour) {
    this.endHour = endHour;
  }


  public ViewPushPreferencesForChannelByUrlResponse endMin(BigDecimal endMin) {
    
    this.endMin = endMin;
    return this;
  }

   /**
   * Get endMin
   * @return endMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndMin() {
    return endMin;
  }


  public void setEndMin(BigDecimal endMin) {
    this.endMin = endMin;
  }


  public ViewPushPreferencesForChannelByUrlResponse snoozeEnabled(Boolean snoozeEnabled) {
    
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Get snoozeEnabled
   * @return snoozeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public ViewPushPreferencesForChannelByUrlResponse snoozeStartTs(BigDecimal snoozeStartTs) {
    
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Get snoozeStartTs
   * @return snoozeStartTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSnoozeStartTs() {
    return snoozeStartTs;
  }


  public void setSnoozeStartTs(BigDecimal snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public ViewPushPreferencesForChannelByUrlResponse snoozeEndTs(BigDecimal snoozeEndTs) {
    
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Get snoozeEndTs
   * @return snoozeEndTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSnoozeEndTs() {
    return snoozeEndTs;
  }


  public void setSnoozeEndTs(BigDecimal snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public ViewPushPreferencesForChannelByUrlResponse timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public ViewPushPreferencesForChannelByUrlResponse pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  public ViewPushPreferencesForChannelByUrlResponse enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewPushPreferencesForChannelByUrlResponse viewPushPreferencesForChannelByUrlResponse = (ViewPushPreferencesForChannelByUrlResponse) o;
    return Objects.equals(this.pushTriggerOption, viewPushPreferencesForChannelByUrlResponse.pushTriggerOption) &&
        Objects.equals(this.doNotDisturb, viewPushPreferencesForChannelByUrlResponse.doNotDisturb) &&
        Objects.equals(this.startHour, viewPushPreferencesForChannelByUrlResponse.startHour) &&
        Objects.equals(this.startMin, viewPushPreferencesForChannelByUrlResponse.startMin) &&
        Objects.equals(this.endHour, viewPushPreferencesForChannelByUrlResponse.endHour) &&
        Objects.equals(this.endMin, viewPushPreferencesForChannelByUrlResponse.endMin) &&
        Objects.equals(this.snoozeEnabled, viewPushPreferencesForChannelByUrlResponse.snoozeEnabled) &&
        Objects.equals(this.snoozeStartTs, viewPushPreferencesForChannelByUrlResponse.snoozeStartTs) &&
        Objects.equals(this.snoozeEndTs, viewPushPreferencesForChannelByUrlResponse.snoozeEndTs) &&
        Objects.equals(this.timezone, viewPushPreferencesForChannelByUrlResponse.timezone) &&
        Objects.equals(this.pushSound, viewPushPreferencesForChannelByUrlResponse.pushSound) &&
        Objects.equals(this.enable, viewPushPreferencesForChannelByUrlResponse.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushTriggerOption, doNotDisturb, startHour, startMin, endHour, endMin, snoozeEnabled, snoozeStartTs, snoozeEndTs, timezone, pushSound, enable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewPushPreferencesForChannelByUrlResponse {\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("push_trigger_option");
    openapiFields.add("do_not_disturb");
    openapiFields.add("start_hour");
    openapiFields.add("start_min");
    openapiFields.add("end_hour");
    openapiFields.add("end_min");
    openapiFields.add("snooze_enabled");
    openapiFields.add("snooze_start_ts");
    openapiFields.add("snooze_end_ts");
    openapiFields.add("timezone");
    openapiFields.add("push_sound");
    openapiFields.add("enable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewPushPreferencesForChannelByUrlResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewPushPreferencesForChannelByUrlResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewPushPreferencesForChannelByUrlResponse is not found in the empty JSON string", ViewPushPreferencesForChannelByUrlResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewPushPreferencesForChannelByUrlResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewPushPreferencesForChannelByUrlResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("push_trigger_option") != null && !jsonObj.get("push_trigger_option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_trigger_option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_trigger_option").toString()));
      }
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewPushPreferencesForChannelByUrlResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewPushPreferencesForChannelByUrlResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewPushPreferencesForChannelByUrlResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewPushPreferencesForChannelByUrlResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewPushPreferencesForChannelByUrlResponse>() {
           @Override
           public void write(JsonWriter out, ViewPushPreferencesForChannelByUrlResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewPushPreferencesForChannelByUrlResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewPushPreferencesForChannelByUrlResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewPushPreferencesForChannelByUrlResponse
  * @throws IOException if the JSON string is invalid with respect to ViewPushPreferencesForChannelByUrlResponse
  */
  public static ViewPushPreferencesForChannelByUrlResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewPushPreferencesForChannelByUrlResponse.class);
  }

 /**
  * Convert an instance of ViewPushPreferencesForChannelByUrlResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

