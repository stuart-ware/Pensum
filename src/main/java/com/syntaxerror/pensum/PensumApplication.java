package com.syntaxerror.pensum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// NO TIENES QUE TOCAR ESTE MAIN
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.syntaxerror.pensum.repository")
@EntityScan(basePackages = "com.syntaxerror.pensum.models")            
public class PensumApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PensumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IO.println("Servidor Iniciado!");
	}

}
