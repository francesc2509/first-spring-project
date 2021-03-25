package com.springcourse.ioc.model;

import com.springcourse.ioc.builder.ReportBuilder;

public abstract class EmployeeImpl implements Employee {
	protected String email;
	protected String companyName;
	protected ReportBuilder reportBuilder;
}
