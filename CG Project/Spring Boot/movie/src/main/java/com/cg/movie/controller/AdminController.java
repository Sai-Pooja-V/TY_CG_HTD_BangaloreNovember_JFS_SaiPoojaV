package com.cg.movie.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.bean.Movie;
import com.cg.movie.bean.MovieResponse;
import com.cg.movie.bean.Screen;
import com.cg.movie.bean.Show;
import com.cg.movie.bean.Theater;
import com.cg.movie.service.AdminService;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping(path = "add-theater", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse addTheater(@RequestBody Theater theater) {
		MovieResponse response = new MovieResponse();
		if (adminService.addTheater(theater) != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Theater added Successfully");
			response.setBeans(Arrays.asList(theater));
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Theater not added");
		}
		return response;
	}

	@DeleteMapping(path = "delete-theater/{theaterId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse deleteTheater(@PathVariable("theaterId") int theaterId) {
		MovieResponse response = new MovieResponse();
		if (adminService.deleteTheater(theaterId)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Theater deleted Successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Theater not deleted");
		}
		return response;
	}

	@PostMapping(path = "add-movie", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse addMovie(@RequestBody Movie movie) {
		MovieResponse response = new MovieResponse();
		if (adminService.addMovie(movie) != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Movie added Successfully");
			response.setBeans(Arrays.asList(movie));
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Movie not added");
		}
		return response;
	}

	@DeleteMapping(path = "delete-movie/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse deleteMovie(@PathVariable("movieId") int movieId) {
		MovieResponse response = new MovieResponse();
		if (adminService.deleteMovie(movieId)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Movie deleted Successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Movie not deleted");
		}
		return response;
	}

	@PostMapping(path = "add-screen", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse addScreen(@RequestBody Screen screen) {
		MovieResponse response = new MovieResponse();
		if (adminService.addScreen(screen) != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Screen added Successfully");
			response.setBeans(Arrays.asList(screen));
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Screen not added");
		}
		return response;
	}

	@DeleteMapping(path = "delete-screen/{screenId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse deleteScreen(@PathVariable("screenId") int screenId) {
		MovieResponse response = new MovieResponse();
		if (adminService.deleteScreen(screenId)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Screen deleted Successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Screen not deleted");
		}
		return response;
	}

	@PostMapping(path = "add-show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse addShow(@RequestBody Show show) {
		MovieResponse response = new MovieResponse();
		if (adminService.addShow(show) != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Show added Successfully");
			response.setBeans(Arrays.asList(show));
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Show not added");
		}
		return response;
	}

	@DeleteMapping(path = "delete-show/{showId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse deleteShow(@PathVariable("showId") int showId) {
		MovieResponse response = new MovieResponse();
		if (adminService.deleteShow(showId)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Show deleted Successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Show not deleted");
		}
		return response;
	}
	
	@GetMapping(path = "/get-all-theaters", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse getAllTheaters() {
		MovieResponse response = new MovieResponse();
		if (adminService.getAllTheters() != null && !adminService.getAllTheters().isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Displaying all theaters");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Theaters are not available");
		}
		return response;
	}
	
	@GetMapping(path = "/get-all-movies", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse getAllMovies() {
		MovieResponse response = new MovieResponse();
		if (adminService.getAllMovies() != null && !adminService.getAllMovies().isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Displaying all movies");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Movies are not available");
		}
		return response;
	}
	
	@GetMapping(path = "/get-all-screens", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse getAllScreens() {
		MovieResponse response = new MovieResponse();
		if (adminService.getAllScreens() != null && !adminService.getAllScreens().isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Displaying all screens");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Screens are not available");
		}
		return response;
	}
	
	@GetMapping(path = "/get-all-shows", produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieResponse getAllShows() {
		MovieResponse response = new MovieResponse();
		if (adminService.getAllShows() != null && !adminService.getAllShows().isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Displaying all shows");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure");
			response.setDescription("Shows are not available");
		}
		return response;
	}
}
