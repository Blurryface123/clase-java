package com.andres.models;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

	private static SessionFactory sf = null;
	private SessionFactory sessionFactory;

	@BeforeClass
	public static void createSessionFactory() {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Esto hace que nos podamos conectarnos a traves de hibernate

	}

	@Test
	public void testSession() {
		Session session = sf.openSession();

		assertNotNull(session);
	}

	@Test
	public void testInsert() {
		Session session = sf.openSession();

		Transaction t = session.beginTransaction();
		Employee newE = new Employee(0, "Pepe", "Perez");
		int id = ((Integer) session.save(newE)).intValue();
		System.out.println("el id nuevo es: " + id);

		Employee newE2 = new Employee(0, "Maria", "Martinez");
		session.save(newE2);

		Employee newE3 = new Employee(0, "Julia", "Juarez");
		session.save(newE3);

		t.commit();
		session.close();
	}

	@Test
	public void testGet() {
		Session session = sf.openSession();
		Employee recE = (Employee) session.get(Employee.class, 3);

		System.out.println("Empleado recibido:" + recE.getNombre());

		session.close();

	}

	@Test
	public void testLoad() {
		Session session = sf.openSession();
		List<Employee> empleados = session.createQuery("from Employee WHERE id>5", Employee.class).getResultList();

		for (Employee employee : empleados) {
			System.out.println("Empleados: " + employee.getId());
		}

		session.close();

	}

	@Test
	public void testDelete() {
		Session session = sf.openSession();

		Transaction t = session.beginTransaction();
		Employee unE = (Employee) session.get(Employee.class, 30);
		session.delete(unE);

		// This makes the pending delete to be done

		t.commit();

		session.close();

	}
	
	@Test
	public void testUpdate() {
		Session session = sf.openSession();

		Transaction t = session.beginTransaction();
		Employee upE = (Employee) session.load(Employee.class, 31);
		 upE.setNombre("klars");
		 
		 session.update(upE);
		 
		 
		

		t.commit();

		session.close();

	}

}
