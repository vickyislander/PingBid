package com.pingbid.communicate;

import com.pingbid.model.Softpull;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;


/**
 * Created by rvignesh on 9/24/2016.
 */

@Service
public class CommunicationService {

    private static final String SOFTPULL_URL = "http://test-de1.adfdata.net:8000/softpull_model/";

    public void doSoftpull(Softpull softpull){

        try {
            softpull.setSoftpull_score(new Communicate().post(new URL(SOFTPULL_URL),softpull));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

}
