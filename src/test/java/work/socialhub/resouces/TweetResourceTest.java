package work.socialhub.resouces;

import org.junit.Test;
import work.socialhub.JTWTest;
import work.socialhub.api.request.TweetLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;
import work.socialhub.field.TweetFields;

public class TweetResourceTest extends JTWTest {

    @Test
    public void testShowTweet() {
        Response<Root<Tweet>> response = getClient()
                .show(TweetLookupIdRequest
                        .builder("1416524386757222406")
                        .build());

        System.out.println(response
                .getValue().getData()
                .getText());
    }

    @Test
    public void testShowOwnedTweetWithMetrics(){
        Response<Root<Tweet>> response = getClient()
                .show(TweetLookupIdRequest
                        .builder("1415982501214838788")
                        .tweetFields(TweetFields.Owned)
                        .build());

        System.out.println(response
                .getValue().getData()
                .getNonPublicMetrics()
                .getImpressionCount());
    }
}
