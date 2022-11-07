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
import org.openapitools.client.model.SendBirdRestrictionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdMember
 */
@JsonPropertyOrder({
  SendBirdMember.JSON_PROPERTY_CONNECTION_STATUS,
  SendBirdMember.JSON_PROPERTY_FRIEND_DISCOVERY_KEY,
  SendBirdMember.JSON_PROPERTY_FRIEND_NAME,
  SendBirdMember.JSON_PROPERTY_IS_ACTIVE,
  SendBirdMember.JSON_PROPERTY_IS_MUTED,
  SendBirdMember.JSON_PROPERTY_LAST_SEEN_AT,
  SendBirdMember.JSON_PROPERTY_NICKNAME,
  SendBirdMember.JSON_PROPERTY_PLAIN_PROFILE_URL,
  SendBirdMember.JSON_PROPERTY_PREFERRED_LANGUAGES,
  SendBirdMember.JSON_PROPERTY_PROFILE_URL,
  SendBirdMember.JSON_PROPERTY_REQUIRE_AUTH,
  SendBirdMember.JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE,
  SendBirdMember.JSON_PROPERTY_METADATA,
  SendBirdMember.JSON_PROPERTY_IS_ONLINE,
  SendBirdMember.JSON_PROPERTY_MUTED_END_AT,
  SendBirdMember.JSON_PROPERTY_MUTED_DESCRIPTION,
  SendBirdMember.JSON_PROPERTY_RESTRICTION_INFO,
  SendBirdMember.JSON_PROPERTY_ROLE,
  SendBirdMember.JSON_PROPERTY_STATE,
  SendBirdMember.JSON_PROPERTY_USER_ID
})
@JsonTypeName("SendBird.Member")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class SendBirdMember {
  public static final String JSON_PROPERTY_CONNECTION_STATUS = "connection_status";
  private String connectionStatus;

  public static final String JSON_PROPERTY_FRIEND_DISCOVERY_KEY = "friend_discovery_key";
  private JsonNullable<String> friendDiscoveryKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRIEND_NAME = "friend_name";
  private JsonNullable<String> friendName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_IS_MUTED = "is_muted";
  private Boolean isMuted;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private Integer lastSeenAt;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_PLAIN_PROFILE_URL = "plain_profile_url";
  private String plainProfileUrl;

  public static final String JSON_PROPERTY_PREFERRED_LANGUAGES = "preferred_languages";
  private List<String> preferredLanguages = null;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_REQUIRE_AUTH = "require_auth";
  private Boolean requireAuth;

  public static final String JSON_PROPERTY_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  private Boolean requireAuthForProfileImage;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_IS_ONLINE = "is_online";
  private Boolean isOnline;

  public static final String JSON_PROPERTY_MUTED_END_AT = "muted_end_at";
  private BigDecimal mutedEndAt;

  public static final String JSON_PROPERTY_MUTED_DESCRIPTION = "muted_description";
  private String mutedDescription;

  public static final String JSON_PROPERTY_RESTRICTION_INFO = "restriction_info";
  private SendBirdRestrictionInfo restrictionInfo;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    EMPTY(""),
    
    NONE("none"),
    
    OPERATOR("operator");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private JsonNullable<RoleEnum> role = JsonNullable.<RoleEnum>undefined();

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    EMPTY(""),
    
    INVITED("invited"),
    
    JOINED("joined");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<StateEnum> state = JsonNullable.<StateEnum>undefined();

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public SendBirdMember() { 
  }

  public SendBirdMember connectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionStatus() {
    return connectionStatus;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public SendBirdMember friendDiscoveryKey(String friendDiscoveryKey) {
    this.friendDiscoveryKey = JsonNullable.<String>of(friendDiscoveryKey);
    return this;
  }

   /**
   * Get friendDiscoveryKey
   * @return friendDiscoveryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFriendDiscoveryKey() {
        return friendDiscoveryKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRIEND_DISCOVERY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFriendDiscoveryKey_JsonNullable() {
    return friendDiscoveryKey;
  }
  
  @JsonProperty(JSON_PROPERTY_FRIEND_DISCOVERY_KEY)
  public void setFriendDiscoveryKey_JsonNullable(JsonNullable<String> friendDiscoveryKey) {
    this.friendDiscoveryKey = friendDiscoveryKey;
  }

  public void setFriendDiscoveryKey(String friendDiscoveryKey) {
    this.friendDiscoveryKey = JsonNullable.<String>of(friendDiscoveryKey);
  }


  public SendBirdMember friendName(String friendName) {
    this.friendName = JsonNullable.<String>of(friendName);
    return this;
  }

   /**
   * Get friendName
   * @return friendName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFriendName() {
        return friendName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRIEND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFriendName_JsonNullable() {
    return friendName;
  }
  
  @JsonProperty(JSON_PROPERTY_FRIEND_NAME)
  public void setFriendName_JsonNullable(JsonNullable<String> friendName) {
    this.friendName = friendName;
  }

  public void setFriendName(String friendName) {
    this.friendName = JsonNullable.<String>of(friendName);
  }


  public SendBirdMember isActive(Boolean isActive) {
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


  public SendBirdMember isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMuted() {
    return isMuted;
  }


  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public SendBirdMember lastSeenAt(Integer lastSeenAt) {
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


  public SendBirdMember nickname(String nickname) {
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


  public SendBirdMember plainProfileUrl(String plainProfileUrl) {
    this.plainProfileUrl = plainProfileUrl;
    return this;
  }

   /**
   * Get plainProfileUrl
   * @return plainProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAIN_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlainProfileUrl() {
    return plainProfileUrl;
  }


  @JsonProperty(JSON_PROPERTY_PLAIN_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlainProfileUrl(String plainProfileUrl) {
    this.plainProfileUrl = plainProfileUrl;
  }


  public SendBirdMember preferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public SendBirdMember addPreferredLanguagesItem(String preferredLanguagesItem) {
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


  public SendBirdMember profileUrl(String profileUrl) {
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


  public SendBirdMember requireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }


  public SendBirdMember requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
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


  public SendBirdMember metadata(Object metadata) {
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


  public SendBirdMember isOnline(Boolean isOnline) {
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


  public SendBirdMember mutedEndAt(BigDecimal mutedEndAt) {
    this.mutedEndAt = mutedEndAt;
    return this;
  }

   /**
   * Get mutedEndAt
   * @return mutedEndAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTED_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMutedEndAt() {
    return mutedEndAt;
  }


  @JsonProperty(JSON_PROPERTY_MUTED_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutedEndAt(BigDecimal mutedEndAt) {
    this.mutedEndAt = mutedEndAt;
  }


  public SendBirdMember mutedDescription(String mutedDescription) {
    this.mutedDescription = mutedDescription;
    return this;
  }

   /**
   * Get mutedDescription
   * @return mutedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMutedDescription() {
    return mutedDescription;
  }


  @JsonProperty(JSON_PROPERTY_MUTED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutedDescription(String mutedDescription) {
    this.mutedDescription = mutedDescription;
  }


  public SendBirdMember restrictionInfo(SendBirdRestrictionInfo restrictionInfo) {
    this.restrictionInfo = restrictionInfo;
    return this;
  }

   /**
   * Get restrictionInfo
   * @return restrictionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdRestrictionInfo getRestrictionInfo() {
    return restrictionInfo;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictionInfo(SendBirdRestrictionInfo restrictionInfo) {
    this.restrictionInfo = restrictionInfo;
  }


  public SendBirdMember role(RoleEnum role) {
    this.role = JsonNullable.<RoleEnum>of(role);
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RoleEnum getRole() {
        return role.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RoleEnum> getRole_JsonNullable() {
    return role;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLE)
  public void setRole_JsonNullable(JsonNullable<RoleEnum> role) {
    this.role = role;
  }

  public void setRole(RoleEnum role) {
    this.role = JsonNullable.<RoleEnum>of(role);
  }


  public SendBirdMember state(StateEnum state) {
    this.state = JsonNullable.<StateEnum>of(state);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public StateEnum getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StateEnum> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<StateEnum> state) {
    this.state = state;
  }

  public void setState(StateEnum state) {
    this.state = JsonNullable.<StateEnum>of(state);
  }


  public SendBirdMember userId(String userId) {
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
   * Return true if this SendBird.Member object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdMember sendBirdMember = (SendBirdMember) o;
    return Objects.equals(this.connectionStatus, sendBirdMember.connectionStatus) &&
        equalsNullable(this.friendDiscoveryKey, sendBirdMember.friendDiscoveryKey) &&
        equalsNullable(this.friendName, sendBirdMember.friendName) &&
        Objects.equals(this.isActive, sendBirdMember.isActive) &&
        Objects.equals(this.isMuted, sendBirdMember.isMuted) &&
        Objects.equals(this.lastSeenAt, sendBirdMember.lastSeenAt) &&
        Objects.equals(this.nickname, sendBirdMember.nickname) &&
        Objects.equals(this.plainProfileUrl, sendBirdMember.plainProfileUrl) &&
        Objects.equals(this.preferredLanguages, sendBirdMember.preferredLanguages) &&
        Objects.equals(this.profileUrl, sendBirdMember.profileUrl) &&
        Objects.equals(this.requireAuth, sendBirdMember.requireAuth) &&
        Objects.equals(this.requireAuthForProfileImage, sendBirdMember.requireAuthForProfileImage) &&
        Objects.equals(this.metadata, sendBirdMember.metadata) &&
        Objects.equals(this.isOnline, sendBirdMember.isOnline) &&
        Objects.equals(this.mutedEndAt, sendBirdMember.mutedEndAt) &&
        Objects.equals(this.mutedDescription, sendBirdMember.mutedDescription) &&
        Objects.equals(this.restrictionInfo, sendBirdMember.restrictionInfo) &&
        equalsNullable(this.role, sendBirdMember.role) &&
        equalsNullable(this.state, sendBirdMember.state) &&
        Objects.equals(this.userId, sendBirdMember.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionStatus, hashCodeNullable(friendDiscoveryKey), hashCodeNullable(friendName), isActive, isMuted, lastSeenAt, nickname, plainProfileUrl, preferredLanguages, profileUrl, requireAuth, requireAuthForProfileImage, metadata, isOnline, mutedEndAt, mutedDescription, restrictionInfo, hashCodeNullable(role), hashCodeNullable(state), userId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdMember {\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    friendDiscoveryKey: ").append(toIndentedString(friendDiscoveryKey)).append("\n");
    sb.append("    friendName: ").append(toIndentedString(friendName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    plainProfileUrl: ").append(toIndentedString(plainProfileUrl)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    mutedEndAt: ").append(toIndentedString(mutedEndAt)).append("\n");
    sb.append("    mutedDescription: ").append(toIndentedString(mutedDescription)).append("\n");
    sb.append("    restrictionInfo: ").append(toIndentedString(restrictionInfo)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

