package com.springcourse.ioc;

public class Secretary implements Employee {
	@Override
	public String getTasks() {
		return "Manage boss agenda";
	}
	
	@Override
	public String getReport() {
		return "";
	}
}
