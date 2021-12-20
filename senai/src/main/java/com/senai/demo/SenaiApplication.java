package com.senai.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class SenaiApplication implements CommandLineRunner{

	public static void main(String... args) throws Exception{
		SpringApplication.run(SenaiApplication.class, args);
	}

}
