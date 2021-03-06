package com.alexis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class HelloThymeApplication {

	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("author", "Alexis Anderson");
		model.addAttribute("favoriteFood", "tacos");
		model.addAttribute("favoriteTV", "The Simpsons");

		List favoriteMovies = Arrays.asList("Finding Nemo", "Armageddon", "Liar Liar");
		model.addAttribute("favoriteMovies", favoriteMovies);

		return "index.html";
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloThymeApplication.class, args);
	}
}
