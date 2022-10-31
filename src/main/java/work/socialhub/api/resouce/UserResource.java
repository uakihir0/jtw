package work.socialhub.api.resouce;

import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

/**
 * api collection about user resource.
 * ユーザー関連 API の集合
 */
public interface UserResource {

    /**
     * Get single user entity.
     * 特定のユーザー情報を取得する (単数)
     */
    Response<Root<User>> show(UserLookupIdRequest request);
}
