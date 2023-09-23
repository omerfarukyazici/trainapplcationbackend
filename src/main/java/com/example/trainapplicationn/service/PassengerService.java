package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Passenger;

import java.util.List;

public interface PassengerService {
    Passenger createPassenger(Passenger passenger);
    List<Passenger> getAllPassengers();
    Passenger getPassengerById(int id);
    void deletePassenger(int id);
    Passenger updatePassenger(int id, Passenger passenger);
}
