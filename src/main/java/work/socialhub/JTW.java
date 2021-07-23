package work.socialhub;

import work.socialhub.api.LikeResource;
import work.socialhub.api.RetweetResource;
import work.socialhub.api.TweetResource;
import work.socialhub.api.UserResource;

public interface JTW extends
        UserResource,
        TweetResource,
        LikeResource,
        RetweetResource {
}
