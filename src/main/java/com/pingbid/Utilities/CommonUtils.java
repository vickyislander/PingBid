package com.pingbid.Utilities;

import com.pingbid.controller.LeadHandler;
import com.pingbid.databaseModel.Lead;
import com.pingbid.databaseRepositories.LeadRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

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


}
