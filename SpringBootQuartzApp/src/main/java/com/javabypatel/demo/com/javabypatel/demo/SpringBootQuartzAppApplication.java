package com.javabypatel.demo.com.javabypatel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.javabypatel.demo")
@SpringBootApplication
public class SpringBootQuartzAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQuartzAppApplication.class, args);
		//http://javabypatel.blogspot.com/2017/10/quartz-scheduler-spring-boot-example.html
	}
}
