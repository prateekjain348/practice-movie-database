package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    public int countryId;

    @Column(name = "country_iso_code")
    public String countryIsoCode;

    @Column(name = "country_name")
    public String countryName;
}


