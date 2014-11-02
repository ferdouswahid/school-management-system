package org.sms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ClassInfo {
	
	private int id;
	private String subjectName;
	private String levelNo;
	private String section;
	private int numberOfStudent;
	private String teacherName;
	
	private String dayName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="TIMESTAMP")
	private Date classTime;
	
	private List listOfStudents;
	
	
	
	
	

}
