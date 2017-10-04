package com.tecsup.lab08.crud.dao;

import java.util.ArrayList;

import com.tecsup.lab08.crud.bean.Employee;

public interface EmployeeDAO {

	/**
	 * 
	 * @return
	 */
	ArrayList<Employee> findAll();

	/**
	 * 
	 * @param id
	 */
	Employee findById(int id);
		
	/**
	 * 
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 * @param pEdad
	 */
	int create(String pFirstname, String pLastname, Double pSalary, int pEdad);

	/**
	 * 
	 * @param id
	 */
	void delete(int id);

	/**
	 * 
	 * @param id
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 * @param pEdad
	 */
	void update(int id, String pFirstname, String pLastname, Double pSalary, int pEdad);

} 

