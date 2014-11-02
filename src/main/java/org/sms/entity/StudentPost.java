package org.sms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StudentPost {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "classGroup_Id")
	private ClassGroup classGroup;
	
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;	

	
	private String postBody;	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "published_date", columnDefinition="TIMESTAMP")
	private Date publishedDate;		
	

	@OneToMany(mappedBy = "StudentPost", cascade = CascadeType.REMOVE)
	private List<StudentComment> studentComment;

}
