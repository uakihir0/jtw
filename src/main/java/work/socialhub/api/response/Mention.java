package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Mention {

    @SerializedName("start")
    public Integer start;
    @SerializedName("end")
    public Integer end;
    @SerializedName("username")
    public String username;
    @SerializedName("id")
    public String id;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // endregion
}
