package org.ibm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Compute c=(Compute)ac.getBean("comp");
		int r=c.addsum(c.a, c.b);
		System.out.println("sum is"+r);

	}

}
