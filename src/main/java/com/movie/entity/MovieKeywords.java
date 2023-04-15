package com.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/*@Entity*/
@Table(name = "movie_keywords")
@Data
public class MovieKeywords {

    private static final long serialVersionUID = 1L;

    @Column(name = "movie_id")
    public int movieId;

    @Column(name = "keyword_id")
    public int keywordId;
}
