package org.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.sms.annotation.UniqueUsername;

@Entity
public class Student extends Users{	
	
		private int classId;
		private int classRoll;
		public int getClassId() {
			return classId;
		}
		public void setClassId(int classId) {
			this.classId = classId;
		}
		public int getClassRoll() {
			return classRoll;
		}
		public void setClassRoll(int classRoll) {
			this.classRoll = classRoll;
		}		
		
	
	
	
}
