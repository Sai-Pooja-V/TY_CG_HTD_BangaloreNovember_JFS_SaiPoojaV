package com.cg.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.bean.Movie;
import com.cg.movie.bean.Screen;
import com.cg.movie.bean.Show;
import com.cg.movie.bean.Theater;
import com.cg.movie.dao.AdminDao;
import com.cg.movie.exception.AdminException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao dao;

	@Override
	public Theater addTheater(Theater theater) {
		return dao.addTheater(theater);
	}

	@Override
	public boolean deleteTheater(int theaterId) {
		return dao.deleteTheater(theaterId);
	}

	@Override
	public Movie addMovie(Movie movie) {
		List<Theater> theater = dao.getAllTheters();
		for (Theater theater2 : theater) {
			if (theater2.getTheaterId() == movie.getTheaterId()) {
				return dao.addMovie(movie);
			}
		}
		throw new AdminException("Theater Id does not exist");
		//return dao.addMovie(movie);
	}

	@Override
	public boolean deleteMovie(int movieId) {
		return dao.deleteMovie(movieId);
	}

	@Override
	public Screen addScreen(Screen screen) {
		List<Theater> theaters = dao.getAllTheters();
		for (Theater theater : theaters) {
			if (theater.getTheaterId() == screen.getTheaterId()) {
				return dao.addScreen(screen);
			}
		}
		throw new AdminException("Theater Id does not exist");
	}

	@Override
	public boolean deleteScreen(int screenId) {
		return dao.deleteScreen(screenId);
	}

	@Override
	public Show addShow(Show show) {
		List<Theater> theaters = dao.getAllTheters();
		List<Screen> screens = dao.getAllScreens();
		for (Screen screen : screens) {
			for (Theater theater : theaters) {
				if (screen.getScreenId() == show.getScreenId()) {
					if (theater.getTheaterId() == screen.getTheaterId()) {
						return dao.addShow(show);
					} else {
						throw new AdminException("Theater Id does not exist");
					}
				} else {
					throw new AdminException("Screen Id does not exist");
				}
			}
		}
		throw new AdminException("Theater Id does not exist");
	}

	@Override
	public boolean deleteShow(int showId) {
		return dao.deleteShow(showId);
	}

	@Override
	public List<Theater> getAllTheters() {
		return dao.getAllTheters();
	}

	@Override
	public List<Screen> getAllScreens() {
		// TODO Auto-generated method stub
		return dao.getAllScreens();
	}

	@Override
	public List<Show> getAllShows() {
		// TODO Auto-generated method stub
		return dao.getAllShows();
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return dao.getAllMovies();
	}

	@Override
	public Theater getTheater(int id) {
		// TODO Auto-generated method stub
		return dao.getTheater(id);
	}

}
