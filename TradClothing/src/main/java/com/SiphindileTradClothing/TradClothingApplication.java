package com.SiphindileTradClothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.SiphindileTradClothing") // path of the entity model
@EnableJpaRepositories("com.SiphindileTradClothing.control") // path of jpa repository
@SpringBootApplication
public class TradClothingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradClothingApplication.class, args);
	}

}