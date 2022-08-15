package com.in28minutes.database.databasedemo.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.database.databasedemo.entity.Person;

public interface SpringDataJPA extends JpaRepository<Person, Integer> {

}
