package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private int roomId;

    @Column(name = "room_no")
    private String roomNo;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "total_bed")
    private int totalBed;

    private int sharing;

    @Column(name = "security_deposit")
    private int securityDeposit;

    private String status; // AVAILABLE / BOOKED / BLOCKED

    @ManyToOne
    @JoinColumn(name = "pg_id")
    private Pg_properties pgProperty;

    // -------- getters & setters --------

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getTotalBed() {
        return totalBed;
    }

    public void setTotalBed(int totalBed) {
        this.totalBed = totalBed;
    }

    public int getSharing() {
        return sharing;
    }

    public void setSharing(int sharing) {
        this.sharing = sharing;
    }

    public int getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(int securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pg_properties getPgProperty() {
        return pgProperty;
    }

    public void setPgProperty(Pg_properties pgProperty) {
        this.pgProperty = pgProperty;
    }
}
