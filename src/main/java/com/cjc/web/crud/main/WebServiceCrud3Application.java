package com.cjc.web.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceCrud3Application {

	public static void main(String[] args) {
		System.out.println("This is Web Service Crud 3");
		System.out.println("This is web modification to pranali");
		
		System.out.println("modification by prem 1");
		System.out.println("modification by prem 2");
		SpringApplication.run(WebServiceCrud3Application.class, args);
	}

}
