package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Train;
import com.example.trainapplicationn.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImplement  implements TrainService{

    private final TrainRepository trainRepository;

    public TrainServiceImplement(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }



    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }


    public List<Train> getAllTrain() {
        return trainRepository.findAll();
    }


    public Train getTrainById(int id) {
        return trainRepository.findById(id).get();
    }


    public void deleteTrain(int id) {
        Train train = trainRepository.findById(id).get();
        if (train != null) {
            trainRepository.delete(train);
        }
    }


    public Train updateTrain(int id, Train train) {
        Train oldTrain = trainRepository.findById(id).get();

        if (oldTrain != null) {
            train.setId(id);
            return trainRepository.save(train);

        }
        return null;

    }
}