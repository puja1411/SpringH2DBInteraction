package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private static Logger LOGGER = LoggerFactory.getLogger(DatabaseDemoApplication.class);
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
		System.out.println("Testing Application");
	}

	@Override
	public void run(String... args) throws Exception {

//		LOGGER.info("All Users->{}", dao.findByName("Puja"));
		LOGGER.info("All Users->{}", dao.findAll());
		LOGGER.info("User id 10001->{}", dao.findById(10001));
//		LOGGER.info("User id 10001->{}", dao.deleteById(10001));
		LOGGER.info("Insert->{}", dao.insert(new Person(10004,"Keshav","Bangalore")));
		LOGGER.info("updating 10003 ->{}", dao.update(new Person(10003,"Payal","NYC")));
		LOGGER.info("All Users->{}", dao.findAll());

	}

}
