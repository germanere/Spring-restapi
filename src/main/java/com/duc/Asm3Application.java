package com.duc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Library APIS",version = "1.0",description = "Library Management Apis."))
public class Asm3Application {

	public static void main(String[] args) {
		SpringApplication.run(Asm3Application.class, args);
	}

}
