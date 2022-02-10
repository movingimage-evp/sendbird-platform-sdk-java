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
 * SendBirdPollUpdatedVoteCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T13:13:38.822057Z[Europe/London]")
public class SendBirdPollUpdatedVoteCount {
  public static final String SERIALIZED_NAME_OPTION_ID = "option_id";
  @SerializedName(SERIALIZED_NAME_OPTION_ID)
  private BigDecimal optionId;

  public static final String SERIALIZED_NAME_VOTE_COUNT = "vote_count";
  @SerializedName(SERIALIZED_NAME_VOTE_COUNT)
  private BigDecimal voteCount;

  public SendBirdPollUpdatedVoteCount() { 
  }

  public SendBirdPollUpdatedVoteCount optionId(BigDecimal optionId) {
    
    this.optionId = optionId;
    return this;
  }

   /**
   * Get optionId
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOptionId() {
    return optionId;
  }


  public void setOptionId(BigDecimal optionId) {
    this.optionId = optionId;
  }


  public SendBirdPollUpdatedVoteCount voteCount(BigDecimal voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getVoteCount() {
    return voteCount;
  }


  public void setVoteCount(BigDecimal voteCount) {
    this.voteCount = voteCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollUpdatedVoteCount sendBirdPollUpdatedVoteCount = (SendBirdPollUpdatedVoteCount) o;
    return Objects.equals(this.optionId, sendBirdPollUpdatedVoteCount.optionId) &&
        Objects.equals(this.voteCount, sendBirdPollUpdatedVoteCount.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollUpdatedVoteCount {\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

