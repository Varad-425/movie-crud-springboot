package com.example.Movie_CRUD.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class movie {
	private Integer movie_id;
	private String title;
	private int budget;
	private String homepage;
	private String overview;
	private float popularity;
	private Date release_date;
	private String revenue;
	private int runtime;
	private String movie_status;
	private String tagline;
	private float vote_average;
	private int vote_count;
	private String genre;
	private String actor;

	

	

	public movie() {
    }

	public movie(Integer movie_id, String title, int budget, String homepage, String overview, float popularity,
			Date release_date, String revenue, int runtime, String movie_status, String tagline, float vote_average,
			int vote_count,String genre,String actor) {

		this.movie_id = movie_id;
		this.title = title;
		this.budget = budget;
		this.homepage = homepage;
		this.overview = overview;
		this.popularity = popularity;
		this.release_date = release_date;
		this.revenue = revenue;
		this.runtime = runtime;
		this.movie_status = movie_status;
		this.tagline = tagline;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.genre = genre;
		this.actor=actor;
	}

	@Id
	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public float getPopularity() {
		return popularity;
	}

	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date( Date release_date) {
		this.release_date = release_date;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getMovie_status() {
		return movie_status;
	}

	public void setMovie_status(String movie_status) {
		this.movie_status = movie_status;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public float getVote_average() {
		return vote_average;
	}

	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "movie [movie_id=" + movie_id + ", title=" + title + ", budget=" + budget + ", homepage=" + homepage
				+ ", overview=" + overview + ", popularity=" + popularity + ", release_date=" +release_date+ ", revenue=" + revenue + ", runtime=" + runtime + ", movie_status=" + movie_status + ", tagline="
				+ tagline + ", vote_average=" + vote_average + ", vote_count=" + vote_count + ",genre="+genre+",actor="+actor+"]";
	}
	
	

}
