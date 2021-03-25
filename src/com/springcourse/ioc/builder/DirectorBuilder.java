package com.springcourse.ioc.builder;

import com.springcourse.ioc.model.EmployeeImpl;

public class DirectorBuilder extends EmployeeImpl {
	private ReportBuilder reportBuilder;
	
	public DirectorBuilder(ReportBuilder reportBuilder) {
		this.reportBuilder = reportBuilder;
	}
	
	@Override
	public String getTasks() {
		return "Manage company's staff";
	}
	
	@Override
	public String getReport() {
		return String.join(" ", "Director's", reportBuilder.createReport());
	}

}
