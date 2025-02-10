package com.example.lab4_1.repository;

import com.example.lab4_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
}