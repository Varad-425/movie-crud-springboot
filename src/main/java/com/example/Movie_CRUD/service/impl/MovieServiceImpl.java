package com.example.Movie_CRUD.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.Movie_CRUD.model.Genreid;
import com.example.Movie_CRUD.model.actor;
import com.example.Movie_CRUD.model.actors;
import com.example.Movie_CRUD.model.display_movie;
import com.example.Movie_CRUD.model.genre;
import com.example.Movie_CRUD.model.movie;
import com.example.Movie_CRUD.repository.MovieRepository;
import com.example.Movie_CRUD.repository.displayRepos;
import com.example.Movie_CRUD.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	
	private MovieRepository repo;
	private displayRepos repos;
	
	public MovieServiceImpl(MovieRepository repo,displayRepos repos) {
		super();
		this.repo=repo;
		this.repos=repos;
	}


	@Override
	public List<movie> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@SuppressWarnings("null")
	@Override
	public List<Map> fordisplay() {
		List<display_movie> dis = repos.findAll();
		Map dpmap=new HashMap();
		List<Map> flist=new ArrayList();
		List<String> actors=new ArrayList<String>();
		List<String> genres=new ArrayList<String>();
		for(display_movie hell:dis) {
			dpmap=new HashMap();
			actors=new ArrayList<String>();
			genres=new ArrayList<String>();
			dpmap.put("Id ", hell.getId());
			dpmap.put("Tagline", hell.getTagline());
			dpmap.put("Description", hell.getOverview());
			dpmap.put("Imdb Rating",hell.getVote_average());
			dpmap.put("Ratings ", hell.getPopularity());
			dpmap.put("Title", hell.getTitle());
			dpmap.put("Releaste Date", hell.getRelease_date());
			for(actors hii:hell.getActorss()) {
				for(actor hia:hii.getActorss()) {
					actors.add(hia.getActor());
				}
			}
			dpmap.put("Actors ", actors);
			for(Genreid hii:hell.getGenreidss()) {
				for(genre hia:hii.getGenressss()) {
					genres.add(hia.getGenre());
				}
			}
			dpmap.put("Genre ", genres);
			flist.add(dpmap);
		}
		return flist;
	}


}
