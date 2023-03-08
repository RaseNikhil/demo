package com.booking.moviebooking.controller;


import com.booking.moviebooking.service.MovieService;
import com.booking.moviebooking.utility.MovieRequest;
import com.booking.moviebooking.utility.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody MovieRequest movieRequest){
        try{
            return movieService.addMovie(movieRequest);
        }catch (Exception e){
            return String.format(e.toString());
        }
    }
    @GetMapping("/getMovieById/{id}")
    public ResponseEntity<MovieResponse>  getMovieById(@PathVariable("id") int id)
    {
        try
        {
            return movieService.getMovieById(id);


        }catch(Exception ex)
        {
            return  new  ResponseEntity<>(null , HttpStatus.INTERNAL_SERVER_ERROR);
        }


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

    public ResponseEntity<String>   addMovies(@RequestBody List<MovieRequest> movieRequestList)
    {

        try
        {
            return  movieService.addMovies(movieRequestList);

        }catch (Exception ex)
        {
            return  new ResponseEntity<>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
