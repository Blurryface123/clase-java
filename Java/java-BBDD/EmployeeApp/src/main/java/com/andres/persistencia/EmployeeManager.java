package com.andres.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.andres.models.Employee;

public class EmployeeManager {

	public static EmployeeManager instancia = null;
	private static SessionFactory sf = null;

	public static EmployeeManager getInstance() {
		if (instancia == null)
			instancia = new EmployeeManager();

		return instancia;
	}

	private EmployeeManager() {

		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public void createEmployee(Employee newE) throws Exception {
		Session session = sf.openSession();

		Transaction t = session.beginTransaction();

		int id = ((Integer) session.save(newE)).intValue();
		System.out.println("el id nuevo es: " + id);

		t.commit();
		session.close();
	}

	public Employee getEmployee(int id) throws Exception {
		Session session = sf.openSession();
		Employee recE = session.get(Employee.class, 3);

		System.out.println("Empleado recibido:" + recE.getNombre());

		session.close();

		return recE;
	}

}
