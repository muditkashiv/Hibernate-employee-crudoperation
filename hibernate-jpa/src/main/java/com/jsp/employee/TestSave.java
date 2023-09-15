package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mudit");//create connection
		EntityManager entityManager = entityManagerFactory.createEntityManager();// perform database operation
		EntityTransaction entityTransaction = entityManager.getTransaction();//init database transaction
		
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setName("rayy");
		employee.setEmail("rayy@gmail.com");
		employee.setCno(557800999);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
