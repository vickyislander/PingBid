package com.pingbid.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rvignesh on 10/26/2016.
 */
@Component
public class Softpull {

    @Value("${standalone}")
    private String standalone;

    Integer prepull_score = 0;
    Integer prepull_cutoff = 0;
    Integer conv_score = 0;
    Integer modelscoreV1 = 0;
    Integer vantage = 0;
    Integer scored_price = 0;







}
