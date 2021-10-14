package com.andre.apifinancas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.andre.apifinancas")
@EntityScan(basePackages = "com.andre.apifinancas.model")
public class ApiFinancasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFinancasApplication.class, args);
	}

}
