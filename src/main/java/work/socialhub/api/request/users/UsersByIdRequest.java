package work.socialhub.api.request.users;

import work.socialhub.api.request.Request;
import work.socialhub.field.Expansion;
import work.socialhub.field.Expansions;
import work.socialhub.field.FieldName;
import work.socialhub.field.TweetField;
import work.socialhub.field.TweetFields;
import work.socialhub.field.UserField;
import work.socialhub.field.UserFields;

import java.util.HashMap;
import java.util.Map;

public class UsersByIdRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersByIdRequestBuilder builder(String id) {
        return new UsersByIdRequestBuilder().id(id);
    }

    private UsersByIdRequest(String id) {
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

    public static final class UsersByIdRequestBuilder {

        private String id;
        private Expansion[] expansions = { Expansions.PinnedTweetId };
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersByIdRequestBuilder() {
        }

        public UsersByIdRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UsersByIdRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersByIdRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersByIdRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UsersByIdRequest build() {
            UsersByIdRequest userIdRequest = new UsersByIdRequest(id);
            userIdRequest.tweetFields = this.tweetFields;
            userIdRequest.expansions = this.expansions;
            userIdRequest.userFields = this.userFields;
            return userIdRequest;
        }
    }

    // endregion
}
