package com.vehicle.web.specs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.vehicle.web.entities.Vehicle;
import com.vehicle.web.exception.VehicleNotFoundException;
import com.vehicle.web.repository.VehicleRepository;
import com.vehicle.web.service.IVehicleService;
import com.vehicle.web.service.VehicleService;

@SpringBootTest
public class VehicleSpecs {
	
	@Mock
	VehicleRepository repo;
	
	@InjectMocks
	IVehicleService service = new VehicleService();
	List<Vehicle> vehicles = new ArrayList<>();
	
	Vehicle v1,v2,v3;
	@SuppressWarnings("deprecation")
	@Before(value="")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	@BeforeEach
	void setUp() throws Exception {
		v1 = new Vehicle("Ferrari",101);
		v2 = new Vehicle("Mercedes",102);
		v3 = new Vehicle("BMW",103);		
		
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);	  
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testAddVehicle() {
		when(repo.save(v1)).thenReturn(v1);
		Vehicle retVal = service.addVehicle(v1);
		assertEquals(v1, retVal);
	}
	
	@Test
	public void testGetVehicles() {
		when(repo.findAll()).thenReturn(vehicles);
		List<Vehicle> lst = service.listAllVehicle();
		assertEquals(vehicles, lst);
	}
	
	@Test
	public void testGetVehiclesSize() {
		when(repo.findAll()).thenReturn(vehicles);
		List<Vehicle> lst = service.listAllVehicle();
		assertEquals(3, lst.size());
	}
	
	@Test
	public void testListById() throws VehicleNotFoundException{
		when(repo.findById(v1.getId())).thenReturn(Optional.of(v1));
		assertEquals(v1, service.listById(v1.getId()));
	}
	
	public void testUpdateVehicle() throws VehicleNotFoundException{
		
		when(repo.findById(v1.getId())).thenReturn(Optional.of(v1));
		when(repo.save(v1)).thenReturn(v3);
		assertEquals(v3, service.updateVehicle(v1, v3.getId()));
		
	}
	
}
