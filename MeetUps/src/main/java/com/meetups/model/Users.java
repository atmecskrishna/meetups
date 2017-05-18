package com.meetups.model;

import java.io.Serializable;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;
import javax.validation.constraints.NotNull;  
    
@Entity  
@Table(name = "users")   
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;  
	  
	 @Id  
	 @GeneratedValue(strategy=GenerationType.AUTO) 
	 @Column(name = "id")  
	 private int id;  
	 
	 @NotNull(message="Email id should not be Null")
	 @Column(name = "emailid")
	 private String emailId;
	 
	 @NotNull(message="password should not be Null")
	 @Column(name = "password")
	 private String password;
	 
	 @NotNull(message="company should not be Null")
	 @Column(name = "company")
	 private String company;
	 
	 @NotNull(message="company address should not be Null")
	 @Column(name = "companyAddress")
	 private String companyAddress;
	 
	 @NotNull(message="phone should not be Null")
	 @Column(name = "phone")
	 private String phone;
	 
	 @NotNull(message="skills should not be Null")
	 @Column(name = "skills")
	 private String skills;
	 
	 @Column(name = "experience")
	 private String experience;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Users(int id, String emailId, String password, String company, String companyAddress, String phone,
			String skills, String experience) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.company = company;
		this.companyAddress = companyAddress;
		this.phone = phone;
		this.skills = skills;
		this.experience = experience;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
}
