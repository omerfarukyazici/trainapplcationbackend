package com.example.trainapplicationn.controller;

import com.example.trainapplicationn.model.Train;
import com.example.trainapplicationn.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@Controller
@RequestMapping("/api/v1/trains")
public class TrainController {
    @Autowired
   private TrainService trainService;
    @PostMapping("/saveTrain")
    public ResponseEntity<Train> createTrain(@RequestBody Train train){
        return  new ResponseEntity<Train>(trainService.createTrain(train),HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Train>>getAllTrain(){
        return new ResponseEntity<List<Train>>(trainService.getAllTrain(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Train>getTrainById(@PathVariable int id){
        return new ResponseEntity<Train>(trainService.getTrainById(id),HttpStatus.OK);

    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String>deleteTrain(@PathVariable int id){
        trainService.deleteTrain(id);
        return new ResponseEntity<String>("Delete Succesfully",HttpStatus.OK
        );
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Train>updateTrain(@PathVariable int id,@RequestBody Train train){
        return new ResponseEntity<Train>(trainService.updateTrain(id,train),HttpStatus.OK);
    }
}
