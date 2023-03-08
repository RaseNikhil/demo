package com.booking.moviebooking.model;


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
    private  Integer theatreId;


    private String theatreName;

    private double ticketPrice;

    private  Integer seatCount;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Movie> movieList;

}
