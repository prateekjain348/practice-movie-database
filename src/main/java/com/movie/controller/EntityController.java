package com.movie.controller;

import com.movie.entity.*;
import com.movie.services.IEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entityservice")
public class EntityController {

    @Autowired
    private IEntityService service;

    @GetMapping("movies")
    public ResponseEntity<List<Movie>> getMovies() {
        System.out.println("Calling movies...");
        List<Movie> movies = service.getMovies();
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

    @GetMapping("countries")
    public ResponseEntity<List<Country>> getCountries() {
        System.out.println("Calling countries...");
        List<Country> countries = service.getCountries();
        return new ResponseEntity<List<Country>>(countries, HttpStatus.OK);
    }

    @GetMapping("languages")
    public ResponseEntity<List<Language>> getLanguages() {
        System.out.println("Calling languages...");
        List<Language> languages = service.getLanguages();
        return new ResponseEntity<List<Language>>(languages, HttpStatus.OK);
    }

    @GetMapping("departments")
    public ResponseEntity<List<Department>> getDepartments() {
        System.out.println("Calling departments...");
        List<Department> departments = service.getDepartments();
        return new ResponseEntity<List<Department>>(departments, HttpStatus.OK);
    }

    @GetMapping("genre")
    public ResponseEntity<List<Genre>> getGenre() {
        System.out.println("Calling genre...");
        List<Genre> genres = service.getGenre();
        return new ResponseEntity<List<Genre>>(genres, HttpStatus.OK);
    }

    @GetMapping("keywords")
    public ResponseEntity<List<Keyword>> getKeywords() {
        System.out.println("Calling keywords...");
        List<Keyword> keywords = service.getKeywords();
        return new ResponseEntity<List<Keyword>>(keywords, HttpStatus.OK);
    }

    @GetMapping("person")
    public ResponseEntity<List<Person>> getPerson() {
        System.out.println("Calling person...");
        List<Person> personList = service.getPerson();
        return new ResponseEntity<List<Person>>(personList, HttpStatus.OK);
    }

    @GetMapping("person/{id}")
    public ResponseEntity<Person> getMovie(@PathVariable("id") Integer id) {
        Person person = service.getPerson(id);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    @GetMapping("productionCompany")
    public ResponseEntity<List<ProductionCompany>> getProductionCompany() {
        System.out.println("Calling productionCompany...");
        List<ProductionCompany> productionCompanies = service.getProductionCompany();
        return new ResponseEntity<List<ProductionCompany>>(productionCompanies, HttpStatus.OK);
    }

    @GetMapping("movieCast")
    public ResponseEntity<List<MovieCast>> getMovieCast() {
        System.out.println("Calling movieCast...");
        List<MovieCast> movieCasts = service.getMovieCast();
        return new ResponseEntity<List<MovieCast>>(movieCasts, HttpStatus.OK);
    }

    @GetMapping("exception4xx")
    public ResponseEntity<String> getException4xx() {
        System.out.println("Calling exception4xx...");
        return new ResponseEntity<String>(HttpStatus.UPGRADE_REQUIRED.toString(), HttpStatus.UPGRADE_REQUIRED);
    }

    @GetMapping("exception5xx")
    public ResponseEntity<String> getException5xx() {
        System.out.println("Calling exception5xx...");
        return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE.toString(), HttpStatus.SERVICE_UNAVAILABLE);
    }

    /**
     * Movies by Production House.
     */
    @GetMapping("productionHouse/{id}")
    public ResponseEntity<List<ProductionCompanyDetails>> getProductionHouse(@PathVariable("id") Integer id) {
        System.out.println("Calling productionHouse...");
        List<ProductionCompanyDetails> movieCasts = service.productionHouse(id);
        return new ResponseEntity<List<ProductionCompanyDetails>>(movieCasts, HttpStatus.OK);

    }
}

