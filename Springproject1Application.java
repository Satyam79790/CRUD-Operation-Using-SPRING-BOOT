package com.project1.springproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.project1.springproject1")
public class Springproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springproject1Application.class, args);
	}

}
