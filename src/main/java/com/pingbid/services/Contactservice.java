package com.pingbid.services;

import com.pingbid.databaseModel.Contact;
import com.pingbid.databaseRepositories.ContactRepository;
import com.pingbid.databaseRepositories.LeadRepository;
import com.pingbid.model.CreateLead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rvignesh on 10/12/2016.
 */
@Service
public class Contactservice {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private ContactRepository contactRepository;

    @Autowired
    public Contactservice(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public boolean checkSSN(CreateLead leadData){

        List<Contact> contacts = contactRepository.findBySsn(leadData.getSsn());
        boolean ssn  = (contacts.size()<=0) ? false : true;
        return ssn;
    }


//data == null) ? null
    //: data.trim()





}
