package com.cg.movie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shows")
public class Show {

	@Id
	@Column
	private int showId;
	@Column
	private String showStartTime;
	@Column
	private String showEndTime;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seaters")
	private List<Seat> seats;
	@Column
	private int screenId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movieName")
	private Movie movieName;
	@Column
	private int theaterId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "screeners")
	private Screen shows;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}

	public String getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public Movie getMovieName() {
		return movieName;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public Screen getShows() {
		return shows;
	}

	public void setShows(Screen shows) {
		this.shows = shows;
	}

}
