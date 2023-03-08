package com.booking.moviebooking.service;

<<<<<<< Updated upstream
import com.booking.moviebooking.utility.UserRequest;
import com.booking.moviebooking.utility.UserResponse;
=======
import com.booking.moviebooking.mapper.UserMapper;

import com.booking.moviebooking.model.UserTable;
>>>>>>> Stashed changes
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
        UserResponse userResponse=userRepository.findByEmail();
        if(userResponse==null){
          UserTable userTable=userRepository.save(UserMapper.userMapper.toUserTable(userrequest));
          return UserMapper.userMapper.toUserResponse(userTable);
        }
        else{
            return null;
        }
    }

    public UserResponse getUserById(int id) {
        UserResponse userresponse=UserMapper.userMapper.toUserResponse((userRepository.getReferenceById((long) id));
        return userresponse;
    }

    public List<UserTable> getAllUsers() {
           List<UserTable> usertable= UserMapper.userMapper.toUserResponseList((userRepository.findAll());
           return usertable;

    }


}
