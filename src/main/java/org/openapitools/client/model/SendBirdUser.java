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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * User
 */
@ApiModel(description = "User")
@JsonPropertyOrder({
  SendBirdUser.JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE,
  SendBirdUser.JSON_PROPERTY_IS_ONLINE,
  SendBirdUser.JSON_PROPERTY_USER_ID,
  SendBirdUser.JSON_PROPERTY_ACCESS_TOKEN,
  SendBirdUser.JSON_PROPERTY_HAS_EVER_LOGGED_IN,
  SendBirdUser.JSON_PROPERTY_IS_ACTIVE,
  SendBirdUser.JSON_PROPERTY_LAST_SEEN_AT,
  SendBirdUser.JSON_PROPERTY_NICKNAME,
  SendBirdUser.JSON_PROPERTY_DISCOVERY_KEYS,
  SendBirdUser.JSON_PROPERTY_SESSION_TOKENS,
  SendBirdUser.JSON_PROPERTY_PREFERRED_LANGUAGES,
  SendBirdUser.JSON_PROPERTY_PROFILE_URL,
  SendBirdUser.JSON_PROPERTY_CREATED_AT,
  SendBirdUser.JSON_PROPERTY_PHONE_NUMBER,
  SendBirdUser.JSON_PROPERTY_LOCAL,
  SendBirdUser.JSON_PROPERTY_LOCALE,
  SendBirdUser.JSON_PROPERTY_IS_HIDE_ME_FROM_FRIENDS,
  SendBirdUser.JSON_PROPERTY_IS_SHADOW_BLOCKED,
  SendBirdUser.JSON_PROPERTY_IS_CREATED,
  SendBirdUser.JSON_PROPERTY_METADATA,
  SendBirdUser.JSON_PROPERTY_DESCRIPTION,
  SendBirdUser.JSON_PROPERTY_END_AT,
  SendBirdUser.JSON_PROPERTY_START_AT
})
@JsonTypeName("SendBird.User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class SendBirdUser {
  public static final String JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  private Boolean requireAuthForProfileImage;

  public static final String JSON_PROPERTY_IS_ONLINE = "is_online";
  private Boolean isOnline;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private String accessToken;

  public static final String JSON_PROPERTY_HAS_EVER_LOGGED_IN = "has_ever_logged_in";
  private Boolean hasEverLoggedIn;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private Integer lastSeenAt;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_DISCOVERY_KEYS = "discovery_keys";
  private List<String> discoveryKeys = null;

  public static final String JSON_PROPERTY_SESSION_TOKENS = "session_tokens";
  private List<Object> sessionTokens = null;

  public static final String JSON_PROPERTY_PREFERRED_LANGUAGES = "preferred_languages";
  private List<String> preferredLanguages = null;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_LOCAL = "local";
  private String local;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_IS_HIDE_ME_FROM_FRIENDS = "is_hide_me_from_friends";
  private Boolean isHideMeFromFriends;

  public static final String JSON_PROPERTY_IS_SHADOW_BLOCKED = "is_shadow_blocked";
  private Boolean isShadowBlocked;

  public static final String JSON_PROPERTY_IS_CREATED = "is_created";
  private Boolean isCreated;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private BigDecimal endAt;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private BigDecimal startAt;

  public SendBirdUser() { 
  }

  public SendBirdUser requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
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


  public SendBirdUser isOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    return this;
  }

   /**
   * Get isOnline
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ONLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOnline() {
    return isOnline;
  }


  @JsonProperty(JSON_PROPERTY_IS_ONLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
  }


  public SendBirdUser userId(String userId) {
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


  public SendBirdUser accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public SendBirdUser hasEverLoggedIn(Boolean hasEverLoggedIn) {
    this.hasEverLoggedIn = hasEverLoggedIn;
    return this;
  }

   /**
   * Get hasEverLoggedIn
   * @return hasEverLoggedIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_EVER_LOGGED_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasEverLoggedIn() {
    return hasEverLoggedIn;
  }


  @JsonProperty(JSON_PROPERTY_HAS_EVER_LOGGED_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasEverLoggedIn(Boolean hasEverLoggedIn) {
    this.hasEverLoggedIn = hasEverLoggedIn;
  }


  public SendBirdUser isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public SendBirdUser lastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Get lastSeenAt
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastSeenAt() {
    return lastSeenAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public SendBirdUser nickname(String nickname) {
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


  public SendBirdUser discoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
    return this;
  }

  public SendBirdUser addDiscoveryKeysItem(String discoveryKeysItem) {
    if (this.discoveryKeys == null) {
      this.discoveryKeys = new ArrayList<>();
    }
    this.discoveryKeys.add(discoveryKeysItem);
    return this;
  }

   /**
   * Get discoveryKeys
   * @return discoveryKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public SendBirdUser sessionTokens(List<Object> sessionTokens) {
    this.sessionTokens = sessionTokens;
    return this;
  }

  public SendBirdUser addSessionTokensItem(Object sessionTokensItem) {
    if (this.sessionTokens == null) {
      this.sessionTokens = new ArrayList<>();
    }
    this.sessionTokens.add(sessionTokensItem);
    return this;
  }

   /**
   * Get sessionTokens
   * @return sessionTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SESSION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSessionTokens() {
    return sessionTokens;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionTokens(List<Object> sessionTokens) {
    this.sessionTokens = sessionTokens;
  }


  public SendBirdUser preferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public SendBirdUser addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Get preferredLanguages
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public SendBirdUser profileUrl(String profileUrl) {
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


  public SendBirdUser createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public SendBirdUser local(String local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocal() {
    return local;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocal(String local) {
    this.local = local;
  }


  public SendBirdUser locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public SendBirdUser isHideMeFromFriends(Boolean isHideMeFromFriends) {
    this.isHideMeFromFriends = isHideMeFromFriends;
    return this;
  }

   /**
   * Get isHideMeFromFriends
   * @return isHideMeFromFriends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_HIDE_ME_FROM_FRIENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHideMeFromFriends() {
    return isHideMeFromFriends;
  }


  @JsonProperty(JSON_PROPERTY_IS_HIDE_ME_FROM_FRIENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHideMeFromFriends(Boolean isHideMeFromFriends) {
    this.isHideMeFromFriends = isHideMeFromFriends;
  }


  public SendBirdUser isShadowBlocked(Boolean isShadowBlocked) {
    this.isShadowBlocked = isShadowBlocked;
    return this;
  }

   /**
   * Get isShadowBlocked
   * @return isShadowBlocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SHADOW_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShadowBlocked() {
    return isShadowBlocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_SHADOW_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsShadowBlocked(Boolean isShadowBlocked) {
    this.isShadowBlocked = isShadowBlocked;
  }


  public SendBirdUser isCreated(Boolean isCreated) {
    this.isCreated = isCreated;
    return this;
  }

   /**
   * Get isCreated
   * @return isCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCreated() {
    return isCreated;
  }


  @JsonProperty(JSON_PROPERTY_IS_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCreated(Boolean isCreated) {
    this.isCreated = isCreated;
  }


  public SendBirdUser metadata(Object metadata) {
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

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public SendBirdUser description(String description) {
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


  public SendBirdUser endAt(BigDecimal endAt) {
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


  public SendBirdUser startAt(BigDecimal startAt) {
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


  /**
   * Return true if this SendBird.User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdUser sendBirdUser = (SendBirdUser) o;
    return Objects.equals(this.requireAuthForProfileImage, sendBirdUser.requireAuthForProfileImage) &&
        Objects.equals(this.isOnline, sendBirdUser.isOnline) &&
        Objects.equals(this.userId, sendBirdUser.userId) &&
        Objects.equals(this.accessToken, sendBirdUser.accessToken) &&
        Objects.equals(this.hasEverLoggedIn, sendBirdUser.hasEverLoggedIn) &&
        Objects.equals(this.isActive, sendBirdUser.isActive) &&
        Objects.equals(this.lastSeenAt, sendBirdUser.lastSeenAt) &&
        Objects.equals(this.nickname, sendBirdUser.nickname) &&
        Objects.equals(this.discoveryKeys, sendBirdUser.discoveryKeys) &&
        Objects.equals(this.sessionTokens, sendBirdUser.sessionTokens) &&
        Objects.equals(this.preferredLanguages, sendBirdUser.preferredLanguages) &&
        Objects.equals(this.profileUrl, sendBirdUser.profileUrl) &&
        Objects.equals(this.createdAt, sendBirdUser.createdAt) &&
        Objects.equals(this.phoneNumber, sendBirdUser.phoneNumber) &&
        Objects.equals(this.local, sendBirdUser.local) &&
        Objects.equals(this.locale, sendBirdUser.locale) &&
        Objects.equals(this.isHideMeFromFriends, sendBirdUser.isHideMeFromFriends) &&
        Objects.equals(this.isShadowBlocked, sendBirdUser.isShadowBlocked) &&
        Objects.equals(this.isCreated, sendBirdUser.isCreated) &&
        Objects.equals(this.metadata, sendBirdUser.metadata) &&
        Objects.equals(this.description, sendBirdUser.description) &&
        Objects.equals(this.endAt, sendBirdUser.endAt) &&
        Objects.equals(this.startAt, sendBirdUser.startAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireAuthForProfileImage, isOnline, userId, accessToken, hasEverLoggedIn, isActive, lastSeenAt, nickname, discoveryKeys, sessionTokens, preferredLanguages, profileUrl, createdAt, phoneNumber, local, locale, isHideMeFromFriends, isShadowBlocked, isCreated, metadata, description, endAt, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdUser {\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    hasEverLoggedIn: ").append(toIndentedString(hasEverLoggedIn)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    discoveryKeys: ").append(toIndentedString(discoveryKeys)).append("\n");
    sb.append("    sessionTokens: ").append(toIndentedString(sessionTokens)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    isHideMeFromFriends: ").append(toIndentedString(isHideMeFromFriends)).append("\n");
    sb.append("    isShadowBlocked: ").append(toIndentedString(isShadowBlocked)).append("\n");
    sb.append("    isCreated: ").append(toIndentedString(isCreated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

