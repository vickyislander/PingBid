package com.pingbid.services;

import com.pingbid.Utilities.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by rvignesh on 10/15/2016.
 */
@Service
public class InputDataFilterService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommonUtils commonUtils;

    Map<String, String> dataToBeFiltered = null;

    String message = "";

    public void checkConditions(Map<String, String> dataToBeFiltered) {

        try {

            Map<String, String> filteredData = dataToBeFiltered.entrySet().stream()
                    .filter((map) -> map.getKey().contentEquals("date_of_birth") && commonUtils.getageFromDOB(map.getValue()) > 18)
                    .filter((map) -> map.getKey().contentEquals("scorable") && Integer.parseInt(map.getValue()) == 0 || Integer.parseInt(map.getValue()) == 1)
                    .filter((map) -> map.getKey().contentEquals("is_military") && Integer.parseInt(map.getValue()) == 0 || Integer.parseInt(map.getValue()) == 1)
                    .filter((map) -> map.getKey().contentEquals("own_home") && Integer.parseInt(map.getValue()) == 0 || Integer.parseInt(map.getValue()) == 1)
                    .filter((map) -> map.getKey().contentEquals("is_live") && Integer.parseInt(map.getValue()) == 0 || Integer.parseInt(map.getValue()) == 1)
                    .filter((map) -> map.getKey().contentEquals("buyin") && Integer.parseInt(map.getValue()) == 0 || Integer.parseInt(map.getValue()) == 1)
                    .filter((map) -> map.getKey().contentEquals("pay_frequency") && map.getValue().equalsIgnoreCase("BI_WEEKLY") || map.getValue().equalsIgnoreCase("WEEKLY") || map.getValue().equalsIgnoreCase("TWICE_PER_MONTH") || map.getValue().equalsIgnoreCase("MONTHLY") || map.getValue().equalsIgnoreCase("OTHER"))
                    .filter((map) -> map.getKey().contentEquals("zip") && commonUtils.isInteger(map.getValue()))
                    .filter((map) -> map.getKey().contentEquals("zip") && map.getValue().length() == 5)
                    .filter((map) -> map.getKey().contentEquals("ssn") && map.getValue().length() == 9)
                    .filter((map) -> map.getKey().contentEquals("ssn") && commonUtils.isInteger(map.getValue()))
                    .filter((map) -> map.getKey().contentEquals("phone_home") && commonUtils.isInteger(map.getValue()))
                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

            if (message != "")
                logger.error("Invalid contact details " + message);
            throw new RuntimeException("Invalid contact details " + message);

        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public void containsKey(List<String> key) {
        /*Mandatory fields which needs to be present*/
        String[] mandatoryFields = {"client_ip", "loan_amount", "first_name", "last_name", "email", "ssn", "date_of_birth", "address1", "city", "state", "zip", "country_code", "phone_home", "is_military", "income_type", "pay_per_period", "monthly_income",
                "pay_frequency", "employer_name", "is_live", "seller_group", "subid", "buyin", "price", "Campaign", "scorable", "own_home"};
        List<String> manFields = Arrays.asList(mandatoryFields);
        key.forEach(entry -> {
            if (!manFields.contains(entry)) {
                message = message + " , " + entry;
            }
        });
        if (message.trim() != "") {
            message = "Enter valid data in fields : " + message;
        }
    }
}
