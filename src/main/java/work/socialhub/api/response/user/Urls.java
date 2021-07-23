package work.socialhub.api.response.user;

import com.google.gson.annotations.SerializedName;
import work.socialhub.api.response.Url;

import java.util.List;

public class Urls {

    @SerializedName("urls")
    private List<Url> urls;

    // region // Getter&Setter
    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }
    // endregion
}
