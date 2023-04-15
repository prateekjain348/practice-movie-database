package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "language_role")
@Data
public class LanguageRole {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    public int roleId;

    @Column(name = "language_role")
    public String languageRole;
}
