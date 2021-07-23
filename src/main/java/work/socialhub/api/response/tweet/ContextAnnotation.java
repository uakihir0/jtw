package work.socialhub.api.response.tweet;

import com.google.gson.annotations.SerializedName;

public class ContextAnnotation {

    @SerializedName("domain")
    public Domain domain;
    @SerializedName("entity")
    public Entity entity;

    // region // Getter&Setter

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    // endregion
}
