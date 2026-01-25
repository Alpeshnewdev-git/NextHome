package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    private LocalDate bookDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private int rentAmount;

    @Column(name = "booking_status")
    private String bookingStatus;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private User tenant;

    @ManyToOne
    @JoinColumn(name = "pg_id")
    private Pg_properties pgProperty;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    // ✅ getters & setters (camelCase only)

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDate bookDate) {
        this.bookDate = bookDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public User getTenant() {
        return tenant;
    }

    public void setTenant(User tenant) {
        this.tenant = tenant;
    }

    public Pg_properties getPgProperty() {
        return pgProperty;
    }

    public void setPgProperty(Pg_properties pgProperty) {
        this.pgProperty = pgProperty;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

