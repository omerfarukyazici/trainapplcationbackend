package com.example.trainapplicationn.repository;

import com.example.trainapplicationn.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
