package com.booking.moviebooking.utility;

import com.booking.moviebooking.validation.PasswordValidator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {


    @NotNull(message = "UserName should not be null")
    @JsonProperty("userName")
    private String UserName;



    @Email(message = "Email should be in correct format")


    @JsonProperty("email")
    private String email;



    @NotNull(message = "password shouldn't be null")
    @NotBlank(message = "password is required")


    @JsonProperty("password")
    @NotBlank
    @NotNull
    @PasswordValidator
    private String password;
}
