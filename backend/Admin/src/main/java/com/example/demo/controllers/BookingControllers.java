package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Booking;
import com.example.demo.services.BookingServices;

@RestController
@RequestMapping("/booking")
public class BookingControllers {

    @Autowired
    private BookingServices bookingServices;



    // ADMIN → VIEW ALL BOOKINGS
    @GetMapping("/admin/all")
    public List<Booking> getAllBookings() {
        return bookingServices.getAllBookings();
    }

 


    
}
