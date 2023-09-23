package com.example.trainapplicationn.controller;

import java.util.List;

import com.example.trainapplicationn.model.Passenger;
import com.example.trainapplicationn.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/passengers")
public class PassengerController {
       @Autowired
  private PassengerService passengerService;



    @PostMapping("/savePassenger")
    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
        return new ResponseEntity<>(passengerService.createPassenger(passenger), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        return new ResponseEntity<>(passengerService.getAllPassengers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable int id) {
        Passenger passenger = passengerService.getPassengerById(id);
        if (passenger != null) {
            return new ResponseEntity<>(passenger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable int id) {
        passengerService.deletePassenger(id);
        return new ResponseEntity<>("Delete Successfully", HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable int id, @RequestBody Passenger passenger) {
        Passenger updatedPassenger = passengerService.updatePassenger(id, passenger);
        if (updatedPassenger != null) {
            return new ResponseEntity<>(updatedPassenger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
