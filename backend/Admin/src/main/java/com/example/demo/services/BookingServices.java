package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Booking;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingServices {

    @Autowired
    private BookingRepo bookingRepo;

 
    
    //Admin  filter by Status  //not implemented
    public List<Booking> getBookingByStatus(String status){
    	return  bookingRepo.findByBookingStatus(status);
    }
    
    
    

    // ADMIN → VIEW ALL BOOKINGS
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }



  
}
