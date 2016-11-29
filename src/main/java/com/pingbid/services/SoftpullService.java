package com.pingbid.services;

import com.pingbid.databaseModel.Lead;
import com.pingbid.model.Response;
import com.pingbid.model.Softpull;
import org.springframework.stereotype.Service;

/**
 * Created by rvignesh on 11/29/2016.
 */
@Service
public class SoftpullService {

    public Response checkConditions(Softpull softpull, Lead lead){

        double scored_price;
        // The 9xx statuses are DE errors, the others are declines.
        if(softpull.getStatus().getId()== 9 || softpull.getStatus().getId()== 502 ){
            softpull.getStatus().setValue("Bad Status");
            scored_price = -1.000;
        }else if(softpull.getStatus().getId() != 200){
            softpull.getStatus().setValue("Bad Status");
            scored_price = 0;
        }

        return new Response(lead.getLeadID(),lead.getStatus(),lead.getSellerGroup(),lead.getFirstName(),lead.getLastName(),lead.getEmail(),lead.getTransactionTime(),lead.getRedirectUrl());
    }
}
