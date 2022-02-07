# MessagesApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExtraDataToMessage**](MessagesApi.md#addExtraDataToMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Add extra data to a message
[**addReactionToAMessage**](MessagesApi.md#addReactionToAMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Add a reaction to a message
[**deleteMessageById**](MessagesApi.md#deleteMessageById) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id} | Delete a message
[**gcMarkAllMessagesAsDelivered**](MessagesApi.md#gcMarkAllMessagesAsDelivered) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_delivered | Mark all messages as delivered
[**gcMarkAllMessagesAsRead**](MessagesApi.md#gcMarkAllMessagesAsRead) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_read | Mark all messages as read
[**gcViewNumberOfEachMembersUnreadMessages**](MessagesApi.md#gcViewNumberOfEachMembersUnreadMessages) | **GET** /v3/group_channels/{channel_url}/messages/unread_count | View number of each member&#39;s unread messages
[**listMessages**](MessagesApi.md#listMessages) | **GET** /v3/{channel_type}/{channel_url}/messages | List messages
[**listReactionsOfMessage**](MessagesApi.md#listReactionsOfMessage) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | List reactions of a message
[**removeExtraDataFromMessage**](MessagesApi.md#removeExtraDataFromMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Remove extra data from a message
[**removeReactionFromAMessage**](MessagesApi.md#removeReactionFromAMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Remove a reaction from a message
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /v3/{channel_type}/{channel_url}/messages | Send a message
[**translateMessageIntoOtherLanguages**](MessagesApi.md#translateMessageIntoOtherLanguages) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/translation | Translate a message into other languages
[**updateExtraDataInMessage**](MessagesApi.md#updateExtraDataInMessage) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Update extra data in a message
[**updateMessageById**](MessagesApi.md#updateMessageById) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id} | Update a message
[**viewMessageById**](MessagesApi.md#viewMessageById) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id} | View a message
[**viewTotalNumberOfMessagesInChannel**](MessagesApi.md#viewTotalNumberOfMessagesInChannel) | **GET** /v3/{channel_type}/{channel_url}/messages/total_count | View total number of messages in a channel


<a name="addExtraDataToMessage"></a>
# **addExtraDataToMessage**
> InlineResponse20054 addExtraDataToMessage(channelType, channelUrl, messageId, apiToken, addExtraDataToMessageData)

Add extra data to a message

## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    AddExtraDataToMessageData addExtraDataToMessageData = new AddExtraDataToMessageData(); // AddExtraDataToMessageData | 
    try {
      InlineResponse20054 result = apiInstance.addExtraDataToMessage(channelType, channelUrl, messageId, apiToken, addExtraDataToMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#addExtraDataToMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **addExtraDataToMessageData** | [**AddExtraDataToMessageData**](AddExtraDataToMessageData.md)|  | [optional]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="addReactionToAMessage"></a>
# **addReactionToAMessage**
> InlineResponse20053 addReactionToAMessage(channelType, channelUrl, messageId, apiToken, addReactionToAMessageData)

Add a reaction to a message

## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    AddReactionToAMessageData addReactionToAMessageData = new AddReactionToAMessageData(); // AddReactionToAMessageData | 
    try {
      InlineResponse20053 result = apiInstance.addReactionToAMessage(channelType, channelUrl, messageId, apiToken, addReactionToAMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#addReactionToAMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **addReactionToAMessageData** | [**AddReactionToAMessageData**](AddReactionToAMessageData.md)|  | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteMessageById"></a>
# **deleteMessageById**
> deleteMessageById(channelType, channelUrl, messageId, apiToken)

Delete a message

## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteMessageById(channelType, channelUrl, messageId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#deleteMessageById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcMarkAllMessagesAsDelivered"></a>
# **gcMarkAllMessagesAsDelivered**
> InlineResponse20050 gcMarkAllMessagesAsDelivered(channelUrl, apiToken, gcMarkAllMessagesAsDeliveredData)

Mark all messages as delivered

## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData = new GcMarkAllMessagesAsDeliveredData(); // GcMarkAllMessagesAsDeliveredData | 
    try {
      InlineResponse20050 result = apiInstance.gcMarkAllMessagesAsDelivered(channelUrl, apiToken, gcMarkAllMessagesAsDeliveredData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcMarkAllMessagesAsDelivered");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcMarkAllMessagesAsDeliveredData** | [**GcMarkAllMessagesAsDeliveredData**](GcMarkAllMessagesAsDeliveredData.md)|  | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcMarkAllMessagesAsRead"></a>
# **gcMarkAllMessagesAsRead**
> gcMarkAllMessagesAsRead(channelUrl, apiToken, gcMarkAllMessagesAsReadData)

Mark all messages as read

## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData = new GcMarkAllMessagesAsReadData(); // GcMarkAllMessagesAsReadData | 
    try {
      apiInstance.gcMarkAllMessagesAsRead(channelUrl, apiToken, gcMarkAllMessagesAsReadData);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcMarkAllMessagesAsRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcMarkAllMessagesAsReadData** | [**GcMarkAllMessagesAsReadData**](GcMarkAllMessagesAsReadData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcViewNumberOfEachMembersUnreadMessages"></a>
# **gcViewNumberOfEachMembersUnreadMessages**
> InlineResponse20049 gcViewNumberOfEachMembersUnreadMessages(channelUrl, apiToken, userIds)

View number of each member&#39;s unread messages

## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userIds = "userIds_example"; // String | 
    try {
      InlineResponse20049 result = apiInstance.gcViewNumberOfEachMembersUnreadMessages(channelUrl, apiToken, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcViewNumberOfEachMembersUnreadMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **userIds** | **String**|  | [optional]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listMessages"></a>
# **listMessages**
> InlineResponse20047 listMessages(channelType, channelUrl, messageTs, messageId, apiToken, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray)

List messages

## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    Integer messageTs = 56; // Integer | 
    Integer messageId = 56; // Integer | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Integer prevLimit = 56; // Integer | 
    Integer nextLimit = 56; // Integer | 
    Boolean include = true; // Boolean | 
    Boolean reverse = true; // Boolean | 
    String senderId = "senderId_example"; // String | 
    String senderIds = "senderIds_example"; // String | 
    String operatorFilter = "operatorFilter_example"; // String | 
    String customTypes = "customTypes_example"; // String | 
    String messageType = "messageType_example"; // String | 
    Boolean includingRemoved = true; // Boolean | 
    Boolean includeReactions = true; // Boolean | 
    Boolean withSortedMetaArray = true; // Boolean | 
    Boolean showSubchannelMessagesOnly = true; // Boolean | 
    String userId = "userId_example"; // String | 
    String customType = "customType_example"; // String | 
    Boolean withMetaArray = true; // Boolean | 
    try {
      InlineResponse20047 result = apiInstance.listMessages(channelType, channelUrl, messageTs, messageId, apiToken, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageTs** | **Integer**|  |
 **messageId** | **Integer**|  |
 **apiToken** | **String**|  | [optional]
 **prevLimit** | **Integer**|  | [optional]
 **nextLimit** | **Integer**|  | [optional]
 **include** | **Boolean**|  | [optional]
 **reverse** | **Boolean**|  | [optional]
 **senderId** | **String**|  | [optional]
 **senderIds** | **String**|  | [optional]
 **operatorFilter** | **String**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **messageType** | **String**|  | [optional]
 **includingRemoved** | **Boolean**|  | [optional]
 **includeReactions** | **Boolean**|  | [optional]
 **withSortedMetaArray** | **Boolean**|  | [optional]
 **showSubchannelMessagesOnly** | **Boolean**|  | [optional]
 **userId** | **String**|  | [optional]
 **customType** | **String**|  | [optional]
 **withMetaArray** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listReactionsOfMessage"></a>
# **listReactionsOfMessage**
> InlineResponse20052 listReactionsOfMessage(channelType, channelUrl, messageId, apiToken, listUsers)

List reactions of a message

## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Boolean listUsers = true; // Boolean | 
    try {
      InlineResponse20052 result = apiInstance.listReactionsOfMessage(channelType, channelUrl, messageId, apiToken, listUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listReactionsOfMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **listUsers** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeExtraDataFromMessage"></a>
# **removeExtraDataFromMessage**
> removeExtraDataFromMessage(channelType, channelUrl, messageId, apiToken, keys)

Remove extra data from a message

## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      apiInstance.removeExtraDataFromMessage(channelType, channelUrl, messageId, apiToken, keys);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#removeExtraDataFromMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeReactionFromAMessage"></a>
# **removeReactionFromAMessage**
> InlineResponse20053 removeReactionFromAMessage(channelType, channelUrl, messageId, apiToken, userId, reaction)

Remove a reaction from a message

## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String reaction = "reaction_example"; // String | 
    try {
      InlineResponse20053 result = apiInstance.removeReactionFromAMessage(channelType, channelUrl, messageId, apiToken, userId, reaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#removeReactionFromAMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **userId** | **String**|  | [optional]
 **reaction** | **String**|  | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="sendMessage"></a>
# **sendMessage**
> SendBirdMessageResponse sendMessage(channelType, channelUrl, apiToken, sendMessageData)

Send a message

## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    SendMessageData sendMessageData = new SendMessageData(); // SendMessageData | 
    try {
      SendBirdMessageResponse result = apiInstance.sendMessage(channelType, channelUrl, apiToken, sendMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **sendMessageData** | [**SendMessageData**](SendMessageData.md)|  | [optional]

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="translateMessageIntoOtherLanguages"></a>
# **translateMessageIntoOtherLanguages**
> SendBirdMessageResponse translateMessageIntoOtherLanguages(channelType, channelUrl, messageId, apiToken, body)

Translate a message into other languages

## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      SendBirdMessageResponse result = apiInstance.translateMessageIntoOtherLanguages(channelType, channelUrl, messageId, apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#translateMessageIntoOtherLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateExtraDataInMessage"></a>
# **updateExtraDataInMessage**
> InlineResponse20054 updateExtraDataInMessage(channelType, channelUrl, messageId, apiToken, updateExtraDataInMessageData)

Update extra data in a message

## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateExtraDataInMessageData updateExtraDataInMessageData = new UpdateExtraDataInMessageData(); // UpdateExtraDataInMessageData | 
    try {
      InlineResponse20054 result = apiInstance.updateExtraDataInMessage(channelType, channelUrl, messageId, apiToken, updateExtraDataInMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#updateExtraDataInMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateExtraDataInMessageData** | [**UpdateExtraDataInMessageData**](UpdateExtraDataInMessageData.md)|  | [optional]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateMessageById"></a>
# **updateMessageById**
> SendBirdMessageResponse updateMessageById(channelType, channelUrl, messageId, apiToken, updateMessageByIdData)

Update a message

## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateMessageByIdData updateMessageByIdData = new UpdateMessageByIdData(); // UpdateMessageByIdData | 
    try {
      SendBirdMessageResponse result = apiInstance.updateMessageById(channelType, channelUrl, messageId, apiToken, updateMessageByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#updateMessageById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateMessageByIdData** | [**UpdateMessageByIdData**](UpdateMessageByIdData.md)|  | [optional]

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewMessageById"></a>
# **viewMessageById**
> SendBirdMessageResponse viewMessageById(channelType, channelUrl, messageId, apiToken, withSortedMetaArray, withMetaArray)

View a message

## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Boolean withSortedMetaArray = true; // Boolean | 
    Boolean withMetaArray = true; // Boolean | 
    try {
      SendBirdMessageResponse result = apiInstance.viewMessageById(channelType, channelUrl, messageId, apiToken, withSortedMetaArray, withMetaArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#viewMessageById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **withSortedMetaArray** | **Boolean**|  | [optional]
 **withMetaArray** | **Boolean**|  | [optional]

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewTotalNumberOfMessagesInChannel"></a>
# **viewTotalNumberOfMessagesInChannel**
> InlineResponse20048 viewTotalNumberOfMessagesInChannel(channelType, channelUrl, apiToken)

View total number of messages in a channel

## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20048 result = apiInstance.viewTotalNumberOfMessagesInChannel(channelType, channelUrl, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#viewTotalNumberOfMessagesInChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

