package com.example.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"com.example.demo"})
public class ProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDemoApplication.class, args);
	}

}
