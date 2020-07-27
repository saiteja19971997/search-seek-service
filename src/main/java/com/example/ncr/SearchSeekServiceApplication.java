package com.example.ncr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.ncr"})
public class SearchSeekServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchSeekServiceApplication.class, args);
	}

}
