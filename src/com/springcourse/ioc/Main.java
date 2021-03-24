package com.springcourse.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.ioc.model.Boss;
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
		
		Boss myBoss = context.getBean("myBoss", Boss.class);
		
		System.out.println(myBoss.getTasks());
		System.out.println(myBoss.getReport());
		System.out.println(myBoss.getEmail());
		System.out.println(myBoss.getCompanyName());
		
		context.close();
		
		System.out.println();
		context = new ClassPathXmlApplicationContext("application-context-v2.xml");
		mySecretary = context.getBean("mySecretary", Secretary.class);
		Secretary mySecretaryV2 = context.getBean("mySecretary", Secretary.class);
		
		System.out.println(mySecretary + "-" + mySecretaryV2);
		
		context.close();
		
		System.out.println();
		context = new ClassPathXmlApplicationContext("application-context-v3.xml");
		myBoss = context.getBean("myBoss", Boss.class);
		System.out.println(myBoss.getTasks());
		System.out.println(myBoss.getReport());
		System.out.println(myBoss.getEmail());
		System.out.println(myBoss.getCompanyName());
		
		context.close();
	}
}
