package com.springwebfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringwebfluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxDemoApplication.class, args);
	}

}
