package com.cg.movie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "screen")
public class Screen {

	@Id
	@Column
	private int screenId;
	@Column
	private int theaterId;
	@Column
	private String screenName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "shows")
	private List<Show> ShowList;
	@Column
	private String movieEndDate;
	@Column
	private int rows;
	@Column
	private int columns;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "screens")
	private Screen screens;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Show> getShowList() {
		return ShowList;
	}

	public void setShowList(List<Show> showList) {
		ShowList = showList;
	}

	public String getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(String movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Screen getScreens() {
		return screens;
	}

	public void setScreens(Screen screens) {
		this.screens = screens;
	}

}
