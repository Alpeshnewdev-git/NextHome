package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Feedback;
import com.example.demo.services.Feedbackservice;

@RestController
@RequestMapping("/admin/feedback")
public class FeedbackControllers {

    @Autowired
    private Feedbackservice feedbackService;

  
    //  VIEW ALL FEEDBACK
    @GetMapping("/allfeedback")
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }
    
    // View Feedback By Pg
    
    @GetMapping("/pg/{pId}")
    public List<Feedback> getFeedbackByPg(@PathVariable int pId){
    	return feedbackService.getFeedBackByPg(pId);
    }
    
    @GetMapping("/user/{userId}")
    public List<Feedback> getFeedbacksByUser(@PathVariable int userId){
    	return feedbackService.getFeedbackByUser(userId);
    }
}
