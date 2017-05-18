package com.meetups.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.meetups.model.Status;
@ComponentScan("com.meetups")
@Repository
public interface StatusDao {
   
	public List<Status> regMeetup(int id);

	public void regMeetup(Status status);
}
