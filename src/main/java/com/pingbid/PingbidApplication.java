package com.pingbid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.persistence.EntityManager;

@SpringBootApplication
@EnableAsync
public class PingbidApplication {

	public static void main(final String... args) {
		SpringApplication.run(PingbidApplication.class, args);
	}
}
