package com.shilpitha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resident res=new Resident();
		res.setFlat_No(116);
		res.setOwner_Name("Avinahs");
		
		res.setFlat_Type("2BHK");
		
		Resident res1=null;
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.shilpitha.Resident.class);
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		res1=session.get(Resident.class, 116);
		//Transaction trn=session.beginTransaction();
		//session.persist(res);
		//trn.commit();
		session.close();
		sf.close();
		System.out.println(res1);

	}

}
