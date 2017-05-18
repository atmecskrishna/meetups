package com.meetups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="status")
public class Status {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;  
	
	@Column(name="userid")
	 private int userId;
	
	@Column(name="meetupid")
	 private int meetupId;
	  
	 public Status() {  
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMeetupId() {
		return meetupId;
	}

	public void setMeetupId(int meetypId) {
		this.meetupId = meetypId;
	}  
	  
	
}
