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
@Table(name="UserTable")
public class UserTable {

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


    @OneToOne()
    @JsonProperty("role")
    private Role  role;



}
