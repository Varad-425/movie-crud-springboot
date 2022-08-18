package com.example.Movie_CRUD.service;

import java.util.List;
import java.util.Map;

import com.example.Movie_CRUD.model.display_movie;
import com.example.Movie_CRUD.model.movie;


public interface MovieService {

	List<movie> getAllMovies();
	List<Map> fordisplay();
}
