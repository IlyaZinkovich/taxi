package com.microservices.taxi.service;

import com.microservices.taxi.model.User;
import com.microservices.taxi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User findById(Long id) {
        return userRepository.findOne(id);
    }
}
