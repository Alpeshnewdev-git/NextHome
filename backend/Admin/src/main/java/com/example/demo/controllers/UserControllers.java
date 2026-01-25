package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/admin/users")
public class UserControllers {

    @Autowired
    private UserService usercon;

    // REGISTER USER / OWNER
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return usercon.registerUser(user);
    }

    // VIEW ALL USERS
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return usercon.getAllUsers();
    }

    // APPROVE OWNER
    @PutMapping("/approve/{id}")
    public String approveOwner(@PathVariable int id) {
        return usercon.approveOwner(id);
    }

    // REJECT OWNER
    @PutMapping("/reject/{id}")
    public String rejectOwner(@PathVariable int id) {
        return usercon.rejectOwner(id);
    }
}
