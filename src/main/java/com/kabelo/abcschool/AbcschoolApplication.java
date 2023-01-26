package com.kabelo.abcschool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbcschoolApplication {

	private static final Logger logger= LoggerFactory.getLogger(AbcschoolApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AbcschoolApplication.class, args);
		logger.info("Application Started");
	}

}
