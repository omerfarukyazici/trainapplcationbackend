package com.example.trainapplicationn.service;

import com.example.trainapplicationn.model.Train;

import java.util.List;

public interface TrainService {
    public Train createTrain(Train train);
    public List<Train> getAllTrain();
    public Train getTrainById(int id);
    public void deleteTrain(int id);
    public Train updateTrain(int id, Train train);

}
