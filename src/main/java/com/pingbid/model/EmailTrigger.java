package com.pingbid.model;

/**
 * Created by rvignesh on 11/27/2016.
 */
public class EmailTrigger {

    private String status;
    private String first_name;
    private String last_name;
    private String redirect_url;
    private String seller_group;
    private String transaction_time;
    private String email;
    private String LeadID;

    public String getStatus() {
        return status;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public String getSeller_group() {
        return seller_group;
    }

    public String getTransaction_time() {
        return transaction_time;
    }

    public String getEmail() {
        return email;
    }

    public String getLeadID() {
        return LeadID;
    }

    @Override
    public String toString() {
        return "EmailTrigger{" +
                "status='" + status + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", redirect_url='" + redirect_url + '\'' +
                ", seller_group='" + seller_group + '\'' +
                ", transaction_time='" + transaction_time + '\'' +
                ", email='" + email + '\'' +
                ", LeadID='" + LeadID + '\'' +
                '}';
    }
}
