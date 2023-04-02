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

public class UsersByUserNameRequest implements Request {

    private final String username;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersByUserNameRequestBuilder builder(String username) {
        return new UsersByUserNameRequestBuilder().username(username);
    }

    private UsersByUserNameRequest(String username) {
        this.username = username;
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

    public String getUsername() {
        return username;
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

    public static final class UsersByUserNameRequestBuilder {
        private String username;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersByUserNameRequestBuilder() {
        }

        public UsersByUserNameRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UsersByUserNameRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersByUserNameRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersByUserNameRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UsersByUserNameRequest build() {
            UsersByUserNameRequest usersByUserNameRequest = new UsersByUserNameRequest(username);
            usersByUserNameRequest.expansions = this.expansions;
            usersByUserNameRequest.userFields = this.userFields;
            usersByUserNameRequest.tweetFields = this.tweetFields;
            return usersByUserNameRequest;
        }
    }

    // endregion
}
