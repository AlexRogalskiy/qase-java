/*
 * Qase.io API
 * # Introduction  You can use our API to access [Qase.io](https://qase.io) API endpoints, which allows to retrieve information about entities stored in database and perform actions with them. The API is organized around [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer).  # API Rate limits  Your application can make up to 200 API requests per minute.  Once the limit is exceeded, clients receive an HTTP 429 with a Retry-After: X header to indicate how long their timeout period is before they will be able to send requests again. The timeout period is set to 60 seconds once the limit is exceeded.  # Authentication  To authorize, use this code:  ```shell # With shell, you can just pass the correct header with each request curl \"https://api.qase.io/v1/api_endpoint\"   -H \"Token: api_token\"   -H \"Content-Type: application/json\" ```  Make sure to replace `api_token` with your API key.  Qase.io uses API tokens to authenticate requests. You can view an manage your API keys in [API tokens pages](https://app.qase.io/user/api/token).  Your API keys has the same access rights as your role in the app, so be sure to keep them secure! Do not share your secret API keys in publicly accessible areas such as GitHub, client-side code, and so forth.  Qase API expects for the API key to be included in all API requests to the server in a header that looks like the following:  `Token: api_token`  You must replace `api_token` with your personal API key.  All API requests must be made over [HTTPS](http://en.wikipedia.org/wiki/HTTP_Secure). Calls made over plain HTTP will fail. API requests without authentication will also fail.  # Access rights  Qase.io is using Role-based Access Control system to restrict some features usage in Web interface and the same rules are applied to API methods. In description for each method you will find a rule name, that is required to perform an action through API. If you don't have enough access rights, you will receive an error with `403` status code.  # Errors  Qase API uses the following error codes:  Code | Meaning ---------- | ------- 400 | Bad Request - Your request is invalid. 401 | Unauthorized - Your API key is wrong. 403 | Forbidden - Your role doesn't have enough permissions to perform this action 404 | Not Found - The resource could not be found. 405 | Method Not Allowed - You tried to access a resource with an invalid method. 406 | Not Acceptable - You requested a format that isn't json. 410 | Gone - The resource requested has been removed from our servers. 429 | Too Many Requests - You're performing too many requests! Slow down! 500 | Internal Server Error - We had a problem with our server. Try again later. 503 | Service Unavailable - We're temporarily offline for maintenance. Please try again later. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@qase.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.api.inner.FilterHelper;
import io.qase.client.*;
import io.qase.client.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MilestonesApi {
    private ApiClient localVarApiClient;

    public MilestonesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MilestonesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createMilestone
     * @param code Code of project, where to search entities. (required)
     * @param milestoneCreate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMilestoneCall(String code, MilestoneCreate milestoneCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = milestoneCreate;

        // create path and map variables
        String localVarPath = "/milestone/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createMilestoneValidateBeforeCall(String code, MilestoneCreate milestoneCreate, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling createMilestone(Async)");
        }
        
        // verify the required parameter 'milestoneCreate' is set
        if (milestoneCreate == null) {
            throw new QaseException("Missing the required parameter 'milestoneCreate' when calling createMilestone(Async)");
        }
        

        okhttp3.Call localVarCall = createMilestoneCall(code, milestoneCreate, _callback);
        return localVarCall;

    }

    /**
     * Create a new milestone.
     * This method allows to create a milestone in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param milestoneCreate  (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse createMilestone(String code, MilestoneCreate milestoneCreate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createMilestoneWithHttpInfo(code, milestoneCreate);
        return localVarResp.getData();
    }

    /**
     * Create a new milestone.
     * This method allows to create a milestone in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param milestoneCreate  (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> createMilestoneWithHttpInfo(String code, MilestoneCreate milestoneCreate) throws QaseException {
        okhttp3.Call localVarCall = createMilestoneValidateBeforeCall(code, milestoneCreate, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new milestone. (asynchronously)
     * This method allows to create a milestone in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param milestoneCreate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMilestoneAsync(String code, MilestoneCreate milestoneCreate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createMilestoneValidateBeforeCall(code, milestoneCreate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteMilestone
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMilestoneCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/milestone/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteMilestoneValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deleteMilestone(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deleteMilestone(Async)");
        }
        

        okhttp3.Call localVarCall = deleteMilestoneCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Delete milestone.
     * This method completely deletes a milestone from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse deleteMilestone(String code, Integer id) throws QaseException {
        ApiResponse<IdResponse> localVarResp = deleteMilestoneWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Delete milestone.
     * This method completely deletes a milestone from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> deleteMilestoneWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = deleteMilestoneValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete milestone. (asynchronously)
     * This method completely deletes a milestone from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMilestoneAsync(String code, Integer id, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteMilestoneValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMilestone
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Milestone. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMilestoneCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/milestone/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMilestoneValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getMilestone(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getMilestone(Async)");
        }
        

        okhttp3.Call localVarCall = getMilestoneCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Get a specific milestone.
     * This method allows to retrieve a specific milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return MilestoneResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Milestone. </td><td>  -  </td></tr>
     </table>
     */
    public MilestoneResponse getMilestone(String code, Integer id) throws QaseException {
        ApiResponse<MilestoneResponse> localVarResp = getMilestoneWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Get a specific milestone.
     * This method allows to retrieve a specific milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return ApiResponse&lt;MilestoneResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Milestone. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MilestoneResponse> getMilestoneWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = getMilestoneValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<MilestoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific milestone. (asynchronously)
     * This method allows to retrieve a specific milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Milestone. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMilestoneAsync(String code, Integer id, final ApiCallback<MilestoneResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getMilestoneValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<MilestoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMilestones
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all milestones. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMilestonesCall(String code, Integer limit, Integer offset, Filters3 filters, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/milestone/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (filters != null) {
            localVarQueryParams.addAll(FilterHelper.getFilterPairs(filters));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMilestonesValidateBeforeCall(String code, Integer limit, Integer offset, Filters3 filters, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getMilestones(Async)");
        }
        

        okhttp3.Call localVarCall = getMilestonesCall(code, limit, offset, filters, _callback);
        return localVarCall;

    }

    /**
     * Get all milestones.
     * This method allows to retrieve all milestones stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @return MilestoneListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all milestones. </td><td>  -  </td></tr>
     </table>
     */
    public MilestoneListResponse getMilestones(String code, Integer limit, Integer offset, Filters3 filters) throws QaseException {
        ApiResponse<MilestoneListResponse> localVarResp = getMilestonesWithHttpInfo(code, limit, offset, filters);
        return localVarResp.getData();
    }

    /**
     * Get all milestones.
     * This method allows to retrieve all milestones stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @return ApiResponse&lt;MilestoneListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all milestones. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MilestoneListResponse> getMilestonesWithHttpInfo(String code, Integer limit, Integer offset, Filters3 filters) throws QaseException {
        okhttp3.Call localVarCall = getMilestonesValidateBeforeCall(code, limit, offset, filters, null);
        Type localVarReturnType = new TypeToken<MilestoneListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all milestones. (asynchronously)
     * This method allows to retrieve all milestones stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all milestones. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMilestonesAsync(String code, Integer limit, Integer offset, Filters3 filters, final ApiCallback<MilestoneListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getMilestonesValidateBeforeCall(code, limit, offset, filters, _callback);
        Type localVarReturnType = new TypeToken<MilestoneListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMilestone
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param milestoneUpdate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMilestoneCall(String code, Integer id, MilestoneUpdate milestoneUpdate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = milestoneUpdate;

        // create path and map variables
        String localVarPath = "/milestone/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateMilestoneValidateBeforeCall(String code, Integer id, MilestoneUpdate milestoneUpdate, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling updateMilestone(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updateMilestone(Async)");
        }
        
        // verify the required parameter 'milestoneUpdate' is set
        if (milestoneUpdate == null) {
            throw new QaseException("Missing the required parameter 'milestoneUpdate' when calling updateMilestone(Async)");
        }
        

        okhttp3.Call localVarCall = updateMilestoneCall(code, id, milestoneUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update milestone.
     * This method updates a milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param milestoneUpdate  (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse updateMilestone(String code, Integer id, MilestoneUpdate milestoneUpdate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = updateMilestoneWithHttpInfo(code, id, milestoneUpdate);
        return localVarResp.getData();
    }

    /**
     * Update milestone.
     * This method updates a milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param milestoneUpdate  (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> updateMilestoneWithHttpInfo(String code, Integer id, MilestoneUpdate milestoneUpdate) throws QaseException {
        okhttp3.Call localVarCall = updateMilestoneValidateBeforeCall(code, id, milestoneUpdate, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update milestone. (asynchronously)
     * This method updates a milestone. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param milestoneUpdate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMilestoneAsync(String code, Integer id, MilestoneUpdate milestoneUpdate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = updateMilestoneValidateBeforeCall(code, id, milestoneUpdate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
