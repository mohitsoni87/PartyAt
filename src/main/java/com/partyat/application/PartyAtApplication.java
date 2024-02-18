package com.partyat.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@Configuration
@ComponentScan(basePackages="com.partyat")
public class PartyAtApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartyAtApplication.class, args);
	}

}
