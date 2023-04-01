package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.DMEventsRequest;
import work.socialhub.api.resouce.DirectMessageResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

import java.util.List;

public class DirectMessageResourceImpl extends JTWBase implements DirectMessageResource {

    public DirectMessageResourceImpl(
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
    public Response<Root<List<Tweet>>> dmEvents(DMEventsRequest request) {

        return proceed(() -> gson.fromJson(
                get("dm_events", request),
                new TypeToken<Root<List<Tweet>>>() {
                }.getType()));
    }
}
