package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;
import work.socialhub.api.response.tweet.Tweet;
import work.socialhub.api.response.user.User;

import java.util.List;

public class Include {

    @SerializedName("tweets")
    private List<Tweet> tweets;
    @SerializedName("users")
    public List<User> users;

    // region // Getter&Setter

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // endregion
}
