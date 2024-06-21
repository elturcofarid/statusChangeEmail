package com.util.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.util.email"})

public class StatusEmailServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusEmailServicesApplication.class, args);
	}

}



