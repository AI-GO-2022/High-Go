package AIGO.highgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing
public class HighgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighgoApplication.class, args);
	}

}
