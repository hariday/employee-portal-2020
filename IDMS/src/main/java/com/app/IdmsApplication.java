package com.app;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(scanBasePackages={
		"com.app.repository"})
/* @EntityScan("com.app.entities") */
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,ErrorMvcAutoConfiguration.class})

public class IdmsApplication extends ServletInitializer{

	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(IdmsApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8081"));
	        app.run(args);
	}

}
