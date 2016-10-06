package com.pingbid.communicate;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingbid.model.Softpull;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.client.HttpClient;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;


/**
 * Created by rvignesh on 9/24/2016.
 */

@Service
public class CommunicationHelper {

    private static final String SOFTPULL_URL = "http://test-de1.adfdata.net:8000/softpull_model/";

    private static final String PRE_PULL_SCORE = "bankName";

    static ObjectMapper mapper = new ObjectMapper();

    static CloseableHttpAsyncClient client;

    static org.apache.http.client.HttpClient sync;

    //static ExecutorService ex = Executors.newFixedThreadPool(20);

    static ConnectionKeepAliveStrategy myStrategy = (response, context) -> 50 * 1000;

    static {

        ConnectionReuseStrategy reuseStrategy = (response, context) -> true;

        client = HttpAsyncClients.custom().setKeepAliveStrategy(myStrategy).setMaxConnPerRoute(5)
                .setMaxConnTotal(10).setConnectionReuseStrategy(reuseStrategy)
                .build();
        client.start();
    }

    public void doSoftpull(Softpull softpull){

        HttpPost pullRequest = new HttpPost(SOFTPULL_URL);
        try {
            //System.out.print(softpull.getLeadid()+" "+softpull.getAge()+" "+softpull.getFico_pool()+" "+softpull.getState()+" "+softpull.getMonths_at_address()+" "+softpull.getMonths_at_bank()+" "+softpull.getPay_frequency()+" "+softpull.getLoan_amount());
            StringEntity params = new StringEntity(softpull.toString());
            System.out.println(params);
            pullRequest.addHeader("content-type", "application/json");
            pullRequest.setEntity(params);
            System.out.println("pull Request "+pullRequest.getEntity());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        client.execute(pullRequest, new FutureCallback<HttpResponse>() {
            @Override
            public void completed(final HttpResponse response) {
                Map<String, String> prePullScore;
                try {
                    prePullScore = mapper.readValue(response.getEntity().getContent(), Map.class);
                    System.out.println(prePullScore);
                    int prepullScore = Integer.parseInt(prePullScore.get(PRE_PULL_SCORE));
                    softpull.setSoftpull_score(prepullScore);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void failed(Exception e) {

            }

            @Override
            public void cancelled() {
            }

        });

        }

}
