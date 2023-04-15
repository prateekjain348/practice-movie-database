package com.movie.serviceImpl;

import com.movie.dao.IEntityDAO;
import com.movie.entity.*;
import com.movie.services.IEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService implements IEntityService {

    @Autowired
    private IEntityDAO dao;

    @Override
    public List<Movie> getMovies() {
        return dao.getMovies();
    }

    @Override
    public List<Country> getCountries() {
        return dao.getCountries();
    }

    @Override
    public List<Language> getLanguages() {
        return dao.getLanguages();
    }

    @Override
    public List<Department> getDepartments() {
        return dao.getDepartments();
    }

    @Override
    public List<Genre> getGenre() {
        return dao.getGenre();
    }

    @Override
    public List<Keyword> getKeywords() {
        return dao.getKeywords();
    }

    @Override
    public List<Person> getPerson() {
        return dao.getPerson();
    }

    @Override
    public List<ProductionCompany> getProductionCompany() {
        return dao.getProductionCompany();
    }

    @Override
    public List<MovieCast> getMovieCast() {
        return dao.getMovieCast();
    }

    @Override
    public Person getPerson(Integer id) {
        return dao.getPerson(id);
    }

    @Override
    public List<ProductionCompanyDetails> productionHouse(Integer id) {
        return dao.productionHouse(id);
    }

}
