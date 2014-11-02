package org.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class TeacherAlert {
	private int id;
	
	private int userId;
	
	private int teacherId;	
	
	private String alertDescription;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="TIMESTAMP")
	private Date alertTime;
	
}
