package com.templatecloud.transactioneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TransactionEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionEurekaServerApplication.class, args);
	}

}
