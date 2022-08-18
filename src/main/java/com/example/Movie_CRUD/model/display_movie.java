package com.example.Movie_CRUD.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="movie", uniqueConstraints = {@UniqueConstraint(columnNames = {"movie_id"})})
public class display_movie {
	
	@Id
	@Column(name="movie_id")
	private int id;
	@Column(name="title")
	private String title;
	@Column(name = "tagline")
	private String tagline;
	@Column(name = "overview")
	private String overview;
	@Column(name = "vote_average")
	private double vote_average;
	@Column(name = "popularity")
	private double popularity;
	@Column(name = "release_date")
	private String release_date;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="actors",cascade = CascadeType.ALL)
	private Set<actors> actorss;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="genreids",cascade = CascadeType.ALL)
	private Set<Genreid> genreidss;
	
	public Set<actors> getActorss() {
		return actorss;
	}
	public void setActorss(Set<actors> actorss) {
		this.actorss = actorss;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public double getVote_average() {
		return vote_average;
	}
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public Set<Genreid> getGenreidss() {
		return genreidss;
	}
	public void setGenreidss(Set<Genreid> genreidss) {
		this.genreidss = genreidss;
	}
	
	
}
