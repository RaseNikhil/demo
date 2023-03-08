package com.booking.moviebooking.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequest {

    @JsonProperty("userId")
    private Integer userId;
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


}

