package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Reservation;
import com.example.trainapplicationn.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImplement implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImplement(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(int id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReservation(int id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation != null) {
            reservationRepository.delete(reservation);
        }
    }

    @Override
    public Reservation updateReservation(int id, Reservation reservation) {
        Reservation oldReservation = reservationRepository.findById(id).orElse(null);

        if (oldReservation != null) {
            reservation.setId(id);
            return reservationRepository.save(reservation);
        }
        return null;
    }
}
