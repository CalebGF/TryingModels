package com.ironhack.tryingModels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TryingModelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryingModelsApplication.class, args);
		ViewController viewController = new ViewController();
		viewController.addSalesRep();
	}

}
