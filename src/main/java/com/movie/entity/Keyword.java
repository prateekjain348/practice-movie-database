package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "keyword")
@Data
public class Keyword {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "keyword_id")
    public int keywordId;

    @Column(name = "keyword_name")
    public String keywordName;
}
