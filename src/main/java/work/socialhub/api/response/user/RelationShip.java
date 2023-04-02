package work.socialhub.api.response.user;

import com.google.gson.annotations.SerializedName;

public class RelationShip {

    @SerializedName("following")
    private Boolean following;

    @SerializedName("pending_follow")
    private Boolean pendingFollow;

    // region // Getter&Setter
    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getPendingFollow() {
        return pendingFollow;
    }

    public void setPendingFollow(Boolean pendingFollow) {
        this.pendingFollow = pendingFollow;
    }
    // endregion
}
