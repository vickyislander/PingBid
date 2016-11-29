package com.pingbid.model;

/**
 * Created by rvignesh on 11/28/2016.
 */

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "softpull_score",
        "model2",
        "cv",
        "model1",
        "maxOffer",
        "softpull_score_cutoff",
        "conversion_score",
        "vantage",
        "ensmbleModel"
})
public class Scores {

    @JsonProperty("softpull_score")
    private String softpullScore;
    @JsonProperty("model2")
    private String model2;
    @JsonProperty("cv")
    private String cv;
    @JsonProperty("model1")
    private String model1;
    @JsonProperty("maxOffer")
    private String maxOffer;
    @JsonProperty("softpull_score_cutoff")
    private String softpullScoreCutoff;
    @JsonProperty("conversion_score")
    private String conversionScore;
    @JsonProperty("vantage")
    private String vantage;
    @JsonProperty("ensmbleModel")
    private String ensmbleModel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The softpullScore
     */
    @JsonProperty("softpull_score")
    public String getSoftpullScore() {
        return softpullScore;
    }

    /**
     * @param softpullScore The softpull_score
     */
    @JsonProperty("softpull_score")
    public void setSoftpullScore(String softpullScore) {
        this.softpullScore = softpullScore;
    }

    /**
     * @return The model2
     */
    @JsonProperty("model2")
    public String getModel2() {
        return model2;
    }

    /**
     * @param model2 The model2
     */
    @JsonProperty("model2")
    public void setModel2(String model2) {
        this.model2 = model2;
    }

    /**
     * @return The cv
     */
    @JsonProperty("cv")
    public String getCv() {
        return cv;
    }

    /**
     * @param cv The cv
     */
    @JsonProperty("cv")
    public void setCv(String cv) {
        this.cv = cv;
    }

    /**
     * @return The model1
     */
    @JsonProperty("model1")
    public String getModel1() {
        return model1;
    }

    /**
     * @param model1 The model1
     */
    @JsonProperty("model1")
    public void setModel1(String model1) {
        this.model1 = model1;
    }

    /**
     * @return The maxOffer
     */
    @JsonProperty("maxOffer")
    public String getMaxOffer() {
        return maxOffer;
    }

    /**
     * @param maxOffer The maxOffer
     */
    @JsonProperty("maxOffer")
    public void setMaxOffer(String maxOffer) {
        this.maxOffer = maxOffer;
    }

    /**
     * @return The softpullScoreCutoff
     */
    @JsonProperty("softpull_score_cutoff")
    public String getSoftpullScoreCutoff() {
        return softpullScoreCutoff;
    }

    /**
     * @param softpullScoreCutoff The softpull_score_cutoff
     */
    @JsonProperty("softpull_score_cutoff")
    public void setSoftpullScoreCutoff(String softpullScoreCutoff) {
        this.softpullScoreCutoff = softpullScoreCutoff;
    }

    /**
     * @return The conversionScore
     */
    @JsonProperty("conversion_score")
    public String getConversionScore() {
        return conversionScore;
    }

    /**
     * @param conversionScore The conversion_score
     */
    @JsonProperty("conversion_score")
    public void setConversionScore(String conversionScore) {
        this.conversionScore = conversionScore;
    }

    /**
     * @return The vantage
     */
    @JsonProperty("vantage")
    public String getVantage() {
        return vantage;
    }

    /**
     * @param vantage The vantage
     */
    @JsonProperty("vantage")
    public void setVantage(String vantage) {
        this.vantage = vantage;
    }

    /**
     * @return The ensmbleModel
     */
    @JsonProperty("ensmbleModel")
    public String getEnsmbleModel() {
        return ensmbleModel;
    }

    /**
     * @param ensmbleModel The ensmbleModel
     */
    @JsonProperty("ensmbleModel")
    public void setEnsmbleModel(String ensmbleModel) {
        this.ensmbleModel = ensmbleModel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Scores{" +
                "softpullScore='" + softpullScore + '\'' +
                ", model2='" + model2 + '\'' +
                ", cv='" + cv + '\'' +
                ", model1='" + model1 + '\'' +
                ", maxOffer='" + maxOffer + '\'' +
                ", softpullScoreCutoff='" + softpullScoreCutoff + '\'' +
                ", conversionScore='" + conversionScore + '\'' +
                ", vantage='" + vantage + '\'' +
                ", ensmbleModel='" + ensmbleModel + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
