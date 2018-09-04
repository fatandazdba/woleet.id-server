/*
 * Woleet.ID Server
 * This is Woleet.ID Server API documentation.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@woleet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.woleet.idsever.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.woleet.idsever.api.model.Identity;
import java.io.IOException;

/**
 * IdentityResult
 */

public class IdentityResult {
  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity = null;

  public IdentityResult identity(Identity identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(value = "")
  public Identity getIdentity() {
    return identity;
  }

  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityResult identityResult = (IdentityResult) o;
    return Objects.equals(this.identity, identityResult.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityResult {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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

