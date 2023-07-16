package com.example.vti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.vti.Controller.MainController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VtiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtiApplication.class, args);
	}


}
