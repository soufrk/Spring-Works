package com.datatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration
//@SpringBootApplication(scanBasePackages = "com.datatest.entity")
//@EntityScan
//@ComponentScan
//@EnableJpaRepositories
public class BootDataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDataDemoApplication.class, args);
	}

}

