package work.socialhub.api.response;

import com.google.gson.annotations.SerializedName;

public class Annotation {

    @SerializedName("start")
    public Integer start;
    @SerializedName("end")
    public Integer end;
    @SerializedName("probability")
    public Double probability;
    @SerializedName("type")
    public String type;
    @SerializedName("normalized_text")
    public String normalizedText;

    // region // Getter&Setter

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNormalizedText() {
        return normalizedText;
    }

    public void setNormalizedText(String normalizedText) {
        this.normalizedText = normalizedText;
    }


    // endregion
}
