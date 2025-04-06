package com.shilpitha;

import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BNGFLTOWNRS {
	
	private String OWNR_FNAME;
	private String OWNR_LNAME;
	private int OWNR_AGE;
	private String OWNR_Origin_Place;
	private String OWNR_Origin_CNTRY;
	private int NO_OF_HOUSES_OWNED;
	@Id
	private String OWNR_Phone_Num;
	@OneToMany(mappedBy="FLTONER")
	private List<FLATHOUSEDETAILS> FLTDETLS;
	
	public String getOWNR_FNAME() {
		return OWNR_FNAME;
	}
	public void setOWNR_FNAME(String oWNR_FNAME) {
		OWNR_FNAME = oWNR_FNAME;
	}
	public String getOWNR_LNAME() {
		return OWNR_LNAME;
	}
	public void setOWNR_LNAME(String oWNR_LNAME) {
		OWNR_LNAME = oWNR_LNAME;
	}
	public int getOWNR_AGE() {
		return OWNR_AGE;
	}
	public void setOWNR_AGE(int oWNR_AGE) {
		OWNR_AGE = oWNR_AGE;
	}
	public String getOWNR_Origin_Place() {
		return OWNR_Origin_Place;
	}
	public void setOWNR_Origin_Place(String oWNR_Origin_Place) {
		OWNR_Origin_Place = oWNR_Origin_Place;
	}
	public String getOWNR_Origin_CNTRY() {
		return OWNR_Origin_CNTRY;
	}
	public void setOWNR_Origin_CNTRY(String oWNR_Origin_CNTRY) {
		OWNR_Origin_CNTRY = oWNR_Origin_CNTRY;
	}
	public int getNO_OF_HOUSES_OWNED() {
		return NO_OF_HOUSES_OWNED;
	}
	public void setNO_OF_HOUSES_OWNED(int nO_OF_HOUSES_OWNED) {
		NO_OF_HOUSES_OWNED = nO_OF_HOUSES_OWNED;
	}
	
	
	
	public String getOWNR_Phone_Num() {
		return OWNR_Phone_Num;
	}
	public void setOWNR_Phone_Num(String oWNR_Phone_Num) {
		OWNR_Phone_Num = oWNR_Phone_Num;
	}
	
	public List<FLATHOUSEDETAILS> getFLTDETLS() {
		return FLTDETLS;
	}
	public void setFLTDETLS(List<FLATHOUSEDETAILS> fLTDETLS) {
		FLTDETLS = fLTDETLS;
	}
	@Override
	public String toString() {
		return "BNGFLTOWNRS [OWNR_FNAME=" + OWNR_FNAME + ", OWNR_LNAME=" + OWNR_LNAME + ", OWNR_AGE=" + OWNR_AGE
				+ ", OWNR_Origin_Place=" + OWNR_Origin_Place + ", OWNR_Origin_CNTRY=" + OWNR_Origin_CNTRY
				+ ", NO_OF_HOUSES_OWNED=" + NO_OF_HOUSES_OWNED + ", OWNR_Phone_Num=" + OWNR_Phone_Num + ", FLTDETLS="
				+ FLTDETLS + "]";
	}
	
	
	
	

}
