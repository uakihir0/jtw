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

public class UsersByUserNamesRequest implements Request {

    private String[] usernames;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersByUserNamesRequestBuilder builder() {
        return new UsersByUserNamesRequestBuilder();
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("usernames", String.join(",", usernames));
        params.put("expansions", FieldName.joining(expansions));
        params.put("tweet.fields", FieldName.joining(tweetFields));
        params.put("user.fields", FieldName.joining(userFields));
        return params;
    }

    // region // AutoGenerate

    public String[] getUsernames() {
        return usernames;
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

    public static final class UsersByUserNamesRequestBuilder {
        private String[] usernames;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersByUserNamesRequestBuilder() {
        }

        public UsersByUserNamesRequestBuilder usernames(String[] usernames) {
            this.usernames = usernames;
            return this;
        }

        public UsersByUserNamesRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersByUserNamesRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersByUserNamesRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UsersByUserNamesRequest build() {
            UsersByUserNamesRequest usersByUserNamesRequest = new UsersByUserNamesRequest();
            usersByUserNamesRequest.userFields = this.userFields;
            usersByUserNamesRequest.usernames = this.usernames;
            usersByUserNamesRequest.expansions = this.expansions;
            usersByUserNamesRequest.tweetFields = this.tweetFields;
            return usersByUserNamesRequest;
        }
    }
}
