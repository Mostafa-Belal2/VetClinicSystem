package net.seniorsteps.senior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class VetClinicSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetClinicSpringbootApplication.class, args);
	}

}
