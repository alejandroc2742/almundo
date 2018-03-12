package com.almundo.Call.almundo.call.exercise;
/***
 * 
 * @author Alejandro Céspedes
 * Clase creada para cargar los atributos básicos de cada empleado, administrar su 
 * disponibilidad, tipo de rol y prioridad
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;

public class EmployeeManage {

	Logger log = Logger.getLogger(AsyncExecutorCall.class.getName());
	static List<Employee> employeeList = new ArrayList<Employee>();

	Employee employee1 = new Employee();
	Employee employee2 = new Employee();
	Employee employee3 = new Employee();
	Employee employee4 = new Employee();
	Employee employee5 = new Employee();
	Employee employee6 = new Employee();
	Employee employee7 = new Employee();
	Employee employee8 = new Employee();
	Employee employee9 = new Employee();
	Employee employee10 = new Employee();

	public EmployeeManage() {
		employee1.setBusy(false);
		employee2.setBusy(false);
		employee3.setBusy(false);
		employee4.setBusy(false);
		employee5.setBusy(false);
		employee6.setBusy(false);
		employee7.setBusy(false);
		employee8.setBusy(false);
		employee9.setBusy(false);
		employee10.setBusy(false);

		employee1.setId(0);
		employee1.setId(1);
		employee1.setId(2);
		employee1.setId(3);
		employee1.setId(4);
		employee1.setId(5);
		employee1.setId(6);
		employee1.setId(7);
		employee1.setId(8);
		employee1.setId(9);

		employee1.setPriority(1);
		employee1.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee2.setPriority(1);
		employee2.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee3.setPriority(1);
		employee3.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee4.setPriority(1);
		employee4.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee5.setPriority(1);
		employee5.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee6.setPriority(1);
		employee6.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee7.setPriority(1);
		employee7.setRole(AppConfig.EMPLOYEE_ROLE_OPERATOR);
		employee8.setPriority(2);
		employee8.setRole(AppConfig.EMPLOYEE_ROLE_SUPERVISOR);
		employee9.setPriority(2);
		employee9.setRole(AppConfig.EMPLOYEE_ROLE_SUPERVISOR);
		employee10.setPriority(3);
		employee10.setRole(AppConfig.EMPLOYEE_ROLE_DIRECTOR);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		employeeList.add(employee8);
		employeeList.add(employee9);
		employeeList.add(employee10);

	}

	public EmployeeManage(List<Employee> list) {
		employeeList = list;
	}

	public Employee getEmployeeAvailable() {
		List<Employee> employeeNotBusy = getListOfNoBusyEmployees();
		log.info("Número de empleados disponibles " + employeeNotBusy.size());
		try {
			Thread.sleep(AppConfig.WAIT_FOR_EMP_BUSY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!employeeNotBusy.isEmpty()) {
			return getMaxPriorEmploye(employeeNotBusy);
		}
		return null;
	}

	private static List<Employee> getListOfNoBusyEmployees() {
		List<Employee> resp = new ArrayList<Employee>();
		for (Employee emp : employeeList) {
			if (!emp.isBusy()) {
				resp.add(emp);
			}
		}
		return resp;
	}

	private static Employee getMaxPriorEmploye(List<Employee> list) {
		for (Employee emp : list) {
			if (emp.getPriority() == 1) {
				emp.setBusy(true);
				return emp;
			}
		}
		for (Employee emp : list) {
			if (emp.getPriority() == 2) {
				return emp;
			}
		}
		for (Employee emp : list) {
			if (emp.getPriority() == 3) {
				return emp;
			}
		}
		return null;
	}

}
