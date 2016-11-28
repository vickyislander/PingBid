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
        "amount",
        "rate",
        "term",
        "isFeatured",
        "isSelected",
        "monthlyPayment",
        "biWeeklyPayment",
        "offerId"
})
public class Offer {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("term")
    private Integer term;
    @JsonProperty("isFeatured")
    private Integer isFeatured;
    @JsonProperty("isSelected")
    private Integer isSelected;
    @JsonProperty("monthlyPayment")
    private Double monthlyPayment;
    @JsonProperty("biWeeklyPayment")
    private Double biWeeklyPayment;
    @JsonProperty("offerId")
    private Integer offerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The amount
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount The amount
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return The rate
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * @param rate The rate
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * @return The term
     */
    @JsonProperty("term")
    public Integer getTerm() {
        return term;
    }

    /**
     * @param term The term
     */
    @JsonProperty("term")
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * @return The isFeatured
     */
    @JsonProperty("isFeatured")
    public Integer getIsFeatured() {
        return isFeatured;
    }

    /**
     * @param isFeatured The isFeatured
     */
    @JsonProperty("isFeatured")
    public void setIsFeatured(Integer isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * @return The isSelected
     */
    @JsonProperty("isSelected")
    public Integer getIsSelected() {
        return isSelected;
    }

    /**
     * @param isSelected The isSelected
     */
    @JsonProperty("isSelected")
    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    /**
     * @return The monthlyPayment
     */
    @JsonProperty("monthlyPayment")
    public Double getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * @param monthlyPayment The monthlyPayment
     */
    @JsonProperty("monthlyPayment")
    public void setMonthlyPayment(Double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    /**
     * @return The biWeeklyPayment
     */
    @JsonProperty("biWeeklyPayment")
    public Double getBiWeeklyPayment() {
        return biWeeklyPayment;
    }

    /**
     * @param biWeeklyPayment The biWeeklyPayment
     */
    @JsonProperty("biWeeklyPayment")
    public void setBiWeeklyPayment(Double biWeeklyPayment) {
        this.biWeeklyPayment = biWeeklyPayment;
    }

    /**
     * @return The offerId
     */
    @JsonProperty("offerId")
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * @param offerId The offerId
     */
    @JsonProperty("offerId")
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

