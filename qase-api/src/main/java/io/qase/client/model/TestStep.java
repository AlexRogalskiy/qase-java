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


package io.qase.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TestStep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T23:17:33.666847+03:00[Europe/Moscow]")
public class TestStep {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_SHARED_STEP_HASH = "shared_step_hash";
  @SerializedName(SERIALIZED_NAME_SHARED_STEP_HASH)
  private String sharedStepHash;

  public static final String SERIALIZED_NAME_SHARED_STEP_NESTED_HASH = "shared_step_nested_hash";
  @SerializedName(SERIALIZED_NAME_SHARED_STEP_NESTED_HASH)
  private String sharedStepNestedHash;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EXPECTED_RESULT = "expected_result";
  @SerializedName(SERIALIZED_NAME_EXPECTED_RESULT)
  private String expectedResult;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;


  public TestStep hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public TestStep sharedStepHash(String sharedStepHash) {
    
    this.sharedStepHash = sharedStepHash;
    return this;
  }

   /**
   * Get sharedStepHash
   * @return sharedStepHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSharedStepHash() {
    return sharedStepHash;
  }


  public void setSharedStepHash(String sharedStepHash) {
    this.sharedStepHash = sharedStepHash;
  }


  public TestStep sharedStepNestedHash(String sharedStepNestedHash) {
    
    this.sharedStepNestedHash = sharedStepNestedHash;
    return this;
  }

   /**
   * Get sharedStepNestedHash
   * @return sharedStepNestedHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSharedStepNestedHash() {
    return sharedStepNestedHash;
  }


  public void setSharedStepNestedHash(String sharedStepNestedHash) {
    this.sharedStepNestedHash = sharedStepNestedHash;
  }


  public TestStep position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public TestStep action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public TestStep expectedResult(String expectedResult) {
    
    this.expectedResult = expectedResult;
    return this;
  }

   /**
   * Get expectedResult
   * @return expectedResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpectedResult() {
    return expectedResult;
  }


  public void setExpectedResult(String expectedResult) {
    this.expectedResult = expectedResult;
  }


  public TestStep data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public TestStep attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestStep addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestStep testStep = (TestStep) o;
    return Objects.equals(this.hash, testStep.hash) &&
        Objects.equals(this.sharedStepHash, testStep.sharedStepHash) &&
        Objects.equals(this.sharedStepNestedHash, testStep.sharedStepNestedHash) &&
        Objects.equals(this.position, testStep.position) &&
        Objects.equals(this.action, testStep.action) &&
        Objects.equals(this.expectedResult, testStep.expectedResult) &&
        Objects.equals(this.data, testStep.data) &&
        Objects.equals(this.attachments, testStep.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, sharedStepHash, sharedStepNestedHash, position, action, expectedResult, data, attachments);
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
    sb.append("class TestStep {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    sharedStepHash: ").append(toIndentedString(sharedStepHash)).append("\n");
    sb.append("    sharedStepNestedHash: ").append(toIndentedString(sharedStepNestedHash)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

