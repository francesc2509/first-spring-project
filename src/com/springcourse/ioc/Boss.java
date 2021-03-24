package com.springcourse.ioc;

public class Boss implements Employee {
	
	private ReportBuilder reportBuilder;
	
	public Boss(ReportBuilder reportBuilder) {
		this.reportBuilder = reportBuilder;
	}
	
	@Override
	public String getTasks() {
		return "Lead my employees";
	}
	
	@Override
	public String getReport() {
		return String.join(" ", "Boss'", reportBuilder.createReport());
	}
}
