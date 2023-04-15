package com.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "production_company")
@Data
public class ProductionCompany {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "company_id")
    public int companyId;

    @Column(name = "company_name")
    public String companyName;
}
