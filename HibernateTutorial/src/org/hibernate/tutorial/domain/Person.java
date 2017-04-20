package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {

	private long id;
	private int age;
	private String firstName;
	private String lastName;
	private Set events = new HashSet();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set getEvents() {
		return events;
	}
	public void setEvents(Set events) {
		this.events = events;
	}
}
