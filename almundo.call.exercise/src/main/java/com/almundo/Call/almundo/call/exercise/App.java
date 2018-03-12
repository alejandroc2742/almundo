package com.almundo.Call.almundo.call.exercise;
/**
 * 
 * @author Alejandro Céspedes
 *
 */
public class App {
	public static void main(String[] args) {
		Thread producer = new Thread(new CallProducer());
		Thread consumer = new Thread(new Dispatcher());

		producer.start();
		consumer.start();
	}
}
