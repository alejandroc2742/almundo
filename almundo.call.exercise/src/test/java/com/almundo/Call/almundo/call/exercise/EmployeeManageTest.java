package com.almundo.Call.almundo.call.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.almundo.Call.almundo.call.exercise.Employee;
import com.almundo.Call.almundo.call.exercise.EmployeeManage;

public class EmployeeManageTest {

	@Test
	public void testEmployeeManageListOfEmployee() {
		Employee employeeTest = new Employee();
		
		EmployeeManage empl = new EmployeeManage();
		assertEquals(employeeTest.getClass(), empl.getEmployeeAvailable().getClass());
	}

}
