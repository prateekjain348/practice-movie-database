package com.movie.services;

import com.movie.entity.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> getMovies();

    Movie createMovie(Movie movie);

    Movie updateMovie(int movieId, Movie movie);

    Movie getMovie(int movieId);

    boolean deleteMovie(int movieId);

}
