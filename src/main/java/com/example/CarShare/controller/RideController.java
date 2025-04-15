package com.example.CarShare.controller;

import com.example.CarShare.model.Ride;
import com.example.CarShare.model.User;
import com.example.CarShare.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RideController {

    private final RideService rideService;

    @Autowired
    public RideController(RideService rideService) {
        this.rideService = rideService;
    }


    @GetMapping("/rides")
    public List<Ride> getAllUsers() {
        return rideService.getAllRides();
    }
}
