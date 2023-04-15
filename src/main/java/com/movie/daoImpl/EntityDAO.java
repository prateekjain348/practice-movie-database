package com.movie.daoImpl;

import com.movie.dao.IEntityDAO;
import com.movie.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class EntityDAO implements IEntityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * This method is responsible to get all movies available in database and return it as List<Movie>
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Movie> getMovies() {
        String hql = "FROM Movie as atcl ORDER BY atcl.movieId";
        return (List<Movie>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all Countries available in database and return it as List<Country>
     */
    @Override
    public List<Country> getCountries() {
        String hql = "FROM Country ";
        return (List<Country>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all languages available in database and return it as List<Language>
     */
    @Override
    public List<Language> getLanguages() {
        String hql = "FROM Language ";
        return (List<Language>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all departments available in database and return it as List<Department>
     */
    @Override
    public List<Department> getDepartments() {
        String hql = "FROM Department";
        return (List<Department>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all genres available in database and return it as List<Genre>
     */
    @Override
    public List<Genre> getGenre() {
        String hql = "FROM Genre";
        return (List<Genre>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all keywords available in database and return it as List<Keyword>
     */
    @Override
    public List<Keyword> getKeywords() {
        String hql = "FROM Keyword";
        return (List<Keyword>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all persons available in database and return it as List<Person>
     */
    @Override
    public List<Person> getPerson() {
        String hql = "FROM Person";
        return (List<Person>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all production companies available in database and return it as List<ProductionCompany>
     */
    @Override
    public List<ProductionCompany> getProductionCompany() {
        String hql = "FROM ProductionCompany";
        return (List<ProductionCompany>) entityManager.createQuery(hql).getResultList();
    }

    /**
     * This method is responsible to get all movie cast available in database and return it as List<MovieCast>
     */
    @Override
    public List<MovieCast> getMovieCast() {
        String hql = "FROM MovieCast";
        return (List<MovieCast>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Person getPerson(Integer id) {
        /*return entityManager.find(Person.class, id);*/
        return test(id);
    }

    public Person test(int id) {
        String sql = "SELECT PERSON_ID,PERSON_NAME FROM PERSON where PERSON_ID=? ";
        return (Person) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(Person.class));
    }

    @Override
    public List<ProductionCompanyDetails> productionHouse(Integer id) {
        String sql = "SELECT PC.COMPANY_NAME, M.MOVIE_ID ,M.TITLE FROM MOVIE M  LEFT JOIN MOVIE_COMPANY MC ON MC.MOVIE_ID=M.MOVIE_ID LEFT JOIN PRODUCTION_COMPANY PC ON PC.COMPANY_ID=MC.COMPANY_ID WHERE PC.COMPANY_ID IN (?) ";
        return (List<ProductionCompanyDetails>) jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(ProductionCompanyDetails.class));
    }
}
