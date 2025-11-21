package com.omar_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OmarSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmarSpringbootApplication.class, args);
	}


    @GetMapping("/hello")
	public String helloWorld(){
		return "Hello World API is runnning successfully";
	}

}
