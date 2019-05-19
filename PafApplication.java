package com.paf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PafApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PafApplication.class, args);
		
		
	}

}
