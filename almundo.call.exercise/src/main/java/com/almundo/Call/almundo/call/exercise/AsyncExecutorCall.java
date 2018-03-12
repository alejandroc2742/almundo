package com.almundo.Call.almundo.call.exercise;

import java.util.logging.Logger;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;
/***
 * 
 * @author Alejandro Céspedes
 * Esta clase permite tener un control asincrono sobre el estado del empleado @isBusy
 * y el estado de las llamadas @inProgress, determinando la duración de la llamada desde 
 * @AppConfig.
 */
@Component
@Scope("prototype")
public class AsyncExecutorCall implements Runnable {
	private int id;
	private Employee employee;
	Logger log = Logger.getLogger(AsyncExecutorCall.class.getName());

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void run() {

		this.employee.setBusy(true);
		this.employee.getCall().setInProgress(true);
		try {
			Thread.sleep(AppConfig.TIME_IN_CALL);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.employee.setBusy(false);
		this.employee.getCall().setInProgress(false);
	}

}
