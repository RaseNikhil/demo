package com.booking.moviebooking.service;

import com.booking.moviebooking.exception.UserNotFoundException;
import com.booking.moviebooking.mapper.UserMappers;
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

        System.out.println(UserMappers.INSTANCE);
        System.out.println(userrequest);
        UserTable userTable=userRepository.findByEmail(userrequest.getEmail());
        if(userTable==null){
            System.out.println("Inside");

          UserTable userTable1=userRepository.save(UserMapper.INSTANCE.toUserTable(userrequest));
          return UserMapper.INSTANCE.toUserResponse(userTable1);
        }
        else{
            return null;
        }
    }

    public UserResponse getUserById(long id) throws UserNotFoundException {
        UserResponse userresponse=UserMapper.INSTANCE.toUserResponse((userRepository.getReferenceById(id)));
         if(userresponse!=null)
         {
             return userresponse;
         }else {
             throw new UserNotFoundException("User not Found");
         }
    }

    public List<UserResponse> getAllUsers() {
           List<UserResponse> usertable1= UserMapper.INSTANCE.toUserResponseList(userRepository.findAll());
           return usertable1;

    }


}
