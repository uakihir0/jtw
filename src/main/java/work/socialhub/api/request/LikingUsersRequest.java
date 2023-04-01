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

public class LikingUsersRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static LikingUsersRequestBuilder builder(String id) {
        return new LikingUsersRequestBuilder().id(id);
    }

    public LikingUsersRequest(String id) {
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

    public static final class LikingUsersRequestBuilder {
        private String id;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;

        private LikingUsersRequestBuilder() {
        }

        public static LikingUsersRequestBuilder aLikingUsersRequest() {
            return new LikingUsersRequestBuilder();
        }

        public LikingUsersRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public LikingUsersRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public LikingUsersRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public LikingUsersRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public LikingUsersRequest build() {
            LikingUsersRequest likingUsersRequest = new LikingUsersRequest(id);
            likingUsersRequest.userFields = this.userFields;
            likingUsersRequest.tweetFields = this.tweetFields;
            likingUsersRequest.expansions = this.expansions;
            return likingUsersRequest;
        }
    }

    // endregion
}
