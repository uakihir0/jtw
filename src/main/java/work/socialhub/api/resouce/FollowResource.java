package work.socialhub.api.resouce;

import work.socialhub.api.request.follows.FollowsCreateFollowRequest;
import work.socialhub.api.request.follows.FollowsDeleteFollowRequest;
import work.socialhub.api.request.follows.FollowsGetFollowerRequest;
import work.socialhub.api.request.follows.FollowsGetFollowingRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.RelationShip;
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
     * <a href="https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-following">Reference</a>
     */
    Response<Root<List<User>>> getFollowing(FollowsGetFollowingRequest request);

    /**
     * Returns a list of users who are followers of the specified user ID.
     * 特定のユーザーのフォロワー一覧を取得
     * <a href="https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-followers">Reference</a>
     */
    Response<Root<List<User>>> getFollower(FollowsGetFollowerRequest request);

    /**
     * Allows a user ID to follow another user.
     * ユーザーをフォローします。
     * <a href="https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/post-users-source_user_id-following">Reference</a>
     */
    Response<Root<RelationShip>> createFollow(FollowsCreateFollowRequest request);

    /**
     * Allows a user ID to unfollow another user.
     * ユーザーのフォローを解除します。
     * <a href="https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/post-users-source_user_id-following">Reference</a>
     */
    Response<Root<RelationShip>> deleteFollow(FollowsDeleteFollowRequest request);
}
