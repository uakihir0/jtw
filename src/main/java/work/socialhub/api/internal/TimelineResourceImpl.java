package work.socialhub.api.internal;

import com.google.gson.reflect.TypeToken;
import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.JTWBase;
import work.socialhub.api.request.TimelineReverseChronologicalRequest;
import work.socialhub.api.resouce.TimelineResource;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

import java.util.List;

public class TimelineResourceImpl extends JTWBase implements TimelineResource {

    public TimelineResourceImpl(
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
    public Response<Root<List<Tweet>>> timelinesReverseChronological(
            TimelineReverseChronologicalRequest request) {

        return proceed(() -> gson.fromJson(
                get("users/" + request.getId() + "/timelines/reverse_chronological", request),
                new TypeToken<Root<List<Tweet>>>() {
                }.getType()));
    }
}
