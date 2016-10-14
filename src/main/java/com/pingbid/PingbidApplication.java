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
