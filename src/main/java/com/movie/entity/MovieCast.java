package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_cast")
@Data
public class MovieCast {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "person_id")
    public int personId;

    @Column(name = "character_name")
    public String characterName;

    @Column(name = "gender_id")
    public int genderId;

    @Column(name = "cast_order")
    public int castOrder;
}
