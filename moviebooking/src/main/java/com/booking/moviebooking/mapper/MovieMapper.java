package com.booking.moviebooking.mapper;


import com.booking.moviebooking.model.Movie;
import com.booking.moviebooking.model.MovieRequest;
import com.booking.moviebooking.model.MovieResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MovieMapper {
  MovieMapper movieMapper = Mappers.getMapper(MovieMapper.class);

    Movie toMovieEntity(MovieRequest movieRequest);

    MovieResponse toMovieResponse(Movie movie);

    List<MovieResponse> toMovieResponseList(List<Movie> movieList);
}

