package work.socialhub.api.resouce;

import work.socialhub.api.request.RetweetedByRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

/**
 * api collection about retweet.
 * リツイート (Retweet) に関連する操作の一覧
 */
public interface RetweetResource {

    /**
     * Get users who retweets specified tweet.
     * 特定のツイートをリツイートしたユーザーを取得 (複数)
     */
    Response<Root<List<User>>> retweetedBy(RetweetedByRequest request);
}
