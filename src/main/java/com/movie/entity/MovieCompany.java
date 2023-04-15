package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_company")
@Data
public class MovieCompany {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "company_id")
    public int companyId;
}
