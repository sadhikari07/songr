package com.sudadh.code401javaSongr.songrLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongrLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrLabApplication.class, args);
		System.out.println("http://localhost:8080/album");
	}

}
