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
import java.util.ArrayList;
import java.util.List;

/**
 * BlockUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class BlockUserData {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Integer> userIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Integer> users = new ArrayList<Integer>();

  public BlockUserData() { 
  }

  public BlockUserData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to block.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to block.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public BlockUserData targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Specifies the ID of the user to be blocked.
   * @return targetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to be blocked.")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public BlockUserData userIds(List<Integer> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public BlockUserData addUserIdsItem(Integer userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to be blocked at a time. (for bulk mode)
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to be blocked at a time. (for bulk mode)")

  public List<Integer> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }


  public BlockUserData users(List<Integer> users) {
    
    this.users = users;
    return this;
  }

  public BlockUserData addUsersItem(Integer usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to be blocked at a time. The user_ids above and this property can be used interchangeably. (for bulk mode)
   * @return users
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to be blocked at a time. The user_ids above and this property can be used interchangeably. (for bulk mode)")

  public List<Integer> getUsers() {
    return users;
  }


  public void setUsers(List<Integer> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockUserData blockUserData = (BlockUserData) o;
    return Objects.equals(this.userId, blockUserData.userId) &&
        Objects.equals(this.targetId, blockUserData.targetId) &&
        Objects.equals(this.userIds, blockUserData.userIds) &&
        Objects.equals(this.users, blockUserData.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, targetId, userIds, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockUserData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

