package com.example.Movie_CRUD.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_CRUD.model.movie;
import com.example.Movie_CRUD.service.MovieService;

@RestController
@RequestMapping("/")
public class movieController {

	private MovieService movieservice;

	public movieController(MovieService movieservice) {
		super();
		this.movieservice=movieservice;
	}
	
	@GetMapping("/home")
	public String getAllMovies(Model model){
		List<movie> movies=movieservice.getAllMovies();
		model.addAttribute("moviesList",movies);
		return "index";
	}
}
