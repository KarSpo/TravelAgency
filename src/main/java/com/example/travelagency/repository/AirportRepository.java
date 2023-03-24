package com.example.travelagency.repository;

import com.example.travelagency.model.AirportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<AirportModel, Long> {
}
