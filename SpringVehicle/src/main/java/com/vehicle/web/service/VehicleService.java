package com.vehicle.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.web.entities.Vehicle;
import com.vehicle.web.exception.VehicleNotFoundException;
import com.vehicle.web.repository.VehicleRepository;

@Service
public class VehicleService implements IVehicleService{
	
	@Autowired
	private VehicleRepository repo;

	@Override
	public Vehicle addVehicle(Vehicle v) {
		
		return repo.save(v);
	}

	@Override
	public Vehicle listById(Long id) throws VehicleNotFoundException {
		Optional<Vehicle> v = repo.findById(id);
		return v.orElseThrow(()->new VehicleNotFoundException("Vehicle Not Found"));
	}

	@Override
	public Vehicle updateVehicle(Vehicle v,Long id) throws VehicleNotFoundException {
		Vehicle v2 = listById(id);	
		
		v2.setModel(v.getModel());
		v2.setRegisteredNumber(v.getRegisteredNumber());		
		return repo.save(v2);
	}

	@Override
	public void deleteById(Long id){
		repo.deleteById(id);		
	}

	@Override
	public List<Vehicle> listAllVehicle() {
		
		return repo.findAll();
	}

}
