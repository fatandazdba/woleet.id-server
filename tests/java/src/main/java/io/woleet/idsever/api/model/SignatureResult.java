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
import java.io.IOException;

/**
 * SignatureResult
 */

public class SignatureResult {
  public static final String SERIALIZED_NAME_PUB_KEY = "pubKey";
  @SerializedName(SERIALIZED_NAME_PUB_KEY)
  private String pubKey = null;

  public static final String SERIALIZED_NAME_SIGNED_HASH = "signedHash";
  @SerializedName(SERIALIZED_NAME_SIGNED_HASH)
  private String signedHash = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_IDENTITY_U_R_L = "identityURL";
  @SerializedName(SERIALIZED_NAME_IDENTITY_U_R_L)
  private String identityURL = null;

  public SignatureResult pubKey(String pubKey) {
    this.pubKey = pubKey;
    return this;
  }

   /**
   * The public key used to sign (must be the same as the &#x60;pubKey&#x60; parameter, if provided).
   * @return pubKey
  **/
  @ApiModelProperty(example = "1KjQ8LgUgYVSqeK7JFhA9W8FVsHCzFrFi8", value = "The public key used to sign (must be the same as the `pubKey` parameter, if provided).")
  public String getPubKey() {
    return pubKey;
  }

  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }

  public SignatureResult signedHash(String signedHash) {
    this.signedHash = signedHash;
    return this;
  }

   /**
   * The hash that is signed (same as the &#x60;hashToSign&#x60; parameter).
   * @return signedHash
  **/
  @ApiModelProperty(example = "01ba4719c80b6fe911b091a7c05124b64eeece964e09c058ef8f9805daca546b", value = "The hash that is signed (same as the `hashToSign` parameter).")
  public String getSignedHash() {
    return signedHash;
  }

  public void setSignedHash(String signedHash) {
    this.signedHash = signedHash;
  }

  public SignatureResult signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The signature of &#x60;hashToSign&#x60; using the public key &#x60;pubKey&#x60;.
   * @return signature
  **/
  @ApiModelProperty(example = "IKnOvW2/BQqahssC2l9Icz7qiJQqesgu0HCKvW/L5xZLaMCLyg19ATDNJojMILdUijFOqiRzgk6ieDXi89DeB0Q=", value = "The signature of `hashToSign` using the public key `pubKey`.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public SignatureResult identityURL(String identityURL) {
    this.identityURL = identityURL;
    return this;
  }

   /**
   * The public URL of the &#x60;/identity&#x60; endpoint (ie. a URL that anyone can use to prove and verify the identity associated with the public key).
   * @return identityURL
  **/
  @ApiModelProperty(example = "https://woleetidserver.acme.com/v1/identity", value = "The public URL of the `/identity` endpoint (ie. a URL that anyone can use to prove and verify the identity associated with the public key).")
  public String getIdentityURL() {
    return identityURL;
  }

  public void setIdentityURL(String identityURL) {
    this.identityURL = identityURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureResult signatureResult = (SignatureResult) o;
    return Objects.equals(this.pubKey, signatureResult.pubKey) &&
        Objects.equals(this.signedHash, signatureResult.signedHash) &&
        Objects.equals(this.signature, signatureResult.signature) &&
        Objects.equals(this.identityURL, signatureResult.identityURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubKey, signedHash, signature, identityURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureResult {\n");
    
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
    sb.append("    signedHash: ").append(toIndentedString(signedHash)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    identityURL: ").append(toIndentedString(identityURL)).append("\n");
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

