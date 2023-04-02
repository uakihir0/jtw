package work.socialhub.api.resouce;

import work.socialhub.api.request.follows.FollowsGetFollowingRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

/**
 * api collection about follow.
 * フォロー関連の操作一覧
 * <a href="https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference">Api Reference</a>
 */
public interface FollowResource {

    /**
     * Returns a list of users the specified user ID is following.
     * 特定のユーザーがフォローしている人の一覧を取得
     */
    Response<Root<List<User>>> getFollowing(FollowsGetFollowingRequest request);

}
