package com.booking.moviebooking.service;

import com.booking.moviebooking.model.UserRequest;
import com.booking.moviebooking.model.UserResponse;
import com.booking.moviebooking.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse addUser(UserRequest userrequest) {

    }

    public UserResponse getUserById(int id) {
    }

    public List<UserResponse> getAllUsers() {
    }


}
