package com.movie.dao;

import com.movie.entity.*;

import java.util.List;

public interface IEntityDAO {
    List<Movie> getMovies();

    List<Country> getCountries();

    List<Language> getLanguages();

    List<Department> getDepartments();

    List<Genre> getGenre();

    List<Keyword> getKeywords();

    List<Person> getPerson();

    List<ProductionCompany> getProductionCompany();

    List<MovieCast> getMovieCast();

    Person getPerson(Integer id);

    List<ProductionCompanyDetails> productionHouse(Integer id);
}
