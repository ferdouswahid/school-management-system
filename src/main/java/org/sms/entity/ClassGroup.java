package org.sms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ClassGroup {
	@Id
	@GeneratedValue
	private int id;	
	
	@OneToMany(mappedBy = "ClassGroup", cascade = CascadeType.REMOVE)
	private List<Post> post;
	
	@ManyToOne
	@JoinColumn(name = "classInfo_Id")
	private ClassInfo classInfo;
	
	

}
