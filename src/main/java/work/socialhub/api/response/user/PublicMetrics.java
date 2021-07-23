package work.socialhub.api.response.user;

import com.google.gson.annotations.SerializedName;

public class PublicMetrics {

    @SerializedName("followers_count")
    private Integer followersCount;
    @SerializedName("following_count")
    private Integer followingCount;
    @SerializedName("tweet_count")
    private Integer tweetCount;
    @SerializedName("listed_count")
    private Integer listedCount;

    // region // Getter&Setter
    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getTweetCount() {
        return tweetCount;
    }

    public void setTweetCount(Integer tweetCount) {
        this.tweetCount = tweetCount;
    }

    public Integer getListedCount() {
        return listedCount;
    }

    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }
    // endregion
}
