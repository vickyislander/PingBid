package com.pingbid.Utilities;

/**
 * Created by rvignesh on 10/9/2016.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.model.*;
import javassist.scopedpool.SoftValueHashMap;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.hibernate.validator.constraints.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Component
public class CommunicateUtils {

    @Value("${deuser}")
    String username;
    @Value("${depass}")
    String password;
    String credentials = username+":"+password;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

        //do prepull
        public PrePull post(String postUrl, PrePull prePull){

            PrePull prepullScore =null;

            try{

                // 1. Open connection
                HttpURLConnection conn = (HttpURLConnection) new URL(postUrl).openConnection();

                // 2. Specify POST method
                conn.setRequestMethod("POST");

                // 3. Set the headers
                conn.setRequestProperty("Content-Type", "application/json");

                conn.setDoOutput(true);

                //`4. Use Jackson object mapper to convert java object into JSON
                ObjectMapper mapper = new ObjectMapper();

                // 5.1 Get connection output stream
                DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

                // 5.2 Copy Content "JSON" into
                mapper.writeValue((DataOutput) wr, prePull);

                // 5.3 Send the request
                wr.flush();

                // 5.4 close
                wr.close();

                // 6. Get the response
                int responseCode = conn.getResponseCode();
                logger.info("\nSending 'POST' request to URL : " + postUrl);
                logger.info("Response Code : " + responseCode);

                prepullScore = mapper.readValue(conn.getInputStream(),PrePull.class);


            } catch (IOException e) {
                logger.error(ExceptionUtils.getStackTrace(e));
            } catch (Exception e){
                logger.error(ExceptionUtils.getStackTrace(e));
            }

            return prepullScore;
        }


    public Softpull post(String postUrl, CreateLead lead){

        Softpull softpull = null;

        try{

            // 1. Open connection
            HttpURLConnection conn = (HttpURLConnection) new URL(postUrl).openConnection();

            // 2. Specify POST method
            conn.setRequestMethod("POST");

            // 3. Set the headers
            conn.setRequestProperty("Content-Type", "application/json");

            // 4.Set authorization headers
            conn.setRequestProperty("Authorization", "Basic "+ Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8)));

            conn.setDoOutput(true);

            // 5. Use Jackson object mapper to convert java object into JSON
            ObjectMapper mapper = new ObjectMapper();

            // 6. Get connection output stream
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

            // 7. Copy Content "JSON" into
            mapper.writeValue((DataOutput) wr, lead);

            // 8. Send the request
            wr.flush();

            // 9. close
            wr.close();

            // 6. Get the response
            int responseCode = conn.getResponseCode();
            logger.info("\nSending 'POST' request to URL : " + postUrl);
            logger.info("Response Code : " + responseCode);

            softpull = mapper.readValue(conn.getInputStream(),Softpull.class);


        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        } catch (Exception e){
            logger.error(ExceptionUtils.getStackTrace(e));
        }

        return softpull;
    }

    public EmailTrigger post(String postUrl, SendMail sendMail){

        EmailTrigger emailTrigger = null;

        try{

            // 1. Open connection
            HttpURLConnection conn = (HttpURLConnection) new URL(postUrl).openConnection();

            // 2. Specify POST method
            conn.setRequestMethod("POST");

            // 3. Set the headers
            conn.setRequestProperty("Content-Type", "application/json");

            // 4.Set authorization headers
            conn.setRequestProperty("Authorization", "Basic "+ Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8)));

            conn.setDoOutput(true);

            // 5. Use Jackson object mapper to convert java object into JSON
            ObjectMapper mapper = new ObjectMapper();

            // 6. Get connection output stream
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

            // 7. Copy Content "JSON" into
            mapper.writeValue((DataOutput) wr, sendMail);

            // 8. Send the request
            wr.flush();

            // 9. close
            wr.close();

            // 6. Get the response
            int responseCode = conn.getResponseCode();
            logger.info("\nSending 'POST' request to URL : " + postUrl);
            logger.info("Response Code : " + responseCode);

            emailTrigger = mapper.readValue(conn.getInputStream(),EmailTrigger.class);


        } catch (IOException e) {
            logger.info(ExceptionUtils.getStackTrace(e));
        } catch (Exception e){
            logger.info(ExceptionUtils.getStackTrace(e));
        }

        return emailTrigger;
    }

}
