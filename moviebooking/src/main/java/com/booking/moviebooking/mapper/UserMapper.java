package com.booking.moviebooking.mapper;

import com.booking.moviebooking.model.*;
import com.booking.moviebooking.utility.UserRequest;
import com.booking.moviebooking.utility.UserResponse;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    UserTable toUserTable(UserRequest userRequest);

    UserResponse toUserResponse(UserTable userTable);

    List<UserResponse> toUserResponseList(List<UserTable> userTableList);
}
