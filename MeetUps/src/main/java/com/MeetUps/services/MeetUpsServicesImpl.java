package com.MeetUps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.MeetUps.dao.MeetUpsDao;
import com.MeetUps.model.MeetUps;

public class MeetUpsServicesImpl implements MeetUpsServices {

	@Autowired
	MeetUpsDao meetUpsDao;;
	@Override
	public boolean addEntity(MeetUps meetups) throws Exception {
		
		return meetUpsDao.addEntity(meetups);
	}

	@Override
	public MeetUps getEntityById(int id) throws Exception {
		
		return meetUpsDao.getEntityById(id);
	}

	@Override
	public List<MeetUps> getEntityList() throws Exception {
		
		return meetUpsDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		
		return meetUpsDao.deleteEntity(id);
	}

}
