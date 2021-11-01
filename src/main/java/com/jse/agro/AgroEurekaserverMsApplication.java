package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AgroEurekaserverMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroEurekaserverMsApplication.class, args);
	}

}
