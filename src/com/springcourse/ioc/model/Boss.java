package com.springcourse.ioc.model;

import com.springcourse.ioc.builder.ReportBuilder;

public class Boss implements Employee {
	
	private String email;
	private String companyName;
	private ReportBuilder reportBuilder;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
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
