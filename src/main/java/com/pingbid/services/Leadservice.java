package com.pingbid.services;

import com.pingbid.databaseRepositories.ContactRepository;
import com.pingbid.databaseRepositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rvignesh on 10/12/2016.
 */

@Service
public class Leadservice {

    private LeadRepository leadRepository;


    @Autowired
    public Leadservice(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }




}
