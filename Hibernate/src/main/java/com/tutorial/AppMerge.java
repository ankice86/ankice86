package com.tutorial;

import java.util.Date;

import org.hibernate.Session;

import com.tutorial.user.DBUser;
import com.tutorial.util.HibernateUtil;

public class AppMerge {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUser user = new DBUser();
		user.setUserId(113);
		user.setUsername("superman1");
		user.setCreatedBy("system Eng2");
		user.setCreatedDate(new Date());
		/**
		 * uses Select to check If row is present then it updates else it inserts a new row in DB
		 * It retruns the POJO Object
		 */
		DBUser obj = (DBUser)session.merge(user);
		System.out.println("AppMerge.main()" + obj.getUserId());
		session.getTransaction().commit();
		
		session.close();
	}
} // Next AppSaveUpdate