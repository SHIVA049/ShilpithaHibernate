package com.shilpitha;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	
	
	

	@Id
	private String registration_No;
	@Id
	private String student_Name;
	private int student_age;
	@OneToOne
	private LapTop Laptop;
	
	public String getRegistration_No() {
		return registration_No;
	}
	
	public void setRegistration_No(String registration_No) {
		this.registration_No = registration_No;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	
	
	
	public LapTop getLaptop() {
		return Laptop;
	}

	public void setLaptop(LapTop laptop) {
		Laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [registration_No=" + registration_No + ", student_Name=" + student_Name + ", student_age="
				+ student_age + ", Laptop=" + Laptop + "]";
	}
	

}
