package com.booking.moviebooking.repository;


import com.booking.moviebooking.model.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTable,Long> {
    UserTable findByEmail(String email);
}
