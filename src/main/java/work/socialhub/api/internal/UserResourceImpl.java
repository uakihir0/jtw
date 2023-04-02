package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.users.UsersByUserNameRequest;
import work.socialhub.api.request.users.UsersByUserNamesRequest;
import work.socialhub.api.request.users.UsersByIdRequest;
import work.socialhub.api.request.users.UsersByIdsRequest;
import work.socialhub.api.resouce.UserResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class UserResourceImpl extends JTWBase implements UserResource {

    public UserResourceImpl(
            Authorization authorization,
            Configuration configuration,
            HttpClient httpClient
    ) {
        super(authorization, configuration, httpClient);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<User>> get(UsersByIdRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/" + request.getId(), request),
                new TypeToken<Root<User>>() {
                }.getType()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<List<User>>> get(UsersByIdsRequest request) {
        return proceed(() -> gson.fromJson(
                get("users", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<User>> get(UsersByUserNameRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/by/username/" + request.getUsername(), request),
                new TypeToken<Root<User>>() {
                }.getType()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<List<User>>> get(UsersByUserNamesRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/by", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
    }
}
