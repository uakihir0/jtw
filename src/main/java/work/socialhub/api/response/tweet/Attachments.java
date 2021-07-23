package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attachments {

    @SerializedName("media_keys")
    public List<String> mediaKeys;

    // region // Getter&Setter

    public List<String> getMediaKeys() {
        return mediaKeys;
    }

    public void setMediaKeys(List<String> mediaKeys) {
        this.mediaKeys = mediaKeys;
    }

    // endregion
}
