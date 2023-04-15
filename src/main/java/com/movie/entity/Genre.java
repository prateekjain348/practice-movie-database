package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "genre")
@Data
public class Genre {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genre_id")
    public int genreId;

    @Column(name = "genre_name")
    public String genreName;
}
