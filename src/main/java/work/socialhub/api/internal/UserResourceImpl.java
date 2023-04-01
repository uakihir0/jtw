package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.request.UserLookupRequest;
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
    public Response<Root<User>> show(UserLookupIdRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/" + request.getId(), request),
                new TypeToken<Root<User>>() {
                }.getType()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<List<User>>> show(UserLookupRequest request) {
        return proceed(() -> gson.fromJson(
                get("users", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
    }

}
