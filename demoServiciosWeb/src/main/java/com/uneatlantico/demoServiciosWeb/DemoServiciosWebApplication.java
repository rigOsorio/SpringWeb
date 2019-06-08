package com.uneatlantico.demoServiciosWeb;

import com.uneatlantico.demoServiciosWeb.Modelos.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoServiciosWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiciosWebApplication.class, args);
		Persona persona=new Persona();
	}

}
