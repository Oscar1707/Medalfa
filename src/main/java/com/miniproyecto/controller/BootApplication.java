package com.miniproyecto.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.miniproyecto.controller.reposotory")
@SpringBootApplication
public class BootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
