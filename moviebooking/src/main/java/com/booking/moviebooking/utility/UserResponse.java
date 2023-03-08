package com.booking.moviebooking.utility;

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
public class UserResponse {

    @JsonProperty("UserId")
    private Long UserId;

    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("Email")
    private String email;

    @JsonProperty("password")
    private String password;
}
