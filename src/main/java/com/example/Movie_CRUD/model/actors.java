package com.example.Movie_CRUD.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="movie_cast")
public class actors {
	@Id
	@Column(name="person_id")
	private int person_id;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "movie_id")
	@JsonIgnore
    private display_movie actors;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="actossr",cascade = CascadeType.ALL)
	private Set<actor> actorss;


	

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public display_movie getActors() {
		return actors;
	}

	public void setActors(display_movie actors) {
		this.actors = actors;
	}

	public Set<actor> getActorss() {
		return actorss;
	}

	public void setActorss(Set<actor> actorss) {
		this.actorss = actorss;
	}

	
	
}
