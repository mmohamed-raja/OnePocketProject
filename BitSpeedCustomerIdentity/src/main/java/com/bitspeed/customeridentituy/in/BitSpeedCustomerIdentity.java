package com.bitspeed.customeridentituy.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.bitspeed.customeridentituy.in.repository.ContactRepository;

@SpringBootApplication
@Component
@EnableJpaRepositories(basePackageClasses = ContactRepository.class)
public class BitSpeedCustomerIdentity {

	public static void main(String[] args) {
		SpringApplication.run(BitSpeedCustomerIdentity.class, args);
	}

}
