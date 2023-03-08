package com.booking.moviebooking.service;

import com.booking.moviebooking.mapper.MovieMapper;
import com.booking.moviebooking.model.Movie;
import com.booking.moviebooking.utility.MovieRequest;
import com.booking.moviebooking.repository.MovieRepository;
import com.booking.moviebooking.utility.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequest movieRequest){
        Optional<Movie> movieData = movieRepository.findById(movieRequest.getUserId());
        if(movieData==null){
            movieRepository.save(MovieMapper.movieMapper.toEntity(movieRequest));
            return "Movie Added";
        }else {
            return "movie Already Present";
        }
    }

    public MovieResponse getMovieById(int id){
        Optional<Movie> movieData=movieRepository.findById(id);
        if(movieData.isPresent()){
            return MovieMapper.movieMapper.toResponse(movieData.get());
        }else{
            return null;
        }
    }

    public List<MovieResponse> getAllMovies(){
        List<MovieResponse> allMovies = MovieMapper.movieMapper.toResponseList(movieRepository.findAll());
        return allMovies;
    }
}
