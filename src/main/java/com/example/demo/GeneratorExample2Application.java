package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.repository.BooksIdRepository;
import com.example.demo.service.BooksService;

@SpringBootApplication
public class GeneratorExample2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(GeneratorExample2Application.class, args);
		System.out.println("Bean Definition count ="+run.getBeanDefinitionCount());
		
		
		  BooksService bean = run.getBean(BooksService.class);
		  
		  bean.bookSavingDetails();
		 
		
	}

}
