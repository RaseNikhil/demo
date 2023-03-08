package com.booking.moviebooking.service;

import com.booking.moviebooking.mapper.MovieMapper;
import com.booking.moviebooking.model.Movie;
import com.booking.moviebooking.utility.MovieRequest;
import com.booking.moviebooking.repository.MovieRepository;
import com.booking.moviebooking.utility.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public  ResponseEntity<MovieResponse> getMovieById(int id){
        Optional<Movie> movieData=movieRepository.findById(id);

        if(movieData.isPresent()){
           return new ResponseEntity<>(MovieMapper.movieMapper.toResponse(movieData.get()),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    public  ResponseEntity<List<MovieResponse>> getAllMovies(){
        List<MovieResponse> allMovies = MovieMapper.movieMapper.toResponseList(movieRepository.findAll());
        return  new ResponseEntity<>(allMovies,HttpStatus.OK);
    }


    public ResponseEntity<String> addMovies(List<MovieRequest> movieRequestList){
        List<Movie> movies=MovieMapper.movieMapper.toMovie(movieRequestList);
       List<Movie> movieList= movieRepository.saveAll(movies);
       return new ResponseEntity<>("All movies added", HttpStatus.OK);
    }
    public ResponseEntity<String> deleteMovieById(int id){
        Movie movieExist=movieRepository.findByMovieId(id);
        if(movieExist!=null){
            movieRepository.deleteById(id);
            return new ResponseEntity<>("Succefully Deleted ",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("No movie found",HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<String> updateById(int id,MovieRequest movieRequest){
        Movie movieExist=movieRepository.findByMovieId(id);
        if(movieExist!=null){
          movieExist.setMovieName(movieRequest.getMovieName());
          movieExist.setMovieDescription(movieRequest.getMovieDescription());
          movieExist.setMovieLanguage(movieRequest.getMovieLanguage());
          movieExist.setGenre(movieRequest.getGenre());
          movieExist.setShowTiming(movieRequest.getShowTiming());
            movieRepository.saveAndFlush(movieExist);
            return new ResponseEntity<>("Successfully Updated",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Movie Not found",HttpStatus.NOT_FOUND);
        }
    }
}
