package com.springcourse.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Employee myEmployee = context.getBean("myEmployee", Employee.class);
		
		System.out.println(myEmployee.getTasks());
		
		context.close();
	}
}
