package com.MeetUps.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MeetUps.model.MeetUps;
import com.MeetUps.model.Status;
import com.MeetUps.services.MeetUpsServices;

@RestController
public class MeetupController {

	@Autowired 
	MeetUpsServices meetUpServices;
	
	static final Logger logger = Logger.getLogger(MeetupController.class);  
	
	 @RequestMapping(value = "/create", method = RequestMethod.POST, consumes ="Accept: application/json")  
	 public @ResponseBody  
	 Status addMeetUps(@RequestBody MeetUps meetUps) {  
	  try {  
	   meetUpServices.addEntity(meetUps);  
	   return new Status(1, "MeetUps added Successfully !");  
	  } catch (Exception e) {  
	   // e.printStackTrace();  
	   return new Status(0, e.toString());  
	  }  
	  
	 }
	 
	 /* Ger a single objct in Json form in Spring Rest Services */  
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)  
	 public @ResponseBody  
	 MeetUps getMeetUps(@PathVariable("id") int id) {  
	  MeetUps meetUps = null;  
	  try {  
	   meetUps = meetUpServices.getEntityById(id);  
	  
	  } catch (Exception e) {  
	   e.printStackTrace();  
	  }  
	  return meetUps;  
	 }  
	  
	 /* Getting List of objects in Json format in Spring Restful Services */  
	 @RequestMapping(value = "/list", method = RequestMethod.GET)  
	 public @ResponseBody  
	 List<MeetUps> getMeetUps() {  
	  
	  List<MeetUps> meetUpsList = null;  
	  try {  
	   meetUpsList = meetUpServices.getEntityList();  
	  
	  } catch (Exception e) {  
	   e.printStackTrace();  
	  }  
	  
	  return meetUpsList;  
	 }  
	  
	 /* Delete an object from DB in Spring Restful Services */  
	 @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)  
	 public @ResponseBody  
	 Status deleteMeetUps(@PathVariable int id) {  
	  
	  try {  
	   meetUpServices.deleteEntity(id);  
	   return new Status(1, "MeetUps deleted Successfully !");  
	  } catch (Exception e) {  
	   return new Status(0, e.toString());  
	  }
	 }
}
