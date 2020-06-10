package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.movie.bean.Admin;
import com.cg.movie.bean.Movie;
import com.cg.movie.bean.Screen;
import com.cg.movie.bean.Show;
import com.cg.movie.bean.Theater;
import com.cg.movie.exception.AdminException;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Theater addTheater(Theater theater) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(theater);
			entityTransaction.commit();
			entityManager.close();
			return theater;
		} catch (Exception e) {
			throw new AdminException("Company  Already Exists");
		}
	}

	@Override
	public boolean deleteTheater(int theaterId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Theater theaterBean = manager.find(Theater.class, theaterId);
		if (theaterBean != null) {
			manager.remove(theaterBean);
			transaction.commit();
			return true;
		} else {
			throw new AdminException("Theter Id Not Found");
		}
	}

	@Override
	public Movie addMovie(Movie movie) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(movie);
			entityTransaction.commit();
			entityManager.close();
			return movie;
		} catch (Exception e) {
			throw new AdminException("Company  Already Exists");
		}
	}

	@Override
	public boolean deleteMovie(int movieId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Movie movie = manager.find(Movie.class, movieId);
		if (movie != null) {
			manager.remove(movie);
			transaction.commit();
			return true;
		} else {
			throw new AdminException("Movie Id Not Found");
		}
	}

	@Override
	public Screen addScreen(Screen screen) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(screen);
			entityTransaction.commit();
			entityManager.close();
			return screen;
		} catch (Exception e) {
			throw new AdminException("Company  Already Exists");
		}
	}

	@Override
	public boolean deleteScreen(int screenId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Screen screen = manager.find(Screen.class, screenId);
		if (screen != null) {
			manager.remove(screen);
			transaction.commit();
			return true;
		} else {
			throw new AdminException("Screen Id Not Found");
		}
	}

	@Override
	public Show addShow(Show show) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(show);
			entityTransaction.commit();
			entityManager.close();
			return show;
		} catch (Exception e) {
			throw new AdminException("Company  Already Exists");
		}
	}

	@Override
	public boolean deleteShow(int showId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Show show = manager.find(Show.class, showId);
		if (show != null) {
			manager.remove(show);
			transaction.commit();
			return true;
		} else {
			throw new AdminException("Show Id Not Found");
		}
	}

	@Override
	public List<Theater> getAllTheters() {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from Theater";
			Query query = entityManager.createQuery(jpql);
			List<Theater> theater = query.getResultList();
			return theater;
		} catch (Exception e) {
			throw new AdminException("No Theaters");
		}
	}

	@Override
	public List<Screen> getAllScreens() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			String jpql = "from Screen";
			Query query = entityManager.createQuery(jpql);
			List<Screen> screens = query.getResultList();
			return screens;
		} catch (Exception e) {
			throw new AdminException("No Screens");
		}
	}

	@Override
	public List<Show> getAllShows() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Show";
		Query query = entityManager.createQuery(jpql);
		List<Show> list = query.getResultList();
		return list;
	}

	@Override
	public List<Movie> getAllMovies() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Movie";
		Query query = entityManager.createQuery(jpql);
		List<Movie> list = query.getResultList();
		return list;
	}

	@Override
	public Theater getTheater(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Theater theater = entityManager.find(Theater.class, id);
		if (theater != null) {
			return theater;
		} else {
			throw new AdminException("Theater Id does not exists");
		}
	}

}
