package com.bridgeit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 */
@Controller
public class App {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam String name,@RequestParam String emailId,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Hello World!");
		Resource r = new ClassPathResource("NewFile.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao employeeDao = (EmployeeDao) factory.getBean("employeeDao");

		
		Employee e = new Employee();
		e.setName(name);
		e.setEmailId(emailId);

		employeeDao.insert(e);

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("empName",name);
		modelAndView.addObject("empEmailId",emailId);

		
		return modelAndView;
	}
}
