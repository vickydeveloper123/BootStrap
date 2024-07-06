package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJapConnectionToMySql1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJapConnectionToMySql1Application.class, args);
	
		System.out.println(" Getting the class name from which package we have got imported the data ->"+run.getClass().getName());
	
		System.out.println("  Number of beans count in this Application ->"+run.getBeanDefinitionCount());
	}

}
