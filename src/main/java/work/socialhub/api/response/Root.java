package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Root<T> {

    @SerializedName("data")
    private T data;

    @SerializedName("includes")
    private Include includes;

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
    // endregion
}
