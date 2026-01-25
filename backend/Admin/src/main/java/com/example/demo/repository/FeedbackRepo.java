package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {
	
	// Admin - View feedback by Pg
	List<Feedback> findByPgProperty_PgId(int pgId);

	
	
	// Admin - view feedback by user
	List <Feedback> findByUser_UserId(int userId);
	

}
