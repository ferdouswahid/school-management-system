package org.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class StudyMaterial {
	private int id;
	
	private int classGroupId;
	
	private String url;
	
	private String materialName;
	
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="TIMESTAMP")
	private Date publishTime;

}
