package com.booking.moviebooking.controller;


import com.booking.moviebooking.exception.MovieAlreadyPresent;
import com.booking.moviebooking.exception.MovieNotFoundException;
import com.booking.moviebooking.service.MovieService;
import com.booking.moviebooking.utility.MovieRequest;
import com.booking.moviebooking.utility.MovieResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody  @Valid MovieRequest movieRequest) throws MovieAlreadyPresent {
        return movieService.addMovie(movieRequest);
    }
    @GetMapping("/getMovieById/{id}")
    public ResponseEntity<MovieResponse>  getMovieById(@PathVariable("id")  int id ) throws MovieNotFoundException
    {
        return movieService.getMovieById(id);


    }


    @GetMapping("/getAllMovies")
    public ResponseEntity<List<MovieResponse>>  getAllMovies()
    {

         try{

             return movieService.getAllMovies();

         }catch (Exception ex)
         {
             return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }


    @PostMapping("/addMovies")

    public ResponseEntity<String>   addMovies(@RequestBody @Valid  List<MovieRequest> movieRequestList) throws MovieAlreadyPresent

    {

        return  movieService.addMovies(movieRequestList);
    }



    @DeleteMapping("deleteMovie/{id}")
    public ResponseEntity<String>  deleteMovieById(@PathVariable("id") int id)
    {
        try{

              return  movieService.deleteMovieById(id);

        }catch (Exception  ex)
        {
            return  new ResponseEntity<>("Something went Wrong" , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/updateMovie/{id}")

    public ResponseEntity<String>  updateById(@PathVariable("id") int id , @RequestBody MovieRequest movieRequest)
    {

        try
        {  return  movieService.updateById(id,movieRequest);

        }catch (Exception  ex )
        {
            return  new ResponseEntity<>("Something Went Wrong",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
