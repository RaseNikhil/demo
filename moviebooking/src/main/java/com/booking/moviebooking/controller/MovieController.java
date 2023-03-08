package com.booking.moviebooking.controller;

import com.booking.moviebooking.model.MovieRequest;
import com.booking.moviebooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/addMovie")
    public String addMovie(@RequestBody MovieRequest movieRequest){
        try{
            return movieService.addMovie(movieRequest);
        }catch (Exception e){
            return String.format(e.toString());
        }
    }
}
