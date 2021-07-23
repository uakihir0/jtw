package work.socialhub.api.request;

import work.socialhub.field.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class UserLookupIdRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersLookupIdRequestBuilder builder(String id) {
        return new UsersLookupIdRequestBuilder().id(id);
    }

    private UserLookupIdRequest(String id) {
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

    public static final class UsersLookupIdRequestBuilder {

        private String id;
        private Expansion[] expansions = { Expansions.PinnedTweetId };
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersLookupIdRequestBuilder() {
        }

        public UsersLookupIdRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UsersLookupIdRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersLookupIdRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersLookupIdRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UserLookupIdRequest build() {
            UserLookupIdRequest userLookupIdRequest = new UserLookupIdRequest(id);
            userLookupIdRequest.tweetFields = this.tweetFields;
            userLookupIdRequest.expansions = this.expansions;
            userLookupIdRequest.userFields = this.userFields;
            return userLookupIdRequest;
        }
    }

    // endregion
}
