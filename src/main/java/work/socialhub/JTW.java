package work.socialhub;

import work.socialhub.api.resouce.DirectMessageResource;
import work.socialhub.api.resouce.LikeResource;
import work.socialhub.api.resouce.RetweetResource;
import work.socialhub.api.resouce.TimelineResource;
import work.socialhub.api.resouce.TweetResource;
import work.socialhub.api.resouce.UserResource;

public interface JTW extends
        UserResource,
        TweetResource,
        LikeResource,
        RetweetResource,
        TimelineResource,
        DirectMessageResource {
}
