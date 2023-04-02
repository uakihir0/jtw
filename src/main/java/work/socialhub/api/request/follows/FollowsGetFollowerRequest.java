package work.socialhub.api.request.follows;

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

public class FollowsGetFollowerRequest implements Request {

    private final String id;
    private Integer maxResults;
    private String paginationToken;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static FollowsGetFollowerRequestBuilder builder(String id) {
        return new FollowsGetFollowerRequestBuilder().id(id);
    }

    private FollowsGetFollowerRequest(String id) {
        this.id = id;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "max_results", maxResults);
        putParam(params, "pagination_token", paginationToken);
        putParam(params, "expansions", FieldName.joining(expansions));
        putParam(params, "tweet.fields", FieldName.joining(tweetFields));
        putParam(params, "user.fields", FieldName.joining(userFields));
        return params;
    }

    // region // AutoGenerate
    public String getId() {
        return id;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public String getPaginationToken() {
        return paginationToken;
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

    public static final class FollowsGetFollowerRequestBuilder {
        private String id;
        private Integer maxResults;
        private String paginationToken;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private FollowsGetFollowerRequestBuilder() {
        }

        public FollowsGetFollowerRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FollowsGetFollowerRequestBuilder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public FollowsGetFollowerRequestBuilder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }

        public FollowsGetFollowerRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public FollowsGetFollowerRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public FollowsGetFollowerRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public FollowsGetFollowerRequest build() {
            FollowsGetFollowerRequest followsGetFollowerRequest = new FollowsGetFollowerRequest(id);
            followsGetFollowerRequest.expansions = this.expansions;
            followsGetFollowerRequest.tweetFields = this.tweetFields;
            followsGetFollowerRequest.paginationToken = this.paginationToken;
            followsGetFollowerRequest.userFields = this.userFields;
            followsGetFollowerRequest.maxResults = this.maxResults;
            return followsGetFollowerRequest;
        }
    }
    // endregion
}
