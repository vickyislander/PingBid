package com.pingbid.Utilities;

import com.pingbid.controller.LeadHandler;
import com.pingbid.databaseModel.Lead;
import com.pingbid.databaseRepositories.LeadRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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

        logger.info(createLead);

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

    public boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }

    public static String generateLeadID(Map<String,String> leadDetails) {
        final int prime = 31;
        int result = 1;
        String email = leadDetails.get("email");
        String fName = leadDetails.get("first_name");
        String lName = leadDetails.get("last_name");
        String zip = leadDetails.get("zip");
        String prefix = "P";


        result = prime * result + ((email == null) ? 0 : email.toLowerCase().hashCode());
        result = prime * result + ((fName == null) ? 0 : fName.toLowerCase().hashCode());
        result = prime * result + ((lName == null) ? 0 : lName.toLowerCase().hashCode());
        result = prime * result + ((zip == null)   ? 0 : zip.toLowerCase().hashCode());
        result = prime * result + ((prefix == null) ? 0 : prefix.toLowerCase().hashCode());

        if (result < 0) {
            return prefix + "T" + ("" + result).substring(1);
        }
        return prefix + "B" + result;
    }


}
