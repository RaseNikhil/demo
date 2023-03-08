package com.booking.moviebooking.repository;


import com.booking.moviebooking.model.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTable,Long> {
    UserTable findByEmail();
}
