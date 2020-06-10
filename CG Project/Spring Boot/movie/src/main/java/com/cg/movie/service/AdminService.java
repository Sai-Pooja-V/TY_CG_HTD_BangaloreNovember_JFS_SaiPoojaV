package com.cg.movie.service;

import java.util.List;

import com.cg.movie.bean.Movie;
import com.cg.movie.bean.Screen;
import com.cg.movie.bean.Show;
import com.cg.movie.bean.Theater;

public interface AdminService {
	public Theater addTheater(Theater theater);

	public boolean deleteTheater(int theaterId);

	public Movie addMovie(Movie movie);

	public boolean deleteMovie(int movieId);

	public Screen addScreen(Screen screen);

	public boolean deleteScreen(int screenId);

	public Show addShow(Show show);

	public boolean deleteShow(int showId);

	public List<Theater> getAllTheters();

	public List<Screen> getAllScreens();

	public List<Show> getAllShows();

	public List<Movie> getAllMovies();

	public Theater getTheater(int id);
}
