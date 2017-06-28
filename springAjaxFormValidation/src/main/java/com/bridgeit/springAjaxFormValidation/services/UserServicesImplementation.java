package com.bridgeit.springAjaxFormValidation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.springAjaxFormValidation.dao.UserDao;
import com.bridgeit.springAjaxFormValidation.model.User1;

public class UserServicesImplementation implements UserServices{

	@Autowired
	UserDao userDao;

	
	public boolean userAvailability(String name) {
		return userDao.userAvailability(name);
	}

	@Transactional
	public Object addUser(User1 user) {
		return userDao.addUser(user);
	}
}
