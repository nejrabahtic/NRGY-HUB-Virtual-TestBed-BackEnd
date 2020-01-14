package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/company").allowedOrigins("http://localhost:8000");
				registry.addMapping("/user").allowedOrigins("http://localhost:8000");
				registry.addMapping("/meter").allowedOrigins("http://localhost:8000");
				registry.addMapping("/building").allowedOrigins("http://localhost:8000");
			}
		};
	}
}
