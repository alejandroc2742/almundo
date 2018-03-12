package com.almundo.Call.almundo.call.exercise;

import java.util.logging.Logger;

import com.almundo.Call.almundo.call.exercise.config.AppConfig;

public class CallProducer implements Runnable {

	Logger log = Logger.getLogger(CallProducer.class.getName());

	/*
	 * Clase encargada de producir llamadas cada @time milisegundos
	 * 
	 */
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
