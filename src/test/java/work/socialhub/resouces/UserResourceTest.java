package work.socialhub.resouces;

import org.junit.Test;
import work.socialhub.JTWTest;
import work.socialhub.api.request.UserLookupIdRequest;
import work.socialhub.api.request.UserLookupRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

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

    @Test
    public void testShowUsers() {
        Response<Root<List<User>>> response = getClient()
                .users().show(UserLookupRequest
                        .builder()
                        .ids(new String[]{
                                "11348282"
                        })
                        .build());

        for (User user : response.getValue().getData()) {
            System.out.println(user.getName());
        }
    }
}
