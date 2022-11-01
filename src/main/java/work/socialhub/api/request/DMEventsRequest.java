package work.socialhub.api.request;

import work.socialhub.field.DMEventField;
import work.socialhub.field.DMEventFields;
import work.socialhub.field.EventType;
import work.socialhub.field.EventTypes;
import work.socialhub.field.Expansion;
import work.socialhub.field.Expansions;
import work.socialhub.field.FieldName;
import work.socialhub.field.MediaField;
import work.socialhub.field.MediaFields;
import work.socialhub.field.TweetField;
import work.socialhub.field.TweetFields;
import work.socialhub.field.UserField;
import work.socialhub.field.UserFields;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class DMEventsRequest implements Request {

    private DMEventField[] dmEventFields;
    private EventType[] eventTypes;
    private Expansion[] expansions;
    private MediaField[] mediaFields;
    private TweetField[] tweetFields;
    private UserField[] userFields;
    private Integer maxResults;
    private String paginationToken;

    public static DMEventsRequest.DMEventsRequestBuilder builder() {
        return new DMEventsRequest.DMEventsRequestBuilder();
    }

    // region // AutoGeneration

    public DMEventField[] getDmEventFields() {
        return dmEventFields;
    }

    public EventType[] getEventTypes() {
        return eventTypes;
    }

    public Expansion[] getExpansions() {
        return expansions;
    }

    public MediaField[] getMediaFields() {
        return mediaFields;
    }

    public TweetField[] getTweetFields() {
        return tweetFields;
    }

    public UserField[] getUserFields() {
        return userFields;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public String getPaginationToken() {
        return paginationToken;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();

        if (paginationToken != null) {
            params.put("pagination_token", paginationToken);
        }
        if (maxResults != null) {
            params.put("max_results", maxResults);
        }

        params.put("dm_event.fields", Stream.of(dmEventFields).map(FieldName::getName).collect(joining(",")));
        params.put("event_types", Stream.of(eventTypes).map(FieldName::getName).collect(joining(",")));
        params.put("expansions", Stream.of(expansions).map(FieldName::getName).collect(joining(",")));

        params.put("media.fields", Stream.of(mediaFields).map(FieldName::getName).collect(joining(",")));
        params.put("tweet.fields", Stream.of(tweetFields).map(FieldName::getName).collect(joining(",")));
        params.put("user.fields", Stream.of(userFields).map(FieldName::getName).collect(joining(",")));
        return params;
    }

    public static final class DMEventsRequestBuilder {
        private DMEventField[] dmEventFields = DMEventFields.All;
        private EventType[] eventTypes = EventTypes.All;
        private Expansion[] expansions = Expansions.DM;
        private MediaField[] mediaFields = MediaFields.All;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;
        private Integer maxResults;
        private String paginationToken;

        private DMEventsRequestBuilder() {
        }

        public static DMEventsRequestBuilder aDMEventsRequest() {
            return new DMEventsRequestBuilder();
        }

        public DMEventsRequestBuilder dmEventFields(DMEventField[] dmEventFields) {
            this.dmEventFields = dmEventFields;
            return this;
        }

        public DMEventsRequestBuilder eventTypes(EventType[] eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        public DMEventsRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public DMEventsRequestBuilder mediaFields(MediaField[] mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }

        public DMEventsRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public DMEventsRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public DMEventsRequestBuilder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public DMEventsRequestBuilder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }

        public DMEventsRequest build() {
            DMEventsRequest dMEventsRequest = new DMEventsRequest();
            dMEventsRequest.tweetFields = this.tweetFields;
            dMEventsRequest.mediaFields = this.mediaFields;
            dMEventsRequest.userFields = this.userFields;
            dMEventsRequest.maxResults = this.maxResults;
            dMEventsRequest.expansions = this.expansions;
            dMEventsRequest.eventTypes = this.eventTypes;
            dMEventsRequest.paginationToken = this.paginationToken;
            dMEventsRequest.dmEventFields = this.dmEventFields;
            return dMEventsRequest;
        }
    }
    // endregion
}
