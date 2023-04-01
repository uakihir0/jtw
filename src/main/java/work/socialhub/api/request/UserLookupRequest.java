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

public class UserLookupRequest implements Request {

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
        params.put("expansions", FieldName.joining(expansions));
        params.put("media.fields", FieldName.joining(mediaFields));
        params.put("place.fields", FieldName.joining(placeFields));
        params.put("poll.fields", FieldName.joining(pollFields));
        params.put("tweet.fields", FieldName.joining(tweetFields));
        params.put("user.fields", FieldName.joining(userFields));
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

        public UserLookupRequest build() {
            UserLookupRequest userLookupRequest = new UserLookupRequest();
            userLookupRequest.ids = this.ids;
            userLookupRequest.tweetFields = this.tweetFields;
            userLookupRequest.placeFields = this.placeFields;
            userLookupRequest.mediaFields = this.mediaFields;
            userLookupRequest.pollFields = this.pollFields;
            userLookupRequest.expansions = this.expansions;
            userLookupRequest.userFields = this.userFields;
            return userLookupRequest;
        }
    }

    // endregion
}
