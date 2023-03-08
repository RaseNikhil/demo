package com.booking.moviebooking.utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class MovieRequest {
    private String movieName;
    private String movieDescription;
    private String genre;
    private Date showTiming;
    private String movieLanguage;
    private Integer userId;

}

