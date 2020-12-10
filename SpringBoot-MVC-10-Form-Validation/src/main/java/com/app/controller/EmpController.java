package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Employee;
import com.app.service.EmployeeService;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmpController {
    @Autowired
	private EmployeeValidator validator;
	
	@Autowired
	private EmployeeService service;
	
	//show registratiom age
	@RequestMapping("/reg")
	public String regPage(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "register";
	}
	
	//read form data
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	//read data from ui
	public String saveData(@ModelAttribute Employee employee,Errors errors, Model model)
	{
		
		//call before save operation
		validator.validate(employee, errors);
		
		if(!errors.hasErrors()) {// if no error given by validator
		Integer eid = service.saveEmployee(employee);
		//write massage
		String msg=eid+" data save succesfully";
		//show msg to ui
		model.addAttribute("Massage", msg);
		}
		else{//error exist here
			model.addAttribute("Massage", "Please check all erroes");
		}
		return "register";
	}
	
	//fatch all data
	@RequestMapping("/all")
	public String fatchEmp(Model model)
	{
		//select data from table
		List<Employee> list = service.fatchData();
		//send data to ui
		model.addAttribute("list",list);
		return "datapage";
	}
	
	//delete data
	@RequestMapping("/delete")
	public String deleteData(@RequestParam ("eid")Integer eid,Model model)
	{
		service.deleteEmpData(eid);
		//send msg to ui
		model.addAttribute("godata","one row deleted");
		//send remaining data
		//read form data from db
		List<Employee> list = service.fatchData();
		model.addAttribute("list", list);
		return "datapage";
	}
	//edit data
	@RequestMapping("/edit")
	public String editEmp(@RequestParam ("eid")Integer eid,Model model)
	{
		Employee oneRow = service.fatchOneRow(eid);
		model.addAttribute("date", oneRow);
		return "editpage";
	}

}
