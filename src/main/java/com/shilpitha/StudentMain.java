package com.shilpitha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st=new Student1();
		st.setRegistration_Num("2HN01ME049");
		st.setStudent_Name("Shiva");
		st.setAge(23);
		
		Student1 s2=null;
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.shilpitha.Student1.class);
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		//Transaction trn=session.beginTransaction();
		//session.persist(st);
		//trn.commit();
		s2=session.get(Student1.class, "2HN01ME049");
		session.close();
		sf.close();
		System.out.println(s2);

	}

}
