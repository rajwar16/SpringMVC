package com.bridgeit.LoginRegister.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.LoginRegister.model.Employee;
import com.bridgeit.LoginRegister.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value="addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("Employee") Employee employee1, BindingResult result){
		
		System.out.println("employee controller : "+employeeService);
		if(result.hasErrors())
		{
			ModelAndView modelAndView=new ModelAndView("addEmployee");
			return modelAndView;
		}
		
		System.out.println(employee1.getName());
	
		employeeService.addEmployee(employee1);
		
		ModelAndView modelAndView=new ModelAndView("EmployeeDetails");
		return modelAndView;
		
	}
}
