package com.meetups.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.meetups.model.Users;

@Transactional
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	public void addUser(Users user) {
		  Session session=sessionFactory.getCurrentSession();
		  session.save(user);
		  System.out.println("user added successfully");
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> viewUsers() {
		Session session=sessionFactory.getCurrentSession();
		
		  List<Users> list=session.createCriteria(Users.class).list();
		
		return list;
	}
	public void update(Users user) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}
	public Users viewUserById(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		Users user=(Users)session.get(Users.class,id);
		return user;
	}
	
	
	@SuppressWarnings("unchecked")
	public int validateUser(String emailid, String password) {
		int res=0;
		Session session=sessionFactory.getCurrentSession();
		Query result=session.createQuery("from Users u where u.emailId='"+emailid+"'");
		  // result.setString("username",username);
		List<Users> user=result.list();
		System.out.println("user:"+user);
	if(user.size()==0)
	{
		res=0;
	}
	else
	{
		for(int i=0;i<user.size();i++)
		{
			System.out.println("inside for loop");
			String dbuserName=user.get(i).getEmailId();
			String dbpassword=user.get(i).getPassword();
			if(dbuserName.equals(emailid)&&dbpassword.equals(password))
			{
				res=1;
				System.out.println("the result is:"+res);
			}
			}
	}	
	return res;
	}
}
