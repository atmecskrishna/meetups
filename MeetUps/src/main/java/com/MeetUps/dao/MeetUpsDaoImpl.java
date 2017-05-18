package com.MeetUps.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.MeetUps.model.MeetUps;

public class MeetUpsDaoImpl implements MeetUpsDao {

	@Autowired  
	 SessionFactory sessionFactory;  
	  
	 Session session = null;  
	 Transaction tx = null;  
	
	@Override
	public boolean addEntity(MeetUps meetUps) throws Exception {
		session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		  session.saveOrUpdate(meetUps);  
		  tx.commit();  
		  session.close();  
		
		return false;
	}

	@Override
	public MeetUps getEntityById(int id) throws Exception {
		session = sessionFactory.openSession();  
		  MeetUps meetups = (MeetUps) session.load(MeetUps.class,  
		    new Integer(id));  
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		return meetups;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MeetUps> getEntityList() throws Exception {
		 session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		  List<MeetUps> meetupsList = session.createCriteria(MeetUps.class)  
		    .list();  
		  tx.commit();  
		  session.close();  
		return meetupsList;
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		  session = sessionFactory.openSession();  
		  Object o = session.load(MeetUps.class, id);  
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  session.delete(o);  
		  tx.commit();  
		  return false;  
	}

	
}
