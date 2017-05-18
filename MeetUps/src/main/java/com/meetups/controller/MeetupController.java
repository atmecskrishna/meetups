package com.meetups.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetups.dao.MeetupDao;
import com.meetups.model.Meetup;
import com.meetups.model.Users;

@RestController
public class MeetupController 
{
	@Autowired
	private MeetupDao meetupDao;
	
	@RequestMapping(value = "/getAllMeetup", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Meetup> getAllMeetup() {
		
		List<Meetup> listOfMeetUps = meetupDao.viewMeetup();
		return listOfMeetUps;
	}

	/*@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getMeetup/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Meetup> getMeetupById(@PathVariable int id) {
		 System.out.println("MeetUp Id:"+id);
		 return (List<Meetup>) meetupDao.viewMeetupById(id);
	}*/
	
	/*@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getMeetup/{presentor}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Meetup> getMeetupByPresentor(@PathVariable String presentor) {
		 System.out.println("MeetUp Id:"+presentor);
		 return (List<Meetup>) meetupDao.viewMeetupByPresentor(presentor);
	}*/
	
	@RequestMapping(value="/getMeetupId/{id}",method=RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody Meetup getMeetupById(@PathVariable("id") int id)
	 {
		 System.out.println("MeetUp Id:"+id);
		 return meetupDao.viewMeetupById(id);
	 }
	/*@RequestMapping(value="/getMeetupPresentor/{presentor}",method=RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody List<Meetup> getMeetupByPresentor(@PathVariable("presentor") String presentor)
	 {
		 System.out.println("MeetUp Presentor:"+presentor);
		 return meetupDao.viewMeetupByPresentor(presentor);
	 }*/

	@RequestMapping(value="getMeetupPresentor/{presentor}",headers="Accept=application/json",method=RequestMethod.GET,produces = "text/html")
	 public List<Meetup> getMeetupbypresentorName(@PathVariable String presentor)
	 {

		 return meetupDao.viewMeetupByPresentor(presentor);
		 
	 }
	@RequestMapping(value = "/addMeetup", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addMeetup(@RequestBody Meetup meetup) {	
		meetupDao.addMeetup(meetup);
		
	}

	@RequestMapping(value = "/updateMeetup", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateMeetup(@RequestBody Meetup meetup) {
		meetupDao.update(meetup);
	}

	@RequestMapping(value = "/deleteMeetup/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteMeetup(@PathVariable("id") int id) {
		meetupDao.delete(id);		
	}

}
