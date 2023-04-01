package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.LikingUsersRequest;
import work.socialhub.api.resouce.LikeResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class LikeResourceImpl extends JTWBase implements LikeResource {

    public LikeResourceImpl(
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
    public Response<Root<List<User>>> likingUsers(LikingUsersRequest request) {
        return proceed(() -> gson.fromJson(
                get("tweets/" + request.getId() + "/liking_users", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
    }
}
