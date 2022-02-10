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

/**
 * SendBirdRestrictionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T12:13:33.713738Z[Europe/London]")
public class SendBirdRestrictionInfo {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  /**
   * Gets or Sets restrictionType
   */
  @JsonAdapter(RestrictionTypeEnum.Adapter.class)
  public enum RestrictionTypeEnum {
    BANNED("banned"),
    
    MUTED("muted");

    private String value;

    RestrictionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestrictionTypeEnum fromValue(String value) {
      for (RestrictionTypeEnum b : RestrictionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestrictionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestrictionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestrictionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestrictionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESTRICTION_TYPE = "restriction_type";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_TYPE)
  private RestrictionTypeEnum restrictionType;

  public SendBirdRestrictionInfo() { 
  }

  public SendBirdRestrictionInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SendBirdRestrictionInfo endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public SendBirdRestrictionInfo restrictionType(RestrictionTypeEnum restrictionType) {
    
    this.restrictionType = restrictionType;
    return this;
  }

   /**
   * Get restrictionType
   * @return restrictionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RestrictionTypeEnum getRestrictionType() {
    return restrictionType;
  }


  public void setRestrictionType(RestrictionTypeEnum restrictionType) {
    this.restrictionType = restrictionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdRestrictionInfo sendBirdRestrictionInfo = (SendBirdRestrictionInfo) o;
    return Objects.equals(this.description, sendBirdRestrictionInfo.description) &&
        Objects.equals(this.endAt, sendBirdRestrictionInfo.endAt) &&
        Objects.equals(this.restrictionType, sendBirdRestrictionInfo.restrictionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endAt, restrictionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdRestrictionInfo {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
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

