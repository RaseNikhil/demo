package com.booking.moviebooking.mapper;


import com.booking.moviebooking.model.Movie;
import com.booking.moviebooking.utility.MovieRequest;
import com.booking.moviebooking.utility.MovieResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MovieMapper {
  MovieMapper movieMapper = Mappers.getMapper(MovieMapper.class);

    Movie toEntity(MovieRequest movieRequest);

    MovieResponse toResponse(Movie movie);

    List<MovieResponse> toResponseList(List<Movie> movieList);
}

