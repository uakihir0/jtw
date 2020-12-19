package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Entities {

    @SerializedName("url")
    private Urls url;
    @SerializedName("description")
    private Description description;

    // region // Getter&Setter
    public Urls getUrl() {
        return url;
    }

    public void setUrl(Urls url) {
        this.url = url;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
    // endregion
}
