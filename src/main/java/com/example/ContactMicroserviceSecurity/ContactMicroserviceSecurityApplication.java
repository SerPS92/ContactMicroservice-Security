package com.example.ContactMicroserviceSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class ContactMicroserviceSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceSecurityApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
