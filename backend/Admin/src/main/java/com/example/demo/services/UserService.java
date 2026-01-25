package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo Uservice;
	
	 public String registerUser(User user) {

	        // OWNER case
	        if (user.getRole().getRoleId() == 2) {
	            user.setStatus("PENDING");
	        } 
	        // USER case
	        else {
	            user.setStatus("ACTIVE");
	        }

	        Uservice.save(user);
	        return "User registered successfully";
	    }

	    // ADMIN → VIEW ALL USERS
	    public List<User> getAllUsers() {
	        return Uservice.findAll();
	    }
	
	
	public String approveOwner(int userId) {
	    User user = Uservice.findById(userId).orElseThrow();
	    user.setStatus("APPROVED");
	    Uservice.save(user);
	    return "Owner approved";
	}

	public String rejectOwner(int userId) {
	    User user = Uservice.findById(userId).orElseThrow();
	    user.setStatus("REJECTED");
	    Uservice.save(user);
	    return "Owner rejected";
	}

}
