package com.booking.moviebooking.service;

import com.booking.moviebooking.exception.UserNotFoundException;
import com.booking.moviebooking.utility.UserRequest;
import com.booking.moviebooking.utility.UserResponse;
import com.booking.moviebooking.mapper.UserMapper;

import com.booking.moviebooking.model.UserTable;
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
        UserTable userTable=userRepository.findByEmail(userrequest.getEmail());
        if(userTable==null){
          UserTable userTable1=userRepository.save(UserMapper.userMapper.toUserTable(userrequest));
          return UserMapper.userMapper.toUserResponse(userTable1);
        }
        else{
            return null;
        }
    }

    public UserResponse getUserById(long id) throws UserNotFoundException {
        UserResponse userresponse=UserMapper.userMapper.toUserResponse((userRepository.getReferenceById(id)));
         if(userresponse!=null)
         {
             return userresponse;
         }else {
             throw new UserNotFoundException("User not Found");
         }
    }

    public List<UserResponse> getAllUsers() {
           List<UserResponse> usertable1= UserMapper.userMapper.toUserResponseList(userRepository.findAll());
           return usertable1;

    }


}
