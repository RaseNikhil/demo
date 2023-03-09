package com.booking.moviebooking.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


 
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequest {


    @NotNull(message = "user Id not provided")
    @NotEmpty(message = "userId is empty")
    @NotBlank
    @JsonProperty("userId")
    private Integer userId;


    @NotNull(message = "movie should not be null")
    @NotBlank(message = "please enter movie name")
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getShowTiming() {
        return showTiming;
    }

    public void setShowTiming(Date showTiming) {
        this.showTiming = showTiming;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
}

