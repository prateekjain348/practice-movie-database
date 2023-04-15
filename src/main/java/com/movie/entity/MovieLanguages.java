package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_languages")
@Data
public class MovieLanguages {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "language_id")
    public int languageId;

    @Column(name = "language_role_id")
    public int languageRoleId;
}
