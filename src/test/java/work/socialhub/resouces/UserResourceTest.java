package work.socialhub.resouces;

import org.junit.Test;
import work.socialhub.JTWTest;
import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

public class UserResourceTest extends JTWTest {

    @Test
    public void testShowUser() {
        Response<Root<User>> response = getClient()
                .users().show(UserLookupIdRequest
                        .builder("11348282")
                        .build());

        System.out.println(response
                .getValue().getData()
                .getName());
    }
}
