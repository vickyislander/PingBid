package com.pingbid.services;

import com.pingbid.Utilities.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by rvignesh on 10/15/2016. MIrth64$
 */
public class InputDataFilterService {

    @Autowired
    private CommonUtils commonUtils;

    public void checkConditions(Map<String, String> dataToBeFiltered) {


      dataToBeFiltered.entrySet().stream()
           //.filter(this::filterNotMandatoryFields)
           .filter((map)-> map.getKey().contentEquals("date_of_birth") && Integer.parseInt(map.getValue())>18)
           .filter((map)-> map.getKey().contentEquals("scorable") && Integer.parseInt(map.getValue())==0 || Integer.parseInt(map.getValue())==1)
           .filter((map)-> map.getKey().contentEquals("is_military") && Integer.parseInt(map.getValue())==0 || Integer.parseInt(map.getValue())==1)
           .filter((map)-> map.getKey().contentEquals("own_home")  && Integer.parseInt(map.getValue())==0 || Integer.parseInt(map.getValue())==1)
           .filter((map)-> map.getKey().contentEquals("is_live")  && Integer.parseInt(map.getValue())==0 || Integer.parseInt(map.getValue())==1)
           .filter((map)-> map.getKey().contentEquals("buyin")  && Integer.parseInt(map.getValue())==0 || Integer.parseInt(map.getValue())==1)
           .filter((map)-> map.getKey().contentEquals("pay_frequency") && map.getValue().equalsIgnoreCase("BI_WEEKLY") || map.getValue().equalsIgnoreCase("WEEKLY") || map.getValue().equalsIgnoreCase("TWICE_PER_MONTH") || map.getValue().equalsIgnoreCase("MONTHLY") || map.getValue().equalsIgnoreCase("OTHER") )
           .filter((map)-> map.getKey().contentEquals("zip") && map.getValue().length()<5)
           .filter((map)-> map.getKey().contentEquals("date_of_birth") && Integer.parseInt(map.getValue())>18)
           .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

    }










    /*public  filterNotMandatoryFields() {
        //return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
        return (map) -> map.getKey() == "";
    }*/

    /*

            if 'scorable' not in diffset:
            if pblead['scorable'] not in ['0','1']:
                diffset.add('scorable')
        if 'is_military' not in diffset:
            if pblead['is_military'] not in ['0','1']:
                diffset.add('is_military')
        if 'own_home' in pblead:
            if pblead['own_home'] not in ['0','1']:
                diffset.add('own_home')
        if 'is_live' not in diffset:
            if pblead['is_live']  not in ['0','1']:
                diffset.add('is_live')
        if 'buyin' not in diffset:
            if pblead['buyin'] not in ['0','1']:
                diffset.add('buyin')
        if 'pay_frequency' not in diffset:
            if pblead['pay_frequency'] not in ["BI_WEEKLY",  "WEEKLY", "TWICE_PER_MONTH", "MONTHLY", "OTHER"]:
                diffset.add('pay_frequency')

                if 'date_of_birth' not in diffset:
            try:
                dob = parse(pblead['date_of_birth'])
                now = datetime.datetime.now()
                diff = relativedelta(now, dob).years
                if diff < 18:
                    logger.info('Applicant is under 18')
                    diffset.add('date_of_birth')
            except Exception, e:
                logger.error('date_of_birth problem')
                logger.exception(e);
                diffset.add('date_of_birth')

                     if 'zip' not in diffset:
            thezip = str(pblead['zip'][:5])
            if thezip.isdigit() is False:
                diffset.add('zip')

     */
}
