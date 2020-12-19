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
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class UsersLookupRequest implements Request {

    private String[] ids;
    private Expansion[] expansions;
    private MediaField[] mediaFields;
    private PlaceField[] placeFields;
    private PollField[] pollFields;
    private TweetField[] tweetFields;
    private UserField[] userFields;

    public static UsersLookupRequestBuilder builder() {
        return new UsersLookupRequestBuilder();
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", String.join(",", ids));
        params.put("expansions", Stream.of(expansions).map(FieldName::getName).collect(joining(",")));
        params.put("media.fields", Stream.of(mediaFields).map(FieldName::getName).collect(joining(",")));
        params.put("place.fields", Stream.of(placeFields).map(FieldName::getName).collect(joining(",")));
        params.put("poll.fields", Stream.of(pollFields).map(FieldName::getName).collect(joining(",")));
        params.put("tweet.fields", Stream.of(tweetFields).map(FieldName::getName).collect(joining(",")));
        params.put("user.fields", Stream.of(userFields).map(FieldName::getName).collect(joining(",")));
        return params;
    }

    // region // AutoGenerate

    public String[] getIds() {
        return ids;
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

    public static final class UsersLookupRequestBuilder {

        private String[] ids;
        private Expansion[] expansions = Expansions.All;
        private MediaField[] mediaFields = MediaFields.All;
        private PlaceField[] placeFields = PlaceFields.All;
        private PollField[] pollFields = PollFields.All;
        private TweetField[] tweetFields = TweetFields.All;
        private UserField[] userFields = UserFields.All;

        private UsersLookupRequestBuilder() {
        }

        public UsersLookupRequestBuilder ids(String[] ids) {
            this.ids = ids;
            return this;
        }

        public UsersLookupRequestBuilder expansions(Expansion[] expansions) {
            this.expansions = expansions;
            return this;
        }

        public UsersLookupRequestBuilder mediaFields(MediaField[] mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }

        public UsersLookupRequestBuilder placeFields(PlaceField[] placeFields) {
            this.placeFields = placeFields;
            return this;
        }

        public UsersLookupRequestBuilder pollFields(PollField[] pollFields) {
            this.pollFields = pollFields;
            return this;
        }

        public UsersLookupRequestBuilder tweetFields(TweetField[] tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public UsersLookupRequestBuilder userFields(UserField[] userFields) {
            this.userFields = userFields;
            return this;
        }

        public UsersLookupRequest build() {
            UsersLookupRequest UsersLookupRequest = new UsersLookupRequest();
            UsersLookupRequest.ids = this.ids;
            UsersLookupRequest.tweetFields = this.tweetFields;
            UsersLookupRequest.placeFields = this.placeFields;
            UsersLookupRequest.mediaFields = this.mediaFields;
            UsersLookupRequest.pollFields = this.pollFields;
            UsersLookupRequest.expansions = this.expansions;
            UsersLookupRequest.userFields = this.userFields;
            return UsersLookupRequest;
        }
    }

    // endregion
}
