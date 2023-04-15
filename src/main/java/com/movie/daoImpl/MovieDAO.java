package com.movie.daoImpl;

import com.movie.dao.IMovieDAO;
import com.movie.entity.Movie;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class MovieDAO implements IMovieDAO {

    @PersistenceContext
    private EntityManager entityManager;

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
     * This method is responsible to get a particular Movie detail by given movie id
     */
    @Override
    public Movie getMovie(int movieId) {

        return entityManager.find(Movie.class, movieId);
    }

    /**
     * This method is responsible to create new movie in database
     */
    @Override
    public Movie createMovie(Movie movie) {
        entityManager.persist(movie);
        Movie b = getLastInsertedMovie();
        return b;
    }

    /**
     * This method is responsible to update movie detail in database
     */
    @Override
    public Movie updateMovie(int movieId, Movie movie) {

        //First We are taking Movie detail from database by given movie id and
        // then updating detail with provided movie object
        entityManager.flush();

        //again i am taking updated result of movie and returning the movie object
        Movie updatedMovie = getMovie(movieId);

        return updatedMovie;
    }

    /**
     * This method is responsible for deleting a particular(which id will be passed that record)
     * record from the database
     */
    @Override
    public boolean deleteMovie(int movieId) {
        Movie movie = getMovie(movieId);
        entityManager.remove(movie);

        //we are checking here that whether entityManager contains earlier deleted movie or not
        // if contains then movie is not deleted from DB that's why returning false;
        boolean status = entityManager.contains(movie);
        if (status) {
            return false;
        }
        return true;
    }

    /**
     * This method will get the latest inserted record from the database and return the object of Movie class
     *
     * @return movie
     */
    private Movie getLastInsertedMovie() {
        String hql = "from Movie order by id DESC";
        Query query = entityManager.createQuery(hql);
        query.setMaxResults(1);
        Movie movie = (Movie) query.getSingleResult();
        return movie;
    }

}
