package com.cabind.scrapmanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// Enable JPA Auditing
@EnableJpaAuditing
@SpringBootApplication
public class ScrapManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrapManagementApiApplication.class, args);
	}

}
	