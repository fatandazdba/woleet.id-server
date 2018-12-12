/*
 * Woleet.ID Server
 * This is Woleet.ID Server API documentation.
 *
 * OpenAPI spec version: 1.0.4
 * Contact: contact@woleet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.woleet.idserver.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.woleet.idserver.api.model.FullIdentity;
import io.woleet.idserver.api.model.UserRoleEnum;
import io.woleet.idserver.api.model.UserStatusEnum;
import java.io.IOException;
import java.util.UUID;

/**
 * UserBase
 */

public class UserBase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatusEnum status = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private UserRoleEnum role = null;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private FullIdentity identity = null;

  public static final String SERIALIZED_NAME_DEFAULT_KEY_ID = "defaultKeyId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_KEY_ID)
  private UUID defaultKeyId;

   /**
   * User identifier (allocated by the server).
   * @return id
  **/
  @ApiModelProperty(example = "7c42e7e9-aec5-4d56-9a3b-bd55e129aae3", value = "User identifier (allocated by the server).")
  public UUID getId() {
    return id;
  }

  public UserBase email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email (can be used for login).
   * @return email
  **/
  @ApiModelProperty(example = "john.doe@acme.com", value = "User email (can be used for login).")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBase username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name (can be used for login).
   * @return username
  **/
  @ApiModelProperty(example = "johndoe", value = "User name (can be used for login).")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserBase status(UserStatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public UserStatusEnum getStatus() {
    return status;
  }

  public void setStatus(UserStatusEnum status) {
    this.status = status;
  }

  public UserBase role(UserRoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public UserRoleEnum getRole() {
    return role;
  }

  public void setRole(UserRoleEnum role) {
    this.role = role;
  }

  public UserBase identity(FullIdentity identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(value = "")
  public FullIdentity getIdentity() {
    return identity;
  }

  public void setIdentity(FullIdentity identity) {
    this.identity = identity;
  }

  public UserBase defaultKeyId(UUID defaultKeyId) {
    this.defaultKeyId = defaultKeyId;
    return this;
  }

   /**
   * Identifier of the default key to use for this user.
   * @return defaultKeyId
  **/
  @ApiModelProperty(example = "c7c6e0de-2acb-4311-80b4-17dbf0b76806", value = "Identifier of the default key to use for this user.")
  public UUID getDefaultKeyId() {
    return defaultKeyId;
  }

  public void setDefaultKeyId(UUID defaultKeyId) {
    this.defaultKeyId = defaultKeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBase userBase = (UserBase) o;
    return Objects.equals(this.id, userBase.id) &&
        Objects.equals(this.email, userBase.email) &&
        Objects.equals(this.username, userBase.username) &&
        Objects.equals(this.status, userBase.status) &&
        Objects.equals(this.role, userBase.role) &&
        Objects.equals(this.identity, userBase.identity) &&
        Objects.equals(this.defaultKeyId, userBase.defaultKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, username, status, role, identity, defaultKeyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    defaultKeyId: ").append(toIndentedString(defaultKeyId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

