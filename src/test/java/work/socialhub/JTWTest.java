package work.socialhub;

import org.junit.Test;
import work.socialhub.api.JTWFactory;
import work.socialhub.api.request.LikingUsersRequest;
import work.socialhub.api.request.RetweetByRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.user.User;

import java.util.List;

public class JTWTest {

    public JTW getClient() {
        JTWFactory factory = JTWFactory.fromConsumerKeyAndSecret(
                TestProperty.CONSUMER_KEY, TestProperty.CONSUMER_SECRET);
        return factory.verifyWithAccessToken(
                TestProperty.ACCESS_TOKEN, TestProperty.ACCESS_TOKEN_SECRET);
    }



    @Test
    public void testLikingUser() {
        Response<Root<List<User>>> response = getClient()
                .likingUsers(LikingUsersRequest
                        .builder("1416524386757222406")
                        .build());

        System.out.println(response.getValue().getData().get(0).getName());
        System.out.println(response.getValue().getIncludes().getTweets().get(0).getText());
    }

    @Test
    public void testRetweetBy() {
        Response<Root<List<User>>> response = getClient()
                .retweetBy(RetweetByRequest
                        .builder("1416524386757222406")
                        .build());

        System.out.println(response.getValue().getData().get(0).getName());
        System.out.println(response.getValue().getIncludes().getTweets().get(0).getText());
    }
}
