package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "complaint")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int complaint_id;

    private String message;
    private String status;
    private LocalDateTime complaint_at;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private User user;

  

	@ManyToOne
    @JoinColumn(name = "pg_id")
    private Pg_properties pgProperty;

    // getters & setters
	  public int getComplaint_id() {
			return complaint_id;
		}

		public void setComplaint_id(int complaint_id) {
			this.complaint_id = complaint_id;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public LocalDateTime getComplaint_at() {
			return complaint_at;
		}

		public void setComplaint_at(LocalDateTime complaint_at) {
			this.complaint_at = complaint_at;
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
