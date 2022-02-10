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
 * CreateUserMetadataData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T12:13:33.713738Z[Europe/London]")
public class CreateUserMetadataData {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public CreateUserMetadataData() { 
  }

  public CreateUserMetadataData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user to store the metadata in.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to store the metadata in.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CreateUserMetadataData metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserMetadataData createUserMetadataData = (CreateUserMetadataData) o;
    return Objects.equals(this.userId, createUserMetadataData.userId) &&
        Objects.equals(this.metadata, createUserMetadataData.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserMetadataData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

