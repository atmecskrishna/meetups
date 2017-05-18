package com.meetups.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.meetups.model.Meetup;

@ComponentScan("com.meetups")
@Repository
public interface MeetupDao 
{
	
	void addMeetup(Meetup meetup);
	List<Meetup> viewMeetup();	
	void update(Meetup meetup);
	Meetup viewMeetupById(int id);
	/*List<Meetup> viewMeetupByPresentor(String presentor);*/
	public List<Meetup> viewMeetupByPresentor(String presentor);
    void delete(int id);

	/*
	@Autowired
	private SessionFactory sessionFactory;
	
	

	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	public List<Meetup> getlist()
	{
		Session session = sessionFactory.getCurrentSession();
		List<Meetup> meetupList = session.createQuery("from Meetup").list();
		return meetupList;
	}
	
	@SuppressWarnings("unchecked")
	public List<Meetup> getAllMeetup() {
		Session session = sessionFactory.getCurrentSession();
		List<Meetup> meetupList = session.createQuery("from Meetup").list();
		return meetupList;
	}

	public List<Meetup> getMeetup(String presentor) {
		Session session = this.sessionFactory.getCurrentSession();
		Meetup meetup= (Meetup) session.load(Meetup.class, new Integer(id));
		
		List<Meetup> meetup=new ArrayList<Meetup>();
		List<Meetup> data=getlist();
		
		for(Meetup tup:data)
		{
			if(tup.getPresentor().equals(presentor))
			{
				meetup.add(tup);
			}
		}
		
		return meetup;
	}

	public Meetup addMeetup(Meetup meetup) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(meetup);
		return meetup;
	}

	public void updateMeetup(Meetup meetup) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(meetup);
	}

	public void deleteMeetup(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Meetup p = (Meetup) session.load(Meetup.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}*/

}
