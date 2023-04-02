package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.follows.FollowsGetFollowingRequest;
import work.socialhub.api.resouce.FollowResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class FollowResourceImpl extends JTWBase implements FollowResource {

    public FollowResourceImpl(
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
    public Response<Root<List<User>>> getFollowing(FollowsGetFollowingRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/" + request.getId() + "/following", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
    }
}
