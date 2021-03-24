package com.springcourse.ioc.model;

import com.springcourse.ioc.builder.ReportBuilder;

public class Director implements Employee {
	private ReportBuilder reportBuilder;
	
	public Director(ReportBuilder reportBuilder) {
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
