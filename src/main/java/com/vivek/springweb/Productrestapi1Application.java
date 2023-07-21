package com.vivek.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Productrestapi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Productrestapi1Application.class, args);
	}

}
