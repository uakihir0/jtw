package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

public class NonPublicMetrics {

    @SerializedName("user_profile_clicks")
    public Integer userProfileClicks;
    @SerializedName("impression_count")
    public Integer impressionCount;

    // region // Getter&Setter

    public Integer getUserProfileClicks() {
        return userProfileClicks;
    }

    public void setUserProfileClicks(Integer userProfileClicks) {
        this.userProfileClicks = userProfileClicks;
    }

    public Integer getImpressionCount() {
        return impressionCount;
    }

    public void setImpressionCount(Integer impressionCount) {
        this.impressionCount = impressionCount;
    }


    // endregion
}
