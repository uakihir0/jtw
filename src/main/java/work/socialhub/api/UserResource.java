package work.socialhub.api;

import work.socialhub.api.response.Response;
import work.socialhub.api.response.User;

/**
 * api collection returning user resource.
 * ユーザーリソースを返す API の集合
 */
public interface UserResource {

    Response<User> show();
}
