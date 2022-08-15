package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	// select * from person

	public List<Person> findAll() {
		return jdbcTemplate.query("Select * from Person", new BeanPropertyRowMapper<Person>(Person.class));

	}

//	public List<Person> findByName(String name) {
//		return (List<Person>) jdbcTemplate.queryForObject("Select * from Person where name=?",
//				new BeanPropertyRowMapper<Person>(Person.class), new Object[] { name });
//
//	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject("Select * from Person where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));

	}

	public int deleteById(int id) {
		return jdbcTemplate.update("Delete from Person where id=?", new Object[] { id });

	}

	public int insert(Person person) {
		return jdbcTemplate.update("Insert into person(ID, NAME, LOCATION) values(?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation() });

	}

	public int update(Person person) {
		return jdbcTemplate.update("update  person" 
								   + " set name=?," 
								   + "location=?"
								   + " where id=?",
								   new Object[] {person.getName(), person.getLocation() ,person.getId()});

	}

}
