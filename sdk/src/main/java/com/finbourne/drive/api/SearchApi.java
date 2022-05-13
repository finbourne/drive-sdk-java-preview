/*
 * FINBOURNE Drive API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.355
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.drive.api;

import com.finbourne.drive.ApiCallback;
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.ApiResponse;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.Pair;
import com.finbourne.drive.ProgressRequestBody;
import com.finbourne.drive.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.drive.model.LusidProblemDetails;
import com.finbourne.drive.model.LusidValidationProblemDetails;
import com.finbourne.drive.model.PagedResourceListOfStorageObject;
import com.finbourne.drive.model.SearchBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;
    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for search
     * @param searchBody Search parameters (required)
     * @param page  (optional)
     * @param sortBy  (optional)
     * @param limit  (optional)
     * @param filter  (optional, default to )
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchCall(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = searchBody;

        // create path and map variables
        String localVarPath = "/api/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.1.355");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchValidateBeforeCall(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'searchBody' is set
        if (searchBody == null) {
            throw new ApiException("Missing the required parameter 'searchBody' when calling search(Async)");
        }
        

        okhttp3.Call localVarCall = searchCall(searchBody, page, sortBy, limit, filter, _callback);
        return localVarCall;

    }

    /**
     * [BETA] Search: Search for a file or folder with a given name and path
     * 
     * @param searchBody Search parameters (required)
     * @param page  (optional)
     * @param sortBy  (optional)
     * @param limit  (optional)
     * @param filter  (optional, default to )
     * @return PagedResourceListOfStorageObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfStorageObject search(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter) throws ApiException {
        ApiResponse<PagedResourceListOfStorageObject> localVarResp = searchWithHttpInfo(searchBody, page, sortBy, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [BETA] Search: Search for a file or folder with a given name and path
     * 
     * @param searchBody Search parameters (required)
     * @param page  (optional)
     * @param sortBy  (optional)
     * @param limit  (optional)
     * @param filter  (optional, default to )
     * @return ApiResponse&lt;PagedResourceListOfStorageObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfStorageObject> searchWithHttpInfo(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [BETA] Search: Search for a file or folder with a given name and path (asynchronously)
     * 
     * @param searchBody Search parameters (required)
     * @param page  (optional)
     * @param sortBy  (optional)
     * @param limit  (optional)
     * @param filter  (optional, default to )
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchAsync(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback<PagedResourceListOfStorageObject> _callback) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
