package com.movie.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ProductionCompanyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public int movieId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String title;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public int companyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String companyName;
}
