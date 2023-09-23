package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Passenger;
import com.example.trainapplicationn.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassengerServiceImplement implements PassengerService{
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Passenger createPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();

    }

    @Override
    public Passenger getPassengerById(int id) {
        return passengerRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePassenger(int id) {
        Passenger passenger = passengerRepository.findById(id).orElse(null);
        if (passenger != null) {
            passengerRepository.delete(passenger);
        }
    }

    @Override
    public Passenger updatePassenger(int id, Passenger passenger) {
        Passenger oldPassenger = passengerRepository.findById(id).orElse(null);

        if (oldPassenger != null) {
            passenger.setId(id);
            return passengerRepository.save(passenger);
        }
        return null;
    }
}
