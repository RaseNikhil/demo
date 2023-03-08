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

    private Long UserId;

    @Column(name="User_Name")

    private String UserName;
    @Column(name="Email")

    private String email;

    @Column(name="password")

    private String password;


    @OneToOne()

    private Role  role;



}
