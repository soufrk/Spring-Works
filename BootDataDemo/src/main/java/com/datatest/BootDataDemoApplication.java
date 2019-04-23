package com.datatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import com.datatest.repository.WorkerRepository;

@SpringBootApplication
//@EnableAutoConfiguration
//@SpringBootApplication(scanBasePackages = "com.datatest.entity")
@EntityScan(basePackages = "com.datatest.entity")
//@ComponentScan
//@EnableJpaRepositories
//@EnableJpaRepositories("com.datatest.repositories")
public class BootDataDemoApplication {
	
	//@Autowired WorkerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BootDataDemoApplication.class, args);
	}

}

