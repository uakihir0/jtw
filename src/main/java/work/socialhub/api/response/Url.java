package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("start")
    private Integer start;
    @SerializedName("end")
    private Integer end;
    @SerializedName("url")
    private String url;
    @SerializedName("expanded_url")
    private String expandedUrl;
    @SerializedName("display_url")
    private String displayUrl;

    // region // Getter&Setter
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }
    // endregion
}
