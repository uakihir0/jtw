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

public class UserLookupByRequest implements Request {

    private String[] usernames;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UserLookupByRequestBuilder builder() {
        return new UserLookupByRequestBuilder();
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

    // region // AutoGenerat

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

    public static final class UserLookupByRequestBuilder {
        private String[] usernames;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UserLookupByRequestBuilder() {
        }

        public UserLookupByRequestBuilder usernames(String[] usernames) {
            this.usernames = usernames;
            return this;
        }

        public UserLookupByRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UserLookupByRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UserLookupByRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UserLookupByRequest build() {
            UserLookupByRequest userLookupByRequest = new UserLookupByRequest();
            userLookupByRequest.userFields = this.userFields;
            userLookupByRequest.usernames = this.usernames;
            userLookupByRequest.expansions = this.expansions;
            userLookupByRequest.tweetFields = this.tweetFields;
            return userLookupByRequest;
        }
    }
}
