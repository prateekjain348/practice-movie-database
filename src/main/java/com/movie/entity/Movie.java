package com.movie.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
@Data
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "title")
    public String title;

    @Column(name = "budget")
    public int budget;

    @Column(name = "homepage")
    public String homepage;

    @Column(name = "overview")
    public String overview;

    @Column(name = "popularity")
    public Double popularity;

    @Column(name = "release_date")
    public java.sql.Date releaseDate;

    @Column(name = "revenue")
    public long revenue;

    @Column(name = "runtime")
    public int runtime;

    @Column(name = "movie_status")
    public String movieStatus;

    @Column(name = "tagline")
    public String tagline;

    @Column(name = "vote_average")
    public Double voteAverage;

    @Column(name = "vote_count")
    public int voteCount;

}
