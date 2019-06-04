package com.cg.myprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.MyProjectSpringBoot")
public class MyProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectSpringBootApplication.class, args);
		System.out.println("hi..............");
	}

}
