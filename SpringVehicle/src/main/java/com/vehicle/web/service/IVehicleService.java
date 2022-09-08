package com.vehicle.web.service;

import java.util.List;

import com.vehicle.web.entities.Vehicle;
import com.vehicle.web.exception.VehicleNotFoundException;

public interface IVehicleService {
	
	Vehicle addVehicle(Vehicle v);
	Vehicle listById (Long id) throws VehicleNotFoundException;
	Vehicle updateVehicle(Vehicle v,Long id) throws VehicleNotFoundException;
	void deleteById(Long id);
	List<Vehicle> listAllVehicle();
	
	
}
