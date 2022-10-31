package work.socialhub.api.resouce;

import work.socialhub.api.request.TimelineReverseChronologicalRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

import java.util.List;

/**
 * Timeline
 * <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/introduction">see reference.</a>
 */
public interface TimelineResource {

    /**
     * GET /2/users/:id/timelines/reverse_chronological
     * Allows you to retrieve a collection of the most recent
     * Tweets and Retweets posted by you and users you follow.
     * This endpoint returns up to the last 3200 Tweets.
     */
    Response<Root<List<Tweet>>> timelinesReverseChronological(TimelineReverseChronologicalRequest request);
}
