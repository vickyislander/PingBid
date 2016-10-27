package com.pingbid.model;


/**
 * Created by rvignesh on 10/20/2016.
 */
public class Accept {


    private final String leadID;
    private final String status;
    private final String seller_group;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String transaction_time;
    private final String redirect_url;


    public Accept(String leadID, String status, String seller_group, String first_name, String last_name, String email, String transaction_time, String redirect_url)
    {
        this.leadID = leadID;
        this.status = status;
        this.seller_group = seller_group;
        this.first_name=first_name;
        this.last_name = last_name;
        this.email = email;
        this.transaction_time = transaction_time;
        this.redirect_url = redirect_url;
    }

    public String getLeadID() {
        return leadID;
    }

    public String getStatus() {
        return status;
    }

    public String getSeller_group() {
        return seller_group;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getTransaction_time() {
        return transaction_time;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

}

