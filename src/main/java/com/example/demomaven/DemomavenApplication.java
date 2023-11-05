package com.example.demomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demomaven")
public class DemomavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomavenApplication.class, args);
	}

}
