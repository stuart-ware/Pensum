package com.syntaxerror.pensum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PensumApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PensumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IO.println("Servidor Iniciado!");
	}

}
