package work.socialhub.api;

import work.socialhub.api.request.UsersLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.User;

import java.util.List;

/**
 * api collection about like.
 * LIKE に関連する操作の一覧
 */
public interface LikeResource {

    /**
     * Get users who likes specified tweet.
     * 特定のツイートを LIKE したユーザーを取得 (複数)
     */
    Response<Root<List<User>>> likingUsers(UsersLookupIdRequest request);
}
