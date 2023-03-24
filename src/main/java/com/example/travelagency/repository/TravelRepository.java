package com.example.travelagency.repository;

import com.example.travelagency.model.TravelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<TravelModel, Long> {
}
