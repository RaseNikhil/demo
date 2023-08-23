package com.booking.moviebooking.model;

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
    @Column(name="userId")
    private Long userId;
    @Column(name="userName")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name ="roleId", updatable = false,nullable = false)
    private RoleTable role;
}
