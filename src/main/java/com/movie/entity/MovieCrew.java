package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_crew")
@Data
public class MovieCrew {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "person_id")
    public int personId;

    @Column(name = "department_id")
    public int departmentId;

    @Column(name = "job")
    public String job;
}
