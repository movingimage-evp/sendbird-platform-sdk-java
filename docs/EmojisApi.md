# EmojisApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEmojiCategories**](EmojisApi.md#addEmojiCategories) | **POST** /v3/emoji_categories | Add emoji categories
[**addEmojis**](EmojisApi.md#addEmojis) | **POST** /v3/emojis | Add emojis
[**deleteEmojiByKey**](EmojisApi.md#deleteEmojiByKey) | **DELETE** /v3/emojis/{emoji_key} | Delete an emoji
[**deleteEmojiCategoryById**](EmojisApi.md#deleteEmojiCategoryById) | **DELETE** /v3/emoji_categories/{emoji_category_id} | Delete an emoji category
[**enableReactions**](EmojisApi.md#enableReactions) | **PUT** /v3/applications/settings/reactions | Enable reactions
[**getEmojiByKey**](EmojisApi.md#getEmojiByKey) | **GET** /v3/emojis/{emoji_key} | Get an emoji
[**getEmojiCategoryById**](EmojisApi.md#getEmojiCategoryById) | **GET** /v3/emoji_categories/{emoji_category_id} | Get an emoji category
[**listAllEmojisAndEmojiCategories**](EmojisApi.md#listAllEmojisAndEmojiCategories) | **GET** /v3/emoji_categories | List all emojis and emoji categories
[**listEmojis**](EmojisApi.md#listEmojis) | **GET** /v3/emojis | List emojis
[**updateEmojiCategoryUrlById**](EmojisApi.md#updateEmojiCategoryUrlById) | **PUT** /v3/emoji_categories/{emoji_category_id} | Update an emoji category URL
[**updateEmojiUrlByKey**](EmojisApi.md#updateEmojiUrlByKey) | **PUT** /v3/emojis/{emoji_key} | Update an emoji URL
[**useDefaultEmojis**](EmojisApi.md#useDefaultEmojis) | **PUT** /v3/applications/settings/use_default_emoji | Use default emojis


<a name="addEmojiCategories"></a>
# **addEmojiCategories**
> InlineResponse20057 addEmojiCategories(apiToken, body)

Add emoji categories

## Add emoji categories  Adds a list of one or more new emoji categories to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      InlineResponse20057 result = apiInstance.addEmojiCategories(apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#addEmojiCategories");
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
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="addEmojis"></a>
# **addEmojis**
> InlineResponse20059 addEmojis(apiToken, addEmojisData)

Add emojis

## Add emojis  Adds a list of one or more new emojis to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    AddEmojisData addEmojisData = new AddEmojisData(); // AddEmojisData | 
    try {
      InlineResponse20059 result = apiInstance.addEmojis(apiToken, addEmojisData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#addEmojis");
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
 **apiToken** | **String**|  | [optional]
 **addEmojisData** | [**AddEmojisData**](AddEmojisData.md)|  | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteEmojiByKey"></a>
# **deleteEmojiByKey**
> deleteEmojiByKey(emojiKey, apiToken)

Delete an emoji

## Delete an emoji  Deletes an emoji from the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiKey = "emojiKey_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteEmojiByKey(emojiKey, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#deleteEmojiByKey");
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
 **emojiKey** | **String**|  |
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

<a name="deleteEmojiCategoryById"></a>
# **deleteEmojiCategoryById**
> deleteEmojiCategoryById(emojiCategoryId, apiToken)

Delete an emoji category

## Delete an emoji category  Deletes an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiCategoryId = "emojiCategoryId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteEmojiCategoryById(emojiCategoryId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#deleteEmojiCategoryById");
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
 **emojiCategoryId** | **String**|  |
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

<a name="enableReactions"></a>
# **enableReactions**
> InlineResponse20051 enableReactions(apiToken, enableReactionsData)

Enable reactions

## Enable reactions  Turn on or off reactions in a Sendbird application.  &gt; __Note__: This action also allows reactions in UIKit.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    EnableReactionsData enableReactionsData = new EnableReactionsData(); // EnableReactionsData | 
    try {
      InlineResponse20051 result = apiInstance.enableReactions(apiToken, enableReactionsData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#enableReactions");
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
 **apiToken** | **String**|  | [optional]
 **enableReactionsData** | [**EnableReactionsData**](EnableReactionsData.md)|  | [optional]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getEmojiByKey"></a>
# **getEmojiByKey**
> SendBirdEmoji getEmojiByKey(emojiKey, apiToken)

Get an emoji

## Get an emoji  Retrieves an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiKey = "emojiKey_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      SendBirdEmoji result = apiInstance.getEmojiByKey(emojiKey, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#getEmojiByKey");
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
 **emojiKey** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="getEmojiCategoryById"></a>
# **getEmojiCategoryById**
> SendBirdEmojiCategory getEmojiCategoryById(emojiCategoryId, apiToken)

Get an emoji category

## Get an emoji category  Retrieves an emoji category with the specified ID, including its emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category ----------------------------   &#x60;emoji_category_id&#x60;      Type: int      Description: Specifies the unique ID of the emoji category to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiCategoryId = "emojiCategoryId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      SendBirdEmojiCategory result = apiInstance.getEmojiCategoryById(emojiCategoryId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#getEmojiCategoryById");
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
 **emojiCategoryId** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="listAllEmojisAndEmojiCategories"></a>
# **listAllEmojisAndEmojiCategories**
> InlineResponse20056 listAllEmojisAndEmojiCategories(apiToken)

List all emojis and emoji categories

## List all emojis and emoji categories  Retrieves a list of all emoji categories registered to the application, including their emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20056 result = apiInstance.listAllEmojisAndEmojiCategories(apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#listAllEmojisAndEmojiCategories");
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
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listEmojis"></a>
# **listEmojis**
> InlineResponse20058 listEmojis(apiToken)

List emojis

## List emojis  Retrieves a list of all emojis registered to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20058 result = apiInstance.listEmojis(apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#listEmojis");
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
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateEmojiCategoryUrlById"></a>
# **updateEmojiCategoryUrlById**
> SendBirdEmojiCategory updateEmojiCategoryUrlById(emojiCategoryId, apiToken, updateEmojiCategoryUrlByIdData)

Update an emoji category URL

## Update an emoji category URL  Updates the URL of an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiCategoryId = "emojiCategoryId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData = new UpdateEmojiCategoryUrlByIdData(); // UpdateEmojiCategoryUrlByIdData | 
    try {
      SendBirdEmojiCategory result = apiInstance.updateEmojiCategoryUrlById(emojiCategoryId, apiToken, updateEmojiCategoryUrlByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#updateEmojiCategoryUrlById");
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
 **emojiCategoryId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateEmojiCategoryUrlByIdData** | [**UpdateEmojiCategoryUrlByIdData**](UpdateEmojiCategoryUrlByIdData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateEmojiUrlByKey"></a>
# **updateEmojiUrlByKey**
> SendBirdEmoji updateEmojiUrlByKey(emojiKey, apiToken, updateEmojiUrlByKeyData)

Update an emoji URL

## Update an emoji URL  Updates the image URL of an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String emojiKey = "emojiKey_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData = new UpdateEmojiUrlByKeyData(); // UpdateEmojiUrlByKeyData | 
    try {
      SendBirdEmoji result = apiInstance.updateEmojiUrlByKey(emojiKey, apiToken, updateEmojiUrlByKeyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#updateEmojiUrlByKey");
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
 **emojiKey** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateEmojiUrlByKeyData** | [**UpdateEmojiUrlByKeyData**](UpdateEmojiUrlByKeyData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="useDefaultEmojis"></a>
# **useDefaultEmojis**
> InlineResponse20055 useDefaultEmojis(apiToken, useDefaultEmojisData)

Use default emojis

## Use default emojis  Determines whether to use the 7 default emojis initially provided.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.EmojisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    EmojisApi apiInstance = new EmojisApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    UseDefaultEmojisData useDefaultEmojisData = new UseDefaultEmojisData(); // UseDefaultEmojisData | 
    try {
      InlineResponse20055 result = apiInstance.useDefaultEmojis(apiToken, useDefaultEmojisData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmojisApi#useDefaultEmojis");
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
 **apiToken** | **String**|  | [optional]
 **useDefaultEmojisData** | [**UseDefaultEmojisData**](UseDefaultEmojisData.md)|  | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

