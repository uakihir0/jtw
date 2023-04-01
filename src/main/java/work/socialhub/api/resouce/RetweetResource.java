package work.socialhub.api.resouce;

import work.socialhub.api.request.RetweetedByRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

/**
 * api collection about retweet.
 * リツイート (Retweet) に関連する操作の一覧
 * <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/retweets/api-reference">API Reference</a>
 */
public interface RetweetResource {

    /**
     * Get users who retweet specified tweet.
     * 特定のツイートをリツイートしたユーザーを取得 (複数)
     */
    Response<Root<List<User>>> retweetedBy(RetweetedByRequest request);
}
