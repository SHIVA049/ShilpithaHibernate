package com.shilpitha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LapTop l1=new LapTop();
		l1.setLid(1);
		l1.setBrand("Lenovo");
		l1.setModel("83E0");
		l1.setRam(8);
		
		Student std=new Student();
		std.setRegistration_No("2HN01ME055");
		std.setStudent_Name("Sunil Patil");
		std.setStudent_age(28);
		
		std.setLaptop(l1);
		
		Object s2=null;
		
		SessionFactory sf=new Configuration().addAnnotatedClass(com.shilpitha.Student.class).addAnnotatedClass(com.shilpitha.LapTop.class)
				.configure().buildSessionFactory();
		/*Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.shilpitha.Student.class);
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory(); */
		Session session=sf.openSession(); 
		Transaction trn=session.beginTransaction();
		session.persist(std);
		session.persist(l1);
		//s2=session.get(Student.class,'2HN01ME049');
		//session.merge(std);
		//session.remove(std);
		//session.get
		//session.get
		//session.
		trn.commit();
		session.close();
		sf.close();
         System.out.println(std);
	}

}
