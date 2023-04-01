package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.TweetLookupIdRequest;
import work.socialhub.api.resouce.TweetResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

public class TweetResourceImpl extends JTWBase implements TweetResource {

    public TweetResourceImpl(
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
    public Response<Root<Tweet>> show(TweetLookupIdRequest request) {
        return proceed(() -> gson.fromJson(
                get("tweets/" + request.getId(), request),
                new TypeToken<Root<Tweet>>() {
                }.getType()));
    }
}
