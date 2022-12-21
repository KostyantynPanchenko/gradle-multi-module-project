package com.example.gradle.service;

import com.example.gradle.model.TrainTime;
import java.time.LocalTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TrainTimeService {

  public List<TrainTime> getTrainTimes() {
    return List.of(
        new TrainTime("London", "Chelsey", LocalTime.of(9, 30, 0), LocalTime.of(11, 30, 0)),
        new TrainTime("London", "Chelsey", LocalTime.of(10, 30, 0), LocalTime.of(12, 30, 0)),
        new TrainTime("London", "Chelsey", LocalTime.of(11, 30, 0), LocalTime.of(13, 30, 0)),
        new TrainTime("London", "Chelsey", LocalTime.of(12, 30, 0), LocalTime.of(14, 30, 0))
    );
  }
}
