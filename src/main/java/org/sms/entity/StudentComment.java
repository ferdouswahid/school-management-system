package org.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class StudentComment {
	
	private int studentId;

	
	private String commentBody;	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "published_date", columnDefinition="TIMESTAMP")
	private Date publishedDate;
	
	@ManyToOne
	@JoinColumn(name = "StudentPost_Id")
	private StudentPost studentPost;
	

}
