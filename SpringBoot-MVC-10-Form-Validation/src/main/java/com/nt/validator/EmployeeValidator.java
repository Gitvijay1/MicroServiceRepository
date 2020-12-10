package com.nt.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;
@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
        //it will check form backing object and model class Object same ?
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Employee e=(Employee)target;//form object

		//logig for validation
	  //if(e.getEname()==null||"".equals(e.getEname().isBlank())); or
		
		//this is for text input
		if(e.getEname()==null||e.getEname().isBlank()) {
			errors.rejectValue("ename", null, "employee name can not be empty");
		}
		else if(Pattern.matches("[A-Z]{2,6}", e.getEname())){//if not maches
			errors.rejectValue("ename", null, "ename will be minimum 2-6 uppercase");
		}
		
		//for radio button choose any one values only null and empty check will be there
		if(e.getGender() ==null || e.getGender().isBlank()) {
			errors.reject("gender", null, "please coose at least one");
		}
		
		
		//for TextArea pattern
		if(e.getEnpNote()== null || e.getEnpNote().isBlank()) {
			errors.reject("empNote", null, "Please enter emp notes");
		}
		else if(Pattern.matches("[a-z]{5,50}", e.getEnpNote())) {
			errors.reject("empNote", null, "please enter notes between 5-50");
		}
		
		
		//for checkBox no pattern choose  any one
		if(e.getLike()==null || e.getLike().isEmpty()) {
			errors.reject("like", null, "please choose any one");
		}
		
		//for select option no pattern  select any one
		if(e.getOrg()==null|| e.getOrg().isBlank()) {
			errors.reject("org", null, "please select any one");
		}
	}
}
