package com.example.Movie_CRUD.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="person")
public class actor {
	
	@Id
	@Column(name="person_name")
	private String actor;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "person_id")
	@JsonIgnore
    private actors actossr;
	
	public actors getActossr() {
		return actossr;
	}

	public void setActossr(actors actossr) {
		this.actossr = actossr;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
}
