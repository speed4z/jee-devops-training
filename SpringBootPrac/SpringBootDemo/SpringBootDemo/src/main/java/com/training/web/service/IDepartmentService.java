package com.training.web.service;

import java.util.List;

import com.training.web.entities.Department;
import com.training.web.exception.DepartmentNotFoundException;

public interface IDepartmentService {
	
	Department addDepartment(Department d);	   
    List<Department> listAllDepartments();   
    Department updateDepartment(Department d,Long id)  throws DepartmentNotFoundException ;   
    void deleteDepartment(Long id) ; 
     Department listById(Long id)  throws DepartmentNotFoundException ;
     List<Department> findByCity(String city);  

}
