package com.almundo.Call.almundo.call.exercise;
/***
 * 
 * @author Alejandro Céspedes
 * Clase encargada de generar nuevas llamadas cada determinado tiempo, este atributo
 * es configurable desde @AppConfig cambiando el valor de TIME_FOR_NEW_CALL
 *
 */
import java.util.logging.Logger;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;

public class CallProducer implements Runnable {

	Logger log = Logger.getLogger(CallProducer.class.getName());

	public void run() {
		long numberOfCall = 0;
		while (true) {
			numberOfCall += 1;
			Call call = new Call();
			call.setId(numberOfCall);
			call.setDuration(Math.random() * 10000);
			QueueCalls.queueCalls.add(call);
			log.info("Llamada # " + call.getId() + " entró en cola");
			try {
				Thread.sleep(AppConfig.TIME_FOR_NEW_CALL);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
