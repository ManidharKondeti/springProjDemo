package com.example.SLADemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SlaDemoApplication {
        
       @GetMapping("/msg")
       public String message(){
           return "Testing the Azure Deployment";
       }

	public static void main(String[] args) {
		SpringApplication.run(SlaDemoApplication.class, args);
	}

}
