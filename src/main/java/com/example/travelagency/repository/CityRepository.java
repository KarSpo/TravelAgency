package com.example.travelagency.repository;

import com.example.travelagency.model.AirportModel;
import com.example.travelagency.model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityModel, Long> {
}
