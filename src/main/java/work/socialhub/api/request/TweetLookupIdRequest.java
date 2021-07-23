package work.socialhub.api.request;

import work.socialhub.field.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class TweetLookupIdRequest implements Request {

    private final String id;
    private Expansion[] expansions;
    private MediaField[] mediaFields;
    private PlaceField[] placeFields;
    private PollField[] pollFields;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static TweetLookupIdRequestBuilder builder(String id) {
        return new TweetLookupIdRequestBuilder().id(id);
    }

    public TweetLookupIdRequest(String id) {
        this.id = id;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("expansions", Stream.of(expansions).map(FieldName::getName).collect(joining(",")));
        params.put("media.fields", Stream.of(mediaFields).map(FieldName::getName).collect(joining(",")));
        params.put("place.fields", Stream.of(placeFields).map(FieldName::getName).collect(joining(",")));
        params.put("poll.fields", Stream.of(pollFields).map(FieldName::getName).collect(joining(",")));
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

    public static final class TweetLookupIdRequestBuilder {
        private String id;
        private Expansion[] expansions = Expansions.Tweet;
        private MediaField[] mediaFields = MediaFields.All;
        private PlaceField[] placeFields = PlaceFields.All;
        private PollField[] pollFields = PollFields.All;
        private TweetField[] tweetFields = TweetFields.NotOwned;
        private UserField[] userFields = UserFields.All;

        private TweetLookupIdRequestBuilder() {
        }

        public TweetLookupIdRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public TweetLookupIdRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public TweetLookupIdRequestBuilder mediaFields(MediaField[] mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }

        public TweetLookupIdRequestBuilder placeFields(PlaceField[] placeFields) {
            this.placeFields = placeFields;
            return this;
        }

        public TweetLookupIdRequestBuilder pollFields(PollField[] pollFields) {
            this.pollFields = pollFields;
            return this;
        }

        public TweetLookupIdRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public TweetLookupIdRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public TweetLookupIdRequest build() {
            TweetLookupIdRequest tweetLookupIdRequest = new TweetLookupIdRequest(id);
            tweetLookupIdRequest.expansions = this.expansions;
            tweetLookupIdRequest.pollFields = this.pollFields;
            tweetLookupIdRequest.placeFields = this.placeFields;
            tweetLookupIdRequest.userFields = this.userFields;
            tweetLookupIdRequest.mediaFields = this.mediaFields;
            tweetLookupIdRequest.tweetFields = this.tweetFields;
            return tweetLookupIdRequest;
        }
    }

    // endregion
}
