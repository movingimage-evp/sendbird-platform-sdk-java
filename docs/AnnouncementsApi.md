# AnnouncementsApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailedOpenRateOfAnnouncementById**](AnnouncementsApi.md#getDetailedOpenRateOfAnnouncementById) | **GET** /v3/announcement_open_rate/{unique_id} | Get detailed open rate of an announcement
[**getDetailedOpenRateOfAnnouncementGroup**](AnnouncementsApi.md#getDetailedOpenRateOfAnnouncementGroup) | **GET** /v3/announcement_open_rate_by_group/{announcement_group} | Get detailed open rate of an announcement group
[**getDetailedOpenStatusOfAnnouncementById**](AnnouncementsApi.md#getDetailedOpenStatusOfAnnouncementById) | **GET** /v3/announcement_open_status/{unique_id} | Get detailed open status of an announcement
[**getStatistics**](AnnouncementsApi.md#getStatistics) | **GET** /v3/announcement_stats/weekly | Get statistics - weekly
[**getStatisticsDaily**](AnnouncementsApi.md#getStatisticsDaily) | **GET** /v3/announcement_stats/daily | Get statistics - daily
[**getStatisticsMonthly**](AnnouncementsApi.md#getStatisticsMonthly) | **GET** /v3/announcement_stats/monthly | Get statistics - monthly
[**listAnnouncementGroups**](AnnouncementsApi.md#listAnnouncementGroups) | **GET** /v3/announcement_group | List announcement groups
[**listAnnouncements**](AnnouncementsApi.md#listAnnouncements) | **GET** /v3/announcements | List announcements
[**scheduleAnnouncement**](AnnouncementsApi.md#scheduleAnnouncement) | **POST** /v3/announcements | Schedule an announcement
[**updateAnnouncementById**](AnnouncementsApi.md#updateAnnouncementById) | **PUT** /v3/announcements/{unique_id} | Update an announcement
[**viewAnnouncementById**](AnnouncementsApi.md#viewAnnouncementById) | **GET** /v3/announcements/{unique_id} | View an announcement


<a name="getDetailedOpenRateOfAnnouncementById"></a>
# **getDetailedOpenRateOfAnnouncementById**
> InlineResponse20042 getDetailedOpenRateOfAnnouncementById(uniqueId, apiToken)

Get detailed open rate of an announcement

## Get detailed open rate of an announcement  Retrieves the detailed open rate information of an announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement ----------------------------   &#x60;unique_id&#x60;      Type: string      Description: Specifies the unique ID of the announcement to get its open rate.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String uniqueId = "uniqueId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20042 result = apiInstance.getDetailedOpenRateOfAnnouncementById(uniqueId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getDetailedOpenRateOfAnnouncementById");
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
 **uniqueId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getDetailedOpenRateOfAnnouncementGroup"></a>
# **getDetailedOpenRateOfAnnouncementGroup**
> InlineResponse20046 getDetailedOpenRateOfAnnouncementGroup(announcementGroup, apiToken)

Get detailed open rate of an announcement group

## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String announcementGroup = "announcementGroup_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20046 result = apiInstance.getDetailedOpenRateOfAnnouncementGroup(announcementGroup, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getDetailedOpenRateOfAnnouncementGroup");
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
 **announcementGroup** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getDetailedOpenStatusOfAnnouncementById"></a>
# **getDetailedOpenStatusOfAnnouncementById**
> InlineResponse20043 getDetailedOpenStatusOfAnnouncementById(uniqueId, apiToken, limit, next, uniqueIds, channelUrls, hasOpened)

Get detailed open status of an announcement

## Get detailed open status of an announcement  Retrieves the detailed open status information of a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String uniqueId = "uniqueId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Integer limit = 56; // Integer | 
    String next = "next_example"; // String | 
    List<String> uniqueIds = Arrays.asList(); // List<String> | 
    List<String> channelUrls = Arrays.asList(); // List<String> | 
    Boolean hasOpened = true; // Boolean | 
    try {
      InlineResponse20043 result = apiInstance.getDetailedOpenStatusOfAnnouncementById(uniqueId, apiToken, limit, next, uniqueIds, channelUrls, hasOpened);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getDetailedOpenStatusOfAnnouncementById");
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
 **uniqueId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **next** | **String**|  | [optional]
 **uniqueIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **channelUrls** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **hasOpened** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getStatistics"></a>
# **getStatistics**
> InlineResponse20044 getStatistics(apiToken)

Get statistics - weekly

## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20044 result = apiInstance.getStatistics(apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getStatistics");
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

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getStatisticsDaily"></a>
# **getStatisticsDaily**
> InlineResponse20044 getStatisticsDaily(startDate, endDate, startWeek, endWeek, startMonth, endMonth, apiToken, announcementGroup)

Get statistics - daily

## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String startDate = "startDate_example"; // String | 
    String endDate = "endDate_example"; // String | 
    String startWeek = "startWeek_example"; // String | 
    String endWeek = "endWeek_example"; // String | 
    String startMonth = "startMonth_example"; // String | 
    String endMonth = "endMonth_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String announcementGroup = "announcementGroup_example"; // String | 
    try {
      InlineResponse20044 result = apiInstance.getStatisticsDaily(startDate, endDate, startWeek, endWeek, startMonth, endMonth, apiToken, announcementGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getStatisticsDaily");
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
 **startDate** | **String**|  |
 **endDate** | **String**|  |
 **startWeek** | **String**|  |
 **endWeek** | **String**|  |
 **startMonth** | **String**|  |
 **endMonth** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **announcementGroup** | **String**|  | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getStatisticsMonthly"></a>
# **getStatisticsMonthly**
> InlineResponse20044 getStatisticsMonthly(apiToken)

Get statistics - monthly

## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20044 result = apiInstance.getStatisticsMonthly(apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#getStatisticsMonthly");
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

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listAnnouncementGroups"></a>
# **listAnnouncementGroups**
> InlineResponse20045 listAnnouncementGroups(apiToken, token, limit)

List announcement groups

## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20045 result = apiInstance.listAnnouncementGroups(apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#listAnnouncementGroups");
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

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listAnnouncements"></a>
# **listAnnouncements**
> InlineResponse20039 listAnnouncements(apiToken, token, limit, order, status, announcementGroup)

List announcements

## List announcements  Retrieves a list of announcements.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String order = "order_example"; // String | 
    String status = "status_example"; // String | 
    String announcementGroup = "announcementGroup_example"; // String | 
    try {
      InlineResponse20039 result = apiInstance.listAnnouncements(apiToken, token, limit, order, status, announcementGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#listAnnouncements");
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
 **order** | **String**|  | [optional]
 **status** | **String**|  | [optional]
 **announcementGroup** | **String**|  | [optional]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="scheduleAnnouncement"></a>
# **scheduleAnnouncement**
> InlineResponse20040 scheduleAnnouncement(apiToken, scheduleAnnouncementData)

Schedule an announcement

## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    ScheduleAnnouncementData scheduleAnnouncementData = new ScheduleAnnouncementData(); // ScheduleAnnouncementData | 
    try {
      InlineResponse20040 result = apiInstance.scheduleAnnouncement(apiToken, scheduleAnnouncementData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#scheduleAnnouncement");
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
 **scheduleAnnouncementData** | [**ScheduleAnnouncementData**](ScheduleAnnouncementData.md)|  | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateAnnouncementById"></a>
# **updateAnnouncementById**
> InlineResponse20041 updateAnnouncementById(uniqueId, apiToken, updateAnnouncementByIdData)

Update an announcement

## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String uniqueId = "uniqueId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateAnnouncementByIdData updateAnnouncementByIdData = new UpdateAnnouncementByIdData(); // UpdateAnnouncementByIdData | 
    try {
      InlineResponse20041 result = apiInstance.updateAnnouncementById(uniqueId, apiToken, updateAnnouncementByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#updateAnnouncementById");
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
 **uniqueId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateAnnouncementByIdData** | [**UpdateAnnouncementByIdData**](UpdateAnnouncementByIdData.md)|  | [optional]

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewAnnouncementById"></a>
# **viewAnnouncementById**
> InlineResponse20039Announcements viewAnnouncementById(uniqueId, apiToken)

View an announcement

## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementsApi apiInstance = new AnnouncementsApi(defaultClient);
    String uniqueId = "uniqueId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20039Announcements result = apiInstance.viewAnnouncementById(uniqueId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementsApi#viewAnnouncementById");
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
 **uniqueId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20039Announcements**](InlineResponse20039Announcements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

