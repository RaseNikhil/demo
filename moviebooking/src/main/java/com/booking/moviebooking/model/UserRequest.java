package com.booking.moviebooking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @Column(name="User_Name")
    @JsonProperty("UserName")
    private String UserName;
    @Column(name="Email")
    @JsonProperty("Email")
    private String email;

    @Column(name="password")
    @JsonProperty("password")
    private String password;
}
