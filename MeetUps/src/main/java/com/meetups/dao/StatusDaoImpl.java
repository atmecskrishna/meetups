package com.meetups.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meetups.model.Status;

@Transactional
@Repository(value="statusDao")
public class StatusDaoImpl implements StatusDao{


	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Status> regMeetup(int id) {
			
			Session session=sessionFactory.getCurrentSession();
			List<Status> list=new ArrayList<Status>();
			  List<Status> lis=session.createCriteria(Status.class).list();
			  
			  for(Status su:lis)
			  {
				  if(su.getUserId()==id)
					  list.add(su);
			  }
			
		
		return list;
		
	}

	public void regMeetup(Status status) {
		Session session=sessionFactory.getCurrentSession();
		  session.save(status);
		  System.out.println("user added successfully");
		
	}

}
