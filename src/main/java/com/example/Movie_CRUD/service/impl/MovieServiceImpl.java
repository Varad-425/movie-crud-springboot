package com.example.Movie_CRUD.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movie_CRUD.model.movie;
import com.example.Movie_CRUD.repository.MovieRepository;
import com.example.Movie_CRUD.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	
	private MovieRepository repo;
	
	
	public MovieServiceImpl(MovieRepository repo) {
		super();
		this.repo=repo;
	}


	@Override
	public List<movie> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
