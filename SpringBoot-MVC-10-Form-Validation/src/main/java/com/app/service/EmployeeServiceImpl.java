package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee emp) {
		
		Integer eid = repo.save(emp).getEid();
		return eid;
	}

	@Override
	public List<Employee> fatchData() {
             List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteEmpData(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Employee fatchOneRow(Integer id) {
		Employee emp=null;
            Optional<Employee> opt=repo.findById(id);
            if(opt.isPresent()) {//avoid null pointer exception
            	 Employee emp1 = opt.get();
            }
		//Employee emp = null;
		return emp;
	}

	@Override
	public void updateEmp(Employee emp) {
		//method behaves like if ID exist then perform update other wise insert
       repo.save(emp);
	}

	@Override
	public boolean isExist(Integer id) {
		boolean id2 = repo.existsById(id);

		return id2;
	}

}
