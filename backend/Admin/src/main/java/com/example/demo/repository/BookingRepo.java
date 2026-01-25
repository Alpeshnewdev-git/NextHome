package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

    // USER → apni bookings
    List<Booking> findByTenant_UserId(int userId);

    // OWNER → PG ki bookings
    List<Booking> findByPgProperty_PgId(int pgId);

    // STATUS filter
    List<Booking> findByBookingStatus(String bookingStatus);
}
