package com.bridgeit.springAjaxFormValidation.dao;

import com.bridgeit.springAjaxFormValidation.model.User1;

public interface UserDao 
{
	public boolean userAvailability(String name);

	public Object addUser(User1 user);
}
