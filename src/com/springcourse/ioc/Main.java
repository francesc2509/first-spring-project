package com.springcourse.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.ioc.builder.BossBuilder;
import com.springcourse.ioc.builder.SecretaryBuilder;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		SecretaryBuilder mySecretary = context.getBean("mySecretary", SecretaryBuilder.class);
		
		System.out.println(mySecretary.getTasks());
		System.out.println(mySecretary.getReport());
		System.out.println(mySecretary.getEmail());
		System.out.println(mySecretary.getCompanyName());
		
		BossBuilder myBoss = context.getBean("myBoss", BossBuilder.class);
		
		System.out.println(myBoss.getTasks());
		System.out.println(myBoss.getReport());
		System.out.println(myBoss.getEmail());
		System.out.println(myBoss.getCompanyName());
		
		context.close();
		
		System.out.println();
		context = new ClassPathXmlApplicationContext("application-context-v2.xml");
		mySecretary = context.getBean("mySecretary", SecretaryBuilder.class);
		SecretaryBuilder mySecretaryV2 = context.getBean("mySecretary", SecretaryBuilder.class);
		
		System.out.println(mySecretary + "-" + mySecretaryV2);
		
		context.close();
		
		System.out.println();
		context = new ClassPathXmlApplicationContext("application-context-v3.xml");
		myBoss = context.getBean("myBoss", BossBuilder.class);
		System.out.println(myBoss.getTasks());
		System.out.println(myBoss.getReport());
		System.out.println(myBoss.getEmail());
		System.out.println(myBoss.getCompanyName());
		
		context.close();
	}
}
