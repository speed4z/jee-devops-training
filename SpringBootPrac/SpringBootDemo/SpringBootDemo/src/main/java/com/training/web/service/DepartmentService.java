package com.training.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.web.entities.Department;
import com.training.web.exception.DepartmentNotFoundException;
import com.training.web.repository.DepartmentRepository;


@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepository repo;
 
    @Override
    public Department addDepartment(Department d) {

        return repo.save(d);
    }
 
    @Override
    public List<Department> listAllDepartments() {

        return repo.findAll();
    }
 
    
    @Override
    public Department updateDepartment(Department d, Long id) throws DepartmentNotFoundException  {
        Department d2= listById(id);

        d2.setName(d.getName());
        d2.setDeptCode(d.getDeptCode());
        d2.setCity(d.getCity());
        System.out.println(d2);
        return repo.save(d2);

    }
 
    @Override
    public void deleteDepartment(Long id) {
        repo.deleteById(id);

    }
 
    @Override
    public Department listById(Long id) throws DepartmentNotFoundException {
        Optional<Department> dept =repo.findById(id);
        return dept.orElseThrow(()->new DepartmentNotFoundException("department not found"));
    }

	@Override
	public List<Department> findByCity(String city) {
		// TODO Auto-generated method stub
		return repo.findByCity(city);
	}
 
}