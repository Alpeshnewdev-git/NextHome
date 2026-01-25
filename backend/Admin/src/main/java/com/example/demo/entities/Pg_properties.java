package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pg_property")
public class Pg_properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pg_id")
    private int pgId;

    private String pg_name;
    
    private String description;
    
    private int address;
    
    

	private String type;
    
    private int rent;
    
    private String facility;
    
    private String status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    // getters & setters
    
    public int getPg_id() {
		return pgId;
	}

	public void setPg_id(int pg_id) {
		this.pgId = pg_id;
	}

	public String getPg_name() {
		return pg_name;
	}

	public void setPg_name(String pg_name) {
		this.pg_name = pg_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
