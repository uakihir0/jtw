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

public class FollowsGetFollowingRequest implements Request {

    private final String id;
    private Integer maxResults;
    private String paginationToken;
    private Expansion[] expansions;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static FollowsGetFollowingRequestBuilder builder(String id) {
        return new FollowsGetFollowingRequestBuilder().id(id);
    }

    private FollowsGetFollowingRequest(String id) {
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

    public static final class FollowsGetFollowingRequestBuilder {
        private String id;
        private Integer maxResults;
        private String paginationToken;
        private Expansion[] expansions = Expansions.User;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private FollowsGetFollowingRequestBuilder() {
        }

        public FollowsGetFollowingRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FollowsGetFollowingRequestBuilder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public FollowsGetFollowingRequestBuilder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }

        public FollowsGetFollowingRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public FollowsGetFollowingRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public FollowsGetFollowingRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public FollowsGetFollowingRequest build() {
            FollowsGetFollowingRequest followsGetFollowingRequest = new FollowsGetFollowingRequest(id);
            followsGetFollowingRequest.tweetFields = this.tweetFields;
            followsGetFollowingRequest.paginationToken = this.paginationToken;
            followsGetFollowingRequest.userFields = this.userFields;
            followsGetFollowingRequest.maxResults = this.maxResults;
            followsGetFollowingRequest.expansions = this.expansions;
            return followsGetFollowingRequest;
        }
    }
    // endregion
}
