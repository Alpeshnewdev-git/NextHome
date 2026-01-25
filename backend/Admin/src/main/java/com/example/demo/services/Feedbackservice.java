package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Feedback;
import com.example.demo.repository.FeedbackRepo;



@Service
public class Feedbackservice {

    @Autowired
    private FeedbackRepo feedbackRepo;


    // ADMIN → VIEW ALL FEEDBACK
    public List<Feedback> getAllFeedback() {
        return feedbackRepo.findAll();
    }
    
    
    // Admin View Feedback by Pg
    public List<Feedback> getFeedBackByPg(int pgId){
    	return feedbackRepo.findByPgProperty_PgId(pgId);
    }
    
    // Admin  View Feedback by User
    
    public List<Feedback> getFeedbackByUser(int userId){
    	return feedbackRepo.findByUser_UserId(userId);
    }
}
