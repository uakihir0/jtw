package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tweet {

    @SerializedName("entities")
    public Entities entities;
    @SerializedName("context_annotations")
    public List<ContextAnnotation> contextAnnotations;
    @SerializedName("id")
    public String id;
    @SerializedName("lang")
    public String lang;
    @SerializedName("source")
    public String source;
    @SerializedName("conversation_id")
    public String conversationId;
    @SerializedName("attachments")
    public Attachments attachments;
    @SerializedName("created_at")
    public String createdAt;
    @SerializedName("possibly_sensitive")
    public Boolean possiblySensitive;
    @SerializedName("text")
    public String text;
    @SerializedName("public_metrics")
    public PublicMetrics publicMetrics;
    @SerializedName("organic_metrics")
    public OrganicMetrics organicMetrics;
    @SerializedName("non_public_metrics")
    public NonPublicMetrics nonPublicMetrics;
    @SerializedName("author_id")
    public String authorId;
    @SerializedName("reply_settings")
    public String replySettings;

    // region // Getter&Setter

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public List<ContextAnnotation> getContextAnnotations() {
        return contextAnnotations;
    }

    public void setContextAnnotations(List<ContextAnnotation> contextAnnotations) {
        this.contextAnnotations = contextAnnotations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PublicMetrics getPublicMetrics() {
        return publicMetrics;
    }

    public void setPublicMetrics(PublicMetrics publicMetrics) {
        this.publicMetrics = publicMetrics;
    }

    public OrganicMetrics getOrganicMetrics() {
        return organicMetrics;
    }

    public void setOrganicMetrics(OrganicMetrics organicMetrics) {
        this.organicMetrics = organicMetrics;
    }

    public NonPublicMetrics getNonPublicMetrics() {
        return nonPublicMetrics;
    }

    public void setNonPublicMetrics(NonPublicMetrics nonPublicMetrics) {
        this.nonPublicMetrics = nonPublicMetrics;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getReplySettings() {
        return replySettings;
    }

    public void setReplySettings(String replySettings) {
        this.replySettings = replySettings;
    }

    // endregion
}
