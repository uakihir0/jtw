package work.socialhub.api.request;

import work.socialhub.field.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class RetweetByRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static RetweetByRequestBuilder builder(String id) {
        return new RetweetByRequestBuilder().id(id);
    }

    public RetweetByRequest(String id) {
        this.id = id;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("expansions", Stream.of(expansions).map(FieldName::getName).collect(joining(",")));
        params.put("tweet.fields", Stream.of(tweetFields).map(FieldName::getName).collect(joining(",")));
        params.put("user.fields", Stream.of(userFields).map(FieldName::getName).collect(joining(",")));
        return params;
    }

    // region // AutoGenerate
    public String getId() {
        return id;
    }

    public Expansion[] getExpansions() {
        return expansions;
    }

    public TweetField[] getTweetFields() {
        return tweetFields;
    }

    public UserField[] getUserFields() {
        return userFields;
    }

    public static final class RetweetByRequestBuilder {
        private String id;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;

        private RetweetByRequestBuilder() {
        }

        public RetweetByRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public RetweetByRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public RetweetByRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public RetweetByRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public RetweetByRequest build() {
            RetweetByRequest retweetByRequest = new RetweetByRequest(id);
            retweetByRequest.userFields = this.userFields;
            retweetByRequest.tweetFields = this.tweetFields;
            retweetByRequest.expansions = this.expansions;
            return retweetByRequest;
        }
    }

    // endregion
}
