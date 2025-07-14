package com.example.OnlineTender.repository;

import com.example.OnlineTender.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Custom method for login
}