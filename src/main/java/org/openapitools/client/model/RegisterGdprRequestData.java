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
 * RegisterGdprRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class RegisterGdprRequestData {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Integer> userIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_CHANNEL_DELETE_OPTION = "channel_delete_option";
  @SerializedName(SERIALIZED_NAME_CHANNEL_DELETE_OPTION)
  private String channelDeleteOption;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public RegisterGdprRequestData() { 
  }

  public RegisterGdprRequestData action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Determines the type of a GDPR request. Acceptable values are limited to access and delete. If set to access, Sendbird server generates a downloadable zip file containing the data of the specified user with the user_id property to comply with GDPR&#39;s [right to access](https://gdpr-info.eu/art-15-gdpr/) of the data subject. If set to delete, the specified users with the user_ids property will be permanently deleted from your Sendbird application to comply with GDPR&#39;s [right to erasure](https://gdpr-info.eu/art-17-gdpr/) of the data subject. (Default: delete)
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the type of a GDPR request. Acceptable values are limited to access and delete. If set to access, Sendbird server generates a downloadable zip file containing the data of the specified user with the user_id property to comply with GDPR's [right to access](https://gdpr-info.eu/art-15-gdpr/) of the data subject. If set to delete, the specified users with the user_ids property will be permanently deleted from your Sendbird application to comply with GDPR's [right to erasure](https://gdpr-info.eu/art-17-gdpr/) of the data subject. (Default: delete)")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public RegisterGdprRequestData userIds(List<Integer> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public RegisterGdprRequestData addUserIdsItem(Integer userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to delete in order to meet the GDPR&#39;s requirements. The maximum number of users to be processed at once is 100. This should be specified when the value of the action property is delete.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to delete in order to meet the GDPR's requirements. The maximum number of users to be processed at once is 100. This should be specified when the value of the action property is delete.")

  public List<Integer> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }


  public RegisterGdprRequestData channelDeleteOption(String channelDeleteOption) {
    
    this.channelDeleteOption = channelDeleteOption;
    return this;
  }

   /**
   * Determines the scope of group channels to delete in addition to deleting the specified users with the user_ids property. Acceptable values are limited to the following:&lt;br /&gt;- do_not_delete (default): the users will be deleted but their joined group channels will remain.&lt;br /&gt;- 1_on_1: only 1-on-1 group channels of the users will be deleted. (This option can be useful when eliminating spam users) &lt;br /&gt;- all: all joined group channels of the users will be deleted.&lt;br /&gt;&lt;br /&gt; This only works when the value of the action property is delete.
   * @return channelDeleteOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the scope of group channels to delete in addition to deleting the specified users with the user_ids property. Acceptable values are limited to the following:<br />- do_not_delete (default): the users will be deleted but their joined group channels will remain.<br />- 1_on_1: only 1-on-1 group channels of the users will be deleted. (This option can be useful when eliminating spam users) <br />- all: all joined group channels of the users will be deleted.<br /><br /> This only works when the value of the action property is delete.")

  public String getChannelDeleteOption() {
    return channelDeleteOption;
  }


  public void setChannelDeleteOption(String channelDeleteOption) {
    this.channelDeleteOption = channelDeleteOption;
  }


  public RegisterGdprRequestData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user to meet the GDPR&#39;s requirements.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to meet the GDPR's requirements.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterGdprRequestData registerGdprRequestData = (RegisterGdprRequestData) o;
    return Objects.equals(this.action, registerGdprRequestData.action) &&
        Objects.equals(this.userIds, registerGdprRequestData.userIds) &&
        Objects.equals(this.channelDeleteOption, registerGdprRequestData.channelDeleteOption) &&
        Objects.equals(this.userId, registerGdprRequestData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, userIds, channelDeleteOption, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterGdprRequestData {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    channelDeleteOption: ").append(toIndentedString(channelDeleteOption)).append("\n");
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

