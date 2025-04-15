package com.example.CarShare.service;

import com.example.CarShare.model.Ride;
import com.example.CarShare.model.User;

import java.util.List;

public interface RideService {
    List<Ride> getAllRides();

    Ride addNewRide(Ride ride);
}
