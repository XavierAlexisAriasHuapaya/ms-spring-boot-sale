package dev.arias.huapaya.ms_sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSaleApplication.class, args);
	}

}
