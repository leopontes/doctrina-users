package br.com.doctrina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com.doctrina")
@EnableJpaRepositories(basePackages = "br.com.doctrina.repository")
public class DoctrinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctrinaApplication.class, args);
	}

}
