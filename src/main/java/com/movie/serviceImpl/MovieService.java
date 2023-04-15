package com.movie.serviceImpl;

import com.movie.dao.IMovieDAO;
import com.movie.entity.Movie;
import com.movie.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private IMovieDAO dao;

    @Override
    public List<Movie> getMovies() {
        return dao.getMovies();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return dao.createMovie(movie);
    }

    @Override
    public Movie updateMovie(int movieId, Movie movie) {
        return dao.updateMovie(movieId, movie);
    }

    @Override
    public Movie getMovie(int movieId) {
        return dao.getMovie(movieId);
    }

    @Override
    public boolean deleteMovie(int movieId) {
        return dao.deleteMovie(movieId);
    }

}
