package com.edu;


import java.util.Iterator;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		employee sob=new employee();					

		//sob.setEid(2);
		sob.setEname("mala");
		sob.setEsalary("38742");
		sob.setEmail("mala38@gmail.com");
		sob.setEdept("python");
		sob.setEgen("female");

		Configuration conn=new Configuration().configure().addAnnotatedClass(employee.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		//employee e= (employee) sess.get(employee.class, 1);
		//System.out.println(e);
		sess.save(sob);
		//retrieve all records
		/***  Query q=sess.createQuery("from employee");//student is a class name
		       Iterator<employee>e=q.iterate();
		       while(e.hasNext()) {
		    	   employee st=e.next();
		    	   System.out.println(st.geteid()+"  "+st.getename());
		       }***/
		//employee e= new employee();
		// e.seteid(2);
		//sess.delete(e);
		tx.commit();




	}

}
