package work.socialhub.api.request;

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

import java.util.HashMap;
import java.util.Map;

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
        params.put("expansions", FieldName.joining(expansions));
        params.put("media.fields", FieldName.joining(mediaFields));
        params.put("place.fields", FieldName.joining(placeFields));
        params.put("poll.fields", FieldName.joining(pollFields));
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
