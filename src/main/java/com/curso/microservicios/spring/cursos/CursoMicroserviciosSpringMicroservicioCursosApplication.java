package com.curso.microservicios.spring.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import io.github.cdimascio.dotenv.Dotenv;

@EnableEurekaClient
@SpringBootApplication
public class CursoMicroserviciosSpringMicroservicioCursosApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
		SpringApplication.run(CursoMicroserviciosSpringMicroservicioCursosApplication.class, args);
	}

}
