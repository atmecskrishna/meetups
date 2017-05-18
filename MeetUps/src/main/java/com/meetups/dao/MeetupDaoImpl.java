package com.meetups.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meetups.model.Meetup;

@Transactional
@Repository(value="meetupDao")
public class MeetupDaoImpl implements MeetupDao {

	@Autowired
	SessionFactory sessionFactory;
	public void addMeetup(Meetup meetup) {
		Session session=sessionFactory.getCurrentSession();
		  session.save(meetup);
		  System.out.println("meetup added successfully");
		
	}

	@SuppressWarnings("unchecked")
	public List<Meetup> viewMeetup() {
		
		Session session=sessionFactory.getCurrentSession();
		
		  List<Meetup> list=session.createCriteria(Meetup.class).list();
		
		return list;
	}

	public void update(Meetup meetup) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(meetup);
		
	}

	public Meetup viewMeetupById(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		Meetup meetup=(Meetup)session.get(Meetup.class,id);
		return meetup;
	}

	/*@SuppressWarnings("unchecked")
	public List<Meetup> getList()
	{
		Session session=sessionFactory.getCurrentSession();
		
		  List<Meetup> list=session.createCriteria(Meetup.class).list();
		
		return list;
	}
	public List<Meetup> viewMeetupByPresentor(String presentor) {
		List<Meetup> meetup = new ArrayList<Meetup>();
		List<Meetup> data = getList();
		for(Meetup tup:data)
		{
			if(tup.getPresentor().equals(presentor))
			{
				meetup.add(tup);
			}
		}
		return meetup;
	}
*/
	public void delete(int id) {
		Session session=sessionFactory.getCurrentSession();
		Meetup meetup=(Meetup)session.get(Meetup.class,new Integer(id));
		session.delete(meetup);
		
	}

	@SuppressWarnings("unchecked")
	public List<Meetup> viewMeetupByPresentor(String presentor) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Meetup where presentor=:presentor";
		return session.createQuery(hql).setParameter("presentor", presentor).list();
	}

}
