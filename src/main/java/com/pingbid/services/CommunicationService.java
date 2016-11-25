package com.pingbid.services;

import com.pingbid.Utilities.CommunicateUtils;
import com.pingbid.model.CreateLead;
import com.pingbid.model.PrePull;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;


/**
 * Created by rvignesh on 9/24/2016.
 */

@Service
public class CommunicationService {

    private static final String PREPULL_URL = "http://test-de1.adfdata.net:8000/softpull_model/";

    private static final String SOFTPULL_URL = "http://test-de1.adfdata.net:8080/de-service/api/pb/offer/";

    public void doPrepullScore(PrePull prePull){

        try {
            prePull.setPrePull_score(new CommunicateUtils().post(new URL(PREPULL_URL), prePull));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public void doSoftpull(CreateLead lead){

        try {
             new CommunicateUtils().post(new URL(SOFTPULL_URL), lead);
        } catch (MalformedURLException e) {
             e.printStackTrace();
        }

    }

}
