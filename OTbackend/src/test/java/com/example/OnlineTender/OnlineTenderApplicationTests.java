package com.example.OnlineTender;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class OnlineTenderApplicationTests {

	@Test
	void contextLoads() {

	}

	@GetMapping("/test")
	public String test() {
		return "API is working!";
	}
}
