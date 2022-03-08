package br.com.alst.softwares.namingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingServiceJ11Sb265Application {

	public static void main(String[] args) {
		SpringApplication.run(NamingServiceJ11Sb265Application.class, args);
	}

}
