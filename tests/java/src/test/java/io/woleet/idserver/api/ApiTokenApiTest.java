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


package io.woleet.idserver.api;

import io.woleet.idserver.ApiException;
import io.woleet.idsever.api.model.APIToken;
import io.woleet.idsever.api.model.APITokenArray;
import io.woleet.idsever.api.model.APITokenBase;
import io.woleet.idsever.api.model.APITokenPost;
import io.woleet.idsever.api.model.APITokenPut;
import io.woleet.idsever.api.model.ApiError;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiTokenApi
 */
@Ignore
public class ApiTokenApiTest {

    private final ApiTokenApi api = new ApiTokenApi();

    
    /**
     * Create an API token suitable to call the /sign endpoint.
     *
     * This can only be done by an admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAPITokenTest() throws ApiException {
        APITokenPost apITokenPost = null;
        APIToken response = api.createAPIToken(apITokenPost);

        // TODO: test validations
    }
    
    /**
     * Delete an API token.
     *
     * This can only be done by an admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPITokenTest() throws ApiException {
        UUID apITokenId = null;
        APIToken response = api.deleteAPIToken(apITokenId);

        // TODO: test validations
    }
    
    /**
     * Get an API token by its identifier.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPITokenByIdTest() throws ApiException {
        UUID apITokenId = null;
        APIToken response = api.getAPITokenById(apITokenId);

        // TODO: test validations
    }
    
    /**
     * List all API tokens.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAPITokensTest() throws ApiException {
        Boolean full = null;
        APITokenArray response = api.getAllAPITokens(full);

        // TODO: test validations
    }
    
    /**
     * Update an API token.
     *
     * This can only be done by an admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAPITokenTest() throws ApiException {
        UUID apITokenId = null;
        APITokenPut apITokenPut = null;
        APIToken response = api.updateAPIToken(apITokenId, apITokenPut);

        // TODO: test validations
    }
    
}
