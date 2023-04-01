package work.socialhub.api.request;

import work.socialhub.field.Exclude;
import work.socialhub.field.Expansion;
import work.socialhub.field.Expansions;
import work.socialhub.field.FieldName;
import work.socialhub.field.MediaField;
import work.socialhub.field.MediaFields;
import work.socialhub.field.PlaceField;
import work.socialhub.field.PlaceFields;
import work.socialhub.field.PollField;
import work.socialhub.field.PollFields;
import work.socialhub.field.TweetField;
import work.socialhub.field.TweetFields;
import work.socialhub.field.UserField;
import work.socialhub.field.UserFields;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimelineReverseChronologicalRequest implements Request {

    private final String id;

    private Date startTime;
    private Date endTime;
    private String sinceId;
    private String untilId;

    private String paginationToken;
    private Integer maxResults;

    private Exclude[] exclude;
    private Expansion[] expansions;
    private MediaField[] mediaFields;
    private PlaceField[] placeFields;
    private PollField[] pollFields;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static TimelineReverseChronologicalRequest.TimelineReverseChronologicalRequestBuilder builder(String id) {
        return new TimelineReverseChronologicalRequest.TimelineReverseChronologicalRequestBuilder().id(id);
    }

    public TimelineReverseChronologicalRequest(String id) {
        this.id = id;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();

        if (startTime != null || endTime != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ssZ");
            if (startTime != null) {
                params.put("start_time", formatter.format(startTime));
            }
            if (endTime != null) {
                params.put("end_time", formatter.format(endTime));
            }
        }

        if (sinceId != null) {
            params.put("since_id", sinceId);
        }
        if (untilId != null) {
            params.put("until_id", untilId);
        }
        if (paginationToken != null) {
            params.put("pagination_token", paginationToken);
        }
        if (maxResults != null) {
            params.put("max_results", maxResults);
        }

        params.put("expansions", FieldName.joining(expansions));
        params.put("media.fields", FieldName.joining(mediaFields));
        params.put("place.fields", FieldName.joining(placeFields));
        params.put("poll.fields", FieldName.joining(pollFields));
        params.put("tweet.fields", FieldName.joining(tweetFields));
        params.put("user.fields", FieldName.joining(userFields));
        return params;
    }

    // region // AutoGeneration

    public String getId() {
        return id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public String getPaginationToken() {
        return paginationToken;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public Exclude[] getExclude() {
        return exclude;
    }

    public Expansion[] getExpansions() {
        return expansions;
    }

    public MediaField[] getMediaFields() {
        return mediaFields;
    }

    public PlaceField[] getPlaceFields() {
        return placeFields;
    }

    public PollField[] getPollFields() {
        return pollFields;
    }

    public TweetField[] getTweetFields() {
        return tweetFields;
    }

    public UserField[] getUserFields() {
        return userFields;
    }


    public static final class TimelineReverseChronologicalRequestBuilder {
        private String id;
        private Date startTime;
        private Date endTime;
        private String sinceId;
        private String untilId;
        private String paginationToken;
        private Integer maxResults;
        private Exclude[] exclude;
        private Expansion[] expansions = Expansions.Tweet;
        private MediaField[] mediaFields = MediaFields.All;
        private PlaceField[] placeFields = PlaceFields.All;
        private PollField[] pollFields = PollFields.All;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;

        private TimelineReverseChronologicalRequestBuilder() {
        }

        public TimelineReverseChronologicalRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder startTime(Date startTime) {
            this.startTime = startTime;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder endTime(Date endTime) {
            this.endTime = endTime;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder exclude(Exclude[] exclude) {
            this.exclude = exclude;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder mediaFields(MediaField[] mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder placeFields(PlaceField[] placeFields) {
            this.placeFields = placeFields;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder pollFields(PollField[] pollFields) {
            this.pollFields = pollFields;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public TimelineReverseChronologicalRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public TimelineReverseChronologicalRequest build() {
            TimelineReverseChronologicalRequest timelineReverseChronologicalRequest = new TimelineReverseChronologicalRequest(id);
            timelineReverseChronologicalRequest.untilId = this.untilId;
            timelineReverseChronologicalRequest.exclude = this.exclude;
            timelineReverseChronologicalRequest.tweetFields = this.tweetFields;
            timelineReverseChronologicalRequest.sinceId = this.sinceId;
            timelineReverseChronologicalRequest.pollFields = this.pollFields;
            timelineReverseChronologicalRequest.mediaFields = this.mediaFields;
            timelineReverseChronologicalRequest.endTime = this.endTime;
            timelineReverseChronologicalRequest.paginationToken = this.paginationToken;
            timelineReverseChronologicalRequest.expansions = this.expansions;
            timelineReverseChronologicalRequest.startTime = this.startTime;
            timelineReverseChronologicalRequest.maxResults = this.maxResults;
            timelineReverseChronologicalRequest.placeFields = this.placeFields;
            timelineReverseChronologicalRequest.userFields = this.userFields;
            return timelineReverseChronologicalRequest;
        }
    }

    // endregion
}
