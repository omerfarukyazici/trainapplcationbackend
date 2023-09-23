package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Reservation;

import java.util.List;


public interface ReservationService {
        Reservation createReservation(Reservation reservation);
        List<Reservation> getAllReservations();
        Reservation getReservationById(int id);
        void deleteReservation(int id);
        Reservation updateReservation(int id, Reservation reservation);

}
