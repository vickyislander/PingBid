package com.pingbid.services;

import com.pingbid.databaseModel.Lead;
import com.pingbid.model.EmailTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rvignesh on 11/29/2016.
 */
@Service
public class EmailService {

    @Autowired
    private Leadservice leadservice;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void checkEmailStatus(EmailTrigger emailTrigger, Lead lead){
       if(emailTrigger.getStatus().contentEquals("accepted")){
           //set emailed=1 if email is successfully sent
           lead.setEmailed(1);
           //save in DB
           leadservice.save(lead);
           logger.info("\nEmail Trigger Successfull : " + emailTrigger);
       }else{
           //set emailed=0 if email is not sent
           lead.setEmailed(1);
           //save in DB
           leadservice.save(lead);
           logger.error("Failed to trigger Email "+emailTrigger);
       }
    }
}
