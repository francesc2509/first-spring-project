package com.springcourse.ioc.builder;

import com.springcourse.ioc.model.EmployeeImpl;

public class SecretaryBuilder extends EmployeeImpl {
	public SecretaryBuilder(ReportBuilder reportBuilder) {
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
