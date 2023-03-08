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
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("roleId")
    private Integer roleId;


    @JsonProperty("role")

    private String role;



    @JsonProperty("userTable")
    @OneToOne()

    private  UserTable userTable;

}
