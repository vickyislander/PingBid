package com.pingbid.Utilities;

import com.pingbid.controller.LeadHandler;
import com.pingbid.databaseModel.Lead;
import com.pingbid.databaseRepositories.LeadRepository;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
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

    final DateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    Calendar birthDate = Calendar.getInstance();

    public int getageFromDOB(String date) {
        LocalDate today = LocalDate.now();
        try {
            birthDate.setTime(format.parse(date));
            LocalDate birthday = LocalDate.of(birthDate.get(Calendar.YEAR), birthDate.get(Calendar.MONTH), birthDate.get(Calendar.DATE));//int year, int month, int dayOfMonth
            Period p = Period.between(birthday, today);
            return p.getYears();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*public String generateLead(LeadRepository leadrepository){
        boolean size = false;
        String leadid;
        do {
            leadid = "PB"+Integer.toString(700000000 + random.nextInt(999999));
            if ((leadrepository.findByLeadIDOrderById(leadid).size()) == 0) {
                size = true;
            }
        } while (!size);
        return leadid;
    } */

    public Map<String,String> stringSplitter(String createLead){

        //return (createLead==null)?null:createLead.split("client_ip=")[1].split("&")[0];

        Stream<String> words = Stream.of(createLead.split("&"));

        Map<String, String> leadDetails =
                words.map(ele -> ele.split("="))
                     .filter(elem -> elem.length==2)
                     .collect(Collectors.toMap(ele -> ele[0],ele -> ele[1]));

        //can also check for  mandatory fields to be present

        leadDetails.forEach((k,v)->{
            System.out.println("key : "+k+" Value"+v);
        });

        return leadDetails;

    }


}
