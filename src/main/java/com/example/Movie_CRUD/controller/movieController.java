package com.example.Movie_CRUD.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_CRUD.model.display_movie;
import com.example.Movie_CRUD.model.movie;
import com.example.Movie_CRUD.service.MovieService;

@RestController
@RequestMapping("/movie")
public class movieController {
	
	private MovieService movieservice;
	
	public movieController(MovieService movieservice) {
		super();
		this.movieservice=movieservice;
	}
	
	@GetMapping("/getall")
	public List<movie> getAllMovies(){
		return movieservice.getAllMovies();
		}
	
	@GetMapping("/displayinfo")
	public List<Map> fordisplay(){
		return movieservice.fordisplay();
	}
	
}

