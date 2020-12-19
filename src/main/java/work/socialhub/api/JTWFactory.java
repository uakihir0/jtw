package work.socialhub.api;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import work.socialhub.JTW;

public class JTWFactory {

    private String consumerKey;
    private String consumerSecret;

    public static JTW fromTwitter4J(Twitter twitter) {
        return new JTWImpl(
                twitter.getAuthorization(),
                twitter.getConfiguration());
    }

    public static JTWFactory fromConsumerKeyAndSecret(
            String consumerKey,
            String consumerSecret) {

        JTWFactory factory = new JTWFactory();
        factory.consumerKey = consumerKey;
        factory.consumerSecret = consumerSecret;
        return factory;
    }

    public JTW verifyWithAccessToken(
            String accessToken,
            String accessTokenSecret) {

        Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

        return fromTwitter4J(twitter);
    }
}
