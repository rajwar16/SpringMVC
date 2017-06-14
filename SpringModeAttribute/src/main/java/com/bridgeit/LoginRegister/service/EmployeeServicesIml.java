package com.bridgeit.LoginRegister.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.LoginRegister.dao.EmployeeDao;
import com.bridgeit.LoginRegister.model.Employee;

public class EmployeeServicesIml implements EmployeeService
{
	@Autowired
	private EmployeeDao employeeDao;
	
	public Object addEmployee(Employee employee) {
		
		return employeeDao.addEmployee(employee);
	}

}
