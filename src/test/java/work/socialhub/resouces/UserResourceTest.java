package work.socialhub.resouces;

import org.junit.Test;
import work.socialhub.JTWTest;
import work.socialhub.api.request.users.UsersByUserNameRequest;
import work.socialhub.api.request.users.UsersByUserNamesRequest;
import work.socialhub.api.request.users.UsersByIdRequest;
import work.socialhub.api.request.users.UsersByIdsRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class UserResourceTest extends JTWTest {

    @Test
    public void testGetUserById() {
        Response<Root<User>> response = getClient()
                .users().get(UsersByIdRequest
                        .builder("11348282")
                        .build());

        System.out.println(response
                .getValue().getData()
                .getName());
    }

    @Test
    public void testGetUserByIds() {
        Response<Root<List<User>>> response = getClient()
                .users().get(UsersByIdsRequest
                        .builder()
                        .ids(new String[]{
                                "11348282"
                        })
                        .build());

        for (User user : response.getValue().getData()) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testGetUserByUserName() {
        Response<Root<User>> response = getClient()
                .users().get(UsersByUserNameRequest
                        .builder("uakihir0")
                        .build());

        System.out.println(response
                .getValue().getData()
                .getName());
    }


    @Test
    public void testGetUserByUserNames() {
        Response<Root<List<User>>> response = getClient()
                .users().get(UsersByUserNamesRequest
                        .builder()
                        .usernames(new String[]{
                                "uakihir0"
                        })
                        .build());

        for (User user : response.getValue().getData()) {
            System.out.println(user.getName());
        }
    }
}
