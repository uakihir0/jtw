package work.socialhub.api.request.follows;

import work.socialhub.api.request.Request;
import work.socialhub.field.FieldName;

import java.util.HashMap;
import java.util.Map;

public class FollowsCreateFollowRequest implements Request {

    public final String id;
    public final String targetUserId;

    public static FollowsCreateFollowRequestBuilder builder(String id, String targetUserId) {
        return new FollowsCreateFollowRequestBuilder().id(id).targetUserId(targetUserId);
    }

    public FollowsCreateFollowRequest(String id, String targetUserId) {
        this.id = id;
        this.targetUserId = targetUserId;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "target_user_id", targetUserId);
        return params;
    }

    // region // AutoGenerate
    public String getId() {
        return id;
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public static final class FollowsCreateFollowRequestBuilder {
        private String id;
        private String targetUserId;

        private FollowsCreateFollowRequestBuilder() {
        }

        public FollowsCreateFollowRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FollowsCreateFollowRequestBuilder targetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }

        public FollowsCreateFollowRequest build() {
            return new FollowsCreateFollowRequest(id, targetUserId);
        }
    }

    // endregion
}
