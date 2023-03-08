package com.booking.moviebooking.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieResponse {

    @JsonProperty("movieName")
    private String movieName;

    @JsonProperty("movieDescription")
    private String movieDescription;

    @JsonProperty("genre")
    private String genre;

    @JsonProperty("showTiming")
    private Date showTiming;


    @JsonProperty("movieLanguage")
    private String movieLanguage;

    @JsonProperty("userId")
    private Integer userId;
}

