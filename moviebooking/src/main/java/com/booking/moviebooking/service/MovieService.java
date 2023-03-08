package com.booking.moviebooking.service;

import com.booking.moviebooking.mapper.MovieMapper;
import com.booking.moviebooking.model.Movie;
import com.booking.moviebooking.model.MovieRequest;
import com.booking.moviebooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequest movieRequest){
        Movie movieData = movieRepository.findByMovieid(movieRequest.getUserId());
        if(movieData==null){
            movieRepository.save(MovieMapper.movieMapper.toEntity(movieRequest));
            return "Movie Added";
        }else {
            return "movie Already Present";
        }
    }
}
