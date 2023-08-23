package com.booking.moviebooking.repository;

import com.booking.moviebooking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    public Movie findByMovieName(String movieName);
    public Movie findByMovieId(Integer movieId);
}
