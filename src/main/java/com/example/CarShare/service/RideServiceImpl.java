package com.example.CarShare.service;

import com.example.CarShare.model.Ride;
import com.example.CarShare.model.User;
import com.example.CarShare.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    private final RideRepository rideRepository;

    @Autowired
    public RideServiceImpl(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @Override
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}
