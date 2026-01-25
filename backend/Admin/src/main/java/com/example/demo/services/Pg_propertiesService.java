package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pg_properties;
import com.example.demo.repository.pgpropertiesRepo;

@Service
public class Pg_propertiesService {

    @Autowired
    private pgpropertiesRepo pgRepo;   // ✅ meaningful name


    // ADMIN / PUBLIC → ALL PGs
    public List<Pg_properties> getAllPgProperties() {
        return pgRepo.findAll();
    }

   

    // ADMIN → VIEW PENDING PGs
    public List<Pg_properties> getPendingPgProperties() {
        return pgRepo.findByStatus("PENDING");
    }

    // ADMIN → APPROVE PG
    public String approvePg(int pgId) {
        Pg_properties pg = pgRepo.findById(pgId)
                .orElseThrow(() -> new RuntimeException("PG not found"));

        pg.setStatus("AVAILABLE");
        pgRepo.save(pg);
        return "PG approved successfully";
    }

    // ADMIN → REJECT PG
    public String rejectPg(int pgId) {
        Pg_properties pg = pgRepo.findById(pgId)
                .orElseThrow(() -> new RuntimeException("PG not found"));

        pg.setStatus("REJECTED");
        pgRepo.save(pg);
        return "PG rejected";
    }

   

   
}
