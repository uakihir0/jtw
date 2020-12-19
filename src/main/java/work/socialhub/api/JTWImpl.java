package work.socialhub.api;

import com.google.gson.reflect.TypeToken;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.JTW;
import work.socialhub.api.request.UsersLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.User;

public class JTWImpl extends JTWBase implements JTW {

    JTWImpl(Authorization authorization, Configuration configuration) {
        super(authorization, configuration);
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public Response<Root<User>> show(UsersLookupIdRequest request) {
        return proceed(() -> gson.fromJson(
                get("users/" + request.getId(), request),
                new TypeToken<Root<User>>() {
                }.getType()));
    }
}
