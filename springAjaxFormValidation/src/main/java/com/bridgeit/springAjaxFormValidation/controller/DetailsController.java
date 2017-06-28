package com.bridgeit.springAjaxFormValidation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController 
{
	@RequestMapping(value="/adduserinArrayList", method=RequestMethod.POST)
	
	public @ResponseBody String adduser1()
	{
		return "success";
	}
}
