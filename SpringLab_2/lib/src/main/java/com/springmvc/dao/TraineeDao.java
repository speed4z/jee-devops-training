package com.springmvc.dao;

import java.util.List;

import com.springmvc.entities.Trainee;

public interface TraineeDao {
	Trainee addTrainee(Trainee t);
	Trainee removeTrainee(int id)throws TraineeNotFoundException;
	Trainee updateTrainee(Trainee t)throws TraineeNotFoundException;
	Trainee listById(int id)throws TraineeNotFoundException;
	List<Trainee> listAllTrainee();
	
}
