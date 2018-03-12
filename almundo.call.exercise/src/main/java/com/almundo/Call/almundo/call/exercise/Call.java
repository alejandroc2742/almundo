package com.almundo.Call.almundo.call.exercise;
/***
 * 
 * @author Alejandro Céspedes
 * Clase con los atributos básicos de cada llamada
 *
 */
public class Call {
	private long id;
	private Double duration;
	private boolean inProgress;

	public boolean isInProgress() {
		return inProgress;
	}

	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double d) {
		this.duration = d;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
