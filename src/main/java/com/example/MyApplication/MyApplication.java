package com.example.MyApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(MyApplication.class, args);
	}
	
	@Bean
	public  RestTemplate rtMethod()
	{
		return new RestTemplate();
	}
}
