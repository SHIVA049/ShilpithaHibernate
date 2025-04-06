package com.shilpitha;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class FLATHOUSEDETAILS {
	
	private String APT_NAME;
	private String APT_AREA;
	private String APT_BLK;
	private String FLAT_TYPE;
	private String APT_TYPE;
	private String FLAT_COST;
	//private String Owner_Phone_Num;
	private String Tenant_Name;
	@Id
	private String Tenant_Phone_Num;
	@ManyToOne
	private BNGFLTOWNRS FLTONER;
	
	
	public String getAPT_NAME() {
		return APT_NAME;
	}
	public void setAPT_NAME(String aPT_NAME) {
		APT_NAME = aPT_NAME;
	}
	public String getAPT_AREA() {
		return APT_AREA;
	}
	public void setAPT_AREA(String aPT_AREA) {
		APT_AREA = aPT_AREA;
	}
	public String getAPT_BLK() {
		return APT_BLK;
	}
	public void setAPT_BLK(String aPT_BLK) {
		APT_BLK = aPT_BLK;
	}
	public String getFLAT_TYPE() {
		return FLAT_TYPE;
	}
	public void setFLAT_TYPE(String fLAT_TYPE) {
		FLAT_TYPE = fLAT_TYPE;
	}
	public String getAPT_TYPE() {
		return APT_TYPE;
	}
	public void setAPT_TYPE(String aPT_TYPE) {
		APT_TYPE = aPT_TYPE;
	}
	public String getFLAT_COST() {
		return FLAT_COST;
	}
	public void setFLAT_COST(String fLAT_COST) {
		FLAT_COST = fLAT_COST;
	}
	/*public String getOwner_Phone_Num() {
		return Owner_Phone_Num;
	}
	public void setOwner_Phone_Num(String owner_Phone_Num) {
		Owner_Phone_Num = owner_Phone_Num;
	} */
	public String getTenant_Name() {
		return Tenant_Name;
	}
	public void setTenant_Name(String tenant_Name) {
		Tenant_Name = tenant_Name;
	}
	public String getTenant_Phone_Num() {
		return Tenant_Phone_Num;
	}
	public void setTenant_Phone_Num(String tenant_Phone_Num) {
		Tenant_Phone_Num = tenant_Phone_Num;
	}
	
	public BNGFLTOWNRS getFLTONER() {
		return FLTONER;
	}
	public void setFLTONER(BNGFLTOWNRS fLTONER) {
		FLTONER = fLTONER;
	}
	
	@Override
	public String toString() {
		return "FLAT_HOUSE_DETAILS [APT_NAME=" + APT_NAME + ", APT_AREA=" + APT_AREA + ", APT_BLK=" + APT_BLK
				+ ", FLAT_TYPE=" + FLAT_TYPE + ", APT_TYPE=" + APT_TYPE + ", FLAT_COST=" + FLAT_COST
				+ ", Tenant_Name=" + Tenant_Name + ", Tenant_Phone_Num="
				+ Tenant_Phone_Num + "]";
	}
	
	
	

}
