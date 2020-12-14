package com.test.usersinteraction.controller;

import com.test.usersinteraction.entity.User;
import com.test.usersinteraction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/insert")
    public ResponseEntity<User> create(@RequestBody User user) {
        service.create(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = service.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id) {
        service.update(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
