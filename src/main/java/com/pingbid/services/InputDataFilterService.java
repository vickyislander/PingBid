package com.pingbid.services;

import com.pingbid.Utilities.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by rvignesh on 10/15/2016. MIrth64$
 */
public class InputDataFilterService {

    @Autowired
    private CommonUtils commonUtils;

    public void checkConditions(Map<String,String> dataToBeFiltered){

        //dataToBeFiltered.entrySet().stream()
                       // .filter(map -> map.getKey().contentEquals("date_of_birth")?commonUtils.getageFromDOB(map.getValue())>18:)
                       // .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue());





    }

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
