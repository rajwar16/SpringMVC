package com.bridgeit.springAjaxFormValidation.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.bridgeit.springAjaxFormValidation.model.User1;
import com.bridgeit.springAjaxFormValidation.services.UserServices;
@RestController
public class UserController 
{ 
	//List<User> userList=new ArrayList<User>();
	@Autowired
	UserServices userservises; 
	@RequestMapping(value="/AddUser.htm",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		return new ModelAndView("Adduser");
	}
	@RequestMapping(value="addUser",method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute(value="userData") User1 user)
	{
		System.out.println(user);
		System.out.println(userservises);
		userservises.addUser(user);
		ModelAndView modelAndView=new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping(value="/checkUser", method=RequestMethod.POST)
	public @ResponseBody String addUser(HttpServletRequest request)
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		System.out.println(email);
		System.out.println(name);
		if(userservises.userAvailability(name))
		{
			return "yes";
		}
		else
		{
			return "no";
		}
			
		/*JsonResponse jsonResponse=new JsonResponse();
		ValidationUtils.rejectIfEmpty(result, "name", "Name can not be empty.");
		ValidationUtils.rejectIfEmpty(result, "education", "Education can not be empty.");
		if(!result.hasErrors())
		{
			userList.add(user);
			jsonResponse.setStatus("SUCCESS");
			jsonResponse.setResult(userList);
		}
		
		System.out.println("here");
		list1.add("abc");
		list1.add("abc2");
		list1.add("abc3");
		list1.add("abc4");
		model.addAttribute("list1", list1);*/
	}
}
