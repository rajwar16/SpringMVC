package com.bridgeit.springAjaxFormValidation.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgeit.springAjaxFormValidation.model.User1;

public class UserDaoImplementation implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;

	public boolean userAvailability(String name){
		boolean flag=false;
		Session session = sessionFactory.openSession();
		String query="from User1 where name='"+name+"'";
		Query query1 = session.createQuery(query);
		List<User1> list = query1.list();
		//System.out.println(list);
		//System.out.println(list.isEmpty());
		
		System.out.println(list);
		for(User1 employee : list)
		{
			System.out.println(employee);
			String username=employee.getName();
			if(name.equals(username))
			{
				flag=true;
				break;
			}
		}	
		session.close();
		return flag;
	}

	public Object addUser(User1 user) {
		System.out.println("adduser daoimpl :: "+user);
		Session session=sessionFactory.openSession();
		System.out.println(user);
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return null;
	}

}
