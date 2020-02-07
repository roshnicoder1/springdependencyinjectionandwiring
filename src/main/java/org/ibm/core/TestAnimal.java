package org.ibm.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("animal.xml"); 
		AnimalBean obj=(AnimalBean) ac.getBean("animal");
		System.out.println(obj.getAnimaltype());
		ac.registerShutdownHook();
		

	}

}
