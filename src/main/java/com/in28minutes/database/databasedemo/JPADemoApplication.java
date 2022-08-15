package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {

	private static Logger LOGGER = LoggerFactory.getLogger(JPADemoApplication.class);
	@Autowired
	PersonJpaRepository dao;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
		System.out.println("Testing Application");
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("inserting->{}", dao.insert(new Person("P", "A", 12)));
		LOGGER.info("User id 10001->{}", dao.findById(10001));
		dao.deleteById(10002);
		LOGGER.info("All Users->{}", dao.findAll());

	}

}
