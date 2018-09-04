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
import io.woleet.idsever.api.model.ApiError;
import java.util.UUID;
import io.woleet.idsever.api.model.UserArray;
import io.woleet.idsever.api.model.UserDetail;
import io.woleet.idsever.api.model.UserPost;
import io.woleet.idsever.api.model.UserPut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create a new user.
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserPost userPost = null;
        UserDetail response = api.createUser(userPost);

        // TODO: test validations
    }
    
    /**
     * Delete a user.
     *
     * This can only be done by an admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        UUID userId = null;
        UserDetail response = api.deleteUser(userId);

        // TODO: test validations
    }
    
    /**
     * List all users.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        UUID userId = null;
        Boolean full = null;
        UserArray response = api.getAllUsers(userId, full);

        // TODO: test validations
    }
    
    /**
     * Get a user by his identifier.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        UUID userId = null;
        UserDetail response = api.getUserById(userId);

        // TODO: test validations
    }
    
    /**
     * Update a user.
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        UUID userId = null;
        UserPut userPut = null;
        UserDetail response = api.updateUser(userId, userPut);

        // TODO: test validations
    }
    
}
