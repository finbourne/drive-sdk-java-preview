# FilesApi

All URIs are relative to *https://www.lusid.com/drive*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /api/files | [BETA] CreateFile: Uploads a file to Lusid Drive. If using an SDK, consider using the UploadAsStreamAsync function for larger files instead.
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /api/files/{id} | [BETA] DeleteFile: Deletes a file from Drive.
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /api/files/{id}/contents | [BETA] DownloadFile: Download the file from Drive.
[**getFile**](FilesApi.md#getFile) | **GET** /api/files/{id} | [BETA] GetFile: Get a file stored in Drive.
[**updateFileContents**](FilesApi.md#updateFileContents) | **PUT** /api/files/{id}/contents | [BETA] UpdateFileContents: Updates contents of a file in Drive.
[**updateFileMetadata**](FilesApi.md#updateFileMetadata) | **PUT** /api/files/{id} | [BETA] UpdateFileMetadata: Updates metadata for a file in Drive.


<a name="createFile"></a>
# **createFile**
> StorageObject createFile(xLusidDriveFilename, xLusidDrivePath, contentLength, body)

[BETA] CreateFile: Uploads a file to Lusid Drive. If using an SDK, consider using the UploadAsStreamAsync function for larger files instead.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String xLusidDriveFilename = "xLusidDriveFilename_example"; // String | File name.
    String xLusidDrivePath = "xLusidDrivePath_example"; // String | File path.
    Integer contentLength = 56; // Integer | The size in bytes of the file to be uploaded
    byte[] body = null; // byte[] | 
    try {
      StorageObject result = apiInstance.createFile(xLusidDriveFilename, xLusidDrivePath, contentLength, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createFile");
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
 **xLusidDriveFilename** | **String**| File name. |
 **xLusidDrivePath** | **String**| File path. |
 **contentLength** | **Integer**| The size in bytes of the file to be uploaded |
 **body** | **byte[]**|  |

### Return type

[**StorageObject**](StorageObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(id)

[BETA] DeleteFile: Deletes a file from Drive.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | Identifier of the file to be deleted.
    try {
      apiInstance.deleteFile(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
 **id** | **String**| Identifier of the file to be deleted. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(id)

[BETA] DownloadFile: Download the file from Drive.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | Identifier of the file to be downloaded.
    try {
      File result = apiInstance.downloadFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFile");
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
 **id** | **String**| Identifier of the file to be downloaded. |

### Return type

[**File**](File.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**410** | Malware detected, restricted from downloading file. |  -  |
**423** | Virus scan in progress, restricted from downloading file. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getFile"></a>
# **getFile**
> StorageObject getFile(id)

[BETA] GetFile: Get a file stored in Drive.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | Identifier of the file to be retrieved.
    try {
      StorageObject result = apiInstance.getFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFile");
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
 **id** | **String**| Identifier of the file to be retrieved. |

### Return type

[**StorageObject**](StorageObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateFileContents"></a>
# **updateFileContents**
> StorageObject updateFileContents(id, contentLength, body)

[BETA] UpdateFileContents: Updates contents of a file in Drive.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | The unique file identifier
    Integer contentLength = 56; // Integer | The size in bytes of the file to be uploaded
    byte[] body = null; // byte[] | 
    try {
      StorageObject result = apiInstance.updateFileContents(id, contentLength, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateFileContents");
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
 **id** | **String**| The unique file identifier |
 **contentLength** | **Integer**| The size in bytes of the file to be uploaded |
 **body** | **byte[]**|  |

### Return type

[**StorageObject**](StorageObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateFileMetadata"></a>
# **updateFileMetadata**
> StorageObject updateFileMetadata(id, updateFile)

[BETA] UpdateFileMetadata: Updates metadata for a file in Drive.

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | Identifier of the file to be updated
    UpdateFile updateFile = new UpdateFile(); // UpdateFile | Update to be applied to file
    try {
      StorageObject result = apiInstance.updateFileMetadata(id, updateFile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateFileMetadata");
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
 **id** | **String**| Identifier of the file to be updated |
 **updateFile** | [**UpdateFile**](UpdateFile.md)| Update to be applied to file |

### Return type

[**StorageObject**](StorageObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

