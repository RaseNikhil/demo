package com.booking.moviebooking.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Theatre {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JsonProperty("theatreId")
    private  Integer theatreId;


    @JsonProperty("theatreName")
    private String theatreName;


    @JsonProperty("ticketPrice")
    private double ticketPrice;


    @JsonProperty("seatCount")
    private  Integer seatCount;



    @JsonProperty("movieList")
    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "theatreId"),
            inverseJoinColumns = @JoinColumn(name = "movieId")
    )
    private List<Movie> movieList;

}
