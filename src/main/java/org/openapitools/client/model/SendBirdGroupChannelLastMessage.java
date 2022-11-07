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
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdMessageResponseMentionedUsersInner;
import org.openapitools.client.model.SendBirdMessageResponseUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.sendbird.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
@JsonDeserialize(using=SendBirdGroupChannelLastMessage.SendBirdGroupChannelLastMessageDeserializer.class)
@JsonSerialize(using = SendBirdGroupChannelLastMessage.SendBirdGroupChannelLastMessageSerializer.class)
public class SendBirdGroupChannelLastMessage extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SendBirdGroupChannelLastMessage.class.getName());

    public static class SendBirdGroupChannelLastMessageSerializer extends StdSerializer<SendBirdGroupChannelLastMessage> {
        public SendBirdGroupChannelLastMessageSerializer(Class<SendBirdGroupChannelLastMessage> t) {
            super(t);
        }

        public SendBirdGroupChannelLastMessageSerializer() {
            this(null);
        }

        @Override
        public void serialize(SendBirdGroupChannelLastMessage value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SendBirdGroupChannelLastMessageDeserializer extends StdDeserializer<SendBirdGroupChannelLastMessage> {
        public SendBirdGroupChannelLastMessageDeserializer() {
            this(SendBirdGroupChannelLastMessage.class);
        }

        public SendBirdGroupChannelLastMessageDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SendBirdGroupChannelLastMessage deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize SendBirdMessageResponse
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(SendBirdMessageResponse.class);
                SendBirdGroupChannelLastMessage ret = new SendBirdGroupChannelLastMessage();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'SendBirdGroupChannelLastMessage'", e);
            }

            throw new IOException(String.format("Failed deserialization for SendBirdGroupChannelLastMessage: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SendBirdGroupChannelLastMessage getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            return null;
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SendBirdGroupChannelLastMessage() {
        super("anyOf", Boolean.TRUE);
    }

    public SendBirdGroupChannelLastMessage(SendBirdMessageResponse o) {
        super("anyOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("SendBirdMessageResponse", new GenericType<SendBirdMessageResponse>() {
        });
        JSON.registerDescendants(SendBirdGroupChannelLastMessage.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SendBirdGroupChannelLastMessage.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SendBirdMessageResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
           super.setActualInstance(instance);
           return;
        }

        if (JSON.isInstanceOf(SendBirdMessageResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SendBirdMessageResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * SendBirdMessageResponse
     *
     * @return The actual instance (SendBirdMessageResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendBirdMessageResponse`. If the actual instance is not `SendBirdMessageResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendBirdMessageResponse`
     * @throws ClassCastException if the instance is not `SendBirdMessageResponse`
     */
    public SendBirdMessageResponse getSendBirdMessageResponse() throws ClassCastException {
        return (SendBirdMessageResponse)super.getActualInstance();
    }

}

