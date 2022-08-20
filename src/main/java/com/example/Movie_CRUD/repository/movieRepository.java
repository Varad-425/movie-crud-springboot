package com.example.Movie_CRUD.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_CRUD.model.movie;

public interface movieRepository extends JpaRepository<movie, Integer> {
}
