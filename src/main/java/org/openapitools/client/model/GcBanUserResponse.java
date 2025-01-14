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
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcBanUserResponse
 */
@JsonPropertyOrder({
  GcBanUserResponse.JSON_PROPERTY_USER,
  GcBanUserResponse.JSON_PROPERTY_START_AT,
  GcBanUserResponse.JSON_PROPERTY_END_AT,
  GcBanUserResponse.JSON_PROPERTY_DESCRIPTION,
  GcBanUserResponse.JSON_PROPERTY_METADATA,
  GcBanUserResponse.JSON_PROPERTY_NEXT_URL,
  GcBanUserResponse.JSON_PROPERTY_NICKNAME,
  GcBanUserResponse.JSON_PROPERTY_PROFILE_URL,
  GcBanUserResponse.JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE,
  GcBanUserResponse.JSON_PROPERTY_USER_ID
})
@JsonTypeName("gcBanUserResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GcBanUserResponse {
  public static final String JSON_PROPERTY_USER = "user";
  private SendBirdUser user;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private BigDecimal startAt;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private BigDecimal endAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private OcDeleteChannelByUrl200Response metadata;

  public static final String JSON_PROPERTY_NEXT_URL = "next_url";
  private String nextUrl;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  private Boolean requireAuthForProfileImage;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public GcBanUserResponse() { 
  }

  public GcBanUserResponse user(SendBirdUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  public GcBanUserResponse startAt(BigDecimal startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  public GcBanUserResponse endAt(BigDecimal endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public GcBanUserResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GcBanUserResponse metadata(OcDeleteChannelByUrl200Response metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OcDeleteChannelByUrl200Response getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(OcDeleteChannelByUrl200Response metadata) {
    this.metadata = metadata;
  }


  public GcBanUserResponse nextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
    return this;
  }

   /**
   * Get nextUrl
   * @return nextUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextUrl() {
    return nextUrl;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }


  public GcBanUserResponse nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public GcBanUserResponse profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileUrl() {
    return profileUrl;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public GcBanUserResponse requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    this.requireAuthForProfileImage = requireAuthForProfileImage;
    return this;
  }

   /**
   * Get requireAuthForProfileImage
   * @return requireAuthForProfileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireAuthForProfileImage() {
    return requireAuthForProfileImage;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    this.requireAuthForProfileImage = requireAuthForProfileImage;
  }


  public GcBanUserResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Return true if this gcBanUserResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcBanUserResponse gcBanUserResponse = (GcBanUserResponse) o;
    return Objects.equals(this.user, gcBanUserResponse.user) &&
        Objects.equals(this.startAt, gcBanUserResponse.startAt) &&
        Objects.equals(this.endAt, gcBanUserResponse.endAt) &&
        Objects.equals(this.description, gcBanUserResponse.description) &&
        Objects.equals(this.metadata, gcBanUserResponse.metadata) &&
        Objects.equals(this.nextUrl, gcBanUserResponse.nextUrl) &&
        Objects.equals(this.nickname, gcBanUserResponse.nickname) &&
        Objects.equals(this.profileUrl, gcBanUserResponse.profileUrl) &&
        Objects.equals(this.requireAuthForProfileImage, gcBanUserResponse.requireAuthForProfileImage) &&
        Objects.equals(this.userId, gcBanUserResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startAt, endAt, description, metadata, nextUrl, nickname, profileUrl, requireAuthForProfileImage, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcBanUserResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

