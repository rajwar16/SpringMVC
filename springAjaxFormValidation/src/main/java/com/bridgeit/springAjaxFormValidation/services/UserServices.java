package com.bridgeit.springAjaxFormValidation.services;
import com.bridgeit.springAjaxFormValidation.model.User1;

public interface UserServices 
{
	public boolean userAvailability(String name);
	
	public Object addUser(User1 user);
}
