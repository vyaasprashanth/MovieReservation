package com.me.moviebooking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Showtime implements Serializable{
	Movie movie;
	Cinema cinema;
	Screen screen;
	private String showtime;
	
	public Showtime() {
		super();
	}
	
	public Showtime(Movie movie, Cinema cinema, Screen screen, String showtime) {
		super();
		this.movie = movie;
		this.cinema = cinema;
		this.screen = screen;
		this.showtime = showtime;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	
	public String toString(){
		return this.getShowtime();
	}
}
