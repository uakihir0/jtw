package work.socialhub.api;

import twitter4j.HttpClient;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.JTW;
import work.socialhub.api.internal.DirectMessageResourceImpl;
import work.socialhub.api.internal.FollowResourceImpl;
import work.socialhub.api.internal.LikeResourceImpl;
import work.socialhub.api.internal.RetweetResourceImpl;
import work.socialhub.api.internal.TimelineResourceImpl;
import work.socialhub.api.internal.TweetResourceImpl;
import work.socialhub.api.internal.UserResourceImpl;
import work.socialhub.api.resouce.DirectMessageResource;
import work.socialhub.api.resouce.FollowResource;
import work.socialhub.api.resouce.LikeResource;
import work.socialhub.api.resouce.RetweetResource;
import work.socialhub.api.resouce.TimelineResource;
import work.socialhub.api.resouce.TweetResource;
import work.socialhub.api.resouce.UserResource;

public class JTWImpl implements JTW {

    private final UserResource users;
    private final FollowResource follows;
    private final TweetResource tweets;
    private final LikeResource likes;
    private final RetweetResource retweets;
    private final TimelineResource timeline;
    private final DirectMessageResource directMessagesLookup;

    public JTWImpl(
            Authorization authorization,
            Configuration configuration,
            HttpClient client) {

        users = new UserResourceImpl(authorization, configuration, client);
        follows = new FollowResourceImpl(authorization, configuration, client);
        tweets = new TweetResourceImpl(authorization, configuration, client);
        likes = new LikeResourceImpl(authorization, configuration, client);
        retweets = new RetweetResourceImpl(authorization, configuration, client);
        timeline = new TimelineResourceImpl(authorization, configuration, client);
        directMessagesLookup = new DirectMessageResourceImpl(authorization, configuration, client);
    }

    @Override
    public UserResource users() {
        return users;
    }

    @Override
    public FollowResource follows() {
        return follows;
    }

    @Override
    public TweetResource tweets() {
        return tweets;
    }

    @Override
    public LikeResource likes() {
        return likes;
    }

    @Override
    public RetweetResource retweets() {
        return retweets;
    }

    @Override
    public TimelineResource timeline() {
        return timeline;
    }

    @Override
    public DirectMessageResource directMessagesLookup() {
        return directMessagesLookup;
    }
}
