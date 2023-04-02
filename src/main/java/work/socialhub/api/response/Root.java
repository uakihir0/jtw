package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Root<T> {

    @SerializedName("data")
    private T data;

    @SerializedName("includes")
    private Include includes;

    @SerializedName("meta")
    private Meta meta;

    // region // Getter&Setter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Include getIncludes() {
        return includes;
    }

    public void setIncludes(Include includes) {
        this.includes = includes;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    // endregion
}
