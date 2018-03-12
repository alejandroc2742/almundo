package com.almundo.Call.almundo.call.exercise;

public class Employee {
	
	private String role;
	private boolean isBusy;
	private int id;
	private int priority;
	private Call call;
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isBusy() {
		return isBusy;
	}
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	public Call getCall() {
		return call;
	}
	public void setCall(Call call) {
		this.call = call;
	}

}
