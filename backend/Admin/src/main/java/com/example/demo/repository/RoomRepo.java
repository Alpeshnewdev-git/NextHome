package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {

    // 🔹 Admin → View all AVAILABLE rooms
    List<Room> findByStatus(String status);
}
