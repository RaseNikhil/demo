package com.booking.moviebooking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("tranId")
    private Integer tranId;
    @JsonProperty("noOfTickets")
    private  Integer noOfTickets;
    @JsonProperty("totalSum")
    private  Double totalSum;
    @JsonProperty("isPaid")
    private  Boolean isPaid;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "movieId",nullable = false,updatable = false)
    @JsonProperty("movie")
    private Movie movie;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "UserId",updatable = false,nullable = false)
    @JsonProperty("user")
    private  UserTable user;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="theatreId",nullable = false,updatable = false)
    @JsonProperty("theatre")
    private  Theatre theatre;

}
