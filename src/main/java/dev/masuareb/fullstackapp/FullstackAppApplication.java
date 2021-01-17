package dev.masuareb.fullstackapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullstackAppApplication {
	private static final Logger logger = LoggerFactory.getLogger(FullstackAppApplication.class);

	public static void main(String[] args) {
		// Add comment for test Dev Tools
		// updated
		SpringApplication.run(FullstackAppApplication.class, args);
		logger.info("Hello Spring Boot");
	}

}
