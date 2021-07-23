package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;
import work.socialhub.api.response.Annotation;
import work.socialhub.api.response.Hashtag;
import work.socialhub.api.response.Mention;
import work.socialhub.api.response.Url;

import java.util.List;

public class Entities {

    @SerializedName("mentions")
    public List<Mention> mentions;
    @SerializedName("hashtags")
    public List<Hashtag> hashtags;
    @SerializedName("urls")
    public List<Url> url;
    @SerializedName("annotations")
    public List<Annotation> annotations;

    // region // Getter&Setter

    public List<Mention> getMentions() {
        return mentions;
    }

    public void setMentions(List<Mention> mentions) {
        this.mentions = mentions;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Url> getUrl() {
        return url;
    }

    public void setUrl(List<Url> url) {
        this.url = url;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    // endregion
}
