package com.example.Movie_CRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Movie_CRUD.model.display_movie;

public interface displayRepos extends JpaRepository<display_movie, Integer>{
	
	@Query(value = "SELECT movie.movie_id,movie.title,movie.tagline,movie.overview,movie.vote_average,movie.popularity,movie.release_date FROM movie", nativeQuery = true)
    List<display_movie> fordisplay();
	
    @Query(value="SELECT person_name FROM person where person_id= ?1",nativeQuery = true)
    String getperson(long id);
    
    @Query(value="SELECT genre FROM genre where genre_id= ?1",nativeQuery = true)
    String getgenre(long id);
    
    @Query(value="SELECT person_id FROM movie_cast WHERE movie_id= ?1",nativeQuery = true)
    List<Integer> getpersonid(long str);
    
    @Query(value="SELECT genre_id FROM movie_genre where movie_id= ?1",nativeQuery = true)
    List<Integer> getgenreid(long id);

}
