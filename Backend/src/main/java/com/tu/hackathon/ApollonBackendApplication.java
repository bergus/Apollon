package com.tu.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApollonBackendApplication implements CommandLineRunner {

	@Autowired
	AudioPlayer player;

	public static void main(String[] args) {
		SpringApplication.run(ApollonBackendApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		player.start();
	}
}
