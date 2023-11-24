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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * Function
 */
@JsonPropertyOrder({
  Function.JSON_PROPERTY_ARGUMENTS,
  Function.JSON_PROPERTY_CALLER,
  Function.JSON_PROPERTY_LENGTH,
  Function.JSON_PROPERTY_PROTOTYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class Function {
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private JsonNullable<Object> arguments = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CALLER = "caller";
  private Function caller;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private BigDecimal length;

  public static final String JSON_PROPERTY_PROTOTYPE = "prototype";
  private JsonNullable<Object> prototype = JsonNullable.<Object>of(null);

  public Function() { 
  }

  public Function arguments(Object arguments) {
    this.arguments = JsonNullable.<Object>of(arguments);
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getArguments() {
        return arguments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getArguments_JsonNullable() {
    return arguments;
  }
  
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  public void setArguments_JsonNullable(JsonNullable<Object> arguments) {
    this.arguments = arguments;
  }

  public void setArguments(Object arguments) {
    this.arguments = JsonNullable.<Object>of(arguments);
  }


  public Function caller(Function caller) {
    this.caller = caller;
    return this;
  }

   /**
   * Get caller
   * @return caller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Function getCaller() {
    return caller;
  }


  @JsonProperty(JSON_PROPERTY_CALLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaller(Function caller) {
    this.caller = caller;
  }


  public Function length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public Function prototype(Object prototype) {
    this.prototype = JsonNullable.<Object>of(prototype);
    return this;
  }

   /**
   * Get prototype
   * @return prototype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getPrototype() {
        return prototype.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROTOTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPrototype_JsonNullable() {
    return prototype;
  }
  
  @JsonProperty(JSON_PROPERTY_PROTOTYPE)
  public void setPrototype_JsonNullable(JsonNullable<Object> prototype) {
    this.prototype = prototype;
  }

  public void setPrototype(Object prototype) {
    this.prototype = JsonNullable.<Object>of(prototype);
  }


  /**
   * Return true if this Function object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Function function = (Function) o;
    return equalsNullable(this.arguments, function.arguments) &&
        Objects.equals(this.caller, function.caller) &&
        Objects.equals(this.length, function.length) &&
        equalsNullable(this.prototype, function.prototype);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(arguments), caller, length, hashCodeNullable(prototype));
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
    sb.append("class Function {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    prototype: ").append(toIndentedString(prototype)).append("\n");
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

