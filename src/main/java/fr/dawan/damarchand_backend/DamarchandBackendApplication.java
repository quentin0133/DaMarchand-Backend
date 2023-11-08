package fr.dawan.daMarchand_backend;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaMarchandBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaMarchandBackendApplication.class, args);
	}

}
