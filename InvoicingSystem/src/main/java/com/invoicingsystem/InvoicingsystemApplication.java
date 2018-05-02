package com.invoicingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan("com.invoicingsystem.*")
@EnableTransactionManagement
public class InvoicingsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvoicingsystemApplication.class, args);
		System.out.println("Running=====================");
	}
}
