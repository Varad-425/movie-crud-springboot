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
import com.example.Movie_CRUD.repository.movieRepository;
import com.example.Movie_CRUD.repository.displayRepos;
import com.example.Movie_CRUD.repository.movieRepository;
import com.example.Movie_CRUD.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	
	private movieRepository repo;
	private displayRepos repos;
	
	public MovieServiceImpl(movieRepository repo,displayRepos repos) {
		super();
		this.repo=repo;
		this.repos=repos;
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


	public List<movie> listAll() {
		return repo.findAll();
	}



	public List<movie> listgenre(movie movies) {
		List<movie> genrekeyword = repo.findAll();
		List<movie> filteredList = new ArrayList<>();

		for (movie movie1 : genrekeyword) {
			if (movie1.getGenre().toString().equals(movies.getGenre().toString())) {
				filteredList.add(movie1);
				System.out.println(movie1.getGenre());

			}
		}
		return filteredList;
	}



	public List<movie> listactor(movie movies) {
		List<movie> actorkeyword = repo.findAll();
		List<movie> filteredList = new ArrayList<>();

		for (movie movie1 : actorkeyword) {

			if (movie1.getActor().toString().equals(movies.getActor().toString())) {
				filteredList.add(movie1);
				System.out.println(movie1.getActor());

			}
		}
		return filteredList;
	}



	public movie get(Integer movie_id) {
		return repo.findById(movie_id).get();
	}



	public List<movie> getMovieByRuntimeGreaterThan(Integer runtime) {
		List<movie> allMovie = listAll();
		List<movie> movieRuntimeGreaterThan = new ArrayList<>();
		for(int i=0;i<allMovie.size();i++)
		{
			if(allMovie.get(i).getRuntime() >= runtime)
			{
				movieRuntimeGreaterThan.add(allMovie.get(i));
			}
		}
		return movieRuntimeGreaterThan;
	}



	@Override
	public void save(movie movies) {
		repo.save(movies);
	}

}
