package com.training.web.Specs;

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

import com.training.web.entities.Department;
import com.training.web.exception.DepartmentNotFoundException;
import com.training.web.repository.DepartmentRepository;
import com.training.web.service.DepartmentService;
import com.training.web.service.IDepartmentService;
@SpringBootTest
class DepartmentSpecs {
   
	@Mock
	DepartmentRepository repo;
	
	@InjectMocks 
	IDepartmentService service =new DepartmentService();
	
	List<Department> departments=new ArrayList<>();
	
	Department d1,d2,d3;
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
		d1 = new Department("sales","mumbai","sa999");
		d2 = new Department("IT","PUne","9900");
		d3 = new Department("admin","mumbai","4545");
		
		
		departments.add(d1);
		departments.add(d2);
		departments.add(d3);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddDepartment() {
		when(repo.save(d1)).thenReturn(d1);
		Department retVal = service.addDepartment(d1);
		assertEquals(d1, retVal);
	}
	
	@Test
	public void testGetDepartments() {
		
		
		when(repo.findAll()).thenReturn(departments);
		List<Department> list = service.listAllDepartments();
		assertEquals(departments, list);
		
	}

	
	@Test
	public void testGetAllDepartments() {
		
		
		when(repo.findAll()).thenReturn(departments);
		List<Department> list = service.listAllDepartments();
		assertEquals(3, list.size());
		
	}
	
	
	@Test
	public void getDepartmentTest() throws DepartmentNotFoundException {
		
		
		when(repo.findById(d1.getId())).thenReturn(Optional.of(d1));
		assertEquals(d1,service.listById(d1.getId()));
		
	}
	
	
	@Test
public void updateDepartmentTest() throws DepartmentNotFoundException {
		
		
		when(repo.findById(d1.getId())).thenReturn(Optional.of(d1));
		when(repo.save(d1)).thenReturn(d3);
		assertEquals(d3,service.updateDepartment(d3,d1.getId()));
		
	}
	
}