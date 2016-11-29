package com.pingbid.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rvignesh on 10/26/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "offers",
            "status",
            "scores"
    })
    public class Softpull {

        @JsonProperty("offers")
        private List<Offer> offers = new ArrayList<>();
        @JsonProperty("status")
        private Status status;
        @JsonProperty("scores")
        private Scores scores;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<>();

        /**
         *
         * @return
         *     The offers
         */
        @JsonProperty("offers")
        public List<Offer> getOffers() {
            return offers;
        }

        /**
         *
         * @param offers
         *     The offers
         */
        @JsonProperty("offers")
        public void setOffers(List<Offer> offers) {
            this.offers = offers;
        }

        /**
         *
         * @return
         *     The status
         */
        @JsonProperty("status")
        public Status getStatus() {
            return status;
        }

        /**
         *
         * @param status
         *     The status
         */
        @JsonProperty("status")
        public void setStatus(Status status) {
            this.status = status;
        }

        /**
         *
         * @return
         *     The scores
         */
        @JsonProperty("scores")
        public Scores getScores() {
            return scores;
        }

        /**
         *
         * @param scores
         *     The scores
         */
        @JsonProperty("scores")
        public void setScores(Scores scores) {
            this.scores = scores;
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
            return "Softpull{" +
                    "offers=" + offers +
                    ", status=" + status +
                    ", scores=" + scores +
                    ", additionalProperties=" + additionalProperties +
                    '}';
        }
    }

