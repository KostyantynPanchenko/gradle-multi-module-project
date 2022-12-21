package com.example.gradle.controller;

import com.example.gradle.model.TrainTime;
import com.example.gradle.service.TrainTimeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxiRailController {

  private final TrainTimeService trainTimeService;

  public MaxiRailController(final TrainTimeService trainTimeService) {
    this.trainTimeService = trainTimeService;
  }

  @GetMapping(path = "/")
  public List<TrainTime> getTimes() {
    return trainTimeService.getTrainTimes();
  }
}
