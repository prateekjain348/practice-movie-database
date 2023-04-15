package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("movieservice")
public class MovieController {

    @Autowired
    private IMovieService service;

    @GetMapping("ping")
    public ResponseEntity<String> testApi() {
        return new ResponseEntity<String>("Cool", HttpStatus.OK);
    }

    @GetMapping("movies")
    public ResponseEntity<List<Movie>> getMovie() {

        List<Movie> movies = service.getMovies();
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);

    }

    @GetMapping("movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") Integer id) {
        Movie movie = service.getMovie(id);
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    @PostMapping("movie")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie b = service.createMovie(movie);
        return new ResponseEntity<Movie>(b, HttpStatus.OK);

    }

    @PutMapping("movie/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable("id") int id, @RequestBody Movie movie) {

        Movie b = service.updateMovie(id, movie);
        return new ResponseEntity<Movie>(b, HttpStatus.OK);
    }

    @DeleteMapping("movies/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") int id) {
        boolean isDeleted = service.deleteMovie(id);
        if (isDeleted) {
            String responseContent = "Movie has been deleted successfully";
            return new ResponseEntity<String>(responseContent, HttpStatus.OK);
        }
        String error = "Error while deleting movie from database";
        return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
