package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_genres")
@Data
public class MovieGenres {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "genre_id")
    public int genreId;
}
