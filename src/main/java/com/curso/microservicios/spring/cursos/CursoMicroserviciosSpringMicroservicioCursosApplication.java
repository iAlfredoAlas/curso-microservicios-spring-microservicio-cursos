package com.curso.microservicios.spring.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CursoMicroserviciosSpringMicroservicioCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMicroserviciosSpringMicroservicioCursosApplication.class, args);
	}

}
