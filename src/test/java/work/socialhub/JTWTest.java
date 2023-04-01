package work.socialhub;

import org.junit.Test;
import work.socialhub.api.JTWFactory;
import work.socialhub.api.request.LikingUsersRequest;
import work.socialhub.api.request.RetweetedByRequest;
import work.socialhub.api.request.TimelineReverseChronologicalRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;
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
                .likes().likingUsers(LikingUsersRequest
                        .builder("1416524386757222406")
                        .build());

        System.out.println(response.getValue().getData().get(0).getName());
        System.out.println(response.getValue().getIncludes().getTweets().get(0).getText());
    }

    @Test
    public void testRetweetedBy() {
        Response<Root<List<User>>> response = getClient()
                .retweets().retweetedBy(RetweetedByRequest
                        .builder("1416524386757222406")
                        .build());

        System.out.println(response.getValue().getData().get(0).getName());
        System.out.println(response.getValue().getIncludes().getTweets().get(0).getText());
    }

    @Test
    public void testTimelinesReverseChronological() {
        Response<Root<List<Tweet>>> response = getClient()
                .timeline().timelinesReverseChronological(TimelineReverseChronologicalRequest
                        .builder("362220012")
                        .build());

        System.out.println(response.getValue().getData().get(0).getText());
    }
}
