# UserApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRegistrationOrDeviceToken**](UserApi.md#addRegistrationOrDeviceToken) | **POST** /v3/users/{user_id}/push/{token_type} | Add a registration or device token
[**banFromChannelsWithCustomChannelTypes**](UserApi.md#banFromChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/banned_channel_custom_types | Ban from channels with custom channel types
[**blockUser**](UserApi.md#blockUser) | **POST** /v3/users/{user_id}/block | Block a user
[**choosePushNotificationContentTemplate**](UserApi.md#choosePushNotificationContentTemplate) | **PUT** /v3/users/{user_id}/push/template | Choose a push notification content template
[**createUser**](UserApi.md#createUser) | **POST** /v3/users | Create a user
[**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /v3/users/{user_id} | Delete a user
[**leaveMyGroupChannels**](UserApi.md#leaveMyGroupChannels) | **PUT** /v3/users/{user_id}/my_group_channels/leave | Leave my group channels
[**listBannedChannels**](UserApi.md#listBannedChannels) | **GET** /v3/users/{user_id}/ban | List banned channels
[**listBlockedUsers**](UserApi.md#listBlockedUsers) | **GET** /v3/users/{user_id}/block | List blocked users
[**listMutedChannels**](UserApi.md#listMutedChannels) | **GET** /v3/users/{user_id}/mute | List muted channels
[**listMyGroupChannels**](UserApi.md#listMyGroupChannels) | **GET** /v3/users/{user_id}/my_group_channels | List my group channels
[**listRegistrationOrDeviceTokens**](UserApi.md#listRegistrationOrDeviceTokens) | **GET** /v3/users/{user_id}/push/{token_type} | List registration or device tokens
[**listUsers**](UserApi.md#listUsers) | **GET** /v3/users | List users
[**markAllMessagesAsRead**](UserApi.md#markAllMessagesAsRead) | **PUT** /v3/users/{user_id}/mark_as_read_all | Mark all messages as read
[**muteInChannelsWithCustomChannelTypes**](UserApi.md#muteInChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/muted_channel_custom_types | Mute in channels with custom channel types
[**registerAsOperatorToChannelsWithCustomChannelTypes**](UserApi.md#registerAsOperatorToChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/operating_channel_custom_types | Register as an operator to channels with custom channel types
[**removeRegistrationOrDeviceToken**](UserApi.md#removeRegistrationOrDeviceToken) | **DELETE** /v3/users/{user_id}/push | Remove a registration or device token - When unregistering all device tokens
[**removeRegistrationOrDeviceTokenByToken**](UserApi.md#removeRegistrationOrDeviceTokenByToken) | **DELETE** /v3/users/{user_id}/push/{token_type}/{token} | Remove a registration or device token - When unregistering a specific token
[**removeRegistrationOrDeviceTokenFromOwnerByToken**](UserApi.md#removeRegistrationOrDeviceTokenFromOwnerByToken) | **DELETE** /v3/push/device_tokens/{token_type}/{token} | Remove a registration or device token from an owner
[**resetPushPreferences**](UserApi.md#resetPushPreferences) | **DELETE** /v3/users/{user_id}/push_preference | Reset push preferences
[**unblockUserById**](UserApi.md#unblockUserById) | **DELETE** /v3/users/{user_id}/block/{target_id} | Unblock a user
[**updateChannelInvitationPreference**](UserApi.md#updateChannelInvitationPreference) | **PUT** /v3/users/{user_id}/channel_invitation_preference | Update channel invitation preference
[**updateCountPreferenceOfChannelByUrl**](UserApi.md#updateCountPreferenceOfChannelByUrl) | **PUT** /v3/users/{user_id}/count_preference/{channel_url} | Update count preference of a channel
[**updatePushPreferences**](UserApi.md#updatePushPreferences) | **PUT** /v3/users/{user_id}/push_preference | Update push preferences
[**updatePushPreferencesForChannelByUrl**](UserApi.md#updatePushPreferencesForChannelByUrl) | **PUT** /v3/users/{user_id}/push_preference/{channel_url} | Update push preferences for a channel
[**updateUserById**](UserApi.md#updateUserById) | **PUT** /v3/users/{user_id} | Update a user
[**viewChannelInvitationPreference**](UserApi.md#viewChannelInvitationPreference) | **GET** /v3/users/{user_id}/channel_invitation_preference | View channel invitation preference
[**viewCountPreferenceOfChannelByUrl**](UserApi.md#viewCountPreferenceOfChannelByUrl) | **GET** /v3/users/{user_id}/count_preference/{channel_url} | View count preference of a channel
[**viewNumberOfChannelsByJoinStatus**](UserApi.md#viewNumberOfChannelsByJoinStatus) | **GET** /v3/users/{user_id}/group_channel_count | View number of channels by join status
[**viewNumberOfChannelsWithUnreadMessages**](UserApi.md#viewNumberOfChannelsWithUnreadMessages) | **GET** /v3/users/{user_id}/unread_channel_count | View number of channels with unread messages
[**viewNumberOfUnreadItems**](UserApi.md#viewNumberOfUnreadItems) | **GET** /v3/users/{user_id}/unread_item_count | View number of unread items
[**viewNumberOfUnreadMessages**](UserApi.md#viewNumberOfUnreadMessages) | **GET** /v3/users/{user_id}/unread_message_count | View number of unread messages
[**viewPushPreferences**](UserApi.md#viewPushPreferences) | **GET** /v3/users/{user_id}/push_preference | View push preferences
[**viewPushPreferencesForChannelByUrl**](UserApi.md#viewPushPreferencesForChannelByUrl) | **GET** /v3/users/{user_id}/push_preference/{channel_url} | View push preferences for a channel
[**viewUserById**](UserApi.md#viewUserById) | **GET** /v3/users/{user_id} | View a user
[**viewWhoOwnsRegistrationOrDeviceTokenByToken**](UserApi.md#viewWhoOwnsRegistrationOrDeviceTokenByToken) | **GET** /v3/push/device_tokens/{token_type}/{token} | View who owns a registration or device token


<a name="addRegistrationOrDeviceToken"></a>
# **addRegistrationOrDeviceToken**
> InlineResponse20025 addRegistrationOrDeviceToken(userId, tokenType, apiToken, addRegistrationOrDeviceTokenData)

Add a registration or device token

## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = new AddRegistrationOrDeviceTokenData(); // AddRegistrationOrDeviceTokenData | 
    try {
      InlineResponse20025 result = apiInstance.addRegistrationOrDeviceToken(userId, tokenType, apiToken, addRegistrationOrDeviceTokenData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#addRegistrationOrDeviceToken");
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
 **userId** | **String**|  |
 **tokenType** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **addRegistrationOrDeviceTokenData** | [**AddRegistrationOrDeviceTokenData**](AddRegistrationOrDeviceTokenData.md)|  | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="banFromChannelsWithCustomChannelTypes"></a>
# **banFromChannelsWithCustomChannelTypes**
> banFromChannelsWithCustomChannelTypes(userId, apiToken, banFromChannelsWithCustomChannelTypesData)

Ban from channels with custom channel types

## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData = new BanFromChannelsWithCustomChannelTypesData(); // BanFromChannelsWithCustomChannelTypesData | 
    try {
      apiInstance.banFromChannelsWithCustomChannelTypes(userId, apiToken, banFromChannelsWithCustomChannelTypesData);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#banFromChannelsWithCustomChannelTypes");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **banFromChannelsWithCustomChannelTypesData** | [**BanFromChannelsWithCustomChannelTypesData**](BanFromChannelsWithCustomChannelTypesData.md)|  | [optional]

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

<a name="blockUser"></a>
# **blockUser**
> SendBirdUser blockUser(userId, apiToken, blockUserData)

Block a user

## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    BlockUserData blockUserData = new BlockUserData(); // BlockUserData | 
    try {
      SendBirdUser result = apiInstance.blockUser(userId, apiToken, blockUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#blockUser");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **blockUserData** | [**BlockUserData**](BlockUserData.md)|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="choosePushNotificationContentTemplate"></a>
# **choosePushNotificationContentTemplate**
> InlineResponse20029 choosePushNotificationContentTemplate(userId, apiToken, body)

Choose a push notification content template

## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      InlineResponse20029 result = apiInstance.choosePushNotificationContentTemplate(userId, apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#choosePushNotificationContentTemplate");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createUser"></a>
# **createUser**
> SendBirdUser createUser(apiToken, createUserData)

Create a user

## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateUserData createUserData = new CreateUserData(); // CreateUserData | 
    try {
      SendBirdUser result = apiInstance.createUser(apiToken, createUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
 **createUserData** | [**CreateUserData**](CreateUserData.md)|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteUserById"></a>
# **deleteUserById**
> deleteUserById(userId, apiToken)

Delete a user

## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteUserById(userId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserById");
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
 **userId** | **String**|  |
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

<a name="leaveMyGroupChannels"></a>
# **leaveMyGroupChannels**
> leaveMyGroupChannels(userId, apiToken, leaveMyGroupChannelsData)

Leave my group channels

## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    LeaveMyGroupChannelsData leaveMyGroupChannelsData = new LeaveMyGroupChannelsData(); // LeaveMyGroupChannelsData | 
    try {
      apiInstance.leaveMyGroupChannels(userId, apiToken, leaveMyGroupChannelsData);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#leaveMyGroupChannels");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **leaveMyGroupChannelsData** | [**LeaveMyGroupChannelsData**](LeaveMyGroupChannelsData.md)|  | [optional]

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

<a name="listBannedChannels"></a>
# **listBannedChannels**
> InlineResponse20022 listBannedChannels(userId, apiToken, token, limit)

List banned channels

## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20022 result = apiInstance.listBannedChannels(userId, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listBannedChannels");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listBlockedUsers"></a>
# **listBlockedUsers**
> InlineResponse20016 listBlockedUsers(userId, apiToken, token, limit, userIds, metadatakey, metadatavaluesIn)

List blocked users

## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String userIds = "userIds_example"; // String | 
    String metadatakey = "metadatakey_example"; // String | 
    String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
    try {
      InlineResponse20016 result = apiInstance.listBlockedUsers(userId, apiToken, token, limit, userIds, metadatakey, metadatavaluesIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listBlockedUsers");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **userIds** | **String**|  | [optional]
 **metadatakey** | **String**|  | [optional]
 **metadatavaluesIn** | **String**|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listMutedChannels"></a>
# **listMutedChannels**
> InlineResponse20023 listMutedChannels(userId, apiToken, token, limit)

List muted channels

## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20023 result = apiInstance.listMutedChannels(userId, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listMutedChannels");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listMyGroupChannels"></a>
# **listMyGroupChannels**
> InlineResponse20017 listMyGroupChannels(userId, apiToken, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType)

List my group channels

## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String distinctMode = "distinctMode_example"; // String | 
    String publicMode = "publicMode_example"; // String | 
    String superMode = "superMode_example"; // String | 
    String hiddenMode = "hiddenMode_example"; // String | 
    String memberStateFilter = "memberStateFilter_example"; // String | 
    String unreadFilter = "unreadFilter_example"; // String | 
    Integer createdAfter = 56; // Integer | 
    Integer createdBefore = 56; // Integer | 
    Boolean showEmpty = true; // Boolean | 
    Boolean showFrozen = true; // Boolean | 
    Boolean showMember = true; // Boolean | 
    Boolean showDeliveryReceipt = true; // Boolean | 
    Boolean showReadReceipt = true; // Boolean | 
    String order = "order_example"; // String | 
    String metadataOrderKey = "metadataOrderKey_example"; // String | 
    String customTypes = "customTypes_example"; // String | 
    String customTypeStartswith = "customTypeStartswith_example"; // String | 
    String channelUrls = "channelUrls_example"; // String | 
    String name = "name_example"; // String | 
    String nameContains = "nameContains_example"; // String | 
    String nameStartswith = "nameStartswith_example"; // String | 
    String membersExactlyIn = "membersExactlyIn_example"; // String | 
    String membersIncludeIn = "membersIncludeIn_example"; // String | 
    String queryType = "queryType_example"; // String | 
    String membersNickname = "membersNickname_example"; // String | 
    String membersNicknameContains = "membersNicknameContains_example"; // String | 
    String searchQuery = "searchQuery_example"; // String | 
    String searchFields = "searchFields_example"; // String | 
    String metadataKey = "metadataKey_example"; // String | 
    String metadataValues = "metadataValues_example"; // String | 
    String metadataValueStartswith = "metadataValueStartswith_example"; // String | 
    String metacounterKey = "metacounterKey_example"; // String | 
    String metacounterValues = "metacounterValues_example"; // String | 
    String metacounterValueGt = "metacounterValueGt_example"; // String | 
    String metacounterValueGte = "metacounterValueGte_example"; // String | 
    String metacounterValueLt = "metacounterValueLt_example"; // String | 
    String metacounterValueLte = "metacounterValueLte_example"; // String | 
    String customType = "customType_example"; // String | 
    try {
      InlineResponse20017 result = apiInstance.listMyGroupChannels(userId, apiToken, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listMyGroupChannels");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **distinctMode** | **String**|  | [optional]
 **publicMode** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]
 **hiddenMode** | **String**|  | [optional]
 **memberStateFilter** | **String**|  | [optional]
 **unreadFilter** | **String**|  | [optional]
 **createdAfter** | **Integer**|  | [optional]
 **createdBefore** | **Integer**|  | [optional]
 **showEmpty** | **Boolean**|  | [optional]
 **showFrozen** | **Boolean**|  | [optional]
 **showMember** | **Boolean**|  | [optional]
 **showDeliveryReceipt** | **Boolean**|  | [optional]
 **showReadReceipt** | **Boolean**|  | [optional]
 **order** | **String**|  | [optional]
 **metadataOrderKey** | **String**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **customTypeStartswith** | **String**|  | [optional]
 **channelUrls** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **nameContains** | **String**|  | [optional]
 **nameStartswith** | **String**|  | [optional]
 **membersExactlyIn** | **String**|  | [optional]
 **membersIncludeIn** | **String**|  | [optional]
 **queryType** | **String**|  | [optional]
 **membersNickname** | **String**|  | [optional]
 **membersNicknameContains** | **String**|  | [optional]
 **searchQuery** | **String**|  | [optional]
 **searchFields** | **String**|  | [optional]
 **metadataKey** | **String**|  | [optional]
 **metadataValues** | **String**|  | [optional]
 **metadataValueStartswith** | **String**|  | [optional]
 **metacounterKey** | **String**|  | [optional]
 **metacounterValues** | **String**|  | [optional]
 **metacounterValueGt** | **String**|  | [optional]
 **metacounterValueGte** | **String**|  | [optional]
 **metacounterValueLt** | **String**|  | [optional]
 **metacounterValueLte** | **String**|  | [optional]
 **customType** | **String**|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listRegistrationOrDeviceTokens"></a>
# **listRegistrationOrDeviceTokens**
> InlineResponse20024 listRegistrationOrDeviceTokens(userId, tokenType, apiToken)

List registration or device tokens

## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20024 result = apiInstance.listRegistrationOrDeviceTokens(userId, tokenType, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listRegistrationOrDeviceTokens");
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
 **userId** | **String**|  |
 **tokenType** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listUsers"></a>
# **listUsers**
> InlineResponse20016 listUsers(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn)

List users

## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String activeMode = "activeMode_example"; // String | 
    Boolean showBot = true; // Boolean | 
    String userIds = "userIds_example"; // String | 
    String nickname = "nickname_example"; // String | 
    String nicknameStartswith = "nicknameStartswith_example"; // String | 
    String metadatakey = "metadatakey_example"; // String | 
    String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
    try {
      InlineResponse20016 result = apiInstance.listUsers(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listUsers");
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
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **activeMode** | **String**|  | [optional]
 **showBot** | **Boolean**|  | [optional]
 **userIds** | **String**|  | [optional]
 **nickname** | **String**|  | [optional]
 **nicknameStartswith** | **String**|  | [optional]
 **metadatakey** | **String**|  | [optional]
 **metadatavaluesIn** | **String**|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="markAllMessagesAsRead"></a>
# **markAllMessagesAsRead**
> markAllMessagesAsRead(userId, apiToken, markAllMessagesAsReadData)

Mark all messages as read

## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    MarkAllMessagesAsReadData markAllMessagesAsReadData = new MarkAllMessagesAsReadData(); // MarkAllMessagesAsReadData | 
    try {
      apiInstance.markAllMessagesAsRead(userId, apiToken, markAllMessagesAsReadData);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#markAllMessagesAsRead");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **markAllMessagesAsReadData** | [**MarkAllMessagesAsReadData**](MarkAllMessagesAsReadData.md)|  | [optional]

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

<a name="muteInChannelsWithCustomChannelTypes"></a>
# **muteInChannelsWithCustomChannelTypes**
> muteInChannelsWithCustomChannelTypes(userId, apiToken, muteInChannelsWithCustomChannelTypesData)

Mute in channels with custom channel types

## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData = new MuteInChannelsWithCustomChannelTypesData(); // MuteInChannelsWithCustomChannelTypesData | 
    try {
      apiInstance.muteInChannelsWithCustomChannelTypes(userId, apiToken, muteInChannelsWithCustomChannelTypesData);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#muteInChannelsWithCustomChannelTypes");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **muteInChannelsWithCustomChannelTypesData** | [**MuteInChannelsWithCustomChannelTypesData**](MuteInChannelsWithCustomChannelTypesData.md)|  | [optional]

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

<a name="registerAsOperatorToChannelsWithCustomChannelTypes"></a>
# **registerAsOperatorToChannelsWithCustomChannelTypes**
> registerAsOperatorToChannelsWithCustomChannelTypes(userId, apiToken, registerAsOperatorToChannelsWithCustomChannelTypesData)

Register as an operator to channels with custom channel types

## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData = new RegisterAsOperatorToChannelsWithCustomChannelTypesData(); // RegisterAsOperatorToChannelsWithCustomChannelTypesData | 
    try {
      apiInstance.registerAsOperatorToChannelsWithCustomChannelTypes(userId, apiToken, registerAsOperatorToChannelsWithCustomChannelTypesData);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#registerAsOperatorToChannelsWithCustomChannelTypes");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **registerAsOperatorToChannelsWithCustomChannelTypesData** | [**RegisterAsOperatorToChannelsWithCustomChannelTypesData**](RegisterAsOperatorToChannelsWithCustomChannelTypesData.md)|  | [optional]

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

<a name="removeRegistrationOrDeviceToken"></a>
# **removeRegistrationOrDeviceToken**
> InlineResponse20026 removeRegistrationOrDeviceToken(userId, apiToken)

Remove a registration or device token - When unregistering all device tokens

## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20026 result = apiInstance.removeRegistrationOrDeviceToken(userId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceToken");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeRegistrationOrDeviceTokenByToken"></a>
# **removeRegistrationOrDeviceTokenByToken**
> InlineResponse20026 removeRegistrationOrDeviceTokenByToken(userId, tokenType, token, apiToken)

Remove a registration or device token - When unregistering a specific token

## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20026 result = apiInstance.removeRegistrationOrDeviceTokenByToken(userId, tokenType, token, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceTokenByToken");
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
 **userId** | **String**|  |
 **tokenType** | **String**|  |
 **token** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeRegistrationOrDeviceTokenFromOwnerByToken"></a>
# **removeRegistrationOrDeviceTokenFromOwnerByToken**
> InlineResponse20027 removeRegistrationOrDeviceTokenFromOwnerByToken(tokenType, token, apiToken)

Remove a registration or device token from an owner

## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20027 result = apiInstance.removeRegistrationOrDeviceTokenFromOwnerByToken(tokenType, token, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceTokenFromOwnerByToken");
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
 **tokenType** | **String**|  |
 **token** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="resetPushPreferences"></a>
# **resetPushPreferences**
> resetPushPreferences(userId, apiToken)

Reset push preferences

## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.resetPushPreferences(userId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#resetPushPreferences");
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
 **userId** | **String**|  |
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

<a name="unblockUserById"></a>
# **unblockUserById**
> unblockUserById(userId, targetId, apiToken)

Unblock a user

## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String targetId = "targetId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.unblockUserById(userId, targetId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unblockUserById");
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
 **userId** | **String**|  |
 **targetId** | **String**|  |
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

<a name="updateChannelInvitationPreference"></a>
# **updateChannelInvitationPreference**
> InlineResponse2005 updateChannelInvitationPreference(userId, apiToken, updateChannelInvitationPreferenceData)

Update channel invitation preference

## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData = new UpdateChannelInvitationPreferenceData(); // UpdateChannelInvitationPreferenceData | 
    try {
      InlineResponse2005 result = apiInstance.updateChannelInvitationPreference(userId, apiToken, updateChannelInvitationPreferenceData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateChannelInvitationPreference");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateChannelInvitationPreferenceData** | [**UpdateChannelInvitationPreferenceData**](UpdateChannelInvitationPreferenceData.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateCountPreferenceOfChannelByUrl"></a>
# **updateCountPreferenceOfChannelByUrl**
> InlineResponse20021 updateCountPreferenceOfChannelByUrl(userId, channelUrl, apiToken, updateCountPreferenceOfChannelByUrlData)

Update count preference of a channel

## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData = new UpdateCountPreferenceOfChannelByUrlData(); // UpdateCountPreferenceOfChannelByUrlData | 
    try {
      InlineResponse20021 result = apiInstance.updateCountPreferenceOfChannelByUrl(userId, channelUrl, apiToken, updateCountPreferenceOfChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateCountPreferenceOfChannelByUrl");
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
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateCountPreferenceOfChannelByUrlData** | [**UpdateCountPreferenceOfChannelByUrlData**](UpdateCountPreferenceOfChannelByUrlData.md)|  | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updatePushPreferences"></a>
# **updatePushPreferences**
> InlineResponse20028 updatePushPreferences(userId, apiToken, updatePushPreferencesData)

Update push preferences

## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdatePushPreferencesData updatePushPreferencesData = new UpdatePushPreferencesData(); // UpdatePushPreferencesData | 
    try {
      InlineResponse20028 result = apiInstance.updatePushPreferences(userId, apiToken, updatePushPreferencesData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updatePushPreferences");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updatePushPreferencesData** | [**UpdatePushPreferencesData**](UpdatePushPreferencesData.md)|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updatePushPreferencesForChannelByUrl"></a>
# **updatePushPreferencesForChannelByUrl**
> InlineResponse20028 updatePushPreferencesForChannelByUrl(userId, channelUrl, apiToken, updatePushPreferencesForChannelByUrlData)

Update push preferences for a channel

## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData = new UpdatePushPreferencesForChannelByUrlData(); // UpdatePushPreferencesForChannelByUrlData | 
    try {
      InlineResponse20028 result = apiInstance.updatePushPreferencesForChannelByUrl(userId, channelUrl, apiToken, updatePushPreferencesForChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updatePushPreferencesForChannelByUrl");
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
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updatePushPreferencesForChannelByUrlData** | [**UpdatePushPreferencesForChannelByUrlData**](UpdatePushPreferencesForChannelByUrlData.md)|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateUserById"></a>
# **updateUserById**
> SendBirdUser updateUserById(userId, apiToken, updateUserByIdData)

Update a user

## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateUserByIdData updateUserByIdData = new UpdateUserByIdData(); // UpdateUserByIdData | 
    try {
      SendBirdUser result = apiInstance.updateUserById(userId, apiToken, updateUserByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserById");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateUserByIdData** | [**UpdateUserByIdData**](UpdateUserByIdData.md)|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewChannelInvitationPreference"></a>
# **viewChannelInvitationPreference**
> InlineResponse2005 viewChannelInvitationPreference(userId, apiToken)

View channel invitation preference

## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse2005 result = apiInstance.viewChannelInvitationPreference(userId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewChannelInvitationPreference");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewCountPreferenceOfChannelByUrl"></a>
# **viewCountPreferenceOfChannelByUrl**
> InlineResponse20021 viewCountPreferenceOfChannelByUrl(userId, channelUrl, apiToken)

View count preference of a channel

## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20021 result = apiInstance.viewCountPreferenceOfChannelByUrl(userId, channelUrl, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewCountPreferenceOfChannelByUrl");
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
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfChannelsByJoinStatus"></a>
# **viewNumberOfChannelsByJoinStatus**
> InlineResponse20020 viewNumberOfChannelsByJoinStatus(userId, apiToken, state)

View number of channels by join status

## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String state = "state_example"; // String | 
    try {
      InlineResponse20020 result = apiInstance.viewNumberOfChannelsByJoinStatus(userId, apiToken, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfChannelsByJoinStatus");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **state** | **String**|  | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfChannelsWithUnreadMessages"></a>
# **viewNumberOfChannelsWithUnreadMessages**
> InlineResponse20018 viewNumberOfChannelsWithUnreadMessages(userId, apiToken, customTypes, superMode)

View number of channels with unread messages

## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    List<String> customTypes = Arrays.asList(); // List<String> | 
    String superMode = "superMode_example"; // String | 
    try {
      InlineResponse20018 result = apiInstance.viewNumberOfChannelsWithUnreadMessages(userId, apiToken, customTypes, superMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfChannelsWithUnreadMessages");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **customTypes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **superMode** | **String**|  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfUnreadItems"></a>
# **viewNumberOfUnreadItems**
> InlineResponse20019 viewNumberOfUnreadItems(userId, apiToken, customType, itemKeys)

View number of unread items

## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String customType = "customType_example"; // String | 
    String itemKeys = "itemKeys_example"; // String | 
    try {
      InlineResponse20019 result = apiInstance.viewNumberOfUnreadItems(userId, apiToken, customType, itemKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfUnreadItems");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **customType** | **String**|  | [optional]
 **itemKeys** | **String**|  | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfUnreadMessages"></a>
# **viewNumberOfUnreadMessages**
> InlineResponse20018 viewNumberOfUnreadMessages(userId, apiToken, customTypes, superMode)

View number of unread messages

## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String customTypes = "customTypes_example"; // String | 
    String superMode = "superMode_example"; // String | 
    try {
      InlineResponse20018 result = apiInstance.viewNumberOfUnreadMessages(userId, apiToken, customTypes, superMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfUnreadMessages");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewPushPreferences"></a>
# **viewPushPreferences**
> InlineResponse20028 viewPushPreferences(userId, apiToken)

View push preferences

## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20028 result = apiInstance.viewPushPreferences(userId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewPushPreferences");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewPushPreferencesForChannelByUrl"></a>
# **viewPushPreferencesForChannelByUrl**
> InlineResponse20028 viewPushPreferencesForChannelByUrl(userId, channelUrl, apiToken)

View push preferences for a channel

## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20028 result = apiInstance.viewPushPreferencesForChannelByUrl(userId, channelUrl, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewPushPreferencesForChannelByUrl");
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
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewUserById"></a>
# **viewUserById**
> SendBirdUser viewUserById(userId, apiToken, includeUnreadCount, customTypes, superMode)

View a user

## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Boolean includeUnreadCount = true; // Boolean | 
    String customTypes = "customTypes_example"; // String | 
    String superMode = "superMode_example"; // String | 
    try {
      SendBirdUser result = apiInstance.viewUserById(userId, apiToken, includeUnreadCount, customTypes, superMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewUserById");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **includeUnreadCount** | **Boolean**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewWhoOwnsRegistrationOrDeviceTokenByToken"></a>
# **viewWhoOwnsRegistrationOrDeviceTokenByToken**
> InlineResponse20027 viewWhoOwnsRegistrationOrDeviceTokenByToken(tokenType, token, apiToken)

View who owns a registration or device token

## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20027 result = apiInstance.viewWhoOwnsRegistrationOrDeviceTokenByToken(tokenType, token, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewWhoOwnsRegistrationOrDeviceTokenByToken");
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
 **tokenType** | **String**|  |
 **token** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

