package com.vehicle.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.web.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
