package com.pingbid.services;

import com.pingbid.Utilities.CommunicateUtils;
import com.pingbid.model.*;

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

    @Value("${emailer}")
    private String EMAIL_URL;


    public PrePull doPrepullScore(PrePull prePull){
         return communicateUtils.post(PREPULL_URL, prePull);
    }

    public Softpull doSoftpull(CreateLead lead) {
        return communicateUtils.post(SOFTPULL_URL, lead);
    }

    public EmailTrigger doSendMail(SendMail sendMail){
        return communicateUtils.post(EMAIL_URL,sendMail);
    }
}
