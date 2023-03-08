package com.booking.moviebooking.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="UserTable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_id")
    @JsonProperty("UserId")
    private long UserId;

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
