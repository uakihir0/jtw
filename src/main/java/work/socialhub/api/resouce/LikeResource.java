package work.socialhub.api.resouce;

import work.socialhub.api.request.LikingUsersRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

/**
 * api collection about like.
 * いいね (Like) に関連する操作の一覧
 * <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/likes/api-reference">API Reference</a>
 */
public interface LikeResource {

    /**
     * Get users who like specified tweet.
     * 特定のツイートをいいねしたユーザーを取得 (複数)
     */
    Response<Root<List<User>>> likingUsers(LikingUsersRequest request);
}
