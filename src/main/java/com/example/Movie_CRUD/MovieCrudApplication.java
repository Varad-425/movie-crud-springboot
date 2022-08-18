package com.example.Movie_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieCrudApplication {

	public static void main(String[] args) {
		System.setProperty("server.connection-timeout","-1");
		SpringApplication.run(MovieCrudApplication.class, args);
	}

}
