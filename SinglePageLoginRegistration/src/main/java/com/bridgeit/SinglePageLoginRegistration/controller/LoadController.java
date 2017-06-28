package com.bridgeit.SinglePageLoginRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoadController 
{
	@RequestMapping(value="/homePage")
	public String homePage()
	{
		return "Home";
	}
	
	@RequestMapping(value="login")
	public @ResponseBody ModelAndView login()
	{
		ModelAndView modelAndView=new ModelAndView("Login");
		return modelAndView;
	}
	
	@RequestMapping(value="register")
	public @ResponseBody ModelAndView register()
	{
		ModelAndView modelAndView=new ModelAndView("Register");
		return modelAndView;
	}
}
