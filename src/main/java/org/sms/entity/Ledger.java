package org.sms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ledger {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int userId;
	
	private int month;
	private int year;
	
	private double payable;
	
	private double paid;
}
