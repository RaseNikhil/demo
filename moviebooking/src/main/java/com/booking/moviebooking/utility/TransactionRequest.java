package com.booking.moviebooking.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {


    @JsonProperty("noOfTickets")
    private  Integer noOfTickets;
    @JsonProperty("totalSum")
    private  Double totalSum;
    @JsonProperty("isPaid")
    private  Boolean isPaid;

    @JsonProperty("movie")
    private Integer movieId;

    @JsonProperty("user")
    private  Integer user;

    @JsonProperty("theatre")
    private  Integer theatre;


}
