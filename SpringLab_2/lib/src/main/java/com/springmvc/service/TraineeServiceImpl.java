package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.TraineeDao;
import com.springmvc.dao.TraineeNotFoundException;
import com.springmvc.entities.Trainee;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao dao;
	
	@Override
	public Trainee addTrainee(Trainee t) {
		// TODO Auto-generated method stub
		return dao.addTrainee(t);
	}

	@Override
	public Trainee removeTrainee(int id) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		return dao.removeTrainee(id);
	}

	@Override
	public Trainee updateTrainee(Trainee t) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		return dao.updateTrainee(t);
	}

	@Override
	public Trainee listById(int id) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
		return dao.listById(id);
	}

	@Override
	public List<Trainee> listAllTrainee() {
		// TODO Auto-generated method stub
		return dao.listAllTrainee();
	}

}
