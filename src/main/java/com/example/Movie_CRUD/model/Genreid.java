package com.example.Movie_CRUD.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="movie_genres")
public class Genreid {
	@Id
	@Column(name="genre_id")
	private int genre_id;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "movie_id")
	@JsonIgnore
    private display_movie genreids;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="genress",cascade = CascadeType.ALL)
	private Set<genre> genressss;

	public display_movie getGenreids() {
		return genreids;
	}

	public void setGenreids(display_movie genreids) {
		this.genreids = genreids;
	}

	public Set<genre> getGenressss() {
		return genressss;
	}

	public void setGenressss(Set<genre> genressss) {
		this.genressss = genressss;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

}
