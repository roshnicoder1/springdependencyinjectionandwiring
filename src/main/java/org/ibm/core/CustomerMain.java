package org.ibm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("springcore.xml");
		//by setter method
//		Customer c=(Customer)ac.getBean("g2");
//		System.out.println(c.id);
//		System.out.println(c.name);
//		System.out.println(c.orderValue);
		
//		//by constructor
//		Customer c1=(Customer)ac.getBean("g3");
//		System.out.println(c1);

	}

}
