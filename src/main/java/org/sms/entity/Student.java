package org.sms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.sms.annotation.UniqueUsername;

@Entity
public class Student extends Users{	
	
		private int classRoll;
		
		@ManyToMany
		@JoinTable
		private List<ClassInfo> classInfo;	
		

		public int getClassRoll() {
			return classRoll;
		}
		
		public void setClassRoll(int classRoll) {
			this.classRoll = classRoll;
		}		
		
	
	
	
}
