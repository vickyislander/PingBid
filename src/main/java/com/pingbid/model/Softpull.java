package com.pingbid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rvignesh on 9/24/2016.
 */

@JsonIgnoreProperties(value = { "softpull_score" })
public class Softpull {


    private final String leadid;
    private final int age;
    private final String fico_pool;
    private final String state;
    private final String own_home;
    private final int months_at_address;
    private final int months_at_bank;
    private final String pay_frequency;
    private final int loan_amount;
    private final int monthly_income;
    private int softpull_score;

    public Softpull(String leadid, int age, String fico_pool, String state, String own_home, int months_at_address, int months_at_bank, String pay_frequency, int loan_amount, int monthly_income){
        this.leadid=leadid;
        this.age=age;
        this.fico_pool=fico_pool;
        this.state=state;
        this.own_home=own_home;
        this.months_at_address=months_at_address;
        this.months_at_bank=months_at_bank;
        this.pay_frequency=pay_frequency;
        this.loan_amount=loan_amount;
        this.monthly_income=monthly_income;
    }

    public String getLeadid() {
        return leadid;
    }

    public int getAge() {
        return age;
    }

    public String getFico_pool() {
        return fico_pool;
    }

    public String getState() {
        return state;
    }

    public String getOwn_home() {
        return own_home;
    }

    public int getMonths_at_address() {
        return months_at_address;
    }

    public int getMonths_at_bank() {
        return months_at_bank;
    }

    public String getPay_frequency() {
        return pay_frequency;
    }

    public int getLoan_amount() {
        return loan_amount;
    }

    public int getMonthly_income() {
        return monthly_income;
    }

    public int getSoftpull_score() {
        return softpull_score;
    }

    public void setSoftpull_score(int softpull_score) {
        this.softpull_score = softpull_score;
    }
}
