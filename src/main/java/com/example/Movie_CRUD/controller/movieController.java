package com.example.Movie_CRUD.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/displayinfo")
	public List<Map> fordisplay(){
		return movieservice.fordisplay();
	}
	
	@GetMapping("/movies")
	public List<movie> list() {
		return movieservice.listAll();
	}

	@PostMapping("/add-movies")
	public void add(@RequestBody movie movies) {
		movieservice.save(movies);
	}

	@GetMapping("/movies/{movie_id}")
	public ResponseEntity<movie> get(@PathVariable Integer movie_id) {
		try {
			movie movies = movieservice.get(movie_id);
			return new ResponseEntity<movie>(movies, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<movie>(HttpStatus.NOT_FOUND);
			}}

	@PostMapping("/search-genre")
	public List<movie> search(@RequestBody movie movies) {
		return movieservice.listgenre(movies);
	}

	@PostMapping("/search-actor")
	public List<movie> searchactor(@RequestBody movie movies) {
		return movieservice.listactor(movies);

	}

	@GetMapping("/getMovieByRuntimeGreaterThan/{runtime}")
	public List<movie> getMovieByRuntimeGreaterThan(@PathVariable Integer runtime) {
		return movieservice.getMovieByRuntimeGreaterThan(runtime);
		
		}
	
}

