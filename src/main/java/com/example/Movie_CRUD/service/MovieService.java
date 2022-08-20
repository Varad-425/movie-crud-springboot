package com.example.Movie_CRUD.service;

import java.util.List;
import java.util.Map;

import com.example.Movie_CRUD.model.movie;


public interface MovieService {

	List<Map> fordisplay();
	List<movie> listAll();
	List<movie> listgenre(movie movies);
	List<movie> listactor(movie movies);
	movie get(Integer movie_id);
	List<movie> getMovieByRuntimeGreaterThan(Integer runtime);
	void save(movie movies);
	
}
