package org.hibernate.tutorial.domain;

import java.util.Date;

public class Event {

	private long id;
	private Date date;
	private String title;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "id="+id+";date="+date+";title="+title;
	}
}
