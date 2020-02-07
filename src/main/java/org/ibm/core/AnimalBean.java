package org.ibm.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AnimalBean implements InitializingBean,DisposableBean{
	private String animaltype;

	public String getAnimaltype() {
		return animaltype;
	}

	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
	}
	

	public AnimalBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructor is invoked");
	}



	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after setting properties");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		
	}
	

}
