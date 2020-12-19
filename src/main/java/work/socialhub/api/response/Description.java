package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Description {

    @SerializedName("hashtags")
    private List<Hashtag> hashtags;

    // region // Getter&Setter
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }
    // endregion
}
