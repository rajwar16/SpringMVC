package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddCpontroller 
{
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		int n1=Integer.parseInt(request.getParameter("t1"));
		int n2=Integer.parseInt(request.getParameter("t2"));
		
		int result=n1+n2;
		
		System.out.println(result);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("display.jsp");
		
		modelAndView.addObject("result", result);
		
		System.out.println("successfull.....");
		return modelAndView;
	}
}
