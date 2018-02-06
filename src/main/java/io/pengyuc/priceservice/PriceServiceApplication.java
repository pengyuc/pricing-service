package io.pengyuc.priceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PriceServiceApplication {

	@GetMapping(value = "/pricing", produces = "application/json")
	public String getPricing() {
		return "{\"price\": 1024}";
	}

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}
}
