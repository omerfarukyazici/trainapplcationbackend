package com.example.trainapplicationn.repository;

import com.example.trainapplicationn.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
