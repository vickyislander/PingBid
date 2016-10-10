package com.pingbid.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.Utilities.CommonUtils;
import com.pingbid.communicate.CommunicationService;
import com.pingbid.databaseModel.Contact;
import com.pingbid.databaseModel.Lead;
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

import java.util.List;

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
    private CommunicationService communicationService;

    @RequestMapping(method= RequestMethod.POST,value="/pinglead", consumes="text/plain",produces = "application/json")
    public CreateLead createLead(@RequestBody String createLead) {
        CreateLead leadData = new CreateLead(utilities.stringSplitter(createLead));
       /* List<Contact> contacts = contactRepository.findBySsnOrderById(Integer.parseInt(leadData.getSsn())); // 1 is fico pool
        System.out.println("Size is "+contacts.size());
        System.out.println(contacts.get(0).getContactID()); */
        Lead lead = new Lead(utilities.stringSplitter(createLead));
        leadRepository.save(lead);
        System.out.println(leadData.getStatus()+" : "+leadData.getTransaction_time()+" : "+leadData.getMessage());
        Softpull softpull = new Softpull(utilities.generateLead(leadRepository),utilities.getageFromDOB(leadData.getDate_of_birth()),"D",leadData.getState(),leadData.getOwn_home(),leadData.getMonths_at_address(),leadData.getMonths_at_bank(),leadData.getPay_frequency(),leadData.getLoan_amount(),leadData.getMonthly_income());
        communicationService.doSoftpull(softpull);
        return leadData;
    }
}
