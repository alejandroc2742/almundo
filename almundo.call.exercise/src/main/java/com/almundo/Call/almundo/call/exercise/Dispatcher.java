package com.almundo.Call.almundo.call.exercise;
/***
 * 
 * @author Alejandro Céspedes
 * Clase encargada de consumir las llamadas expuestas por @CallProducer, validando la 
 * lista de empledados disponibles, recuperando el empleado con prioridad máxima prioridad
 * libre al momento de atender la llamada
 *
 */
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;

public class Dispatcher implements Runnable {
	EmployeeManage emManage = new EmployeeManage();
	Logger log = Logger.getLogger(Dispatcher.class.getName());

	public void run() {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) context.getBean("taskExecutor");
		AsyncExecutorCall asynExecutor = (AsyncExecutorCall) context.getBean("asyncExecutorCall");

		while (true) {
			Call call = QueueCalls.queueCalls.poll();
			if (call != null) {
				Employee employee = emManage.getEmployeeAvailable();
				log.info("Consumiendo llamada # " + call.getId());
				if (employee != null) {
					employee.setCall(call);
					asynExecutor.setEmployee(employee);
					taskExecutor.execute(asynExecutor);
				} else {
					log.info(AppConfig.SYSTEM_BUSY);
				}

			}

		}
	}

}
