package com.microservices.taxi.controller;

import com.microservices.taxi.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @RequestMapping("{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

}