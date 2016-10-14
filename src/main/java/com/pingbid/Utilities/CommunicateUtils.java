package com.pingbid.Utilities;

/**
 * Created by rvignesh on 10/9/2016.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.model.PrePull;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CommunicateUtils {

    Map<String,Integer> data = null;

        public Integer post(URL postUrl, PrePull prePull){

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

                data= mapper.readValue(conn.getInputStream(),Map.class);


            } catch (IOException e) {
                e.printStackTrace();
            }

            return data.get("softpull_score");
        }
}
