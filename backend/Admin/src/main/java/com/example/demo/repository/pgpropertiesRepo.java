package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Pg_properties;

@Repository
public interface pgpropertiesRepo extends JpaRepository<Pg_properties, Integer> {

    List<Pg_properties> findByStatus(String status);

    List<Pg_properties> findByCity_CityId(int cityId);

    List<Pg_properties> findByRentBetween(double min, double max);

    List<Pg_properties> findByOwner_UserId(int ownerId);
}
