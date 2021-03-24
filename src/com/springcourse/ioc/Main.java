package com.springcourse.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.ioc.model.Employee;
import com.springcourse.ioc.model.Secretary;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Secretary mySecretary = context.getBean("mySecretary", Secretary.class);
		
		System.out.println(mySecretary.getTasks());
		System.out.println(mySecretary.getReport());
		System.out.println(mySecretary.getEmail());
		System.out.println(mySecretary.getCompanyName());
		
		context.close();
	}
}
