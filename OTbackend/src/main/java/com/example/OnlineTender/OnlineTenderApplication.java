package com.example.OnlineTender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class OnlineTenderApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlineTenderApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200") // Your Angular app URL
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add OPTIONS
						.allowedHeaders("*")
						.allowCredentials(true); // If using cookies/auth headers
			}
		};
	}
}