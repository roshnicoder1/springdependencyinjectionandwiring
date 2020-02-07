package org.ibm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("springcore.xml"); 
		Customer c=(Customer) ac.getBean("g4");
		System.out.println(c);
	    c.show();

	}

}
