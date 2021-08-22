package com.example.airfoil_data;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AirfoilDataApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AirfoilDataApplication.class, args);
	}
	
	@GetMapping
	public List<String> message()
	{
		return List.of("Hello","World");
	}
}
