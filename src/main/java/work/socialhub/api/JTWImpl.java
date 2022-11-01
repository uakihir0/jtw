package work.socialhub.api;

import com.google.gson.reflect.TypeToken;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.JTW;
import work.socialhub.api.request.DMEventsRequest;
import work.socialhub.api.request.LikingUsersRequest;
import work.socialhub.api.request.RetweetedByRequest;
import work.socialhub.api.request.TimelineReverseChronologicalRequest;
import work.socialhub.api.request.TweetLookupIdRequest;
import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;
import work.socialhub.api.response.user.User;

import java.util.List;

public class JTWImpl extends JTWBase implements JTW {

    JTWImpl(Authorization authorization, Configuration configuration) {
        super(authorization, configuration);
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
    public Response<Root<Tweet>> show(TweetLookupIdRequest request) {
        return proceed(() -> gson.fromJson(
                get("tweets/" + request.getId(), request),
                new TypeToken<Root<Tweet>>() {
                }.getType()));
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

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Root<List<User>>> retweetedBy(RetweetedByRequest request) {
        return proceed(() -> gson.fromJson(
                get("tweets/" + request.getId() + "/retweeted_by", request),
                new TypeToken<Root<List<User>>>() {
                }.getType()));
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
