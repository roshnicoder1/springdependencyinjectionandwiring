package org.ibm.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("springcore.xml"); 
//		Person p=(Person) ac.getBean("g5");
		Employee e=(Employee)ac.getBean("g6");
//		System.out.println(p.getpName());
//		System.out.println(p.getAd());
		System.out.println(e);
//		System.out.println(e));
	

	}

}
