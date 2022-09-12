package com.nadir.singlewebapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

@SpringBootApplication
public class SinglewebappApplication {


	public static void main(String[] args) {
		SpringApplication.run(SinglewebappApplication.class, args);
	}

}

@RestController
class HelloWrold{
	@GetMapping("/")
	public String helloEndPoint(){
		return "endpoint to say hello";
	}
}
/*
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class User{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
}*/