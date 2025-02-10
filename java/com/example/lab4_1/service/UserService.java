package com.example.lab4_1.service;

import com.example.lab4_1.entity.User;
import com.example.lab4_1.repository.UserRepository;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository custDetailsRepository;

    public Page<User> getPaginatedUsers(int page, int pageSize) {
        return custDetailsRepository.findAll(PageRequest.of(page, pageSize));
    }

    public List<User> getAllUsers() {
        return custDetailsRepository.findAll();
    }

    public void saveUser(@Valid User user){
        custDetailsRepository.save(user);
    }
}
