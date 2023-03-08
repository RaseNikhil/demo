package com.booking.moviebooking.service;

import com.booking.moviebooking.repository.MovieRepository;
import com.booking.moviebooking.repository.TheatreRepository;
import com.booking.moviebooking.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    UserRepository userRepository;
    MovieRepository movieRepository;
    TheatreRepository theatreRepository;

    public TransactionService(UserRepository userRepository, MovieRepository movieRepository, TheatreRepository theatreRepository) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
        this.theatreRepository = theatreRepository;
    }
    

}
