package com.springcourse.ioc.model;

import com.springcourse.ioc.builder.ReportBuilder;

public class Secretary implements Employee {
	
	private String email;
	private String companyName;
	private ReportBuilder reportBuilder;
	
	public Secretary(ReportBuilder reportBuilder) {
		this.reportBuilder = reportBuilder;
	}
	
	
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

	@Override
	public String getTasks() {
		return "Manage boss agenda";
	}
	
	@Override
	public String getReport() {
		return String.join(" ", "Secretary'", reportBuilder.createReport());
	}
}
