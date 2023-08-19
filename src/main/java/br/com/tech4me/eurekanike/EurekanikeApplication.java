package br.com.tech4me.eurekanike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekanikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekanikeApplication.class, args);
	}

}
