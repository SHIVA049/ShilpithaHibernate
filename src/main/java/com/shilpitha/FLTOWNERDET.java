package com.shilpitha;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class FLTOWNERDET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BNGFLTOWNRS BNG=new BNGFLTOWNRS();
		FLATHOUSEDETAILS FLTHS=new FLATHOUSEDETAILS();
		FLATHOUSEDETAILS FLTHS1=new FLATHOUSEDETAILS();
		
		BNG.setOWNR_FNAME("Shivaling");
		BNG.setOWNR_LNAME("Neralagi");
        BNG.setOWNR_AGE(43);
        BNG.setOWNR_Origin_Place("Belgaum");
        BNG.setOWNR_Origin_CNTRY("India");
        BNG.setNO_OF_HOUSES_OWNED(2);
        BNG.setOWNR_Phone_Num("7829509547");
        BNG.setFLTDETLS(List.of(FLTHS,FLTHS1));
        
        FLTHS.setAPT_NAME("Shilpitha Sunflower");
        FLTHS.setAPT_AREA("Whitefield");
        FLTHS.setAPT_BLK("SUMMER-B");
        FLTHS.setAPT_TYPE("Luxury");
        FLTHS.setFLAT_TYPE("2.5 BHK");
        FLTHS.setFLAT_COST("60 Lakhs");
        //FLTHS.setOwner_Phone_Num("7829509547");
        FLTHS.setTenant_Name("Self Occupied");
        FLTHS.setTenant_Phone_Num("7829509547");
        FLTHS.setFLTONER(BNG);
        
        FLTHS1.setAPT_NAME("BM Pristine");
        FLTHS1.setAPT_AREA("Gunjur");
        FLTHS1.setAPT_BLK("B6");
        FLTHS1.setAPT_TYPE("Semi-Luxury");
        FLTHS1.setFLAT_TYPE("2 BHK");
        FLTHS1.setFLAT_COST("50 Lakhs");
        //FLTHS1.setOwner_Phone_Num("7829509547");
        FLTHS1.setTenant_Name("RENTED");
        FLTHS1.setTenant_Phone_Num("9741275767");
        FLTHS1.setFLTONER(BNG);
        
        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(com.shilpitha.BNGFLTOWNRS.class);
        cfg.addAnnotatedClass(com.shilpitha.FLATHOUSEDETAILS.class);
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        session.persist(BNG);
        session.persist(FLTHS);
        session.persist(FLTHS1);
        trn.commit();
        session.close();
        sf.close();
        System.out.println(BNG);
        System.out.println(FLTHS);
        
        
	}

}
