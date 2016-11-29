package com.pingbid.controller;

import com.pingbid.Utilities.CommonUtils;
import com.pingbid.model.*;
import com.pingbid.services.*;
import com.pingbid.databaseModel.Lead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * Created by rvignesh on 9/23/2016.
 */


@RestController
@EnableCaching
public class LeadHandler extends BaseController {

    @Autowired
    private CommonUtils utilities;

    @Autowired
    private CommunicationService communicationService;

    @Autowired
    private Contactservice contactservice;

    @Autowired
    private Leadservice leadservice;

    @Autowired
    private InputDataFilterService inputDataFilterService;

    @Autowired
    private SoftpullService softpullService;

    @Autowired
    private EmailService emailService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method= RequestMethod.POST,value="/pinglead", consumes="text/plain",produces = "application/json")
    public Response createLead(@RequestBody String createLead) {
        //split the string and save the values in map as key value pairs
        Map<String,String> leadDetails = utilities.stringSplitter(createLead);
        //Generate leadid based on email,firstName,lastName,zipcode
        utilities.generateLeadID(leadDetails);
        //filter Input data
        inputDataFilterService.checkConditions(leadDetails);
        //Initialize leadData POJO Class
        CreateLead leadData = new CreateLead(leadDetails);
        //Check if contact already exists in contact table by using ssn
        contactservice.checkSSN(leadData); // 1 is fico pool
        //Initialize the lead Database model class
        Lead lead = new Lead(leadDetails);
        //save the lead object to DB
        leadservice.save(lead);
        logger.info(leadData.getStatus()+" : "+leadData.getTransaction_time()+" : "+leadData.getMessage());
        //Intialize prePull POJO class
        PrePull prePull = new PrePull("LeadID",utilities.getageFromDOB(leadData.getDate_of_birth()),"D",leadData.getState(),leadData.getOwn_home(),leadData.getMonths_at_address(),leadData.getMonths_at_bank(),leadData.getPay_frequency(),leadData.getLoan_amount(),leadData.getMonthly_income());
        //Do prepull
        communicationService.doPrepullScore(prePull);
        //Do Softpull
        Softpull softpull = communicationService.doSoftpull(leadData);
        //check softpull scores
        Response response = softpullService.checkConditions(softpull,lead);
        //send mail
        EmailTrigger emailTrigger = communicationService.doSendMail(new SendMail(lead.getLeadID()));
        emailService.checkEmailStatus(emailTrigger,lead);
        return response;
    }

}
