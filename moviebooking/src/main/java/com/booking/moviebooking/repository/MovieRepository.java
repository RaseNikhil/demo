package com.booking.moviebooking.repository;

import com.booking.moviebooking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    public Movie findByMovieName(String movieName);
    public Movie findByMovieId(Integer movieId);
}
