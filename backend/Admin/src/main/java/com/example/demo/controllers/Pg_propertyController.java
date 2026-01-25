package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Pg_properties;
import com.example.demo.services.Pg_propertiesService;

@RestController
@RequestMapping("/pg")
public class Pg_propertyController {

    @Autowired
    private Pg_propertiesService pgPropertyService;

    



    // ADMIN → VIEW ALL PGs
    @GetMapping("/admin/all")
    public List<Pg_properties> getAllPgs() {
        return pgPropertyService.getAllPgProperties();
    }

    // ADMIN → VIEW PENDING PGs
    @GetMapping("/admin/pending")
    public List<Pg_properties> getPendingPgs() {
        return pgPropertyService.getPendingPgProperties();
    }

    // ADMIN → APPROVE PG
    @PutMapping("/admin/approve/{pgId}")
    public String approvePg(@PathVariable int pgId) {
        return pgPropertyService.approvePg(pgId);
    }

    // ADMIN → REJECT PG
    @PutMapping("/admin/reject/{pgId}")
    public String rejectPg(@PathVariable int pgId) {
        return pgPropertyService.rejectPg(pgId);
    }

  

}
