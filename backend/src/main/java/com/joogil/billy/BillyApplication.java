package com.joogil.billy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource("classpath:secrets/mysql.properties"),
	@PropertySource("classpath:secrets/security.properties")
})
public class BillyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillyApplication.class, args);
	}

}
