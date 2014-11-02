package org.sms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ClassInfo {
	@Id
	@GeneratedValue
	private int id;
	private String subjectName;
	private String levelNo;
	private String section;	
	
	private String dayName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="TIMESTAMP")
	private Date classTime;	
	
	private int teacherId;	
	
	@OneToMany(mappedBy = "classinfo", cascade = CascadeType.REMOVE)
	private List<ClassGroup> classGroup;
	
	
	@ManyToMany(mappedBy = "classinfo")
	private List<Student> students;
	
	
	
}
