package com.pingbid;

import com.google.common.cache.CacheBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.persistence.EntityManager;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class PingbidApplication {

	public static final String CACHE_LEAD = "lead";

	public static void main(final String... args) {
		SpringApplication.run(PingbidApplication.class, args);
	}

	@Bean
	public CacheManager cacheManager() {

			GuavaCacheManager guavaCacheManager = new GuavaCacheManager();
			guavaCacheManager.setCacheBuilder(CacheBuilder.newBuilder());
			return guavaCacheManager;
	}
}


/*
{
	"offers": [{
		"amount": 1000,
		"rate": 139.9,
		"term": 36,
		"isFeatured": 1,
		"isSelected": 0,
		"monthlyPayment": 118.82634,
		"biWeeklyPayment": 54.725605,
		"offerId": 392988
	}, {
		"amount": 1000,
		"rate": 139.9,
		"term": 48,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 117.17224,
		"biWeeklyPayment": 54.03971,
		"offerId": 392989
	}, {
		"amount": 1000,
		"rate": 139.9,
		"term": 24,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 125.4791,
		"biWeeklyPayment": 57.580673,
		"offerId": 392990
	}, {
		"amount": 2500,
		"rate": 139.9,
		"term": 24,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 313.69775,
		"biWeeklyPayment": 143.95169,
		"offerId": 392991
	}, {
		"amount": 2500,
		"rate": 139.9,
		"term": 36,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 297.06583,
		"biWeeklyPayment": 136.81401,
		"offerId": 392992
	}, {
		"amount": 3000,
		"rate": 139.9,
		"term": 36,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 475.30536,
		"biWeeklyPayment": 218.90242,
		"offerId": 392993
	}, {
		"amount": 2500,
		"rate": 139.9,
		"term": 48,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 351.5167,
		"biWeeklyPayment": 162.11913,
		"offerId": 392994
	}, {
		"amount": 3000,
		"rate": 139.9,
		"term": 48,
		"isFeatured": 0,
		"isSelected": 0,
		"monthlyPayment": 468.68896,
		"biWeeklyPayment": 216.15884,
		"offerId": 392995
	}],
	"status": {
		"value": "Ok",
		"id": 200,
		"optionalValue": ""
	},
	"scores": {
		"softpull_score": "19",
		"model2": "858",
		"cv": "640",
		"model1": "907",
		"maxOffer": "3000.0",
		"softpull_score_cutoff": "14",
		"conversion_score": "51",
		"vantage": "640",
		"ensmbleModel": "938"
	}
}

//rejected

{
	"status": "rejected",
	"first_name": "sadha",
	"last_name": "sivam",
	"transaction_time": "2016-09-02 11:24:05.350032",
	"LeadID": "PB3000025",
	"seller_group": "7",
	"message": "Code 32: Unmet purchase criteria",
	"email": "SShanmugam@applieddatafinance.com"
}

{"status":{"value":"No Offer","id":202,"optionalValue":""},"scores":
{"softpull_score":"9998","ficco":"+586","model2":"890","cv":"+650","model1":"982","softpull_score_cutoff":"14","conversion_score":"402","vantage":"+650","ensmbleModel":"956"}}


//email trigger

{
	"status": "accepted",
	"first_name": "Bharthi",
	"last_name": "Ediga",
	"redirect_url": "https://test-ui.adfdata.net/landing?src=UEI=&leadid=PB858565847",
	"seller_group": "7",
	"transaction_time": "2016-09-02 11:06:54.364645",
	"email": "bharathkrishnan.r@applieddatafinance.com",
	"LeadID": "PB858565847"
}

 */
