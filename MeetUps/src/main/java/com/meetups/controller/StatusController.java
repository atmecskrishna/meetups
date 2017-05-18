package com.meetups.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meetups.dao.StatusDao;
import com.meetups.model.Status;
import com.meetups.model.Users;

@RestController
public class StatusController {
	
	@Autowired
	private StatusDao statusDao;

	
	 @RequestMapping(value="/button/{id}", method=RequestMethod.GET,headers="Accept=application/json")
	 public List<Status> regMeetup(@PathVariable("id") int id)
	 {
		 /*System.out.println("email:"+user.getId());*/
		 
          System.out.println(id);
		 List<Status> result=statusDao.regMeetup(id);
	/*	 System.out.println("result we have got is:"+result);*/
		 return result;
	 }
	 
	 
	 @RequestMapping(value="/regForMeetup", method=RequestMethod.POST,headers="Accept=application/json")
		public void regMeetup(@RequestBody Status status)
		{
		    int uid = status.getMeetupId();
		    int mid = status.getMeetupId();
		    System.out.println(uid + "  " + mid);
			System.out.println("Inside the adduser ");
			statusDao.regMeetup(status);
		}
}
