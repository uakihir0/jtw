package work.socialhub.api.request.follows;

import work.socialhub.api.request.Request;

import java.util.HashMap;
import java.util.Map;

public class FollowsDeleteFollowRequest implements Request {

    public final String sourceUserId;
    public final String targetUserId;

    public static FollowsDeleteFollowRequestBuilder builder(
            String sourceUserId,
            String targetUserId
    ) {
        return new FollowsDeleteFollowRequestBuilder()
                .sourceUserId(sourceUserId)
                .targetUserId(targetUserId);
    }

    public FollowsDeleteFollowRequest(
            String sourceUserId,
            String targetUserId
    ) {
        this.sourceUserId = sourceUserId;
        this.targetUserId = targetUserId;
    }

    @Override
    public Map<String, Object> getParams() {
        return new HashMap<>();
    }

    // region // AutoGenerate
    public String getSourceUserId() {
        return sourceUserId;
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public static final class FollowsDeleteFollowRequestBuilder {
        private String sourceUserId;
        private String targetUserId;

        private FollowsDeleteFollowRequestBuilder() {
        }

        public FollowsDeleteFollowRequestBuilder sourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }

        public FollowsDeleteFollowRequestBuilder targetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }

        public FollowsDeleteFollowRequest build() {
            return new FollowsDeleteFollowRequest(sourceUserId, targetUserId);
        }
    }
    // endregion
}
