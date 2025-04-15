package com.example.CarShare.repository;

import com.example.CarShare.model.Ride;
import com.example.CarShare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
