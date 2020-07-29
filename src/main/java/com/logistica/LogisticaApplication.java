package com.logistica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@Configuration
public class LogisticaApplication   {

	public static void main(String[] args) {
		SpringApplication.run(LogisticaApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
