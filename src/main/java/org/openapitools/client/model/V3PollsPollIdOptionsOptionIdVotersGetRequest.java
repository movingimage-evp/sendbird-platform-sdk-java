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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * V3PollsPollIdOptionsOptionIdVotersGetRequest
 */
@JsonPropertyOrder({
  V3PollsPollIdOptionsOptionIdVotersGetRequest.JSON_PROPERTY_TOKEN,
  V3PollsPollIdOptionsOptionIdVotersGetRequest.JSON_PROPERTY_LIMIT
})
@JsonTypeName("_v3_polls__poll_id__options__option_id__voters_get_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class V3PollsPollIdOptionsOptionIdVotersGetRequest {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public V3PollsPollIdOptionsOptionIdVotersGetRequest() { 
  }

  public V3PollsPollIdOptionsOptionIdVotersGetRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Specifies the token to get the next page of voters. You can get this value from the next property of the previous API response.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the token to get the next page of voters. You can get this value from the next property of the previous API response.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public V3PollsPollIdOptionsOptionIdVotersGetRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Specifies the number of voters to return per page. Acceptable values are 1 to 100, inclusive. (Default is 100)
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of voters to return per page. Acceptable values are 1 to 100, inclusive. (Default is 100)")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  /**
   * Return true if this _v3_polls__poll_id__options__option_id__voters_get_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest = (V3PollsPollIdOptionsOptionIdVotersGetRequest) o;
    return Objects.equals(this.token, v3PollsPollIdOptionsOptionIdVotersGetRequest.token) &&
        Objects.equals(this.limit, v3PollsPollIdOptionsOptionIdVotersGetRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdOptionsOptionIdVotersGetRequest {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

