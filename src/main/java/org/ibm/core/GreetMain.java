package org.ibm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("springcore.xml");
		//identify bean by its id
		Greet gt=(Greet)ac.getBean("g1");
		System.out.println(gt.getMessage());


	}

}
