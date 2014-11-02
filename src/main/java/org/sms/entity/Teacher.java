package org.sms.entity;

import javax.persistence.Entity;

@Entity
public class Teacher extends Users{
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
