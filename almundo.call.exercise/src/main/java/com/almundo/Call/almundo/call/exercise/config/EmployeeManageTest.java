package com.almundo.Call.almundo.call.exercise.config;

import static org.junit.Assert.*;

import org.junit.Test;

import com.almundo.Call.almundo.call.exercise.Employee;
import com.almundo.Call.almundo.call.exercise.EmployeeManage;

public class EmployeeManageTest {

	@Test
	public void testEmployeeManage() {
		Employee employeeTest = new Employee();
		
		EmployeeManage empl = new EmployeeManage();
		assertEquals(employeeTest.getClass(), empl.getEmployeeAvailable().getClass());
	}


	@Test
	public void testEmployeeManageListOfEmployee() {
		
	}

	@Test
	public void testGetEmployeeAvailable() {
		
	}

}
