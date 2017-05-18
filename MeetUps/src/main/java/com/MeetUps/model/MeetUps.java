package com.MeetUps.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity  
@Table(name = "meetups")  
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  
public class MeetUps implements Serializable {

	private static final long serialVersionUID = 1L;  
	
	 @Id  
	 @GeneratedValue  
	 @Column(name = "id")  
	 private long id; 
	
	 @Column(name = "title")  
	 private String title;  
	  
	 @Column(name = "presentor")  
	 private String presentor;  
	  
	 @Column(name = "description")  
	 private String description;  
	  
	 @Column(name = "guest")  
	 private String guest; 
	 
	 @Column(name="meetupDate")
	 private String meetupDate;
	 
	 @Column(name="startTime")
	 private String startTime;
	 
	 @Column(name="endTime")
	 private String endTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPresentor() {
		return presentor;
	}

	public void setPresentor(String presentor) {
		this.presentor = presentor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public String getMeetupDate() {
		return meetupDate;
	}

	public void setMeetupDate(String meetupDate) {
		this.meetupDate = meetupDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	 
	 
}
