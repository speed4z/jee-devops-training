package com.vehicle.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.web.entities.Vehicle;
import com.vehicle.web.exception.VehicleNotFoundException;
import com.vehicle.web.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleService service;
	
	@PostMapping("/vehicles")
	public Vehicle addVehicle(@Valid @RequestBody Vehicle v) {
		
		   return service.addVehicle(v);
	}
	
	@GetMapping("/vehicles")
	public List<Vehicle> listAllVehicle() {		
		
		return service.listAllVehicle();
	}
	
	@GetMapping("/vehicles/{idd}")
	public Vehicle listById(@PathVariable("idd")Long id) throws VehicleNotFoundException{
		
		return service.listById(id);
	}
	
	
    @PutMapping("/vehicles/{id}")
    public Vehicle updateVehicle(@RequestBody Vehicle v,@PathVariable Long id) throws VehicleNotFoundException
    {
        return service.updateVehicle(v, id);

    }
    
    @PatchMapping("/vehicles/{id}")
    public Vehicle updateVehiclePart(@RequestBody Vehicle v,@PathVariable Long id) throws VehicleNotFoundException
    {
        return service.updateVehicle(v, id);

    }
    
    @DeleteMapping("/vehicles/{id}")
    public String deleteById(@PathVariable Long id) throws VehicleNotFoundException
    {
        service.deleteById(id);
        return "Deleted Successfully";

    }
	
	
}
