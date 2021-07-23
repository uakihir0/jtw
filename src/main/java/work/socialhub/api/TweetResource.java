package work.socialhub.api;

import work.socialhub.api.request.TweetLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

/**
 * api collection about tweet resource.
 * ツイート関連 API の集合
 */
public interface TweetResource {

    /**
     * Get single tweet entity.
     * 特定のツイート情報を取得する (単数)
     */
    Response<Root<Tweet>> show(TweetLookupIdRequest request);
}
