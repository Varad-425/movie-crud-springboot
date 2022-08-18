package com.example.Movie_CRUD.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="genre")
public class genre {
	@Id
	@Column(name="genre_name")
	private String genre;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "genre_id")
	@JsonIgnore
    private Genreid genress;



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Genreid getGenressss() {
		return genress;
	}

	public void setGenressss(Genreid genress) {
		this.genress = genress;
	}
	
	
}
