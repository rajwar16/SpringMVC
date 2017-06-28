package com.Brridgelabz.MavenProject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Alien_name alien_name=new Alien_name();
		alien_name.setFirstName("pooja");
		alien_name.setLastName("rajwar");
		alien_name.setMiddleName("vinod");
		
		Alien_name alien_name2=new Alien_name();
		alien_name2.setFirstName("shital");
		alien_name2.setLastName("wani");
		alien_name2.setMiddleName("ramesh");
		
		
		Alien obj =new Alien();
		Alien obj2 = new Alien();
		
		obj.setaID(1233);
		obj.setName(alien_name);
		obj.setColor("green");
		
		obj2.setaID(1234);
		obj2.setName(alien_name2);
		obj2.setColor("red");

		Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();

		//obj=(Alien) session.get(Alien.class, 1233);
		
		Transaction transaction=session.beginTransaction();

		//System.out.println(obj);
		session.save(obj);
		session.save(obj2);

		transaction.commit();
		System.out.println("success...");

	}
}
