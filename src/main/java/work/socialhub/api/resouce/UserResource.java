package work.socialhub.api.resouce;

import work.socialhub.api.request.users.UsersByUserNameRequest;
import work.socialhub.api.request.users.UsersByUserNamesRequest;
import work.socialhub.api.request.users.UsersByIdRequest;
import work.socialhub.api.request.users.UsersByIdsRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

/**
 * api collection about user resource.
 * ユーザー関連 API の集合
 */
public interface UserResource {

    /**
     * Get user entity from id.
     * ID から特定のユーザー情報を取得する (単数)
     */
    Response<Root<User>> get(UsersByIdRequest request);

    /**
     * Get user entities from ids.
     * ID から複数のユーザー情報を取得する (複数)
     */
    Response<Root<List<User>>> get(UsersByIdsRequest request);

    /**
     * Get user entity from username.
     * ユーザー名から複数のユーザー情報を取得する (単数)
     */
    Response<Root<User>> get(UsersByUserNameRequest request);

    /**
     * Get user entities from usernames.
     * ユーザー名から複数のユーザー情報を取得する (複数)
     */
    Response<Root<List<User>>> get(UsersByUserNamesRequest request);
}
