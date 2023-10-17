package com.jsp.pan.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PanPersonController {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vivek");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    
	    
	    Person person = new Person();
	    person.setName("xyz");
	    person.setEmail("xyz@gmail.com");
	    
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityTransaction.commit();
	}

}
