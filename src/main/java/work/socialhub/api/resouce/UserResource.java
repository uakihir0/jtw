package work.socialhub.api.resouce;

import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.request.UserLookupRequest;
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
     * Get single user entity.
     * 特定のユーザー情報を取得する (単数)
     */
    Response<Root<User>> show(UserLookupIdRequest request);

    /**
     * Get user entities.
     * 複数のユーザー情報を取得する (複数)
     */
    Response<Root<List<User>>> show(UserLookupRequest request);
}
