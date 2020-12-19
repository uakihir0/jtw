package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Hashtag {

    @SerializedName("start")
    private Integer start;
    @SerializedName("end")
    private Integer end;
    @SerializedName("tag")
    private String tag;

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    // endregion
}
