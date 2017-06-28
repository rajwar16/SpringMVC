package com.bridgeit.LoginRegister.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.LoginRegister.model.Employee;
import com.bridgeit.LoginRegister.service.EmployeeService;

public class EmployeeDaoIml implements EmployeeDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private EmployeeService employeeService; 
	
	public Object addEmployee(Employee employee) {
		
		System.out.println("dao Implementation : "+employeeService);
		Session session=sessionFactory.openSession();
		
		Transaction transaction=null;
		transaction=session.beginTransaction();
		Object object=session.save(employee);
		transaction.commit();
		return object;
	
	}
}
