package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("profile_image_url")
    private String profileImageUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private String url;
    @SerializedName("pinned_tweet_id")
    private String pinnedTweetId;
    @SerializedName("public_metrics")
    private Metrics publicMetrics;
    @SerializedName("username")
    private String username;
    @SerializedName("location")
    private String location;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("protected")
    private Boolean _protected;
    @SerializedName("entities")
    private Entities entities;
    @SerializedName("verified")
    private Boolean verified;
    @SerializedName("description")
    private String description;

    // region // Getter&Setter
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPinnedTweetId() {
        return pinnedTweetId;
    }

    public void setPinnedTweetId(String pinnedTweetId) {
        this.pinnedTweetId = pinnedTweetId;
    }

    public Metrics getPublicMetrics() {
        return publicMetrics;
    }

    public void setPublicMetrics(Metrics publicMetrics) {
        this.publicMetrics = publicMetrics;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // endregion
}
