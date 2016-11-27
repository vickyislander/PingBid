package com.pingbid.services;

import com.pingbid.Utilities.CommunicateUtils;
import com.pingbid.model.CreateLead;
import com.pingbid.model.PrePull;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by rvignesh on 9/24/2016.
 */

@Service
public class CommunicationService {

    @Autowired
    public CommunicateUtils communicateUtils;

    @Value("${prepullurl}")
    private String PREPULL_URL;

    @Value("${softpullurl}")
    private String SOFTPULL_URL;

    public void doPrepullScore(PrePull prePull){

        try {
            prePull.setPrePull_score(communicateUtils.post(new URL(PREPULL_URL), prePull));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public void doSoftpull(CreateLead lead){

        try {
            communicateUtils.post(new URL(SOFTPULL_URL), lead);
        } catch (MalformedURLException e) {
             e.printStackTrace();
        }

    }

}
