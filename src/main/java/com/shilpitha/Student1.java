package com.shilpitha;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
	
	@Id
	private String Registration_Num;
	private String Student_Name;
	private int Age;
	
	public String getRegistration_Num() {
		return Registration_Num;
	}
	public void setRegistration_Num(String registration_Num) {
		Registration_Num = registration_Num;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Student1 [Registration_Num=" + Registration_Num + ", Student_Name=" + Student_Name + ", Age=" + Age
				+ "]";
	}
	
	

}
