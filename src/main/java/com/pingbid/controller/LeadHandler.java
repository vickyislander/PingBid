package com.pingbid.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.Utilities.CommonUtils;
import com.pingbid.communicate.CommunicationHelper;
import com.pingbid.databaseModel.Contact;
import com.pingbid.databaseRepositories.ContactRepository;
import com.pingbid.databaseRepositories.LeadRepository;
import com.pingbid.model.CreateLead;
import com.pingbid.model.Softpull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


/**
 * Created by rvignesh on 9/23/2016.
 */

@RestController
public class LeadHandler {


    private ContactRepository contactRepository;

    private LeadRepository leadRepository;


    @Autowired
    public LeadHandler(ContactRepository contactRepository,LeadRepository leadRepository) {
        this.contactRepository = contactRepository;
        this.leadRepository = leadRepository;
    }

    @Autowired
    private CommonUtils utilities;

    @Autowired
    private CommunicationHelper communicationHelper;

    @RequestMapping(method= RequestMethod.POST,value="/pinglead", consumes="text/plain",produces = "application/json")
    public String createLead(@RequestBody String createLead) {
        CreateLead leadData = new CreateLead(createLead);
        this.contactRepository.findOne(Integer.parseInt(leadData.getSsn())); // 1 is fico pool
        Softpull softpull = new Softpull(utilities.generateLead(leadRepository),utilities.getageFromDOB(leadData.getDate_of_birth()),"1",leadData.getState(),leadData.getOwn_home(),leadData.getMonths_at_address(),leadData.getMonths_at_bank(),leadData.getPay_frequency(),leadData.getLoan_amount(),leadData.getMonthly_income());
        communicationHelper.doSoftpull(softpull);
        return createLead;
    }
}
