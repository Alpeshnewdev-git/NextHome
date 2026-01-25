package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

   

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedback_id;

    private int rating;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "pg_id")
    private Pg_properties pgProperty;

    // getters & setters
    public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pg_properties getPgProperty() {
		return pgProperty;
	}

	public void setPgProperty(Pg_properties pgProperty) {
		this.pgProperty = pgProperty;
	}
}
