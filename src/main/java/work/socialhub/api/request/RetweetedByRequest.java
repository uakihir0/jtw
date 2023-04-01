package work.socialhub.api.request;

import work.socialhub.field.Expansion;
import work.socialhub.field.Expansions;
import work.socialhub.field.FieldName;
import work.socialhub.field.TweetField;
import work.socialhub.field.TweetFields;
import work.socialhub.field.UserField;
import work.socialhub.field.UserFields;

import java.util.HashMap;
import java.util.Map;

public class RetweetedByRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static RetweetedByRequestBuilder builder(String id) {
        return new RetweetedByRequestBuilder().id(id);
    }

    public RetweetedByRequest(String id) {
        this.id = id;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("expansions", FieldName.joining(expansions));
        params.put("tweet.fields", FieldName.joining(tweetFields));
        params.put("user.fields", FieldName.joining(userFields));
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

    public static final class RetweetedByRequestBuilder {
        private String id;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;

        private RetweetedByRequestBuilder() {
        }

        public RetweetedByRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public RetweetedByRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public RetweetedByRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public RetweetedByRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public RetweetedByRequest build() {
            RetweetedByRequest retweetedByRequest = new RetweetedByRequest(id);
            retweetedByRequest.userFields = this.userFields;
            retweetedByRequest.tweetFields = this.tweetFields;
            retweetedByRequest.expansions = this.expansions;
            return retweetedByRequest;
        }
    }

    // endregion
}
