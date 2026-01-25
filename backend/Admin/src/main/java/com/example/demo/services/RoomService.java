package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Room;
import com.example.demo.repository.RoomRepo;

@Service
public class RoomService {

    @Autowired
    private RoomRepo roomRepo;

    // 🔹 Admin → View all AVAILABLE rooms
    public List<Room> getAvailableRooms() {
        return roomRepo.findByStatus("AVAILABLE");
    }
}
