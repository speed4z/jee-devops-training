package com.springmvc.service;

import java.util.List;

import com.springmvc.dao.TraineeNotFoundException;
import com.springmvc.entities.Trainee;

public interface TraineeService {
	Trainee addTrainee(Trainee t);
	Trainee removeTrainee(int id)throws TraineeNotFoundException;
	Trainee updateTrainee(Trainee t)throws TraineeNotFoundException;
	Trainee listById(int id)throws TraineeNotFoundException;
	List<Trainee> listAllTrainee();
}
