# MessageApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmojiCategories**](MessageApi.md#addEmojiCategories) | **POST** /v3/emoji_categories | Add emoji categories |
| [**addEmojis**](MessageApi.md#addEmojis) | **POST** /v3/emojis | Add emojis |
| [**addExtraDataToMessage**](MessageApi.md#addExtraDataToMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Add extra data to a message |
| [**addReactionToAMessage**](MessageApi.md#addReactionToAMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Add a reaction to a message |
| [**deleteEmojiByKey**](MessageApi.md#deleteEmojiByKey) | **DELETE** /v3/emojis/{emoji_key} | Delete an emoji |
| [**deleteEmojiCategoryById**](MessageApi.md#deleteEmojiCategoryById) | **DELETE** /v3/emoji_categories/{emoji_category_id} | Delete an emoji category |
| [**deleteMessageById**](MessageApi.md#deleteMessageById) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id} | Delete a message |
| [**enableReactions**](MessageApi.md#enableReactions) | **PUT** /v3/applications/settings/reactions | Enable reactions |
| [**gcMarkAllMessagesAsDelivered**](MessageApi.md#gcMarkAllMessagesAsDelivered) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_delivered | Mark all messages as delivered |
| [**gcMarkAllMessagesAsRead**](MessageApi.md#gcMarkAllMessagesAsRead) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_read | Mark all messages as read |
| [**gcViewNumberOfEachMembersUnreadMessages**](MessageApi.md#gcViewNumberOfEachMembersUnreadMessages) | **GET** /v3/group_channels/{channel_url}/messages/unread_count | View number of each member&#39;s unread messages |
| [**getEmojiByKey**](MessageApi.md#getEmojiByKey) | **GET** /v3/emojis/{emoji_key} | Get an emoji |
| [**getEmojiCategoryById**](MessageApi.md#getEmojiCategoryById) | **GET** /v3/emoji_categories/{emoji_category_id} | Get an emoji category |
| [**getStatistics**](MessageApi.md#getStatistics) | **GET** /v3/announcement_stats/weekly | Get statistics - weekly |
| [**getStatisticsDaily**](MessageApi.md#getStatisticsDaily) | **GET** /v3/announcement_stats/daily | Get statistics - daily |
| [**getStatisticsMonthly**](MessageApi.md#getStatisticsMonthly) | **GET** /v3/announcement_stats/monthly | Get statistics - monthly |
| [**listAllEmojisAndEmojiCategories**](MessageApi.md#listAllEmojisAndEmojiCategories) | **GET** /v3/emoji_categories | List all emojis and emoji categories |
| [**listAnnouncementGroups**](MessageApi.md#listAnnouncementGroups) | **GET** /v3/announcement_group | List announcement groups |
| [**listAnnouncements**](MessageApi.md#listAnnouncements) | **GET** /v3/announcements | List announcements |
| [**listEmojis**](MessageApi.md#listEmojis) | **GET** /v3/emojis | List emojis |
| [**listMessages**](MessageApi.md#listMessages) | **GET** /v3/{channel_type}/{channel_url}/messages | List messages |
| [**listReactionsOfMessage**](MessageApi.md#listReactionsOfMessage) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | List reactions of a message |
| [**migrateMessagesByUrl**](MessageApi.md#migrateMessagesByUrl) | **POST** /v3/migration/{target_channel_url} | Migrate messages |
| [**removeExtraDataFromMessage**](MessageApi.md#removeExtraDataFromMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Remove extra data from a message |
| [**removeReactionFromAMessage**](MessageApi.md#removeReactionFromAMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Remove a reaction from a message |
| [**scheduleAnnouncement**](MessageApi.md#scheduleAnnouncement) | **POST** /v3/announcements | Schedule an announcement |
| [**sendMessage**](MessageApi.md#sendMessage) | **POST** /v3/{channel_type}/{channel_url}/messages | Send a message |
| [**translateMessageIntoOtherLanguages**](MessageApi.md#translateMessageIntoOtherLanguages) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/translation | Translate a message into other languages |
| [**updateAnnouncementById**](MessageApi.md#updateAnnouncementById) | **PUT** /v3/announcements/{unique_id} | Update an announcement |
| [**updateEmojiCategoryUrlById**](MessageApi.md#updateEmojiCategoryUrlById) | **PUT** /v3/emoji_categories/{emoji_category_id} | Update an emoji category URL |
| [**updateEmojiUrlByKey**](MessageApi.md#updateEmojiUrlByKey) | **PUT** /v3/emojis/{emoji_key} | Update an emoji URL |
| [**updateExtraDataInMessage**](MessageApi.md#updateExtraDataInMessage) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Update extra data in a message |
| [**updateMessageById**](MessageApi.md#updateMessageById) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id} | Update a message |
| [**useDefaultEmojis**](MessageApi.md#useDefaultEmojis) | **PUT** /v3/applications/settings/use_default_emoji | Use default emojis |
| [**viewMessageById**](MessageApi.md#viewMessageById) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id} | View a message |
| [**viewTotalNumberOfMessagesInChannel**](MessageApi.md#viewTotalNumberOfMessagesInChannel) | **GET** /v3/{channel_type}/{channel_url}/messages/total_count | View total number of messages in a channel |



## addEmojiCategories

> AddEmojiCategoriesResponse addEmojiCategories(apiToken, body)

Add emoji categories

## Add emoji categories

Adds a list of one or more new emoji categories to the application.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        Object body = null; // Object | 
        try {
            AddEmojiCategoriesResponse result = apiInstance.addEmojiCategories(apiToken, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#addEmojiCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

[**AddEmojiCategoriesResponse**](AddEmojiCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addEmojis

> AddEmojisResponse addEmojis(apiToken, addEmojisData)

Add emojis

## Add emojis

Adds a list of one or more new emojis to the application.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddEmojisData addEmojisData = new AddEmojisData(); // AddEmojisData | 
        try {
            AddEmojisResponse result = apiInstance.addEmojis(apiToken, addEmojisData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#addEmojis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **addEmojisData** | [**AddEmojisData**](AddEmojisData.md)|  | [optional] |

### Return type

[**AddEmojisResponse**](AddEmojisResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addExtraDataToMessage

> AddExtraDataToMessageResponse addExtraDataToMessage(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData)

Add extra data to a message

## Add extra data to a message

Adds one or more key-values items which store additional information for a message.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        AddExtraDataToMessageData addExtraDataToMessageData = new AddExtraDataToMessageData(); // AddExtraDataToMessageData | 
        try {
            AddExtraDataToMessageResponse result = apiInstance.addExtraDataToMessage(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#addExtraDataToMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **addExtraDataToMessageData** | [**AddExtraDataToMessageData**](AddExtraDataToMessageData.md)|  | [optional] |

### Return type

[**AddExtraDataToMessageResponse**](AddExtraDataToMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addReactionToAMessage

> AddReactionToAMessageResponse addReactionToAMessage(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData)

Add a reaction to a message

## Add a reaction to a message

Adds a specific reaction to a message.

> __Note__: Currently, this action is only available in group channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        AddReactionToAMessageData addReactionToAMessageData = new AddReactionToAMessageData(); // AddReactionToAMessageData | 
        try {
            AddReactionToAMessageResponse result = apiInstance.addReactionToAMessage(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#addReactionToAMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **addReactionToAMessageData** | [**AddReactionToAMessageData**](AddReactionToAMessageData.md)|  | [optional] |

### Return type

[**AddReactionToAMessageResponse**](AddReactionToAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteEmojiByKey

> deleteEmojiByKey(apiToken, emojiKey)

Delete an emoji

## Delete an emoji

Deletes an emoji from the application.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiKey = "emojiKey_example"; // String | 
        try {
            apiInstance.deleteEmojiByKey(apiToken, emojiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#deleteEmojiByKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiKey** | **String**|  | |

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
| **200** | Successful response |  -  |


## deleteEmojiCategoryById

> Object deleteEmojiCategoryById(apiToken, emojiCategoryId)

Delete an emoji category

## Delete an emoji category

Deletes an emoji category with the specified ID.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiCategoryId = "emojiCategoryId_example"; // String | 
        try {
            Object result = apiInstance.deleteEmojiCategoryById(apiToken, emojiCategoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#deleteEmojiCategoryById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiCategoryId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteMessageById

> Object deleteMessageById(apiToken, channelType, channelUrl, messageId)

Delete a message

## Delete a message

Deletes a message from a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        try {
            Object result = apiInstance.deleteMessageById(apiToken, channelType, channelUrl, messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#deleteMessageById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## enableReactions

> EnableReactionsResponse enableReactions(apiToken, enableReactionsData)

Enable reactions

## Enable reactions

Turn on or off reactions in a Sendbird application.

> __Note__: This action also allows reactions in UIKit.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        EnableReactionsData enableReactionsData = new EnableReactionsData(); // EnableReactionsData | 
        try {
            EnableReactionsResponse result = apiInstance.enableReactions(apiToken, enableReactionsData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#enableReactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **enableReactionsData** | [**EnableReactionsData**](EnableReactionsData.md)|  | [optional] |

### Return type

[**EnableReactionsResponse**](EnableReactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcMarkAllMessagesAsDelivered

> GcMarkAllMessagesAsDeliveredResponse gcMarkAllMessagesAsDelivered(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData)

Mark all messages as delivered

## Mark all messages as delivered

Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData = new GcMarkAllMessagesAsDeliveredData(); // GcMarkAllMessagesAsDeliveredData | 
        try {
            GcMarkAllMessagesAsDeliveredResponse result = apiInstance.gcMarkAllMessagesAsDelivered(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#gcMarkAllMessagesAsDelivered");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelUrl** | **String**|  | |
| **gcMarkAllMessagesAsDeliveredData** | [**GcMarkAllMessagesAsDeliveredData**](GcMarkAllMessagesAsDeliveredData.md)|  | [optional] |

### Return type

[**GcMarkAllMessagesAsDeliveredResponse**](GcMarkAllMessagesAsDeliveredResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcMarkAllMessagesAsRead

> Object gcMarkAllMessagesAsRead(apiToken, channelUrl, gcMarkAllMessagesAsReadData)

Mark all messages as read

## Mark all messages as read

Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData = new GcMarkAllMessagesAsReadData(); // GcMarkAllMessagesAsReadData | 
        try {
            Object result = apiInstance.gcMarkAllMessagesAsRead(apiToken, channelUrl, gcMarkAllMessagesAsReadData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#gcMarkAllMessagesAsRead");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelUrl** | **String**|  | |
| **gcMarkAllMessagesAsReadData** | [**GcMarkAllMessagesAsReadData**](GcMarkAllMessagesAsReadData.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcViewNumberOfEachMembersUnreadMessages

> GcViewNumberOfEachMembersUnreadMessagesResponse gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds)

View number of each member&#39;s unread messages

## View number of each member's unread messages

Retrieves the total number of each member's unread messages in a group channel. This action is only applicable for users in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String userIds = "userIds_example"; // String | 
        try {
            GcViewNumberOfEachMembersUnreadMessagesResponse result = apiInstance.gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#gcViewNumberOfEachMembersUnreadMessages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelUrl** | **String**|  | |
| **userIds** | **String**|  | [optional] |

### Return type

[**GcViewNumberOfEachMembersUnreadMessagesResponse**](GcViewNumberOfEachMembersUnreadMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getEmojiByKey

> SendBirdEmoji getEmojiByKey(apiToken, emojiKey)

Get an emoji

## Get an emoji

Retrieves an emoji with the specified key.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiKey = "emojiKey_example"; // String | 
        try {
            SendBirdEmoji result = apiInstance.getEmojiByKey(apiToken, emojiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getEmojiByKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiKey** | **String**|  | |

### Return type

[**SendBirdEmoji**](SendBirdEmoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getEmojiCategoryById

> SendBirdEmojiCategory getEmojiCategoryById(apiToken, emojiCategoryId)

Get an emoji category

## Get an emoji category

Retrieves an emoji category with the specified ID, including its emojis.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category
----------------------------

 `emoji_category_id`
     Type: int
     Description: Specifies the unique ID of the emoji category to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiCategoryId = "emojiCategoryId_example"; // String | 
        try {
            SendBirdEmojiCategory result = apiInstance.getEmojiCategoryById(apiToken, emojiCategoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getEmojiCategoryById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiCategoryId** | **String**|  | |

### Return type

[**SendBirdEmojiCategory**](SendBirdEmojiCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatistics

> GetStatisticsResponse getStatistics(apiToken)

Get statistics - weekly

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetStatisticsResponse result = apiInstance.getStatistics(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getStatistics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |

### Return type

[**GetStatisticsResponse**](GetStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatisticsDaily

> GetStatisticsDailyResponse getStatisticsDaily(apiToken, startDate, endDate, startWeek, endWeek, startMonth, endMonth, announcementGroup)

Get statistics - daily

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String startDate = "startDate_example"; // String | 
        String endDate = "endDate_example"; // String | 
        String startWeek = "startWeek_example"; // String | 
        String endWeek = "endWeek_example"; // String | 
        String startMonth = "startMonth_example"; // String | 
        String endMonth = "endMonth_example"; // String | 
        String announcementGroup = "announcementGroup_example"; // String | 
        try {
            GetStatisticsDailyResponse result = apiInstance.getStatisticsDaily(apiToken, startDate, endDate, startWeek, endWeek, startMonth, endMonth, announcementGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getStatisticsDaily");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **startDate** | **String**|  | |
| **endDate** | **String**|  | |
| **startWeek** | **String**|  | |
| **endWeek** | **String**|  | |
| **startMonth** | **String**|  | |
| **endMonth** | **String**|  | |
| **announcementGroup** | **String**|  | [optional] |

### Return type

[**GetStatisticsDailyResponse**](GetStatisticsDailyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatisticsMonthly

> GetStatisticsMonthlyResponse getStatisticsMonthly(apiToken)

Get statistics - monthly

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetStatisticsMonthlyResponse result = apiInstance.getStatisticsMonthly(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getStatisticsMonthly");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |

### Return type

[**GetStatisticsMonthlyResponse**](GetStatisticsMonthlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listAllEmojisAndEmojiCategories

> ListAllEmojisAndEmojiCategoriesResponse listAllEmojisAndEmojiCategories(apiToken)

List all emojis and emoji categories

## List all emojis and emoji categories

Retrieves a list of all emoji categories registered to the application, including their emojis.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListAllEmojisAndEmojiCategoriesResponse result = apiInstance.listAllEmojisAndEmojiCategories(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listAllEmojisAndEmojiCategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |

### Return type

[**ListAllEmojisAndEmojiCategoriesResponse**](ListAllEmojisAndEmojiCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listAnnouncementGroups

> ListAnnouncementGroupsResponse listAnnouncementGroups(apiToken, token, limit)

List announcement groups

## List announcement groups

Retrieves a list of announcement groups.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListAnnouncementGroupsResponse result = apiInstance.listAnnouncementGroups(apiToken, token, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listAnnouncementGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListAnnouncementGroupsResponse**](ListAnnouncementGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listAnnouncements

> ListAnnouncementsResponse listAnnouncements(apiToken, token, limit, order, status, announcementGroup)

List announcements

## List announcements

Retrieves a list of announcements.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String order = "order_example"; // String | 
        String status = "status_example"; // String | 
        String announcementGroup = "announcementGroup_example"; // String | 
        try {
            ListAnnouncementsResponse result = apiInstance.listAnnouncements(apiToken, token, limit, order, status, announcementGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listAnnouncements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **order** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **announcementGroup** | **String**|  | [optional] |

### Return type

[**ListAnnouncementsResponse**](ListAnnouncementsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listEmojis

> ListEmojisResponse listEmojis(apiToken)

List emojis

## List emojis

Retrieves a list of all emojis registered to the application.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListEmojisResponse result = apiInstance.listEmojis(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listEmojis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |

### Return type

[**ListEmojisResponse**](ListEmojisResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listMessages

> ListMessagesResponse listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray)

List messages

## List messages

Retrieves a list of past messages of a channel.

> This message retrieval is one of Sendbird's [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the channel to retrieve a list of past messages.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageTs = "messageTs_example"; // String | 
        Integer messageId = 56; // Integer | 
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
            ListMessagesResponse result = apiInstance.listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listMessages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageTs** | **String**|  | [optional] |
| **messageId** | **Integer**|  | [optional] |
| **prevLimit** | **Integer**|  | [optional] |
| **nextLimit** | **Integer**|  | [optional] |
| **include** | **Boolean**|  | [optional] |
| **reverse** | **Boolean**|  | [optional] |
| **senderId** | **String**|  | [optional] |
| **senderIds** | **String**|  | [optional] |
| **operatorFilter** | **String**|  | [optional] |
| **customTypes** | **String**|  | [optional] |
| **messageType** | **String**|  | [optional] |
| **includingRemoved** | **Boolean**|  | [optional] |
| **includeReactions** | **Boolean**|  | [optional] |
| **withSortedMetaArray** | **Boolean**|  | [optional] |
| **showSubchannelMessagesOnly** | **Boolean**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **customType** | **String**|  | [optional] |
| **withMetaArray** | **Boolean**|  | [optional] |

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listReactionsOfMessage

> ListReactionsOfMessageResponse listReactionsOfMessage(apiToken, channelType, channelUrl, messageId, listUsers)

List reactions of a message

## List reactions of a message

Retrieves a list of reactions made to a message.

> __Note__: Currently, this action is only available in group channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the target channel.
 `message_id`
     Type: long
     Description: Specifies the unique ID of the message to add a reaction to.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        Boolean listUsers = true; // Boolean | 
        try {
            ListReactionsOfMessageResponse result = apiInstance.listReactionsOfMessage(apiToken, channelType, channelUrl, messageId, listUsers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listReactionsOfMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **listUsers** | **Boolean**|  | [optional] |

### Return type

[**ListReactionsOfMessageResponse**](ListReactionsOfMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## migrateMessagesByUrl

> migrateMessagesByUrl(apiToken, targetChannelUrl, body)

Migrate messages

## Migrate messages

Using our migration API, you can migrate the messages from another system into a Sendbird system's [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.

> To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).

There are three things to do in advance before the migration. Follow the instructions below:

1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user).
2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn't create a channel for your migration automatically.
3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.

https://sendbird.com/docs/chat/v3/platform-api/guides/migration#2-migrate-messages
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String targetChannelUrl = "targetChannelUrl_example"; // String | 
        Object body = null; // Object | 
        try {
            apiInstance.migrateMessagesByUrl(apiToken, targetChannelUrl, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#migrateMessagesByUrl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **targetChannelUrl** | **String**|  | |
| **body** | **Object**|  | [optional] |

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
| **200** | Successful response |  -  |


## removeExtraDataFromMessage

> Object removeExtraDataFromMessage(apiToken, channelType, channelUrl, messageId, keys)

Remove extra data from a message

## Remove extra data from a message

Removes specific items from a message by their keys.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        List<String> keys = Arrays.asList(); // List<String> | 
        try {
            Object result = apiInstance.removeExtraDataFromMessage(apiToken, channelType, channelUrl, messageId, keys);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#removeExtraDataFromMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **keys** | **List&lt;String&gt;**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## removeReactionFromAMessage

> RemoveReactionFromAMessageResponse removeReactionFromAMessage(apiToken, channelType, channelUrl, messageId, userId, reaction)

Remove a reaction from a message

## Remove a reaction from a message

Removes a specific reaction from a message.

> __Note__: Currently, this action is only available in group channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        String userId = "userId_example"; // String | 
        String reaction = "reaction_example"; // String | 
        try {
            RemoveReactionFromAMessageResponse result = apiInstance.removeReactionFromAMessage(apiToken, channelType, channelUrl, messageId, userId, reaction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#removeReactionFromAMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **reaction** | **String**|  | [optional] |

### Return type

[**RemoveReactionFromAMessageResponse**](RemoveReactionFromAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## scheduleAnnouncement

> ScheduleAnnouncementResponse scheduleAnnouncement(apiToken, scheduleAnnouncementData)

Schedule an announcement

## Schedule an announcement

Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        ScheduleAnnouncementData scheduleAnnouncementData = new ScheduleAnnouncementData(); // ScheduleAnnouncementData | 
        try {
            ScheduleAnnouncementResponse result = apiInstance.scheduleAnnouncement(apiToken, scheduleAnnouncementData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#scheduleAnnouncement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **scheduleAnnouncementData** | [**ScheduleAnnouncementData**](ScheduleAnnouncementData.md)|  | [optional] |

### Return type

[**ScheduleAnnouncementResponse**](ScheduleAnnouncementResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## sendMessage

> SendBirdMessageResponse sendMessage(apiToken, channelType, channelUrl, sendMessageData)

Send a message

## Send a message

Sends a message to a channel. You can send a text message, a file message, and an admin message.

>__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        SendMessageData sendMessageData = new SendMessageData(); // SendMessageData | 
        try {
            SendBirdMessageResponse result = apiInstance.sendMessage(apiToken, channelType, channelUrl, sendMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#sendMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **sendMessageData** | [**SendMessageData**](SendMessageData.md)|  | [optional] |

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
| **200** | Successful response |  -  |


## translateMessageIntoOtherLanguages

> SendBirdMessageResponse translateMessageIntoOtherLanguages(apiToken, channelType, channelUrl, messageId, translateMessageIntoOtherLanguagesData)

Translate a message into other languages

## Translate a message into other languages

Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.

> __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData = new TranslateMessageIntoOtherLanguagesData(); // TranslateMessageIntoOtherLanguagesData | 
        try {
            SendBirdMessageResponse result = apiInstance.translateMessageIntoOtherLanguages(apiToken, channelType, channelUrl, messageId, translateMessageIntoOtherLanguagesData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#translateMessageIntoOtherLanguages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **translateMessageIntoOtherLanguagesData** | [**TranslateMessageIntoOtherLanguagesData**](TranslateMessageIntoOtherLanguagesData.md)|  | [optional] |

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
| **200** | Successful response |  -  |


## updateAnnouncementById

> UpdateAnnouncementByIdResponse updateAnnouncementById(apiToken, uniqueId, updateAnnouncementByIdData)

Update an announcement

## Update an announcement

Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.

>__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn't started yet.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String uniqueId = "uniqueId_example"; // String | 
        UpdateAnnouncementByIdData updateAnnouncementByIdData = new UpdateAnnouncementByIdData(); // UpdateAnnouncementByIdData | 
        try {
            UpdateAnnouncementByIdResponse result = apiInstance.updateAnnouncementById(apiToken, uniqueId, updateAnnouncementByIdData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateAnnouncementById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **uniqueId** | **String**|  | |
| **updateAnnouncementByIdData** | [**UpdateAnnouncementByIdData**](UpdateAnnouncementByIdData.md)|  | [optional] |

### Return type

[**UpdateAnnouncementByIdResponse**](UpdateAnnouncementByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateEmojiCategoryUrlById

> SendBirdEmojiCategory updateEmojiCategoryUrlById(apiToken, emojiCategoryId, updateEmojiCategoryUrlByIdData)

Update an emoji category URL

## Update an emoji category URL

Updates the URL of an emoji category with the specified ID.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiCategoryId = "emojiCategoryId_example"; // String | 
        UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData = new UpdateEmojiCategoryUrlByIdData(); // UpdateEmojiCategoryUrlByIdData | 
        try {
            SendBirdEmojiCategory result = apiInstance.updateEmojiCategoryUrlById(apiToken, emojiCategoryId, updateEmojiCategoryUrlByIdData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateEmojiCategoryUrlById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiCategoryId** | **String**|  | |
| **updateEmojiCategoryUrlByIdData** | [**UpdateEmojiCategoryUrlByIdData**](UpdateEmojiCategoryUrlByIdData.md)|  | [optional] |

### Return type

[**SendBirdEmojiCategory**](SendBirdEmojiCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateEmojiUrlByKey

> SendBirdEmoji updateEmojiUrlByKey(apiToken, emojiKey, updateEmojiUrlByKeyData)

Update an emoji URL

## Update an emoji URL

Updates the image URL of an emoji with the specified key.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String emojiKey = "emojiKey_example"; // String | 
        UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData = new UpdateEmojiUrlByKeyData(); // UpdateEmojiUrlByKeyData | 
        try {
            SendBirdEmoji result = apiInstance.updateEmojiUrlByKey(apiToken, emojiKey, updateEmojiUrlByKeyData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateEmojiUrlByKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **emojiKey** | **String**|  | |
| **updateEmojiUrlByKeyData** | [**UpdateEmojiUrlByKeyData**](UpdateEmojiUrlByKeyData.md)|  | [optional] |

### Return type

[**SendBirdEmoji**](SendBirdEmoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateExtraDataInMessage

> UpdateExtraDataInMessageResponse updateExtraDataInMessage(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData)

Update extra data in a message

## Update extra data in a message

Updates the values of specific items by their keys.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        UpdateExtraDataInMessageData updateExtraDataInMessageData = new UpdateExtraDataInMessageData(); // UpdateExtraDataInMessageData | 
        try {
            UpdateExtraDataInMessageResponse result = apiInstance.updateExtraDataInMessage(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateExtraDataInMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **updateExtraDataInMessageData** | [**UpdateExtraDataInMessageData**](UpdateExtraDataInMessageData.md)|  | [optional] |

### Return type

[**UpdateExtraDataInMessageResponse**](UpdateExtraDataInMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateMessageById

> SendBirdMessageResponse updateMessageById(apiToken, channelType, channelUrl, messageId, updateMessageByIdData)

Update a message

## Update a message

Updates information on a message in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        UpdateMessageByIdData updateMessageByIdData = new UpdateMessageByIdData(); // UpdateMessageByIdData | 
        try {
            SendBirdMessageResponse result = apiInstance.updateMessageById(apiToken, channelType, channelUrl, messageId, updateMessageByIdData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateMessageById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **updateMessageByIdData** | [**UpdateMessageByIdData**](UpdateMessageByIdData.md)|  | [optional] |

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
| **200** | Successful response |  -  |


## useDefaultEmojis

> UseDefaultEmojisResponse useDefaultEmojis(apiToken, useDefaultEmojisData)

Use default emojis

## Use default emojis

Determines whether to use the 7 default emojis initially provided.

https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        UseDefaultEmojisData useDefaultEmojisData = new UseDefaultEmojisData(); // UseDefaultEmojisData | 
        try {
            UseDefaultEmojisResponse result = apiInstance.useDefaultEmojis(apiToken, useDefaultEmojisData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#useDefaultEmojis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **useDefaultEmojisData** | [**UseDefaultEmojisData**](UseDefaultEmojisData.md)|  | [optional] |

### Return type

[**UseDefaultEmojisResponse**](UseDefaultEmojisResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewMessageById

> SendBirdMessageResponse viewMessageById(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray)

View a message

## View a message

Retrieves information on a message.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the target channel.
 `message_id`
     Type: long
     Description: Specifies the unique ID of the message to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String messageId = "messageId_example"; // String | 
        Boolean withSortedMetaArray = true; // Boolean | 
        Boolean withMetaArray = true; // Boolean | 
        try {
            SendBirdMessageResponse result = apiInstance.viewMessageById(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#viewMessageById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **withSortedMetaArray** | **Boolean**|  | [optional] |
| **withMetaArray** | **Boolean**|  | [optional] |

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
| **200** | Successful response |  -  |


## viewTotalNumberOfMessagesInChannel

> ViewTotalNumberOfMessagesInChannelResponse viewTotalNumberOfMessagesInChannel(apiToken, channelType, channelUrl)

View total number of messages in a channel

## View total number of messages in a channel

Retrieves the total number of messages in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        try {
            ViewTotalNumberOfMessagesInChannelResponse result = apiInstance.viewTotalNumberOfMessagesInChannel(apiToken, channelType, channelUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#viewTotalNumberOfMessagesInChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |

### Return type

[**ViewTotalNumberOfMessagesInChannelResponse**](ViewTotalNumberOfMessagesInChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

