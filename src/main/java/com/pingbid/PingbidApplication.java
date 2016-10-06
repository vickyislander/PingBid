package com.pingbid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.EntityManager;

@SpringBootApplication
public class PingbidApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingbidApplication.class, args);
	}
}
