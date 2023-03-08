package com.booking.moviebooking.exception;


import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {


    public Map<String , String> userNotFoundExec(UserNotFoundException exception)
    {
       Map<String ,String>  map = new HashMap<>();

       map.put("message:",exception.getMessage());
       return  map;

    }

}
