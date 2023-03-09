package com.booking.moviebooking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMappers {
    UserMappers INSTANCE= Mappers.getMapper(UserMappers.class);

}
