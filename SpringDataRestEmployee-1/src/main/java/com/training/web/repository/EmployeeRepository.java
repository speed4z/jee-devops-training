package com.training.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.web.entities.Employee;

//If you want different url
@RepositoryRestResource(path = "emps")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findByName(@Param("name") String name);
	
	List<Employee> findByDepartment(@Param("department") String department);

}
