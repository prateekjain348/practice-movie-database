package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "gender")
@Data
public class Gender {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gender_id")
    public int genderId;

    @Column(name = "gender")
    public String gender;
}
