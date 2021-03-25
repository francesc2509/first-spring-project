package com.springcourse.ioc.builder;

import com.springcourse.ioc.model.EmployeeImpl;

public class BossBuilder extends EmployeeImpl {
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
	
	public BossBuilder(ReportBuilder reportBuilder) {
		this.reportBuilder = reportBuilder;
	}
	
	public void init() {
		System.out.println("Initialising bean...");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed...");
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
