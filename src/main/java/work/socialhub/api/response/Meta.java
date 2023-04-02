package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("result_count")
    private Integer resultCount;

    @SerializedName("next_token")
    private String nextToken;

    // region // Getter&Setter
    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    // endregion
}
