package com.pingbid.Utilities;

/**
 * Created by rvignesh on 10/9/2016.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.model.CreateLead;
import com.pingbid.model.PrePull;
import javassist.scopedpool.SoftValueHashMap;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class CommunicateUtils {

    @Value("${deuser}")
    String username;
    @Value("${depass}")
    String password;
    String credentials = username+":"+password;

        //do prepull
        public Integer post(URL postUrl, PrePull prePull){

            int prepullScore =0;

            try{

                // 1. Open connection
                HttpURLConnection conn = (HttpURLConnection) postUrl.openConnection();

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
                System.out.println("\nSending 'POST' request to URL : " + postUrl);
                System.out.println("Response Code : " + responseCode);

                prepullScore = mapper.readValue(conn.getInputStream(),Integer.class);


            } catch (IOException e) {
                e.printStackTrace();
            }

            return prepullScore;
        }

    //do softpull
    public Map<String, ?> post(URL postUrl, CreateLead lead){

        Map<String,?> data = null;

        try{

            // 1. Open connection
            HttpURLConnection conn = (HttpURLConnection) postUrl.openConnection();

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
            System.out.println("\nSending 'POST' request to URL : " + postUrl);
            System.out.println("Response Code : " + responseCode);

            data= mapper.readValue(conn.getInputStream(),Map.class);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

}
