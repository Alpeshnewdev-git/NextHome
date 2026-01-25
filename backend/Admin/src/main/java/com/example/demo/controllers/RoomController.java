package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Room;
import com.example.demo.services.RoomService;

@RestController
@RequestMapping("/admin/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // 🔹 Admin → View AVAILABLE rooms
    @GetMapping("/available")
    public List<Room> viewAvailableRooms() {
        return roomService.getAvailableRooms();
    }
}
