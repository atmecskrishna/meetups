package com.meetups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="meetup")
public class Meetup 
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@NotNull(message="title should not be Null")
	@Column(name="title")
	String title;
	
	@NotNull(message="presentor should not be Null")
	@Column(name="presentor")
	String presentor;
	
	@NotNull(message="description should not be Null")
	@Column(name="description")
	String description;
	
	@NotNull(message="guest should not be Null")
	@Column(name="guest")
	String guest;
	
	@NotNull(message="date should not be Null")
	@Column(name="date")
	String date;
	
	@NotNull(message="start time should not be Null")
	@Column(name="starttime")
	String starttime;
	
	@NotNull(message="endtime should not be Null")
	@Column(name="endtime")
	String endtime;
	
	
	public Meetup()
	{
		super();
	}


	public Meetup(int id, String title, String presentor, String description, String guest, String date,
			String starttime, String endtime) {
		super();
		this.id = id;
		this.title = title;
		this.presentor = presentor;
		this.description = description;
		this.guest = guest;
		this.date = date;
		this.starttime = starttime;
		this.endtime = endtime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getStarttime() {
		return starttime;
	}


	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public String getEndtime() {
		return endtime;
	}


	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	

}
