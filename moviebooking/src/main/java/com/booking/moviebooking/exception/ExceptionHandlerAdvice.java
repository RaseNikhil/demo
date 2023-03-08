package com.booking.moviebooking.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerAdvice {



    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String , String> userNotFoundExec(UserNotFoundException exception)
    {
       Map<String ,String>  map = new HashMap<>();

       map.put("message:",exception.getMessage());
       return  map;

    }


    @ExceptionHandler(MovieNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String>  movieNotFoundExc(MovieNotFoundException ex)
    {

        Map<String ,String>  map = new HashMap<>();

        map.put("message:",ex.getMessage());
        return  map;


    }

    @ExceptionHandler(MovieAlreadyPresent.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String ,String >  movieAlreadyPresentExc(MovieAlreadyPresent ex)
    {
        Map<String ,String>  map = new HashMap<>();

        map.put("message:",ex.getMessage());
        return  map;
    }

}
