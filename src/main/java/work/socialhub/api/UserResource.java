package work.socialhub.api;

import work.socialhub.api.request.UsersLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.User;

/**
 * api collection returning user resource.
 * ユーザーリソースを返す API の集合
 */
public interface UserResource {

    /**
     * Get single user entity.
     * 特定のユーザー情報を取得する (単数)
     */
    Response<Root<User>> show(UsersLookupIdRequest request);
}
