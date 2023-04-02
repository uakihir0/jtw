package work.socialhub.resouces;

import org.junit.Test;
import work.socialhub.JTWTest;
import work.socialhub.api.request.follows.FollowsGetFollowerRequest;
import work.socialhub.api.request.follows.FollowsGetFollowingRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class FollowResourceTest extends JTWTest {

    @Test
    public void testGetFollowing() {
        Response<Root<List<User>>> response1 = getClient()
                .follows().getFollowing(FollowsGetFollowingRequest
                        .builder("11348282")
                        .maxResults(1)
                        .build());

        for (User user : response1.getValue().getData()) {
            print(user);
        }

        String token = response1.getValue().getMeta().getNextToken();

        Response<Root<List<User>>> response2 = getClient()
                .follows().getFollowing(FollowsGetFollowingRequest
                        .builder("11348282")
                        .paginationToken(token)
                        .maxResults(1)
                        .build());

        for (User user : response2.getValue().getData()) {
            print(user);
        }
    }

    @Test
    public void testGetFollower() {
        Response<Root<List<User>>> response1 = getClient()
                .follows().getFollower(FollowsGetFollowerRequest
                        .builder("11348282")
                        .maxResults(1)
                        .build());

        for (User user : response1.getValue().getData()) {
            print(user);
        }

        String token = response1.getValue().getMeta().getNextToken();

        Response<Root<List<User>>> response2 = getClient()
                .follows().getFollower(FollowsGetFollowerRequest
                        .builder("11348282")
                        .paginationToken(token)
                        .maxResults(1)
                        .build());

        for (User user : response2.getValue().getData()) {
            print(user);
        }
    }
}
