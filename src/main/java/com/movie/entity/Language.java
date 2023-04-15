package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "language")
@Data
public class Language {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    public int languageId;

    @Column(name = "language_code")
    public String languageCode;

    @Column(name = "language_name")
    public String languageName;
}
