package com.training.web.controller;

import java.util.List;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.training.web.entities.Department;
import com.training.web.exception.DepartmentNotFoundException;
import com.training.web.service.IDepartmentService;
 
@RestController 
public class DepartmentController {


    @Autowired
    private IDepartmentService service;

	//which ever client tool u are using ,like postman , resttemplate , angular ,react
	//you can add a new department to the collection of departments which is in db
	//controller -service -repo
	//api /departments  with the postmapping 

    @GetMapping("/departments")
    public List<Department> getDepts(){

        return service.listAllDepartments();
    }

    @GetMapping("/departments/{idd}")
    public Department getDepts(@PathVariable("idd")Long id) throws DepartmentNotFoundException{

        return service.listById(id);
    }

    @PostMapping("/departments")
    public Department addDept(@Valid @RequestBody Department dept) {

        return service.addDepartment(dept);

    }

    @PutMapping("/departments/{id}")
    public Department updateDept(@RequestBody Department dept,@PathVariable Long id) throws DepartmentNotFoundException
    {
        return service.updateDepartment(dept, id);

    }
    
    @GetMapping("/departments/city/{city}")
    public List<Department> getDeptsByCity(@PathVariable("city") String city){
    	return service.findByCity(city);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDept(@PathVariable Long id) {
        service.deleteDepartment(id);
        return "Deleted successfully";
    }
    
    
}
 
