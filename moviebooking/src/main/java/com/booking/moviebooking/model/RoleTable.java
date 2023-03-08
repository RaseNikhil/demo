package com.booking.moviebooking.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private Integer roleId;




    private String role;




    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private  UserTable userTable;

}
