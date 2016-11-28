package com.pingbid.model;

/**
 * Created by rvignesh on 11/28/2016.
 */
public class SendMail {

    private final String leadid ;
    private final String channel;

    public SendMail(String leadid,String channel){
        this.leadid = leadid;
        this.channel = channel;
    }

    public String getLeadid() {
        return leadid;
    }

    public String getChannel() {
        return channel;
    }
}
