package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

public class OrganicMetrics {

    @SerializedName("impression_count")
    public Integer impressionCount;
    @SerializedName("reply_count")
    public Integer replyCount;
    @SerializedName("retweet_count")
    public Integer retweetCount;
    @SerializedName("like_count")
    public Integer likeCount;
    @SerializedName("user_profile_clicks")
    public Integer userProfileClicks;

    // region // Getter&Setter

    public Integer getImpressionCount() {
        return impressionCount;
    }

    public void setImpressionCount(Integer impressionCount) {
        this.impressionCount = impressionCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getUserProfileClicks() {
        return userProfileClicks;
    }

    public void setUserProfileClicks(Integer userProfileClicks) {
        this.userProfileClicks = userProfileClicks;
    }


    // endregion
}
