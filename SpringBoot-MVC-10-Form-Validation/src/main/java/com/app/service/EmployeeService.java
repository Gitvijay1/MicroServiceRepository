package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService {
	//save data
	public Integer saveEmployee(Employee emp);
   //fatch data from table
	public List<Employee> fatchData();
	
	//delete data by id
	public void deleteEmpData(Integer id);
	
	//fatch one employee
	public Employee fatchOneRow(Integer id); 
	
	//update Employee
	public void updateEmp(Employee emp);
	
	//isRecord is exist or not
	public boolean isExist(Integer id);

}
