package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

public class PublicMetrics {

    @SerializedName("retweet_count")
    public Integer retweetCount;
    @SerializedName("reply_count")
    public Integer replyCount;
    @SerializedName("like_count")
    public Integer likeCount;
    @SerializedName("quote_count")
    public Integer quoteCount;
    @SerializedName("impression_count")
    public Integer impressionCount;

    // region // Getter&Setter

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getQuoteCount() {
        return quoteCount;
    }

    public void setQuoteCount(Integer quoteCount) {
        this.quoteCount = quoteCount;
    }

    public Integer getImpressionCount() {
        return impressionCount;
    }

    public void setImpressionCount(Integer impressionCount) {
        this.impressionCount = impressionCount;
    }
    // endregion
}
