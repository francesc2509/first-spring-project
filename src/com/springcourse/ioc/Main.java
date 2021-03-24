package com.springcourse.ioc;
public class Main {
	
	public static void main(String[] args) {
		
		Employee bossEmployee = new Boss();
		System.out.println(bossEmployee.getTasks());
		
		Employee secretary = new Secretary();
		System.out.println(secretary.getTasks());
		
		Employee director = new Director();
		System.out.println(director.getTasks());
	}
}
