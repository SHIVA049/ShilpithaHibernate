package com.shilpitha;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Resident_Bang")
public class Resident {
    
	
	@Id
	@Column(name="Flat_Num")
	private int Flat_No;
	private String Owner_Name;
	@Transient
	private String Flat_Type;
	
	public int getFlat_No() {
		return Flat_No;
	}
	public void setFlat_No(int flat_No) {
		Flat_No = flat_No;
	}
	public String getOwner_Name() {
		return Owner_Name;
	}
	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}
	public String getFlat_Type() {
		return Flat_Type;
	}
	public void setFlat_Type(String flat_Type) {
		Flat_Type = flat_Type;
	}
	
	@Override
	public String toString() {
		return "Resident [Flat_No=" + Flat_No + ", Owner_Name=" + Owner_Name + ", Flat_Type=" + Flat_Type + "]";
	}
	
	
	
	
}
