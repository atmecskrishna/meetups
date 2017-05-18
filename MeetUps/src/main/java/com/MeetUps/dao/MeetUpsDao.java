package com.MeetUps.dao;

import java.util.List;

import com.MeetUps.model.MeetUps;

public interface MeetUpsDao {

	 public boolean addEntity(MeetUps meetups) throws Exception;  
	 public MeetUps getEntityById(int id) throws Exception;  
	 public List<MeetUps> getEntityList() throws Exception;  
	 public boolean deleteEntity(int id) throws Exception;  
	  
}
