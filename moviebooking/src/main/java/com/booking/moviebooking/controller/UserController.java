package com.booking.moviebooking.controller;

import com.booking.moviebooking.utility.UserRequest;
import com.booking.moviebooking.utility.UserResponse;


import com.booking.moviebooking.model.UserTable;
import com.booking.moviebooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;
    @PostMapping("/addUser")
    public UserResponse addUser(UserRequest userrequest)
    {
        return userservice.addUser(userrequest);
    }

    @GetMapping("/getByUserId/{id}")
    public UserResponse getUserById(@PathVariable("id") int id)
    {
        return userservice.getUserById(id);
    }


    @GetMapping("/getAllUsers")
    public List<UserResponse> getAllUsers()
    {
        return userservice.getAllUsers();
    }




}
