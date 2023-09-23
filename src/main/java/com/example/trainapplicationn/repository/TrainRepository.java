package com.example.trainapplicationn.repository;

import com.example.trainapplicationn.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository  extends JpaRepository<Train,Integer> {
}
