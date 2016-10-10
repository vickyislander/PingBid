package com.pingbid.Utilities;

import com.pingbid.controller.LeadHandler;
import com.pingbid.databaseModel.Lead;
import com.pingbid.databaseRepositories.LeadRepository;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by rvignesh on 9/27/2016.
 */

@Component
public class CommonUtils {

    Random random = new Random();

    public int getageFromDOB(String date) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, 1, 1);
        Period p = Period.between(birthday, today);
        return p.getYears();
    }

    public String generateLead(LeadRepository leadrepository){
        boolean size = false;
        String leadid;
        do {
            leadid = "PB"+Integer.toString(700000000 + random.nextInt(999999));
            if ((leadrepository.findByLeadIDOrderById(leadid).size()) == 0) {
                size = true;
            }
        } while (!size);
        return leadid;
    }

    public Map<String,String> stringSplitter(String createLead){

        //return (createLead==null)?null:createLead.split("client_ip=")[1].split("&")[0];

        Stream<String> words = Stream.of(createLead.split("&"));

        Map<String, String> leadDetails =
                words.map(ele -> ele.split("="))
                     .collect(Collectors.toMap(ele -> ele[0],ele -> ele[1]));

        leadDetails.forEach((k,v)->{
            System.out.println("key : "+k+" Value"+v);
        });

        return leadDetails;

    }


}
