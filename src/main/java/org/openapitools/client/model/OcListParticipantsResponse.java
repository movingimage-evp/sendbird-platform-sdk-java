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
import org.openapitools.client.model.SendBirdUser;

/**
 * OcListParticipantsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T11:12:40.042740+01:00[Europe/London]")
public class OcListParticipantsResponse {
  public static final String SERIALIZED_NAME_PARTICIPANTS = "participants";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS)
  private List<SendBirdUser> participants = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public OcListParticipantsResponse() { 
  }

  public OcListParticipantsResponse participants(List<SendBirdUser> participants) {
    
    this.participants = participants;
    return this;
  }

  public OcListParticipantsResponse addParticipantsItem(SendBirdUser participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<SendBirdUser>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdUser> getParticipants() {
    return participants;
  }


  public void setParticipants(List<SendBirdUser> participants) {
    this.participants = participants;
  }


  public OcListParticipantsResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcListParticipantsResponse ocListParticipantsResponse = (OcListParticipantsResponse) o;
    return Objects.equals(this.participants, ocListParticipantsResponse.participants) &&
        Objects.equals(this.next, ocListParticipantsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcListParticipantsResponse {\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

