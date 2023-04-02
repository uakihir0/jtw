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

public class UsersByIdsRequest implements Request {

    private String[] ids;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersByIdsRequestBuilder builder() {
        return new UsersByIdsRequestBuilder();
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", String.join(",", ids));
        params.put("expansions", FieldName.joining(expansions));
        params.put("tweet.fields", FieldName.joining(tweetFields));
        params.put("user.fields", FieldName.joining(userFields));
        return params;
    }

    // region // AutoGenerate

    public String[] getIds() {
        return ids;
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

    public static final class UsersByIdsRequestBuilder {

        private String[] ids;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersByIdsRequestBuilder() {
        }

        public UsersByIdsRequestBuilder ids(String[] ids) {
            this.ids = ids;
            return this;
        }

        public UsersByIdsRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersByIdsRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersByIdsRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UsersByIdsRequest build() {
            UsersByIdsRequest usersByIdsRequest = new UsersByIdsRequest();
            usersByIdsRequest.ids = this.ids;
            usersByIdsRequest.tweetFields = this.tweetFields;
            usersByIdsRequest.expansions = this.expansions;
            usersByIdsRequest.userFields = this.userFields;
            return usersByIdsRequest;
        }
    }

    // endregion
}
