package com.training.web.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.training.web.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	public List<Department> findByCity(String city);  

}
