package com.bridgeit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDao 
{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insert(Employee e)
	{
		Session session=getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
	}
}
