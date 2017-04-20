package org.hibernate.tutorial;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

	public static void main(String[] args) {
		try {
			EventManager em = new EventManager();
			em.createAndRestoreEvent("my Event!", new Date());
			for(Object o: em.listEvent()) {
				Event e = (Event)o;
				System.out.println(e);
			}
			
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}
	
	public void createAndRestoreEvent(String title, Date date) {
		Event event = new Event();
		event.setDate(date);
		event.setTitle(title);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(event);
		session.getTransaction().commit();
	}
	
	public List<?> listEvent() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<?> result = session.createQuery("from Event").list();
		session.getTransaction().commit();
		return result;
	}
	
	public void addPersonToEvent(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
	}
}
