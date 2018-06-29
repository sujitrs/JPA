package com.example.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



@SpringBootApplication
@EnableJpaAuditing
public class JpaApplication {


	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}


