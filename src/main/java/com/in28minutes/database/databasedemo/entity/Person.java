package com.in28minutes.database.databasedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_person",query = "Select p from Person p")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private int age;

	public int getId() {
		return id;
	}

	public Person() {

	}

	public Person(int id, String name, String location, int age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public Person(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String location;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
}
